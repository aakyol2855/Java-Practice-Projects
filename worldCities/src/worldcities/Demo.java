package worldcities;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Demo extends javax.swing.JFrame {

    DefaultTableModel  model;
    public Demo() {
        initComponents();
        populateTable();
    }
    
    public void populateTable(){
        model = (DefaultTableModel)tblCities.getModel();
        model.setRowCount(0);
        
        try {
            ArrayList<City> cities = getCiities();
            for(City city : cities){
                Object[] row = {
                    city.getId(),
                    city.getName(),
                    city.getCountryCode(),
                    city.getDistrict(),
                    city.getPopulation()
                };
                model.addRow(row);
            }
            
        } catch (SQLException ex) {
            
        }
    }
    
    public ArrayList<City> getCiities() throws SQLException{
        Connection conn = null;
        dbHelper helper = new dbHelper();
        Statement statement =null;
        ResultSet setit ;
        ArrayList<City> cities = null;
        
        try {
            conn = helper.getConnection();
            statement = conn.createStatement();
            setit = statement.executeQuery("select * from city");
            cities = new ArrayList<City>();
            while (setit.next()) {                
                cities.add(new City(
                        setit.getInt("ID"),
                        setit.getString("Name"),
                        setit.getString("CountryCode"),
                        setit.getString("District"),setit.getInt("Population"))
                );
            }
            
        } catch (SQLException e) {
            helper.showErrors(e);
        }finally{
            statement.close();
            conn.close();
        }
        return cities;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCities = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lbCountry = new javax.swing.JLabel();
        lblDistrict = new javax.swing.JLabel();
        lblPopulation = new javax.swing.JLabel();
        tbxName = new javax.swing.JTextField();
        tbxCountry = new javax.swing.JTextField();
        tbxDistrict = new javax.swing.JTextField();
        tbxPopulation = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        tblCities.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tblCities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Country Code", "District", "Population"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCities);
        if (tblCities.getColumnModel().getColumnCount() > 0) {
            tblCities.getColumnModel().getColumn(0).setResizable(false);
            tblCities.getColumnModel().getColumn(1).setResizable(false);
            tblCities.getColumnModel().getColumn(2).setResizable(false);
            tblCities.getColumnModel().getColumn(3).setResizable(false);
            tblCities.getColumnModel().getColumn(4).setResizable(false);
        }

        txtSearch.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblSearch.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblSearch.setText("Arama İfadesi : ");

        lblName.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblName.setText("City Name :");

        lbCountry.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbCountry.setText("Country Code :");

        lblDistrict.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblDistrict.setText("District :");

        lblPopulation.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblPopulation.setText("Population :");

        tbxName.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        tbxCountry.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tbxCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxCountryActionPerformed(evt);
            }
        });

        tbxDistrict.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        tbxPopulation.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setText("Delete selected :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSearch)
                        .addGap(80, 80, 80)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCountry)
                                    .addComponent(lblName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tbxName)
                                    .addComponent(tbxCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDistrict, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPopulation, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(tbxPopulation)
                                    .addComponent(tbxDistrict))
                                .addGap(156, 156, 156)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblDistrict)
                    .addComponent(tbxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbxDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCountry)
                    .addComponent(lblPopulation)
                    .addComponent(tbxCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbxPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        
    }//GEN-LAST:event_formKeyReleased

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchKey = txtSearch.getText();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
        tblCities.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tbxCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxCountryActionPerformed

    }//GEN-LAST:event_tbxCountryActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Connection conn = null;
        dbHelper helper = new dbHelper();
        PreparedStatement statement = null;
        
        try {
            conn=helper.getConnection();
            String sql = "insert into city(Name,CountryCode,District,Population) values(?,?,?,?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1,tbxName.getText());
            statement.setString(2,tbxCountry.getText());
            statement.setString(3,tbxDistrict.getText());
            statement.setInt(4,(Integer.valueOf(tbxPopulation.getText())));
            int result = statement.executeUpdate();
            populateTable();
        } catch (SQLException e) {
            helper.showErrors(e);
        }finally{
            try {
                statement.close();
                conn.close();
            } catch (SQLException e) {
                helper.showErrors(e);
            }
        }
            
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int index = tblCities.getSelectedRow();
        if(index !=-1){
            model.removeRow(index);
        }
        populateTable();

    }//GEN-LAST:event_btnDeleteActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demo().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCountry;
    private javax.swing.JLabel lblDistrict;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPopulation;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblCities;
    private javax.swing.JTextField tbxCountry;
    private javax.swing.JTextField tbxDistrict;
    private javax.swing.JTextField tbxName;
    private javax.swing.JTextField tbxPopulation;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
