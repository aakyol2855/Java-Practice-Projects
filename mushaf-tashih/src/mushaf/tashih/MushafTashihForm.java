package mushaf.tashih;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.JFileChooser;

import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.DateUtil;

public class MushafTashihForm extends JFrame {
    
    private JTable tashihTable;
    private DefaultTableModel tableModel;
    private JButton saveButton;
    private JButton exportButton;
    private JPanel inputPanel;
    private JTextField[] inputFields;
    private String[] columnNames = {
        "Sıra No", "Sayfa No", "Satır No", "Yanlış", "Doğru", 
        "Açıklama", "Tashih Eden", "Tarih"
    };
    private File selectedExcelFile;
    private int lastRowNumber;
    
    public MushafTashihForm() {
        selectExcelFile(); // Önce dosya seçimi
    }
    
    private void selectExcelFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Düzenlenecek Excel Dosyasını Seçin");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
            "Excel Makro Dosyası (*.xlsm)", "xlsm")); // XLSM filtre
        
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            selectedExcelFile = fileChooser.getSelectedFile();
            
            // Eğer dosya yoksa yeni oluştur
            if (!selectedExcelFile.exists()) {
                try {
                    XSSFWorkbook workbook = new XSSFWorkbook();
                    workbook.createSheet("Mushaf Tashih Cetveli");
                    
                    // XLSM olarak kaydet
                    try (FileOutputStream fileOut = new FileOutputStream(
                        selectedExcelFile.getPath().endsWith(".xlsm") ? 
                        selectedExcelFile : 
                        new File(selectedExcelFile.getPath() + ".xlsm"))) {
                        workbook.write(fileOut);
                    }
                    workbook.close();
                    lastRowNumber = 0;
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, 
                        "Yeni dosya oluşturulurken hata: " + e.getMessage());
                    dispose();
                    return;
                }
            }
            
            // Mevcut verileri yükle
            loadExcelData();
            initComponents();
            setTitle("Mushaf Tashih Cetveli - " + selectedExcelFile.getName());
        } else {
            dispose(); // Dosya seçilmezse formu kapat
        }
    }
    
    private void loadExcelData() {
        try {
            // TableModel'i oluştur
            Vector<String> columnIdentifiers = new Vector<>();
            for (String colName : columnNames) {
                columnIdentifiers.add(colName);
            }
            
            Vector<Vector<Object>> data = new Vector<>();
            lastRowNumber = 0;
            
            if (selectedExcelFile.exists()) {
                try (FileInputStream fis = new FileInputStream(selectedExcelFile)) {
                    XSSFWorkbook workbook = new XSSFWorkbook(fis);
                    XSSFSheet sheet = workbook.getSheetAt(0);
                    
                    // Başlık satırını atla, verilerden başla
                    for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                        Row row = sheet.getRow(i);
                        if (row != null) {
                            Vector<Object> rowData = new Vector<>();
                            boolean hasData = false;
                            
                            for (int j = 0; j < columnNames.length; j++) {
                                Cell cell = row.getCell(j);
                                String value = "";
                                if (cell != null) {
                                    switch (cell.getCellType()) {
                                        case STRING:
                                            value = cell.getStringCellValue();
                                            break;
                                        case NUMERIC:
                                            if (DateUtil.isCellDateFormatted(cell)) {
                                                value = new SimpleDateFormat("dd.MM.yyyy")
                                                    .format(cell.getDateCellValue());
                                            } else {
                                                value = String.valueOf((int)cell.getNumericCellValue());
                                            }
                                            break;
                                        default:
                                            value = "";
                                    }
                                    if (!value.trim().isEmpty()) hasData = true;
                                }
                                rowData.add(value);
                            }
                            
                            if (hasData) {
                                data.add(rowData);
                                lastRowNumber = i;
                            }
                        }
                    }
                    workbook.close();
                }
            }
            
            tableModel = new DefaultTableModel(data, columnIdentifiers);
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, 
                "Excel dosyası okunurken hata: " + e.getMessage(),
                "Hata",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void initComponents() {
        setTitle("Mushaf Tashih Cetveli");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        
        // Input Panel
        inputPanel = new JPanel(new GridBagLayout());
        inputPanel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createEmptyBorder(5, 5, 5, 5), 
            "Veri Girişi",
            TitledBorder.LEFT,
            TitledBorder.TOP,
            new java.awt.Font("Arial", java.awt.Font.BOLD, 14)
        ));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        
        inputFields = new JTextField[columnNames.length];
        
        for (int i = 0; i < columnNames.length; i++) {
            gbc.gridx = 0;
            gbc.gridy = i;
            JLabel label = new JLabel(columnNames[i] + ":");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 12));
            inputPanel.add(label, gbc);
            
            gbc.gridx = 1;
            gbc.weightx = 1.0;
            inputFields[i] = new JTextField(20);
            inputFields[i].setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 12));
            inputPanel.add(inputFields[i], gbc);
        }
        
        // Tablo modeli
        tashihTable = new JTable(tableModel);
        
        // Tablo özellikleri
        tashihTable.setRowHeight(25);
        tashihTable.setFont(new Font("Arial", Font.PLAIN, 14));
        tashihTable.getTableHeader().setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 14));
        tashihTable.setSelectionBackground(new java.awt.Color(184, 207, 229));
        tashihTable.setGridColor(new java.awt.Color(211, 211, 211));
        
        JScrollPane scrollPane = new JScrollPane(tashihTable);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        // Butonlar
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        saveButton = createStyledButton("Kaydet");
        exportButton = createStyledButton("Excel'e Aktar");
        
        saveButton.addActionListener(e -> saveData());
        exportButton.addActionListener(e -> exportToExcel());
        
        buttonPanel.add(saveButton);
        buttonPanel.add(exportButton);
        
        // Sol panel (input için)
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.add(inputPanel, BorderLayout.NORTH);
        
        // Split pane
        JSplitPane splitPane = new JSplitPane(
            JSplitPane.HORIZONTAL_SPLIT,
            leftPanel,
            scrollPane
        );
        splitPane.setDividerLocation(300);
        
        // Ana panele ekleme
        add(splitPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        // Pencere boyutu
        setSize(1200, 700);
        setLocationRelativeTo(null);
    }
    
    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 12));
        button.setBackground(new java.awt.Color(25, 55, 109)); // Koyu mavi
        button.setForeground(java.awt.Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder(8, 15, 8, 15));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(new java.awt.Color(37, 78, 153));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(new java.awt.Color(25, 55, 109));
            }
        });
        
        return button;
    }
    
    private void saveData() {
        // Zorunlu alanları kontrol et
        if (inputFields[1].getText().trim().isEmpty() || // Sayfa No
            inputFields[2].getText().trim().isEmpty() || // Satır No
            inputFields[3].getText().trim().isEmpty() || // Yanlış
            inputFields[4].getText().trim().isEmpty() || // Doğru
            inputFields[6].getText().trim().isEmpty()) { // Tashih Eden
            
            JOptionPane.showMessageDialog(this,
                "Lütfen aşağıdaki alanları doldurun:\n" +
                "- Sayfa No\n" +
                "- Satır No\n" +
                "- Yanlış\n" +
                "- Doğru\n" +
                "- Tashih Eden",
                "Zorunlu Alanlar",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Yeni satır verilerini hazırla
        Object[] rowData = new Object[columnNames.length];
        rowData[0] = lastRowNumber + 1; // Son satır numarasından devam et
        lastRowNumber++;
        
        // Diğer alanları doldur
        for (int i = 1; i < columnNames.length - 1; i++) {
            rowData[i] = inputFields[i].getText();
        }
        
        // Tarihi otomatik ekle
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        rowData[columnNames.length - 1] = dateFormat.format(new Date());
        
        // Tabloya ekle
        tableModel.addRow(rowData);
        
        // Excel dosyasına kaydet
        saveToExcel();
        
        // Input alanlarını temizle
        for (JTextField field : inputFields) {
            field.setText("");
        }
        inputFields[1].requestFocus();
    }
    
    private void saveToExcel() {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(selectedExcelFile));
            XSSFSheet sheet = workbook.getSheetAt(0);
            
            // Başlıkları güncelle/ekle
            Row headerRow = sheet.getRow(0);
            if (headerRow == null) {
                headerRow = sheet.createRow(0);
            }
            for (int i = 0; i < columnNames.length; i++) {
                Cell cell = headerRow.getCell(i);
                if (cell == null) {
                    cell = headerRow.createCell(i);
                }
                cell.setCellValue(columnNames[i]);
            }
            
            // Son eklenen satırı ekle
            int lastRow = tableModel.getRowCount() - 1;
            Row row = sheet.createRow(sheet.getLastRowNum() + 1);
            for (int i = 0; i < columnNames.length; i++) {
                Cell cell = row.createCell(i);
                Object value = tableModel.getValueAt(lastRow, i);
                cell.setCellValue(value != null ? value.toString() : "");
            }
            
            // Dosyaya kaydet
            try (FileOutputStream fileOut = new FileOutputStream(selectedExcelFile)) {
                workbook.write(fileOut);
            }
            
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Excel dosyasına kaydedilirken hata: " + e.getMessage());
        }
    }
    
    private void exportToExcel() {
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Excel Dosyasını Kaydet");
            fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
                "Excel Makro Dosyası (*.xlsm)", "xlsm")); // XLSM filtre
            fileChooser.setSelectedFile(new File("MushafTashihCetveli.xlsm")); // .xlsm uzantısı

            if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                if (!file.getName().toLowerCase().endsWith(".xlsm")) {
                    file = new File(file.getParentFile(), file.getName() + ".xlsm");
                }

                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Mushaf Tashih Cetveli");
                
                Row headerRow = sheet.createRow(0);
                for (int i = 0; i < tableModel.getColumnCount(); i++) {
                    Cell cell = headerRow.createCell(i);
                    cell.setCellValue(tableModel.getColumnName(i));
                }
                
                for (int i = 0; i < tableModel.getRowCount(); i++) {
                    Row row = sheet.createRow(i + 1);
                    for (int j = 0; j < tableModel.getColumnCount(); j++) {
                        Cell cell = row.createCell(j);
                        if (tableModel.getValueAt(i, j) != null) {
                            cell.setCellValue(tableModel.getValueAt(i, j).toString());
                        }
                    }
                }
                
                try (FileOutputStream fileOut = new FileOutputStream(file)) {
                    workbook.write(fileOut);
                    JOptionPane.showMessageDialog(this, "Excel dosyası başarıyla oluşturuldu!\nKonum: " + file.getAbsolutePath());
                }
                
                workbook.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                "Excel dosyası oluşturulurken hata oluştu: " + e.getMessage());
            e.printStackTrace();
        }
    }
} 