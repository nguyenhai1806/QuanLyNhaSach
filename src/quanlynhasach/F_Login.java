/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhasach;

import BLL.BNhanVien;
import BLL.BTaiKhoan;
import DTO.NhanVien;
import javax.swing.JOptionPane;

/**
 *
 * @author Nguyen Hai
 */
public class F_Login extends javax.swing.JFrame {

    /**
     * Creates new form f_Login
     */
    public F_Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPasswordField4 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_TenDangNhap = new javax.swing.JTextField();
        btn_DangNhap = new javax.swing.JToggleButton();
        tf_Pass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        lb_ShowPass = new javax.swing.JLabel();
        btn_DoiSever = new javax.swing.JToggleButton();

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Mật khẩu cũ:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Mật khẩu mới:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Mật khẩu mới:");

        jPasswordField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jPasswordField3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jPasswordField4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(234, 35, 48));
        jLabel8.setText("Mật khẩu không trùng khớp");

        jToggleButton2.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jToggleButton2.setText("Cập nhập");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(jPasswordField2)
                            .addComponent(jPasswordField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jPasswordField4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(34, 117, 239));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("An Nhiên");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Book.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(72, 72, 72))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 232));

        tf_TenDangNhap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tf_TenDangNhap.setForeground(new java.awt.Color(51, 51, 0));
        tf_TenDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_TenDangNhapKeyTyped(evt);
            }
        });
        jPanel1.add(tf_TenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 320, 35));

        btn_DangNhap.setBackground(new java.awt.Color(255, 255, 255));
        btn_DangNhap.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_DangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_unlock_30px.png"))); // NOI18N
        btn_DangNhap.setText("Đăng Nhập");
        btn_DangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangNhapActionPerformed(evt);
            }
        });
        jPanel1.add(btn_DangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 160, 36));

        tf_Pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_Pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_PassKeyTyped(evt);
            }
        });
        jPanel1.add(tf_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 320, 35));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 119, -1, 35));

        lb_ShowPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_ShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/eye.png"))); // NOI18N
        lb_ShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_ShowPassMouseClicked(evt);
            }
        });
        jPanel1.add(lb_ShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 38, 35));

        btn_DoiSever.setBackground(new java.awt.Color(255, 255, 255));
        btn_DoiSever.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_DoiSever.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_server_30px.png"))); // NOI18N
        btn_DoiSever.setText("Đổi Sever");
        btn_DoiSever.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DoiSeverMouseClicked(evt);
            }
        });
        btn_DoiSever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DoiSeverActionPerformed(evt);
            }
        });
        jPanel1.add(btn_DoiSever, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 147, 36));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        if (tf_Pass.getEchoChar()=='*')
            tf_Pass.setEchoChar((char)0);
        else 
            tf_Pass.setEchoChar('*');
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btn_DangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangNhapActionPerformed
        String thongBao = ""; boolean flag = true;
        try{
            if (tf_TenDangNhap.getText().trim().length() == 0){
                thongBao = thongBao + "\nTên đăng nhập không để trống";
                flag = false;
            }
            
            
            if (tf_Pass.getText().trim().length() == 0) {
                thongBao = thongBao + "\nMật khẩu không được để trống";
                flag = false;
            }
            if ((!BTaiKhoan.getInstance().CheckDangNhap(tf_TenDangNhap.getText(), tf_Pass.getText()))&&tf_Pass.getText().trim().length() != 0&&tf_TenDangNhap.getText().trim().length() != 0){
                thongBao = thongBao + "\nSai tên tài khoản hoặc mật khẩu";
                flag = false;
            }
            else if (!BTaiKhoan.getInstance().checkAccess(tf_TenDangNhap.getText())) {
                thongBao = thongBao + "\nNhân viên này không được phép đăng nhập";
                flag = false;
            }
             
            if (flag) {
                BienToanCuc.getInstance().setNguoiDangNhap(BNhanVien.getInstance().getNVByTenDN(tf_TenDangNhap.getText().trim()));
                BienToanCuc.getInstance().getF_Home().setVisible(true);
                BienToanCuc.getInstance().closeF_DoiServer();
                BienToanCuc.getInstance().closeF_Login();
                thongBao = null;
            }
               
        }catch(Exception e){
            thongBao = "ERROR: " + e.getMessage();
        }
        if (thongBao != null) {
            JOptionPane.showMessageDialog(this, thongBao);
        }
    }//GEN-LAST:event_btn_DangNhapActionPerformed

    private void tf_PassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_PassKeyTyped
        char c = evt.getKeyChar();
        if (c == ' ')
           evt.consume();
    }//GEN-LAST:event_tf_PassKeyTyped

    private void tf_TenDangNhapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_TenDangNhapKeyTyped
       char c = evt.getKeyChar();
       if (c == ' ')
           evt.consume();
    }//GEN-LAST:event_tf_TenDangNhapKeyTyped

    private void lb_ShowPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ShowPassMouseClicked
        if (tf_Pass.getEchoChar() != '\u25cf'){
            tf_Pass.setEchoChar('\u25cf');
            lb_ShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/eye.png"))); // NOI18N
        }
        else{
            tf_Pass.setEchoChar((char)0);
            lb_ShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_invisible_20px.png")));
        }
    }//GEN-LAST:event_lb_ShowPassMouseClicked

    private void btn_DoiSeverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DoiSeverActionPerformed
        BienToanCuc.getInstance().getF_DoiSever().setVisible(true);
    }//GEN-LAST:event_btn_DoiSeverActionPerformed

    private void btn_DoiSeverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DoiSeverMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_DoiSeverMouseClicked

    
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
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(F_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_DangNhap;
    private javax.swing.JToggleButton btn_DoiSever;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel lb_ShowPass;
    private javax.swing.JPasswordField tf_Pass;
    private javax.swing.JTextField tf_TenDangNhap;
    // End of variables declaration//GEN-END:variables
}
