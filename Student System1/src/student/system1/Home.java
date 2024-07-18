
package student.system1;

import javax.swing.JOptionPane;
import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.ResultSet ;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;




public class Home extends javax.swing.JFrame {

  
    public Home() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LogoutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        course = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        prn = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        searchData = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setPreferredSize(new java.awt.Dimension(1000, 500));

        jPanel1.setPreferredSize(new java.awt.Dimension(2000, 600));

        LogoutBtn.setFont(new java.awt.Font("SimSun-ExtB", 0, 12)); // NOI18N
        LogoutBtn.setText("Logout");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SimSun-ExtB", 0, 36)); // NOI18N
        jLabel2.setText("Create");

        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jLabel1.setText(" Name :");

        jLabel3.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jLabel3.setText("Course :");

        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jLabel4.setText("PRN No:");

        prn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prnActionPerformed(evt);
            }
        });

        submit.setFont(new java.awt.Font("SimSun-ExtB", 0, 14)); // NOI18N
        submit.setText("Create");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("SimSun-ExtB", 0, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("SimSun-ExtB", 0, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        searchBtn.setFont(new java.awt.Font("SimSun-ExtB", 0, 14)); // NOI18N
        searchBtn.setText("Find");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Course", "PRN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setPreferredSize(new java.awt.Dimension(500, 400));
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel5.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jLabel5.setText("Search By Id:");

        searchData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDataActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("SimSun-ExtB", 0, 14)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(searchData, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(submit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(update))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete)
                                .addGap(34, 34, 34)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Clear)
                            .addComponent(searchBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prn, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LogoutBtn)
                .addGap(114, 114, 114))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(prn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchData, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)))
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 792, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1153, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(435, 435, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1333, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(794, 794, 794)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1406, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
          Login LoginFrame = new Login();
          LoginFrame.setVisible(true);
          LoginFrame.pack();
          LoginFrame.setLocationRelativeTo(null);
          this.dispose();
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseActionPerformed

    private void prnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prnActionPerformed
         public void loadData(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:MYSQL://Localhost:3306/java_name";
        String user = "root"; 
        String pass = "";
       //  System.out.println("Okay");
       Connection con = DriverManager.getConnection(url, user, pass );
       Statement st = con.createStatement();
       
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID","Name","Course","PRN"},0);
      
        Table.setModel(model);
        String sql = "Select * FROM create_entry";
          ResultSet rs = st.executeQuery(sql);
          String i , f, l ,e ;
          while(rs.next()){
              i = rs.getString("ID");
              f = rs.getString("Name");
              l = rs.getString("course");
              e = rs.getString("PRN");
              model.addRow(new Object []{i ,f ,l, e});
              
          }}catch(Exception e){
                  System.out.println("Error"+e.getMessage());
                  }
        
     }
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
      String fN ,eN ,em, query ;
             
    
    try{
       Class.forName("com.mysql.cj.jdbc.Driver");       
        String url = "jdbc:MYSQL://Localhost:3306/java_name";
        String user = "root"; 
        String pass = "";
       //  System.out.println("Okay");
       Connection con = DriverManager.getConnection(url, user, pass );
       Statement st = con.createStatement();
       
       if("".equals(fName.getText())){
          JOptionPane.showMessageDialog(new JFrame(), "Name is reqire", "Dialog",
                   JOptionPane.ERROR_MESSAGE);
       }else if("".equals(course.getText())){
          JOptionPane.showMessageDialog(new JFrame(), "Course is reqire", "Dialog",
                   JOptionPane.ERROR_MESSAGE);
       }else if("".equals(prn.getText())){
          JOptionPane.showMessageDialog(new JFrame(), "Permanent Roll no  is reqire", "Dialog",
                   JOptionPane.ERROR_MESSAGE);
       }
       else{
           fN = fName.getText();
           eN = course.getText();
           em = prn.getText();
           query = "Insert Into create_entry (Name, course, PRN )"
                   + " Values ('"+fN+"', '"+eN+"' ,'"+em+"') ";
           st.executeUpdate(query);
           fName.setText("");
           course.setText("");
           prn.setText("");
        
           showMessageDialog(null,"Successfully Registered Student"); 
           loadData();
           con.close();
                 
       }       
    }catch(Exception e){
        System.out.println("Error"+e.getMessage());               
    }                         
    }//GEN-LAST:event_submitActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         String ID ;
        int notFound = 0;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");       
             String url = "jdbc:MYSQL://Localhost:3306/java_name";
             String user = "root"; 
             String pass = "";
       //  System.out.println("Okay");
       Connection con = DriverManager.getConnection(url, user, pass );
       Statement st = con.createStatement();
         
        ID =   searchData.getText();
       if("".equals(ID )){
          JOptionPane.showMessageDialog(new JFrame(), "ID  is reqire", "Dialog",
                   JOptionPane.ERROR_MESSAGE);
       }else {
            String sql = "Select * FROM create_entry WHERE ID ="+ID;
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){               
                  notFound = 1;
                 
                  String sql2 = "DELETE  FROM create_entry WHERE ID ="+ID;
                 st.executeUpdate(sql2);
                  loadData();
                     con.close();
                     
            }
            if(notFound == 0){
                JOptionPane.showMessageDialog(new JFrame(), "Invalid Id !", "Dialog",
                   JOptionPane.ERROR_MESSAGE);
            }
       }
      }catch(Exception e){
        System.out.println("Error"+e.getMessage());
        
        
    }        
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
          String ID ;
        int notFound = 0;
        String fN ,eN ,em ;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");       
             String url = "jdbc:MYSQL://Localhost:3306/java_name";
             String user = "root"; 
             String pass = "";
       //  System.out.println("Okay");
       Connection con = DriverManager.getConnection(url, user, pass );
       Statement st = con.createStatement();
         
        ID =   searchData.getText();
       if("".equals(ID )){
          JOptionPane.showMessageDialog(new JFrame(), "ID  is reqire", "Dialog",
                   JOptionPane.ERROR_MESSAGE);
       }else {
            String sql = "Select * FROM create_entry WHERE ID ="+ID;
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){               
                  notFound = 1;
                  fN = fName.getText();
                  eN = course.getText();
                  em = prn.getText();
                  String sql2 = "UPDATE create_entry SET Name ='"+fN+"', course ='"+eN+"', PRN ='"+em+"' WHERE ID ="+ID;
                 st.executeUpdate(sql2);
                  loadData();
                     con.close();
                     
            }
            if(notFound == 0){
                JOptionPane.showMessageDialog(new JFrame(), "Invalid Id !", "Dialog",
                   JOptionPane.ERROR_MESSAGE);
            }
       }
      }catch(Exception e){
        System.out.println("Error"+e.getMessage());
        
        
    } 
    }//GEN-LAST:event_updateActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String ID ;
        int notFound = 0;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");       
             String url = "jdbc:MYSQL://Localhost:3306/java_name";
             String user = "root"; 
             String pass = "";
       //  System.out.println("Okay");
       Connection con = DriverManager.getConnection(url, user, pass );
       Statement st = con.createStatement();
         
        ID =   searchData.getText();
       if("".equals(ID )){
          JOptionPane.showMessageDialog(new JFrame(), "ID  is reqire", "Dialog",
                   JOptionPane.ERROR_MESSAGE);
       }else {
            String sql = "Select * FROM create_entry WHERE ID ="+ID;
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                  fName.setText(rs.getString("Name"));
                  course.setText(rs.getString("course"));
                  prn.setText(rs.getString("PRN"));
                  notFound = 1;
               
                 con.close();
            }
            if(notFound == 0){
                JOptionPane.showMessageDialog(new JFrame(), "Invalid Id !", "Dialog",
                   JOptionPane.ERROR_MESSAGE);
            }
       }
      }catch(Exception e){
        System.out.println("Error"+e.getMessage());
        
        
    }
        //Id =   searchData.getText();
     
    }//GEN-LAST:event_searchBtnActionPerformed

    private void searchDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchDataActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
            fName.setText("");
            course.setText("");
            prn.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    public void setUser(String name){
        fName.setText(name );
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Home x =  new Home();
               x.loadData();
               x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JTable Table;
    private javax.swing.JTextField course;
    private javax.swing.JButton delete;
    private javax.swing.JTextField fName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField prn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchData;
    private javax.swing.JButton submit;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
