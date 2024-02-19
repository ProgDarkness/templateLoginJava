package com.local.login;

import java.awt.Color;
import javax.swing.JOptionPane;

public class vistalogin extends javax.swing.JFrame {
    int mouseX, mouseY;
    
    public vistalogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        bg_logo = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        buttom_exit = new javax.swing.JPanel();
        label_exit = new javax.swing.JLabel();
        favicon = new javax.swing.JLabel();
        label_pass = new javax.swing.JLabel();
        label_login = new javax.swing.JLabel();
        label_user = new javax.swing.JLabel();
        label_favicon = new javax.swing.JLabel();
        inputUser = new javax.swing.JTextField();
        inputPass = new javax.swing.JPasswordField();
        separator_pass = new javax.swing.JSeparator();
        separator_user = new javax.swing.JSeparator();
        buttom_entrar = new javax.swing.JPanel();
        label_entrar = new javax.swing.JLabel();

        label_logo.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        label_logo.setForeground(new java.awt.Color(255, 255, 255));
        label_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_logo.setText("COMPANY");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMPANY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 290, 60));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/local/images/logo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 290, 150));

        bg_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/local/images/city.png"))); // NOI18N
        bg_logo.setAutoscrolls(true);
        jPanel1.add(bg_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 290, 500));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        buttom_exit.setBackground(new java.awt.Color(255, 255, 255));
        buttom_exit.setForeground(new java.awt.Color(0, 0, 0));
        buttom_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttom_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttom_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttom_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttom_exitMouseExited(evt);
            }
        });

        label_exit.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        label_exit.setForeground(new java.awt.Color(102, 102, 102));
        label_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_exit.setText("X");

        javax.swing.GroupLayout buttom_exitLayout = new javax.swing.GroupLayout(buttom_exit);
        buttom_exit.setLayout(buttom_exitLayout);
        buttom_exitLayout.setHorizontalGroup(
            buttom_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        buttom_exitLayout.setVerticalGroup(
            buttom_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(buttom_exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 770, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttom_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/local/images/favicon.png"))); // NOI18N
        jPanel1.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        label_pass.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        label_pass.setForeground(new java.awt.Color(102, 102, 102));
        label_pass.setText("Contraseña:");
        jPanel1.add(label_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 120, 20));

        label_login.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        label_login.setForeground(new java.awt.Color(102, 102, 102));
        label_login.setText("Inicio de Sesion");
        jPanel1.add(label_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 180, 30));

        label_user.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        label_user.setForeground(new java.awt.Color(102, 102, 102));
        label_user.setText("Usuario:");
        jPanel1.add(label_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 120, 20));

        label_favicon.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        label_favicon.setForeground(new java.awt.Color(102, 102, 102));
        label_favicon.setText("Company");
        jPanel1.add(label_favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 120, 30));

        inputUser.setBackground(new java.awt.Color(255, 255, 255));
        inputUser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputUser.setForeground(new java.awt.Color(153, 153, 153));
        inputUser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputUser.setText("Ingrese su usuario");
        inputUser.setToolTipText("");
        inputUser.setBorder(null);
        inputUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputUserMousePressed(evt);
            }
        });
        jPanel1.add(inputUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 330, 30));

        inputPass.setBackground(new java.awt.Color(255, 255, 255));
        inputPass.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputPass.setForeground(new java.awt.Color(153, 153, 153));
        inputPass.setText("**********");
        inputPass.setBorder(null);
        inputPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputPassMousePressed(evt);
            }
        });
        jPanel1.add(inputPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 330, 30));
        jPanel1.add(separator_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 330, 20));
        jPanel1.add(separator_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 330, 20));

        buttom_entrar.setBackground(new java.awt.Color(0, 132, 192));
        buttom_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_entrar.setBackground(new java.awt.Color(255, 255, 255));
        label_entrar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        label_entrar.setForeground(new java.awt.Color(255, 255, 255));
        label_entrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_entrar.setText("Entrar");
        label_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_entrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_entrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_entrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout buttom_entrarLayout = new javax.swing.GroupLayout(buttom_entrar);
        buttom_entrar.setLayout(buttom_entrarLayout);
        buttom_entrarLayout.setHorizontalGroup(
            buttom_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        buttom_entrarLayout.setVerticalGroup(
            buttom_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(buttom_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 80, 30));

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

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation((x - mouseX), (y - mouseY));
    }//GEN-LAST:event_headerMouseDragged

    private void buttom_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttom_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_buttom_exitMouseClicked

    private void buttom_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttom_exitMouseEntered
        buttom_exit.setBackground(Color.red);
        label_exit.setForeground(Color.white);
    }//GEN-LAST:event_buttom_exitMouseEntered

    private void buttom_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttom_exitMouseExited
        buttom_exit.setBackground(Color.white);
        label_exit.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_buttom_exitMouseExited

    private void inputUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputUserMousePressed
        inputUser.setText("");
        inputUser.setForeground(Color.black);
        
        if (inputPass.getPassword().length < 1) {
            inputPass.setText("***********");
            inputPass.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_inputUserMousePressed

    private void inputPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputPassMousePressed
        if (inputUser.getText().length() < 1) {
            inputUser.setText("Ingrese su usuario");
            inputUser.setForeground(new Color(153,153,153));
        }
        inputPass.setText("");
        inputPass.setForeground(Color.black);
    }//GEN-LAST:event_inputPassMousePressed

    private void label_entrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_entrarMousePressed
        if (!inputUser.getText().equals("Ingrese su usuario") && !inputUser.getText().equals("") && !String.valueOf(inputPass.getPassword()).equals("") && !String.valueOf(inputPass.getPassword()).equals("***********")) {
            JOptionPane.showMessageDialog(this, "LogIn! \n Success \n Usuario: "+ inputUser.getText() + "\n Contraseña: " + String.valueOf(inputPass.getPassword()));
            inputUser.setText("Ingrese su usuario");
            inputUser.setForeground(new Color(153,153,153));
            inputPass.setText("***********");
            inputPass.setForeground(new Color(153,153,153));
        } else {
            JOptionPane.showMessageDialog(this, "Error \n Permiss invalid!");
        }
    }//GEN-LAST:event_label_entrarMousePressed

    private void label_entrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_entrarMouseEntered
        buttom_entrar.setBackground(new Color(0,105,153));
    }//GEN-LAST:event_label_entrarMouseEntered

    private void label_entrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_entrarMouseExited
        buttom_entrar.setBackground(new Color(0,132,192));
    }//GEN-LAST:event_label_entrarMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new vistalogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_logo;
    private javax.swing.JPanel buttom_entrar;
    private javax.swing.JPanel buttom_exit;
    private javax.swing.JLabel favicon;
    private javax.swing.JPanel header;
    private javax.swing.JPasswordField inputPass;
    private javax.swing.JTextField inputUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_entrar;
    private javax.swing.JLabel label_exit;
    private javax.swing.JLabel label_favicon;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_pass;
    private javax.swing.JLabel label_user;
    private javax.swing.JLabel logo;
    private javax.swing.JSeparator separator_pass;
    private javax.swing.JSeparator separator_user;
    // End of variables declaration//GEN-END:variables
}
