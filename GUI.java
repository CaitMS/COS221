/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author caity
 */
public class GUI extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public GUI() {
        
        initComponents();
        setLocationRelativeTo(null);
        //JFrame.setPreferredSize(new Dimension(400,800));
        conn = dbConnection.connect();
        setStaffTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_Staff = new javax.swing.JButton();
        btn_Films = new javax.swing.JButton();
        btn_Report = new javax.swing.JButton();
        btn_Notifications = new javax.swing.JButton();
        MainPage = new javax.swing.JPanel();
        Staff = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Staff_Table = new javax.swing.JTable();
        filterBox = new javax.swing.JComboBox<>();
        txtFilter = new javax.swing.JTextField();
        lblNoResults = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        lblFilterError = new javax.swing.JLabel();
        Films = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Film_Table = new javax.swing.JTable();
        Report = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Notifications = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Client_Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 100, 100));

        Menu.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setText("Menu");

        btn_Staff.setText("Staff");
        btn_Staff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_StaffMouseClicked(evt);
            }
        });
        btn_Staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StaffActionPerformed(evt);
            }
        });

        btn_Films.setText("Films");
        btn_Films.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FilmsActionPerformed(evt);
            }
        });

        btn_Report.setText("Report");
        btn_Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReportActionPerformed(evt);
            }
        });

        btn_Notifications.setText("Notifications");
        btn_Notifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NotificationsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Films)
                            .addComponent(btn_Report)
                            .addComponent(btn_Notifications)
                            .addComponent(btn_Staff, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(btn_Staff)
                .addGap(37, 37, 37)
                .addComponent(btn_Films)
                .addGap(38, 38, 38)
                .addComponent(btn_Report)
                .addGap(35, 35, 35)
                .addComponent(btn_Notifications)
                .addContainerGap(428, Short.MAX_VALUE))
        );

        MainPage.setBackground(new java.awt.Color(255, 255, 255));
        MainPage.setLayout(new java.awt.CardLayout());

        jLabel2.setText("STAFF");

        Staff_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "first_name", "last_name", "address", "address2", "district", "city", "postal_code", "phone", "store_id", "active"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Staff_Table);

        filterBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filter by", "first_name", "last_name", "address", "address2", "district", "city", "postal_code", "phone", "store_id", "active" }));

        txtFilter.setForeground(new java.awt.Color(153, 153, 153));
        txtFilter.setText("Search value");
        txtFilter.setToolTipText("");
        txtFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFilterMouseClicked(evt);
            }
        });
        txtFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilterActionPerformed(evt);
            }
        });
        txtFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFilterKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFilterKeyReleased(evt);
            }
        });

        jButton7.setText("Refresh Table");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StaffLayout = new javax.swing.GroupLayout(Staff);
        Staff.setLayout(StaffLayout);
        StaffLayout.setHorizontalGroup(
            StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffLayout.createSequentialGroup()
                .addGroup(StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StaffLayout.createSequentialGroup()
                        .addGap(645, 645, 645)
                        .addComponent(lblNoResults))
                    .addGroup(StaffLayout.createSequentialGroup()
                        .addGap(564, 564, 564)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(StaffLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(StaffLayout.createSequentialGroup()
                            .addComponent(filterBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(700, 700, 700)
                            .addComponent(jButton7))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblFilterError, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 252, Short.MAX_VALUE))
        );
        StaffLayout.setVerticalGroup(
            StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffLayout.createSequentialGroup()
                .addGroup(StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StaffLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StaffLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNoResults)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFilterError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addContainerGap(269, Short.MAX_VALUE))
        );

        MainPage.add(Staff, "card2");

        jLabel3.setText("FILMS");

        jButton2.setText("Add a new film");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Film_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "film_id", "title", "description", "release_year", "language_id", "original_language_id", "rental_duration", "rental_rate", "length", "replacement_cost", "rating", "special_features", "last_update"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(Film_Table);

        javax.swing.GroupLayout FilmsLayout = new javax.swing.GroupLayout(Films);
        Films.setLayout(FilmsLayout);
        FilmsLayout.setHorizontalGroup(
            FilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FilmsLayout.createSequentialGroup()
                .addGroup(FilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FilmsLayout.createSequentialGroup()
                        .addGap(701, 701, 701)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FilmsLayout.createSequentialGroup()
                        .addGap(507, 507, 507)
                        .addComponent(jLabel3))
                    .addGroup(FilmsLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        FilmsLayout.setVerticalGroup(
            FilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FilmsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );

        MainPage.add(Films, "card4");

        Report.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Report");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Store ", "Genre", "Num Movies"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout ReportLayout = new javax.swing.GroupLayout(Report);
        Report.setLayout(ReportLayout);
        ReportLayout.setHorizontalGroup(
            ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportLayout.createSequentialGroup()
                .addGroup(ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportLayout.createSequentialGroup()
                        .addGap(581, 581, 581)
                        .addComponent(jLabel4))
                    .addGroup(ReportLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel6)
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(484, Short.MAX_VALUE))
        );
        ReportLayout.setVerticalGroup(
            ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addGroup(ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel6))
                    .addGroup(ReportLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(311, Short.MAX_VALUE))
        );

        MainPage.add(Report, "card3");

        jLabel5.setText("notifications");

        jButton3.setText("Add new client");

        jButton4.setText("Update Client");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Delete Client");

        jButton6.setText("List All Clients");

        Client_Table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(Client_Table);

        javax.swing.GroupLayout NotificationsLayout = new javax.swing.GroupLayout(Notifications);
        Notifications.setLayout(NotificationsLayout);
        NotificationsLayout.setHorizontalGroup(
            NotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotificationsLayout.createSequentialGroup()
                .addGroup(NotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NotificationsLayout.createSequentialGroup()
                        .addGap(483, 483, 483)
                        .addComponent(jLabel5))
                    .addGroup(NotificationsLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jButton3)
                        .addGap(32, 32, 32)
                        .addComponent(jButton4)
                        .addGap(37, 37, 37)
                        .addComponent(jButton5)
                        .addGap(29, 29, 29)
                        .addComponent(jButton6))
                    .addGroup(NotificationsLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(732, Short.MAX_VALUE))
        );
        NotificationsLayout.setVerticalGroup(
            NotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotificationsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(NotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        MainPage.add(Notifications, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(MainPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String display = "Staff";

    private void btn_StaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StaffActionPerformed
        if (!display.equals("Staff")) {
            setStaffTable();
            display = "Staff";
            MainPage.removeAll();
            MainPage.add(Staff);
            MainPage.repaint();
            MainPage.revalidate();
        }

    }//GEN-LAST:event_btn_StaffActionPerformed

    private void btn_StaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_StaffMouseClicked

    }//GEN-LAST:event_btn_StaffMouseClicked

    private void btn_FilmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FilmsActionPerformed
        System.out.println(!display.equals("Films"));
        if (!display.equals("Films")) {
            setFilmsTable();
            MainPage.removeAll();
            MainPage.add(Films);
            MainPage.repaint();
            MainPage.revalidate();
            display = "Films";
        }
    }//GEN-LAST:event_btn_FilmsActionPerformed

    private void btn_ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReportActionPerformed
        if (!display.equals("Report")) {
            display = "Report";
            MainPage.removeAll();
            MainPage.add(Report);
            MainPage.repaint();
            MainPage.revalidate();
        }
    }//GEN-LAST:event_btn_ReportActionPerformed

    private void btn_NotificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NotificationsActionPerformed
        if (!display.equals("Notif")) {
            display = "Notif";
            MainPage.removeAll();
            MainPage.add(Notifications);
            MainPage.repaint();
            MainPage.revalidate();
        }
    }//GEN-LAST:event_btn_NotificationsActionPerformed

    private void txtFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFrame insertGui = new InsertFilm();
        insertGui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //insertGui.setSize(800, 600);
        insertGui.setLocationRelativeTo(null);

        insertGui.setVisible(true);
        
        insertGui.addWindowListener(new java.awt.event.WindowAdapter() { 
            public void windowClosing(java.awt.event.WindowEvent windowEvent)
            {
                setFilmsTable();
     
            }
            
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        txtFilter.setText("Search Value");
        txtFilter.setForeground(Color.GRAY);
        filterBox.setSelectedIndex(0);
        setStaffTable();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtFilterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterKeyPressed

    }//GEN-LAST:event_txtFilterKeyPressed

    private void txtFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFilterMouseClicked
        if (txtFilter.getText().equals("Search value")) {
            txtFilter.setText("");
            txtFilter.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_txtFilterMouseClicked

    private void txtFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterKeyReleased
        if (filterBox.getSelectedIndex() == 0) {
            lblFilterError.setForeground(Color.red);
            lblFilterError.setText("Please choose a filter option");
//            txtFilter.setText("Search Value");
//            txtFilter.setForeground(Color.GRAY);
        } else if (txtFilter.getText().equals("")) {
            setStaffTable();

        } else {
            lblFilterError.setText("");
            String filter = filterBox.getSelectedItem().toString();
            String search = txtFilter.getText().toString();
            String query = "SELECT first_name, last_name, address, address2, district, city, postal_code, phone, store_id, active"
                    + " FROM staff"
                    + " INNER JOIN address"
                    + " ON staff.address_id = address.address_id"
                    + " INNER JOIN city"
                    + " ON address.city_id = city.city_id"
                    + " WHERE " + filter + " LIKE '%" + search + "%'";

            try {
                stmt = conn.createStatement();
                rs = stmt.executeQuery(query);
                DefaultTableModel model = (DefaultTableModel) Staff_Table.getModel();
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }

                int it = 0;
                while (rs.next()) {
                    it++;
                    //model.setNumRows(numrow);
                    model.addRow(new Object[]{rs.getString("first_name"),
                        rs.getString("last_name"), rs.getString("address"),
                        rs.getString("address2"), rs.getString("district"),
                        rs.getString("city"), rs.getString("phone"),
                        rs.getInt("store_id"), rs.getInt("active")});

                }
                if (it == 0) {
                    lblNoResults.setForeground(Color.red);
                    lblNoResults.setText("No results");
                }

            } catch (SQLException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_txtFilterKeyReleased

    private void setStaffTable() {

        String query = "SELECT first_name, last_name, address, address2, district, city, postal_code, phone, store_id, active"
                + " FROM staff"
                + " INNER JOIN address"
                + " ON staff.address_id = address.address_id"
                + " INNER JOIN city"
                + " ON address.city_id = city.city_id";

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            DefaultTableModel model = (DefaultTableModel) Staff_Table.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("first_name"),
                    rs.getString("last_name"), rs.getString("address"),
                    rs.getString("address2"), rs.getString("district"),
                    rs.getString("city"), rs.getString("phone"),
                    rs.getInt("store_id"), rs.getInt("active")});

            }

        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private void setFilmsTable() {

        String query = "SELECT * FROM film";

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            DefaultTableModel model = (DefaultTableModel) Film_Table.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt("film_id"),
                    rs.getString("title"), rs.getString("description"), 
                    rs.getDate("release_year"), rs.getInt("language_id"), 
                    rs.getInt("original_language_id"), rs.getInt("rental_duration"),
                    rs.getFloat("rental_rate"), rs.getInt("length"),
                    rs.getFloat("replacement_cost"), rs.getString("rating"),
                    rs.getString("special_features"), rs.getTimestamp("last_update")});

            }

        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //MainPage.setBounds(100, 100, 100, 100);
                new GUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Client_Table;
    private javax.swing.JTable Film_Table;
    private javax.swing.JPanel Films;
    private javax.swing.JPanel MainPage;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Notifications;
    private javax.swing.JPanel Report;
    private javax.swing.JPanel Staff;
    private javax.swing.JTable Staff_Table;
    private javax.swing.JButton btn_Films;
    private javax.swing.JButton btn_Notifications;
    private javax.swing.JButton btn_Report;
    private javax.swing.JButton btn_Staff;
    private javax.swing.JComboBox<String> filterBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblFilterError;
    private javax.swing.JLabel lblNoResults;
    private javax.swing.JTextField txtFilter;
    // End of variables declaration//GEN-END:variables
}
