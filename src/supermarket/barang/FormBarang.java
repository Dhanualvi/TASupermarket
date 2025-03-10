/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package supermarket.barang;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import supermarket.anggota.FormAnggota;
import supermarket.jamkerja.FormJamKerja2;
import supermarket.karyawan.FormKaryawan;
import supermarket.suplier.FormSuplier;

/**
 *
 * @author DanyMG
 */
public class FormBarang extends javax.swing.JFrame {

    Goods brg=new Goods();
    String[][] allGoods= brg.getAllGoods();
    String[] selGood;
    private TableRowSorter<TableModel> rowSorter;
    
    public FormBarang() {
        initComponents();
        setTable(allGoods);
    }
    public void setColumnTable(DefaultTableModel model){        
        model.addColumn("ID");        
        model.addColumn("Nama");
        model.addColumn("Jumlah");
        model.addColumn("Harga Beli");
        model.addColumn("Harga Jual");               
        
    }
    public void setColumnModel(TableColumnModel columnModel){        
        columnModel.getColumn(0).setPreferredWidth(5);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(200);
        columnModel.getColumn(3).setPreferredWidth(75);
     
    }
    public void setTable(String[][] data){
        DefaultTableModel table= new DefaultTableModel();
        setColumnTable(table);
        tblGoods.setModel(table);        
        TableColumnModel columnModel=tblGoods.getColumnModel();
        setColumnModel(columnModel);        
        tblGoods.setColumnModel(columnModel);        
        for (String[] data1 : data) {            
            
                table.addRow(new Object[]{data1[0], data1[1], data1[2], data1[3], data1[4]});                
                      
        }        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Psamping = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblSuplier = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblKaryawan = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblAnggota = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblLaporan = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblJamKerja = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel10 = new javax.swing.JPanel();
        txtAddGood = new javax.swing.JLabel();
        txtEditGood = new javax.swing.JLabel();
        txtBookGood = new javax.swing.JLabel();
        txtSellGood = new javax.swing.JLabel();
        txtRemoveGood = new javax.swing.JLabel();
        txtKeyWord = new javax.swing.JTextField();
        txtCari = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGoods = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        Psamping.setBackground(new java.awt.Color(254, 151, 114));
        Psamping.setPreferredSize(new java.awt.Dimension(160, 650));

        jPanel5.setBackground(new java.awt.Color(254, 151, 114));

        lblSuplier.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSuplier.setForeground(new java.awt.Color(52, 17, 9));
        lblSuplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSuplier.setText("Suplier");
        lblSuplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSuplierMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSuplier, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblSuplier, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(52, 17, 9));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 151, 114));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Barang");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(254, 151, 114));

        lblKaryawan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblKaryawan.setForeground(new java.awt.Color(52, 17, 9));
        lblKaryawan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKaryawan.setText("Karyawan");
        lblKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKaryawanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKaryawan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(lblKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(254, 151, 114));

        lblAnggota.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAnggota.setForeground(new java.awt.Color(52, 17, 9));
        lblAnggota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnggota.setText("Anggota");
        lblAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnggotaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblAnggota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(254, 151, 114));

        lblLaporan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLaporan.setForeground(new java.awt.Color(52, 17, 9));
        lblLaporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLaporan.setText("Laporan");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(254, 151, 114));

        lblJamKerja.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblJamKerja.setForeground(new java.awt.Color(52, 17, 9));
        lblJamKerja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJamKerja.setText("Jam Kerja");
        lblJamKerja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJamKerjaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJamKerja, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJamKerja, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PsampingLayout = new javax.swing.GroupLayout(Psamping);
        Psamping.setLayout(PsampingLayout);
        PsampingLayout.setHorizontalGroup(
            PsampingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PsampingLayout.createSequentialGroup()
                .addGroup(PsampingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PsampingLayout.setVerticalGroup(
            PsampingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PsampingLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 170, Short.MAX_VALUE))
        );

        jPanel1.add(Psamping);

        jPanel3.setBackground(new java.awt.Color(255, 229, 220));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 0));

        jToolBar1.setBackground(new java.awt.Color(255, 229, 220));
        jToolBar1.setRollover(true);

        jPanel10.setBackground(new java.awt.Color(255, 229, 220));

        txtAddGood.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAddGood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/gambar/iconfinder_new10_216291.png"))); // NOI18N
        txtAddGood.setText("Barang Baru");
        txtAddGood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddGoodMouseClicked(evt);
            }
        });

        txtEditGood.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEditGood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/gambar/iconfinder_new-24_103173.png"))); // NOI18N
        txtEditGood.setText("Edit Barang");
        txtEditGood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEditGoodMouseClicked(evt);
            }
        });

        txtBookGood.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBookGood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/gambar/iconfinder_add_126583.png"))); // NOI18N
        txtBookGood.setText("Pesan Barang");
        txtBookGood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBookGoodMouseClicked(evt);
            }
        });

        txtSellGood.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSellGood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/gambar/iconfinder_shopping-cart_216477.png"))); // NOI18N
        txtSellGood.setText("Jual Barang");
        txtSellGood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSellGoodMouseClicked(evt);
            }
        });

        txtRemoveGood.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtRemoveGood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/gambar/iconfinder_trash_115789.png"))); // NOI18N
        txtRemoveGood.setText("Buang Barang");
        txtRemoveGood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRemoveGoodMouseClicked(evt);
            }
        });

        txtKeyWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKeyWordKeyReleased(evt);
            }
        });

        txtCari.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCari.setText("Cari :");
        txtCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCariMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(txtAddGood)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditGood)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBookGood)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSellGood)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRemoveGood)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(txtCari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtAddGood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtEditGood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBookGood)
                .addComponent(txtSellGood)
                .addComponent(txtRemoveGood)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCari)))
        );

        jToolBar1.add(jPanel10);

        tblGoods.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblGoods);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddGoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddGoodMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new FormBarangBaru2(brg.getLastId(allGoods)).setVisible(true);
    }//GEN-LAST:event_txtAddGoodMouseClicked

    private void txtEditGoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEditGoodMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new FormEditBarang2().setVisible(true);
    }//GEN-LAST:event_txtEditGoodMouseClicked

    private void txtBookGoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBookGoodMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new FormPesanBarang2().setVisible(true);
    }//GEN-LAST:event_txtBookGoodMouseClicked

    private void txtSellGoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSellGoodMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        //new ().setVisible(true);
    }//GEN-LAST:event_txtSellGoodMouseClicked

    private void txtRemoveGoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRemoveGoodMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new FormBuangBarang2().setVisible(true);
    }//GEN-LAST:event_txtRemoveGoodMouseClicked

    private void lblSuplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuplierMouseClicked
        this.setVisible(false);
        new FormSuplier().setVisible(true);
    }//GEN-LAST:event_lblSuplierMouseClicked

    private void lblKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKaryawanMouseClicked
        this.setVisible(false);
        new FormKaryawan().setVisible(true);
    }//GEN-LAST:event_lblKaryawanMouseClicked

    private void lblJamKerjaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJamKerjaMouseClicked
        this.setVisible(false);
        new FormJamKerja2().setVisible(true);
    }//GEN-LAST:event_lblJamKerjaMouseClicked

    private void lblAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnggotaMouseClicked
        this.setVisible(false);
        new FormAnggota().setVisible(true);
    }//GEN-LAST:event_lblAnggotaMouseClicked

    private void txtKeyWordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyWordKeyReleased
        if(txtKeyWord.getText().equals("")) tblGoods.setRowSorter(null);
        else{
            rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + txtKeyWord.getText()));
            tblGoods.setRowSorter(rowSorter);
        }
    }//GEN-LAST:event_txtKeyWordKeyReleased

    private void txtCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCariMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Psamping;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblAnggota;
    private javax.swing.JLabel lblJamKerja;
    private javax.swing.JLabel lblKaryawan;
    private javax.swing.JLabel lblLaporan;
    private javax.swing.JLabel lblSuplier;
    private javax.swing.JTable tblGoods;
    private javax.swing.JLabel txtAddGood;
    private javax.swing.JLabel txtBookGood;
    private javax.swing.JLabel txtCari;
    private javax.swing.JLabel txtEditGood;
    private javax.swing.JTextField txtKeyWord;
    private javax.swing.JLabel txtRemoveGood;
    private javax.swing.JLabel txtSellGood;
    // End of variables declaration//GEN-END:variables

}
