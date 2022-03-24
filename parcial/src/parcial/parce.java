/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parcial;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Alex Giron
 */
public class parce extends javax.swing.JFrame {
    int xMouse, yMouse;
    
    /**
     * Creates new form parce
     */
    public parce() {
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

        bg = new JPanel();
        logoname = new JLabel();
        citybg = new JLabel();
        header = new JPanel();
        exitBtn = new JPanel();
        exitTxt = new JLabel();
        favicom = new JLabel();
        title = new JLabel();
        userLabe = new JLabel();
        userTxt = new JTextField();
        jSeparator2 = new JSeparator();
        passLabel = new JLabel();
        passTxt = new JPasswordField();
        jSeparator3 = new JSeparator();
        loginBtn = new JPanel();
        loginTxt = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new Color(255, 255, 255));
        bg.setToolTipText("");
        bg.setName("X\n"); // NOI18N
        bg.setLayout(new AbsoluteLayout());

        logoname.setFont(new Font("Tahoma", 0, 28)); // NOI18N
        logoname.setForeground(new Color(255, 255, 255));
        logoname.setText("UES FMO");
        bg.add(logoname, new AbsoluteConstraints(1090, 330, 130, 100));

        citybg.setIcon(new ImageIcon(getClass().getResource("/parcial/imagenes/tienda.png"))); // NOI18N
        citybg.setText("jLabel1");
        citybg.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bg.add(citybg, new AbsoluteConstraints(560, 0, 750, 560));

        header.setBackground(new Color(255, 255, 255));
        header.setForeground(new Color(255, 255, 255));
        header.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new Color(255, 255, 255));
        exitBtn.setToolTipText("X");
        exitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        exitTxt.setBackground(new Color(255, 255, 255));
        exitTxt.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        exitTxt.setForeground(new Color(255, 0, 0));
        exitTxt.setHorizontalAlignment(SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        GroupLayout exitBtnLayout = new GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(exitBtnLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(exitBtnLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout headerLayout = new GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(headerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1260, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(headerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        bg.add(header, new AbsoluteConstraints(0, 0, 1310, -1));

        favicom.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        favicom.setIcon(new ImageIcon(getClass().getResource("/parcial/imagenes/favicon.png"))); // NOI18N
        favicom.setText("FMOcc");
        bg.add(favicom, new AbsoluteConstraints(0, 30, 140, 50));

        title.setFont(new Font("SansSerif", 1, 22)); // NOI18N
        title.setText("INICIAR SESION");
        bg.add(title, new AbsoluteConstraints(10, 130, 310, 40));

        userLabe.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        userLabe.setText("USUARIO");
        bg.add(userLabe, new AbsoluteConstraints(20, 200, 120, 30));

        userTxt.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        userTxt.setForeground(new Color(102, 102, 102));
        userTxt.setText("Ingrese su nombre de Usuario");
        userTxt.setBorder(null);
        userTxt.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        userTxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        bg.add(userTxt, new AbsoluteConstraints(20, 240, 350, 30));

        jSeparator2.setForeground(new Color(0, 0, 0));
        bg.add(jSeparator2, new AbsoluteConstraints(10, 270, 360, 40));

        passLabel.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        passLabel.setText("CONTRASEÑA");
        bg.add(passLabel, new AbsoluteConstraints(20, 310, 180, 40));

        passTxt.setForeground(new Color(102, 102, 102));
        passTxt.setText("******");
        passTxt.setBorder(null);
        passTxt.setCaretColor(new Color(102, 102, 102));
        passTxt.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        bg.add(passTxt, new AbsoluteConstraints(20, 360, 340, -1));

        jSeparator3.setForeground(new Color(0, 0, 0));
        bg.add(jSeparator3, new AbsoluteConstraints(10, 380, 360, 30));

        loginBtn.setBackground(new Color(0, 0, 204));
        loginBtn.setBorder(new MatteBorder(null));
        loginBtn.setForeground(new Color(51, 51, 51));
        loginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });

        loginTxt.setFont(new Font("Tempus Sans ITC", 1, 16)); // NOI18N
        loginTxt.setForeground(new Color(255, 255, 255));
        loginTxt.setHorizontalAlignment(SwingConstants.CENTER);
        loginTxt.setText("ENTRAR");
        loginTxt.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                loginTxtMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                loginTxtMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                loginTxtMouseExited(evt);
            }
        });

        GroupLayout loginBtnLayout = new GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(loginBtnLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(loginTxt, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );
        loginBtnLayout.setVerticalGroup(loginBtnLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(loginTxt, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        bg.add(loginBtn, new AbsoluteConstraints(20, 440, 180, 50));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bg, GroupLayout.PREFERRED_SIZE, 1310, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(bg, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTxtActionPerformed(ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void headerMousePressed(MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
xMouse = evt.getX();
yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();        
        this.setLocation(x - xMouse,y - yMouse);
        
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseClicked(MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
        
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
        
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
       exitTxt.setForeground(Color.red);
    }//GEN-LAST:event_exitTxtMouseExited

    private void userTxtMousePressed(MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
       if(userTxt.getText().equals("Ingrese su nombre de ususario"));{
        userTxt.setText("");
        userTxt.setForeground(Color.black);
    }
        if (String.valueOf(passTxt.getPassword()).isEmpty()){
        passTxt.setText("******");
         passTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void passTxtMousePressed(MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if(userTxt.getText().isEmpty()){
        userTxt.setText("Ingrese su nombre de usuario");
        userTxt.setForeground(Color.gray);
        }
        if (String.valueOf(passTxt.getPassword()).equals("******")){
        passTxt.setText("");
        passTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_passTxtMousePressed

    private void loginBtnMouseClicked(MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
   
        
    }//GEN-LAST:event_loginBtnMouseClicked

    private void loginTxtMouseEntered(MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseEntered
      loginBtn.setBackground(Color.green);
    }//GEN-LAST:event_loginTxtMouseEntered

    private void loginTxtMouseExited(MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseExited
          loginBtn.setBackground(Color.blue);
    }//GEN-LAST:event_loginTxtMouseExited

    private void loginTxtMouseClicked(MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseClicked
       javax.swing.JOptionPane.showMessageDialog(this, "Intento de login con los datos: \nUsuario: " + userTxt.getText() + "\ncontraseña: " + String.valueOf(passTxt.getPassword()) , "LOGIN",javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_loginTxtMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new parce().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel bg;
    private JLabel citybg;
    private JPanel exitBtn;
    private JLabel exitTxt;
    private JLabel favicom;
    private JPanel header;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JPanel loginBtn;
    private JLabel loginTxt;
    private JLabel logoname;
    private JLabel passLabel;
    private JPasswordField passTxt;
    private JLabel title;
    private JLabel userLabe;
    private JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
