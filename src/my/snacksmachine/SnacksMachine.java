package my.snacksmachine;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
/**
 *
 * @author Jansen C. Cruz
 */
public class SnacksMachine extends javax.swing.JFrame {
    public SnacksMachine() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelBg = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        panelGrid = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Snacks Machine");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Gigi", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to the Sweet World!");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(252, 0, 0), 2, true));
        jLabel1.setOpaque(true);

        panelBg.setBackground(new java.awt.Color(255, 255, 255));

        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/icons/logo.png"));
        Image imgLogo = iconLogo.getImage().getScaledInstance(220, 150, Image.SCALE_SMOOTH);
        ImageIcon logo = new ImageIcon(imgLogo);
        lblIcon.setIcon(logo);
        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setText(" ");

        panelGrid.setBackground(new java.awt.Color(255, 255, 255));
        panelGrid.setLayout(new java.awt.GridLayout(5, 1, 0, 7));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 204));
        jButton1.setIcon(setButtonIcon("/icons/candy.png"));
        jButton1.setIconTextGap(30);
        jButton1.setText("Candy");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setIconTextGap(5);
        panelGrid.add(jButton1);

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 0));
        jButton2.setIcon(setButtonIcon("/icons/chips.png")
        );
        jButton2.setText("Chips");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setIconTextGap(5);
        panelGrid.add(jButton2);

        jButton3.setBackground(new java.awt.Color(255, 255, 153));
        jButton3.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 51, 0));
        jButton3.setText("Gum");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        panelGrid.add(jButton3);

        jButton4.setBackground(new java.awt.Color(255, 153, 204));
        jButton4.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 0, 102));
        jButton4.setText("Cookies");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 204), 2, true));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        panelGrid.add(jButton4);

        btnExit.setBackground(new java.awt.Color(51, 51, 51));
        btnExit.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setFocusable(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        panelGrid.add(btnExit);

        javax.swing.GroupLayout panelBgLayout = new javax.swing.GroupLayout(panelBg);
        panelBg.setLayout(panelBgLayout);
        panelBgLayout.setHorizontalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBgLayout.setVerticalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblIcon)
                .addGap(29, 29, 29)
                .addComponent(panelGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
            .addComponent(panelBg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int exit = JOptionPane.showOptionDialog(null, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 1);
        if(exit == 0)
            System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private static void sleepThread(){
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException ex){
            System.out.println("");
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sleepThread();
                new SnacksMachine().setVisible(true);
            }
        });
    }
    
    private ImageIcon setButtonIcon(String path){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(path));
        Image img = imageIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(img);
        return imgIcon;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JPanel panelBg;
    private javax.swing.JPanel panelGrid;
    // End of variables declaration//GEN-END:variables
}
