/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasibukualamat;

// Import untuk komponen GUI
import javax.swing.*; // JFrame, JPanel, JTextField, JTable, JButton, JLabel, JOptionPane, JScrollPane
import javax.swing.table.DefaultTableModel; // Model data untuk JTable
import javax.swing.event.DocumentEvent; // Untuk mendeteksi perubahan pada JTextField
import javax.swing.event.DocumentListener; // Untuk listener perubahan teks pada JTextField


// Import untuk koneksi database SQLite
import java.sql.Connection; // Untuk koneksi database
import java.sql.DriverManager; // Driver koneksi SQLite
import java.sql.PreparedStatement; // Untuk query SQL dengan parameter
import java.sql.ResultSet; // Untuk hasil query SELECT
import java.sql.SQLException; // Untuk menangani error SQL

// Import untuk operasi file (ekspor/impor)
import java.io.BufferedReader; // Untuk membaca file secara efisien
import java.io.BufferedWriter; // Untuk menulis file secara efisien
import java.io.FileReader; // Untuk membaca file
import java.io.FileWriter; // Untuk menulis file
import java.io.IOException; // Untuk menangani error I/O




public class AplikasiBukuAlamat extends javax.swing.JFrame {

 public class DatabaseConnection {
    public static Connection connect() {
        try {
            String url = "jdbc:sqlite:addressbook.db";
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
            return null;
        }
    }
}
 
    public AplikasiBukuAlamat() {
        initComponents();
        loadTableData();
        addListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        importButton = new javax.swing.JButton();
        exportButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("APLIKASI BUKU ALAMAT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 23, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(9, 7, 9, 46);
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Nama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(9, 7, 9, 46);
        jPanel2.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Alamat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(9, 7, 9, 46);
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Phone");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(9, 7, 9, 46);
        jPanel2.add(jLabel5, gridBagConstraints);

        idTextField.setFocusable(false);
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 13);
        jPanel2.add(idTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 13);
        jPanel2.add(nameTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 13);
        jPanel2.add(addressTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 13);
        jPanel2.add(phoneTextField, gridBagConstraints);

        clearButton.setText("Bersihkan");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 14);
        jPanel2.add(clearButton, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        addButton.setText("Tambah");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel4.add(addButton, new java.awt.GridBagConstraints());

        updateButton.setText("Edit");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel4.add(updateButton, new java.awt.GridBagConstraints());

        deleteButton.setText("Hapus");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel4.add(deleteButton, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(9, 5, 9, 150);
        jPanel2.add(jPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(13, 15, 13, 15);
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel6.setText("Cari Alamat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(9, 16, 9, 53);
        jPanel3.add(jLabel6, gridBagConstraints);

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 0);
        jPanel3.add(searchTextField, gridBagConstraints);

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 16);
        jPanel3.add(resetButton, gridBagConstraints);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 150));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Alamat", "Phone"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(9, 8, 9, 8);
        jPanel3.add(jScrollPane1, gridBagConstraints);

        importButton.setText("Import");
        importButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 9, 72);
        jPanel3.add(importButton, gridBagConstraints);

        exportButton.setText("Export");
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 9, 79);
        jPanel3.add(exportButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(13, 15, 13, 15);
        jPanel1.add(jPanel3, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
 private void addListeners() {
        // DocumentListener untuk searchTextField
        searchTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                search();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                search();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                search();
            }

            private void search() {
                String keyword = searchTextField.getText().trim();
                if (!keyword.isEmpty()) {
                    searchAddressBook(keyword);
                } else {
                    loadTableData();
                }
            }
        });}
// Fungsi untuk Menambah Data
    
