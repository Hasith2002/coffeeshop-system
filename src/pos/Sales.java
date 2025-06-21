
package pos;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import pos.DBConnection;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.DefaultListModel;

public class Sales extends javax.swing.JPanel {
int billNumber = 1; 
double totalBill = 0.0;
   
    public Sales() {
        initComponents();
       
        customerList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            if (!evt.getValueIsAdjusting()) {
                String selectedName = customerList.getSelectedValue();
                if (selectedName != null) {
                    txtCustomerName.setText(selectedName);
                }
            }
        }
        });
        
        productList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
    public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
        if (!evt.getValueIsAdjusting()) {
            String selectedProduct = productList.getSelectedValue();
            if (selectedProduct != null) {
                jTextField2.setText(selectedProduct);
            }
        }
        }
        });
        
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
        String keyword = jTextField2.getText();
        loadProductNames(keyword);
        }
        });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        productList = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnPrintBill = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jLabel1.setText("Customer Name");

        txtCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerNameActionPerformed(evt);
            }
        });
        txtCustomerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerNameKeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer Name", "Product Name", "SID", "Bill Number", "Amount of Product"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Product Name");

        jScrollPane2.setViewportView(customerList);

        jScrollPane3.setViewportView(productList);

        jLabel3.setText("Quantity");

        jLabel4.setText("Total Bill");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnPrintBill.setText("Print Bill");
        btnPrintBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintBillActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addComponent(btnPrintBill))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrintBill)
                        .addGap(26, 26, 26)))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String customer = txtCustomerName.getText().trim();
    String product = jTextField2.getText().trim();
    String qtyStr = jTextField3.getText().trim();

    if (customer.isEmpty() || product.isEmpty() || qtyStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill all fields");
        return;
    }

    try {
        int qty = Integer.parseInt(qtyStr);

        Connection con = DBConnection.mycon();

        
        PreparedStatement pst = con.prepareStatement("SELECT Price FROM product WHERE ProductName = ?");
        pst.setString(1, product);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            double price = rs.getDouble("Price");
            double subtotal = price * qty;
            totalBill += subtotal;

           
            pst = con.prepareStatement("INSERT INTO sale (CustomerName, ProductName, BillNumber, AmountofProduct) VALUES (?, ?,  ?, ?)");
            pst.setString(1, customer);
            pst.setString(2, product);
            pst.setInt(3, billNumber);
            pst.setInt(4, qty);
            pst.executeUpdate();

            
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
            Vector<String> v = new Vector<>();
            v.add(customer);
            v.add(product);
            v.add(String.valueOf(billNumber));
            v.add(String.valueOf(qty));
            dt.addRow(v);

            
            jTextArea1.setText("Total: " + totalBill);

        } else {
            JOptionPane.showMessageDialog(this, "Product not found in DB");
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Quantity must be a number");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error adding sale: " + e.getMessage());}
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNameActionPerformed

    private void btnPrintBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintBillActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintBillActionPerformed

    private void txtCustomerNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerNameKeyReleased
            String keyword = txtCustomerName.getText().trim();
            loadCustomerNames(keyword);
    }//GEN-LAST:event_txtCustomerNameKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnPrintBill;
    private javax.swing.JList<String> customerList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JList<String> productList;
    private javax.swing.JTextField txtCustomerName;
    // End of variables declaration//GEN-END:variables

public void loadCustomerNames(String keyword) {
    DefaultListModel<String> model = new DefaultListModel<>();
    try {
        Connection con = DBConnection.mycon();
        String sql = "SELECT Name FROM customer WHERE Name LIKE ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, "%" + keyword + "%");
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            model.addElement(rs.getString("Name"));
        }

        customerList.setModel(model); 
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
public void loadProductNames(String keyword) {
    DefaultListModel<String> model = new DefaultListModel<>();
    try {
        Connection con = DBConnection.mycon();
        String sql = "SELECT ProductName FROM product WHERE ProductName LIKE ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, "%" + keyword + "%");
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            model.addElement(rs.getString("ProductName"));
        }

        productList.setModel(model); 
    } catch (Exception e) {
        e.printStackTrace();
    }
}



}
