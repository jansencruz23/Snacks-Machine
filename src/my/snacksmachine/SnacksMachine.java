package my.snacksmachine;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Jansen C. Cruz
 */
public class SnacksMachine extends javax.swing.JFrame {
    CashRegister cashier = new CashRegister(1000);
    
    Dispenser candy = new Dispenser(3, 50);
    Dispenser chips = new Dispenser(3, 100);
    Dispenser gum = new Dispenser(4, 10);
    Dispenser cookies = new Dispenser(5, 40);
    
    int pay;
    
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
        btnCandy = new javax.swing.JButton();
        btnChips = new javax.swing.JButton();
        btnGum = new javax.swing.JButton();
        btnCookies = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Snacks Machine");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 153, 255));
        jLabel1.setFont(new java.awt.Font("Harrington", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to the Sweet World!");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 255), 2, true));
        jLabel1.setOpaque(true);

        panelBg.setBackground(new java.awt.Color(249, 235, 249));

        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/icons/logo.png"));
        Image imgLogo = iconLogo.getImage().getScaledInstance(220, 150, Image.SCALE_SMOOTH);
        ImageIcon logo = new ImageIcon(imgLogo);
        lblIcon.setIcon(logo);
        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setText(" ");

        panelGrid.setBackground(new java.awt.Color(249, 235, 249));
        panelGrid.setLayout(new java.awt.GridLayout(5, 1, 0, 7));

        btnCandy.setBackground(new java.awt.Color(255, 153, 204));
        btnCandy.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        btnCandy.setForeground(new java.awt.Color(102, 0, 102));
        btnCandy.setIcon(setButtonIcon("/icons/candy.png"));
        btnCandy.setText("Candy");
        btnCandy.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 204), 2, true));
        btnCandy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCandy.setFocusable(false);
        btnCandy.setIconTextGap(25);
        btnCandy.setMargin(new java.awt.Insets(2, 24, 3, 14));
        btnCandy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onProductActionPerformed(evt);
            }
        });
        panelGrid.add(btnCandy);
        btnCandy.getAccessibleContext().setAccessibleName("");

        btnChips.setBackground(new java.awt.Color(153, 255, 153));
        btnChips.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        btnChips.setForeground(new java.awt.Color(0, 51, 0));
        btnChips.setIcon(setButtonIcon("/icons/chips.png")
        );
        btnChips.setText("Chip");
        btnChips.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        btnChips.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChips.setFocusable(false);
        btnChips.setIconTextGap(27);
        btnChips.setMargin(new java.awt.Insets(2, 24, 3, 14));
        btnChips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onProductActionPerformed(evt);
            }
        });
        panelGrid.add(btnChips);
        btnChips.getAccessibleContext().setAccessibleName("");

        btnGum.setBackground(new java.awt.Color(255, 255, 153));
        btnGum.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        btnGum.setForeground(new java.awt.Color(153, 51, 0));
        btnGum.setIcon(setButtonIcon("/icons/gum.png"));
        btnGum.setIconTextGap(10);
        btnGum.setText("Gum");
        btnGum.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        btnGum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGum.setFocusable(false);
        btnGum.setIconTextGap(35);
        btnGum.setMargin(new java.awt.Insets(2, 24, 3, 14));
        btnGum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onProductActionPerformed(evt);
            }
        });
        panelGrid.add(btnGum);
        btnGum.getAccessibleContext().setAccessibleName("");

        btnCookies.setBackground(new java.awt.Color(255, 195, 165));
        btnCookies.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        btnCookies.setForeground(new java.awt.Color(58, 48, 23));
        btnCookies.setIcon(setButtonIcon("/icons/cookie.png"));
        btnCookies.setText("Cookie");
        btnCookies.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(161, 131, 53), 2, true));
        btnCookies.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCookies.setFocusable(false);
        btnCookies.setIconTextGap(15);
        btnCookies.setMargin(new java.awt.Insets(2, 24, 3, 14));
        btnCookies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onProductActionPerformed(evt);
            }
        });
        panelGrid.add(btnCookies);
        btnCookies.getAccessibleContext().setAccessibleName("");

        btnExit.setBackground(new java.awt.Color(64, 63, 63));
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

        jLabel2.setText("Developed by: Jansen C. Cruz");

        javax.swing.GroupLayout panelBgLayout = new javax.swing.GroupLayout(panelBg);
        panelBg.setLayout(panelBgLayout);
        panelBgLayout.setHorizontalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBgLayout.createSequentialGroup()
                        .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBgLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBgLayout.setVerticalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblIcon)
                .addGap(18, 18, 18)
                .addComponent(panelGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
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
                .addComponent(panelBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int exit = JOptionPane.showOptionDialog(null, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 1);
        if(exit == 0)
            System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    // method on click of the products, passing the pay, product, and the button to productClicked method
    private void onProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onProductActionPerformed
        var product = (JButton) evt.getSource();
        switch(product.getText()){
            case "Candy":
                dispenseProduct(candy, btnCandy);
                break;
            case "Chip":
                dispenseProduct(chips, btnChips);
                break;
            case "Gum":
                dispenseProduct(gum, btnGum);
                break;
            case "Cookie":
                dispenseProduct(cookies, btnCookies);
                break;
        }
    }//GEN-LAST:event_onProductActionPerformed

    // validate if pay is sufficient, validate if there are stocks left, and create changes to the button if no stocks are left
    private void dispenseProduct(Dispenser product, JButton btn){
        pay = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("To buy a %s please insert %d cents", btn.getText(), product.getProductCost())));
        
        while(pay < product.getProductCost())
        {
            int payMore = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("To buy a %s please insert additional %d cents", btn.getText(), product.getProductCost() - pay)));
            pay += payMore;
        }
        
        cashier.acceptAmount(pay);
        product.makeSale();
        JOptionPane.showMessageDialog(null, String.format("Please pickup your %s and Enjoy!", btn.getText()), "Thank you, come again", JOptionPane.INFORMATION_MESSAGE);

        if(pay > product.getProductCost())
        {
            int change = cashier.giveChange(pay, product.getProductCost());
            JOptionPane.showMessageDialog(null, "Please get your change: " + change, "Change", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(product.getCount() <= 0)
        {
            JOptionPane.showMessageDialog(null, "Out of Stock", String.format("%s is out of stock", btn.getText()), JOptionPane.ERROR_MESSAGE);
            btn.setEnabled(false);
            btn.setForeground(Color.WHITE);
            btn.setContentAreaFilled(false);
            btn.setOpaque(true);
            btn.setBackground(Color.RED);
        }
    }

    
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
    private javax.swing.JButton btnCandy;
    private javax.swing.JButton btnChips;
    private javax.swing.JButton btnCookies;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JPanel panelBg;
    private javax.swing.JPanel panelGrid;
    // End of variables declaration//GEN-END:variables
}