/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mushaf.tashih;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.JTable;

public class MushafTashih extends JFrame {
    
    private JPanel headerPanel;
    private JPanel buttonPanel;
    private JTable tashihTable;
    
    public MushafTashih() {
        initComponents();
    }
    
    private void initComponents() {
        // Ana pencere ayarları
        setTitle("Mushaf Tashih Sistemi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        
        // Header panel
        headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel titleLabel = new JLabel("Mushafları İnceleme ve Kıraat Kurulu");
        titleLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));
        // Logo eklenecek
        // JLabel logoLabel = new JLabel(new ImageIcon("path/to/logo.png"));
        headerPanel.add(titleLabel);
        
        // Button panel
        buttonPanel = new JPanel(new GridLayout(2, 2, 20, 20));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JButton mushafButton = createStyledButton("Mushaf Tashih Cetveli");
        JButton okuyusButton = createStyledButton("Okuyuş Tashih Cetveli");
        JButton yarismaButton = createStyledButton("Yarışmalar");
        JButton kurulButton = createStyledButton("Kurul Faaliyetleri");
        
        mushafButton.addActionListener(e -> openMushafTashih());
        
        buttonPanel.add(mushafButton);
        buttonPanel.add(okuyusButton);
        buttonPanel.add(yarismaButton);
        buttonPanel.add(kurulButton);
        
        // Ana panele ekleme
        add(headerPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        
        // JTable'ı oluşturun
        tashihTable = new JTable();
        tashihTable.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
        
        // Pencere boyutu ve konumu
        setSize(800, 600);
        setLocationRelativeTo(null);
    }
    
    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        // Daha koyu ve okunaklı bir renk paleti
        button.setBackground(new Color(25, 55, 109)); // Koyu mavi
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder(15, 25, 15, 25));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        // Modern hover efekti
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(new Color(37, 78, 153));
                button.setBorder(BorderFactory.createEmptyBorder(15, 30, 15, 30));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(new Color(25, 55, 109));
                button.setBorder(BorderFactory.createEmptyBorder(15, 25, 15, 25));
            }
        });
        
        return button;
    }
    
    private void openMushafTashih() {
        MushafTashihForm mushafForm = new MushafTashihForm();
        mushafForm.setVisible(true);
    }
    
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        EventQueue.invokeLater(() -> {
            new MushafTashih().setVisible(true);
        });
    }
}