private void addData() {
        if (validateInput()) {
            String sql = "INSERT INTO AddressBook (name, address, phone) VALUES (?, ?, ?)";
            try (Connection conn = DatabaseConnection.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, nameTextField.getText().trim());
                pstmt.setString(2, addressTextField.getText().trim());
                pstmt.setString(3, phoneTextField.getText().trim());
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!", "Success", JOptionPane.INFORMATION_MESSAGE);
                clearFields();
                loadTableData();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Fungsi untuk Memperbarui Data
    private void updateData() {
        if (validateInput() && !idTextField.getText().trim().isEmpty()) {
            String sql = "UPDATE AddressBook SET name = ?, address = ?, phone = ? WHERE id = ?";
            try (Connection conn = DatabaseConnection.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, nameTextField.getText().trim());
                pstmt.setString(2, addressTextField.getText().trim());
                pstmt.setString(3, phoneTextField.getText().trim());
                pstmt.setInt(4, Integer.parseInt(idTextField.getText().trim()));
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data berhasil diubah!", "Success", JOptionPane.INFORMATION_MESSAGE);
                clearFields();
                loadTableData();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin diubah!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Fungsi untuk Menghapus Data
    private void deleteData() {
        if (!idTextField.getText().trim().isEmpty()) {
            int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                String sql = "DELETE FROM AddressBook WHERE id = ?";
                try (Connection conn = DatabaseConnection.connect();
                     PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    pstmt.setInt(1, Integer.parseInt(idTextField.getText().trim()));
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    clearFields();
                    loadTableData();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void loadTableData() {
    DefaultTableModel model = (DefaultTableModel) jTable.getModel();
    model.setRowCount(0); // Kosongkan tabel sebelum memuat data
    String sql = "SELECT * FROM AddressBook";
    try (Connection conn = DatabaseConnection.connect();
         PreparedStatement pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery()) {
        while (rs.next()) {
            Object[] row = { rs.getInt("id"), rs.getString("name"), rs.getString("address"), rs.getString("phone") };
            model.addRow(row);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
    private boolean validateInput() {
    if (nameTextField.getText().trim().isEmpty() || 
        addressTextField.getText().trim().isEmpty() || 
        phoneTextField.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validasi nomor telepon harus angka
    try {
        Long.parseLong(phoneTextField.getText().trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Nomor telepon harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    return true;
}
 // Fungsi untuk Mencari Data Berdasarkan Kata Kunci
    private void searchAddressBook(String keyword) {
        String sql = "SELECT * FROM AddressBook WHERE name LIKE ? OR address LIKE ? OR phone LIKE ?";
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0); // Kosongkan tabel sebelum memuat hasil pencarian

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            // Gunakan wildcard untuk pencarian
            String searchKeyword = "%" + keyword + "%";
            pstmt.setString(1, searchKeyword);
            pstmt.setString(2, searchKeyword);
            pstmt.setString(3, searchKeyword);

            ResultSet rs = pstmt.executeQuery();

            // Tambahkan hasil pencarian ke JTable
            while (rs.next()) {
                Object[] row = {
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("address"),
                    rs.getString("phone")
                };
                model.addRow(row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void exportToFile() {
    String filePath = "addressbook.txt"; // Nama file ekspor
    String sql = "SELECT * FROM AddressBook";

    try (Connection conn = DatabaseConnection.connect();
         PreparedStatement pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
         BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

        // Tulis header kolom
        writer.write("ID, Name, Address, Phone");
        writer.newLine();

        // Loop untuk menulis data ke file
        while (rs.next()) {
            String row = rs.getInt("id") + ", " +
                         rs.getString("name") + ", " +
                         rs.getString("address") + ", " +
                         rs.getString("phone");
            writer.write(row);
            writer.newLine();
        }
        writer.flush();
        System.out.println("Data berhasil diekspor ke " + filePath);

    } catch (IOException | SQLException e) {
        e.printStackTrace();
    }
}
    
    

private void importFromFile() {
    String filePath = "addressbook.txt"; // Nama file impor
    String sql = "INSERT INTO AddressBook (name, address, phone) VALUES (?, ?, ?)";

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
         Connection conn = DatabaseConnection.connect();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        String line;
        // Lewati header
        reader.readLine();

        // Loop membaca setiap baris
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(","); // Memisahkan data dengan koma
            if (data.length == 4) { // Pastikan ada 3 kolom (name, address, phone)
                pstmt.setString(1, data[1].trim());
                pstmt.setString(2, data[2].trim());
                pstmt.setString(3, data[3].trim());
                pstmt.executeUpdate();
            }
        }
        System.out.println("Data berhasil diimpor dari " + filePath);
    loadTableData();
    } catch (IOException | SQLException e) {
        e.printStackTrace();
    }
}

    private void clearFields() {
    idTextField.setText("");
    nameTextField.setText("");
    addressTextField.setText("");
    phoneTextField.setText("");
}
    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
    addData();       // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
    updateData(); // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
    deleteData();   // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
   int selectedRow = jTable.getSelectedRow();
        if (selectedRow >= 0) {
            // Ambil data dari baris yang dipilih
            String id = jTable.getValueAt(selectedRow, 0).toString();
            String name = jTable.getValueAt(selectedRow, 1).toString();
            String address = jTable.getValueAt(selectedRow, 2).toString();
            String phone = jTable.getValueAt(selectedRow, 3).toString();

            // Isi data ke field
            idTextField.setText(id);
            nameTextField.setText(name);
            addressTextField.setText(address);
            phoneTextField.setText(phone);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTableMouseClicked

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
    clearFields();        // TODO add your handling code here:
    }//GEN-LAST:event_clearButtonActionPerformed

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
    exportToFile();        // TODO add your handling code here:
    }//GEN-LAST:event_exportButtonActionPerformed

    private void importButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importButtonActionPerformed
    importFromFile();        // TODO add your handling code here:
    }//GEN-LAST:event_importButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
    searchTextField.setText("");
            loadTableData();        // TODO add your handling code here:
    }//GEN-LAST:event_resetButtonActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AplikasiBukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiBukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiBukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiBukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiBukuAlamat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exportButton;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton importButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
