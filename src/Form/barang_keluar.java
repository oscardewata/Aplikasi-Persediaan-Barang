/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import java.awt.event.KeyEvent;
import static java.lang.Integer.max;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author ASUS
 */
public class barang_keluar extends javax.swing.JFrame {
    
    /**
     * Creates new form barang_keluar
     */
    Form.koneksi koneksi = new Form.koneksi();
    
    public barang_keluar() {
        initComponents();
        tampil_combo();
        tanggal();
    }
    
    private void BtnEnabled(boolean x){
        hapusbarangkeluar.setEnabled(x);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kodebarang = new javax.swing.JTextField();
        cmbnamabarang = new javax.swing.JComboBox<>();
        ok = new javax.swing.JButton();
        hapusbarangkeluar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jumlahbarangkeluar = new javax.swing.JTextField();
        stokbarang = new javax.swing.JTextField();
        sisabarang = new javax.swing.JTextField();
        tanggalbarangkeluar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        no_keluar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbarangkeluar = new javax.swing.JTable();
        simpantransaksi = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("Barang Keluar");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Kode Barang");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Nama Barang");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Jumlah");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("Tanggal Keluar");

        kodebarang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kodebarang.setEnabled(false);

        cmbnamabarang.setEditable(true);
        cmbnamabarang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbnamabarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbnamabarangActionPerformed(evt);
            }
        });

        ok.setText("OK");
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
        });
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        hapusbarangkeluar.setText("Hapus");
        hapusbarangkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusbarangkeluarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Stok Barang");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("Sisa Barang");

        jumlahbarangkeluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jumlahbarangkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahbarangkeluarActionPerformed(evt);
            }
        });
        jumlahbarangkeluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jumlahbarangkeluarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jumlahbarangkeluarKeyTyped(evt);
            }
        });

        stokbarang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        stokbarang.setEnabled(false);
        stokbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokbarangActionPerformed(evt);
            }
        });

        sisabarang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sisabarang.setEnabled(false);
        sisabarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sisabarangActionPerformed(evt);
            }
        });

        tanggalbarangkeluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tanggalbarangkeluar.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("Nomor Keluar");

        no_keluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kodebarang)
                            .addComponent(cmbnamabarang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jumlahbarangkeluar)
                            .addComponent(stokbarang)
                            .addComponent(sisabarang)
                            .addComponent(tanggalbarangkeluar)
                            .addComponent(no_keluar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(hapusbarangkeluar)
                        .addGap(18, 18, 18)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(no_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kodebarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbnamabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(stokbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahbarangkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sisabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tanggalbarangkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapusbarangkeluar)
                    .addComponent(ok))
                .addGap(19, 19, 19))
        );

        tblbarangkeluar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "No Keluar", "Kode Barang", "Nama Barang", "Stok Barang", "Jumlah", "Sisa Barang", "Tanggal"
            }
        ));
        tblbarangkeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbarangkeluarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblbarangkeluar);

        simpantransaksi.setText("Simpan Transaksi");
        simpantransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpantransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(simpantransaksi)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(simpantransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void tampil_combo()
    {
        try {
        Connection con = koneksi.getKoneksi();
        Statement stt = con.createStatement();
        String sql = "select nama_barang from tbl_barang order by nama_barang asc";      
        ResultSet res = stt.executeQuery(sql);                               
        cmbnamabarang.addItem("==Pilih==");
        while(res.next()){
            Object[] ob = new Object[2];
            ob[0] = res.getString(1);
            
            cmbnamabarang.addItem((String) ob[0]);                                      
        }
        res.close(); stt.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
     public void tampil()
    {
        try {
        Connection con = koneksi.getKoneksi();
        Statement stt = con.createStatement();
        String sql = "select kode_barang, stok from tbl_barang where nama_barang='"+cmbnamabarang.getSelectedItem()+"'";  
        ResultSet res = stt.executeQuery(sql);
        
        while(res.next()){
            Object[] ob = new Object[2];
            ob[0]=  res.getString(1);
            ob[1]=  res.getString(2);
            
            kodebarang.setText((String) ob[0]);
            stokbarang.setText((String) ob[1]);
        }
        res.close(); stt.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }              
    }
     
    public void tanggal()
    {
        Date ys= new Date();
        SimpleDateFormat s= new SimpleDateFormat("dd-MM-yyyy");
        tanggalbarangkeluar.setText(s.format(ys));
    }

    private void cmbnamabarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbnamabarangActionPerformed
        // TODO add your handling code here:
        tampil();
    }//GEN-LAST:event_cmbnamabarangActionPerformed
    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:
        if(no_keluar.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Nomor Keluar Tidak Boleh Kosong");
        
        }else if(kodebarang.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Kode Barang Tidak Boleh Kosong");
        
        }else if(cmbnamabarang.getSelectedItem().equals(""))  
        {
            JOptionPane.showMessageDialog(null,"Nama Barang Tidak Boleh Kosong"); 
        
        }else if(stokbarang.getText().equals(""))  
        {
            JOptionPane.showMessageDialog(null,"Stok Barang Tidak Boleh Kosong"); 
        
        }else if(jumlahbarangkeluar.getText().equals(""))  
        {
            JOptionPane.showMessageDialog(null,"Jumlah Barang Keluar Tidak Boleh kosong"); 
        
        }else if(sisabarang.getText().equals(""))  
        {
            JOptionPane.showMessageDialog(null,"Sisa Barang Tidak Boleh Kosong"); 
        
        }else if(tanggalbarangkeluar.getText().equals(""))  
        {
            JOptionPane.showMessageDialog(null,"Tanggal Barang Keluar Tidak Boleh Kosong"); 
        }
    }//GEN-LAST:event_okActionPerformed

    private void hapusbarangkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusbarangkeluarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblbarangkeluar.getModel();
        int row = tblbarangkeluar.getSelectedRow();
        if(row>=0){
        int ok=JOptionPane.showConfirmDialog(null, "Yakin Mau Hapus?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(ok==0){
        model.removeRow(row);
        }                                       
        }
    }//GEN-LAST:event_hapusbarangkeluarActionPerformed

    private void simpantransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpantransaksiActionPerformed
        if(no_keluar.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Nomor Keluar Tidak Boleh Kosong");
        }else if(kodebarang.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Kode Barang Tidak Boleh Kosong");
        }else if(cmbnamabarang.getSelectedItem().equals(""))  
        {
            JOptionPane.showMessageDialog(null,"Nama Barang Tidak Boleh Kosong"); 
        }else if(stokbarang.getText().equals(""))  
        {
            JOptionPane.showMessageDialog(null,"Stok Barang Tidak Boleh Kosong"); 
        }else if(jumlahbarangkeluar.getText().equals(""))  
        {
            JOptionPane.showMessageDialog(null,"Jumlah Barang Keluar Tidak Boleh kosong"); 
        }else if(sisabarang.getText().equals(""))  
        {
            JOptionPane.showMessageDialog(null,"Sisa Barang Tidak Boleh Kosong"); 
        }else if(tanggalbarangkeluar.getText().equals(""))  
        {
            JOptionPane.showMessageDialog(null,"Tanggal Barang Keluar Tidak Boleh Kosong"); 
        }
        
        if (!kodebarang.getText().equals("") && !cmbnamabarang.getSelectedItem().equals("") && !stokbarang.getText().equals("") && !jumlahbarangkeluar.getText().equals("") && !sisabarang.getText().equals("") && !tanggalbarangkeluar.getText().equals("")){
                try {
                Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/persediaan_barang","root","");
                koneksi.createStatement().executeUpdate("UPDATE tbl_barang set stok = '"+sisabarang.getText()+"' where kode_barang = '"+kodebarang.getText()+"'");
            } catch (SQLException ex) {
                Logger.getLogger(barang_keluar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try { 
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/persediaan_barang","root","");
            koneksi.createStatement().executeUpdate("INSERT INTO tbl_barang_keluar (no_keluar, kode_barang, nama_barang, stok_barang, jumlah, sisa_barang, tanggal) VALUES ('" + no_keluar.getText() + "','" + kodebarang.getText() + "', '" + cmbnamabarang.getSelectedItem() + "', '" + stokbarang.getText() + "', '" + jumlahbarangkeluar.getText() + "', '" + sisabarang.getText() + "', '" + tanggalbarangkeluar.getText() + "')");
            reset();
            JOptionPane.showMessageDialog(null, "Input Barang Keluar Berhasil");
            } catch (SQLException ex) {
            Logger.getLogger(barang_keluar.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_simpantransaksiActionPerformed

    private void tblbarangkeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbarangkeluarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblbarangkeluarMouseClicked

    private void okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseClicked
            // TODO add your handling code here:
            DefaultTableModel model = (DefaultTableModel) tblbarangkeluar.getModel();
            model.addRow(new Object[]{
            no_keluar.getText(), kodebarang.getText(), cmbnamabarang.getSelectedItem(), stokbarang.getText(), jumlahbarangkeluar.getText(), sisabarang.getText(), tanggalbarangkeluar.getText()});
    }//GEN-LAST:event_okMouseClicked

    private void jumlahbarangkeluarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlahbarangkeluarKeyReleased
        // TODO add your handling code here:
        if(stokbarang.getText().isEmpty()){
        stokbarang.setText("0");
        } else if(jumlahbarangkeluar.getText().isEmpty()){
            jumlahbarangkeluar.setText("0");
        }
        int stok = Integer.parseInt(stokbarang.getText());
        int barangkeluar = Integer.parseInt(jumlahbarangkeluar.getText());
       
        if(barangkeluar <= stok){
        int total = stok - barangkeluar;   
        sisabarang.setText(String.valueOf(total));
        }else{
                JOptionPane.showMessageDialog(null, "Jumlah Melebihi Stok Barang");
                reset();
        }
    }//GEN-LAST:event_jumlahbarangkeluarKeyReleased
    
    private void sisabarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sisabarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sisabarangActionPerformed

    private void jumlahbarangkeluarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlahbarangkeluarKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)) && !(c == KeyEvent.VK_BACK_SPACE)){
            JOptionPane.showMessageDialog(null, "Inputan Hanya Boleh Angka");
            evt.consume();
        }
    }//GEN-LAST:event_jumlahbarangkeluarKeyTyped

    private void jumlahbarangkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahbarangkeluarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jumlahbarangkeluarActionPerformed

    private void stokbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stokbarangActionPerformed

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
            java.util.logging.Logger.getLogger(barang_keluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barang_keluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barang_keluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barang_keluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barang_keluar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbnamabarang;
    private javax.swing.JButton hapusbarangkeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField jumlahbarangkeluar;
    private javax.swing.JTextField kodebarang;
    private javax.swing.JTextField no_keluar;
    private javax.swing.JButton ok;
    private javax.swing.JButton simpantransaksi;
    private javax.swing.JTextField sisabarang;
    private javax.swing.JTextField stokbarang;
    private javax.swing.JTextField tanggalbarangkeluar;
    private javax.swing.JTable tblbarangkeluar;
    // End of variables declaration//GEN-END:variables

    private void reset() {
        no_keluar.setText("");
        kodebarang.setText("");
        cmbnamabarang.setSelectedItem("");
        stokbarang.setText("");
        jumlahbarangkeluar.setText("");
        sisabarang.setText("");
    }
}