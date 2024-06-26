/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotelmanagement;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

/**
 *
 * @author aswin
 */
public class Report extends javax.swing.JFrame {
    String Date;
    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
        jScrollPane1.getViewport().setBackground(Color.white);
        jScrollPane2.getViewport().setBackground(Color.white);
        jScrollPane3.getViewport().setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selection = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        date1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        bill = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reserve = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        book = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        checkout = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setOpaque(false);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backLayout = new javax.swing.GroupLayout(back);
        back.setLayout(backLayout);
        backLayout.setHorizontalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        backLayout.setVerticalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("DATE :");

        date1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        date1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        bill.setBackground(new java.awt.Color(42, 60, 104));
        bill.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        bill.setForeground(new java.awt.Color(255, 255, 255));
        bill.setText("SHOW REPORT");
        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bill, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(date1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(bill, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 320, 110));

        jPanel3.setOpaque(false);

        reserve.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        reserve.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Room No", "Name", "Phone No", "Address", "Check In"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        reserve.setRowHeight(22);
        jScrollPane1.setViewportView(reserve);

        book.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        book.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Room No", "Name", "Phone No", "Address", "Check In"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        book.setRowHeight(22);
        jScrollPane3.setViewportView(book);

        checkout.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        checkout.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Room No", "Name", "Phone No", "Address", "Check In", "Check Out", "Amount"
            }
        ));
        checkout.setRowHeight(22);
        jScrollPane2.setViewportView(checkout);

        jLabel10.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(42, 60, 104));
        jLabel10.setText("RESERVATIONS:");

        jLabel11.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(42, 60, 104));
        jLabel11.setText("BOOKINGS:");

        jLabel12.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(42, 60, 104));
        jLabel12.setText("CHECKOUTS:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 970, 730));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/report (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed
        // TODO add your handling code here:
        Date=date1.getText();
        fetchR();
        fetchB();
        fetchC();
    }//GEN-LAST:event_billActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        Dashboard d=new Dashboard();
        d.show();
        dispose();
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel back;
    private javax.swing.JButton bill;
    private javax.swing.JTable book;
    private javax.swing.JTable checkout;
    private javax.swing.JTextField date1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable reserve;
    private javax.swing.ButtonGroup selection;
    // End of variables declaration//GEN-END:variables

    public void fetchR(){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelManagement","root","");
           String sql="select * from CustomerInfo where CheckIn='"+Date+"' && Type='RESERVED'";
           Statement stmt=con.createStatement();
           ResultSet rs=stmt.executeQuery(sql);
           DefaultTableModel d1=(DefaultTableModel)reserve.getModel();
           d1.setRowCount(0);
           while(rs.next())
           {
               
               Vector v2=new Vector();
                    v2.add(rs.getString("ID"));
                    v2.add(rs.getString("Room"));
                    v2.add(rs.getString("Name"));
                    v2.add(rs.getString("PhnNo"));
                    v2.add(rs.getString("Address"));
                    v2.add(rs.getString("CheckIn"));
               d1.addRow(v2);
           }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }
    
    public void fetchB(){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelManagement","root","");
           String sql="select * from CustomerInfo where CheckIn='"+Date+"' && Type='BOOKED'";
           Statement stmt=con.createStatement();
           ResultSet rs=stmt.executeQuery(sql);
           DefaultTableModel d1=(DefaultTableModel)book.getModel();
           d1.setRowCount(0);
           while(rs.next())
           {
               
               Vector v2=new Vector();
                    v2.add(rs.getString("ID"));
                    v2.add(rs.getString("Room"));
                    v2.add(rs.getString("Name"));
                    v2.add(rs.getString("PhnNo"));
                    v2.add(rs.getString("Address"));
                    v2.add(rs.getString("CheckIn"));
               d1.addRow(v2);
           }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }
    
    public void fetchC(){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelManagement","root","");
           String sql="select CustomerInfo.ID,CustomerInfo.Room,CustomerInfo.Name,CustomerInfo.PhnNo,CustomerInfo.CheckIn,Address,CheckOut,Amount from CustomerInfo,CheckOut where CustomerInfo.Room=CheckOut.Room && CheckOut.CheckOut='"+Date+"' && CustomerInfo.Type='CHECKOUT'";
           Statement stmt=con.createStatement();
           ResultSet rs=stmt.executeQuery(sql);
           DefaultTableModel d1=(DefaultTableModel)checkout.getModel();
           d1.setRowCount(0);
           while(rs.next())
           {
               
               Vector v2=new Vector();
                    v2.add(rs.getString("ID"));
                    v2.add(rs.getString("Room"));
                    v2.add(rs.getString("Name"));
                    v2.add(rs.getString("PhnNo"));
                    v2.add(rs.getString("Address"));
                    v2.add(rs.getString("CheckIn"));
                    v2.add(rs.getString("CheckOut"));
                    v2.add(rs.getString("Amount"));
               d1.addRow(v2);
           }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }

}
