/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tekwill.App;

import com.tekwill.Model.Address;
import com.tekwill.Model.ContactInfo;
import com.tekwill.Model.Employee;
import com.tekwill.service.Modifiable;
import com.tekwill.service.Service;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Andrei
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        createButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        jobField = new javax.swing.JTextField();
        yearOfBirth = new javax.swing.JTextField();
        countryField = new javax.swing.JTextField();
        postCodeField = new javax.swing.JTextField();
        streetField = new javax.swing.JTextField();
        idfield = new javax.swing.JTextField();
        salaryField = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        dayOfBirth = new javax.swing.JTextField();
        monthOfBirth = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone number", "Birthday", "Job", "Salary", "Country", "PostCode", "Street"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        nameField.setText("Name");

        phoneField.setText("Phone number");

        jobField.setText("Job");

        yearOfBirth.setText("YYYY");

        countryField.setText("Country");

        postCodeField.setText("PostCode");

        streetField.setText("Street");

        idfield.setText("Id");

        salaryField.setText("Salary");

        dayOfBirth.setText("DD");

        monthOfBirth.setText("MM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createButton)
                        .addGap(43, 43, 43)
                        .addComponent(updateButton)
                        .addGap(45, 45, 45)
                        .addComponent(deleteButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(salaryField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(phoneField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jobField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idfield, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yearOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dayOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(streetField)
                                .addComponent(postCodeField, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                                .addComponent(countryField))
                            .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(countryField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(postCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static Modifiable service = new Service();


    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        createNewEmployee();


    }//GEN-LAST:event_createButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int i = jTable1.getSelectedRow();
            model.removeRow(i);
            service.delete(i + 1);

            if (!service.getEmployeeMap().containsKey(Integer.parseInt(idfield.getText()))) {

                Address address = service.create(countryField.getText(), postCodeField.getText(), streetField.getText());
                ContactInfo contact = service.create(nameField.getText(), phoneField.getText(), address);
                int year = Integer.parseInt(yearOfBirth.getText());
                int month = Integer.parseInt(monthOfBirth.getText());
                int day = Integer.parseInt(dayOfBirth.getText());

                Employee employee = service.createEmployee(Integer.parseInt(idfield.getText()), contact, LocalDate.of(year, month, day), jobField.getText(), Double.parseDouble(salaryField.getText()));

                Object rowData[] = new Object[9];
                Integer key = service.getKey(employee);
                rowData[0] = key;
                rowData[1] = employee.getContact().getName();
                rowData[2] = employee.getContact().getPhoneNumber();
                rowData[3] = employee.getBirthday();
                rowData[4] = employee.getJob();
                rowData[5] = employee.getSalary();
                rowData[6] = employee.getContact().getAdress().getContry();
                rowData[7] = employee.getContact().getAdress().getPostCode();
                rowData[8] = employee.getContact().getAdress().getStreet();

                model.insertRow(i, rowData);

                setDefaultFields();

                label.setText("");
            } else {

                label.setText("You can not add a new employee with existing ID");

            }

        } catch (NumberFormatException numE) {

            label.setText("Invalid number input");
        } catch (DateTimeException dateE) {
            label.setText("Invalid date input");

        } catch (Exception exep) {

            label.setText("Please choose wich element do you want to update");
        }


    }//GEN-LAST:event_updateButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int selectedRow = jTable1.getSelectedRow();

            idfield.setText(model.getValueAt(selectedRow, 0).toString());
            nameField.setText(model.getValueAt(selectedRow, 1).toString());
            phoneField.setText(model.getValueAt(selectedRow, 2).toString());
            jobField.setText(model.getValueAt(selectedRow, 4).toString());

            Employee employeeFoundbyKey = service.find(selectedRow + 1);
            int year = employeeFoundbyKey.getBirthday().getYear();
            int month = employeeFoundbyKey.getBirthday().getMonthValue();
            int day = employeeFoundbyKey.getBirthday().getDayOfMonth();
            yearOfBirth.setText(String.valueOf(year));
            monthOfBirth.setText(String.valueOf(month));
            dayOfBirth.setText(String.valueOf(day));

            salaryField.setText(model.getValueAt(selectedRow, 5).toString());
            countryField.setText(model.getValueAt(selectedRow, 6).toString());
            postCodeField.setText(model.getValueAt(selectedRow, 7).toString());
            streetField.setText(model.getValueAt(selectedRow, 8).toString());
        } catch (NullPointerException nullE) {

        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int i = jTable1.getSelectedRow();
            int key = i + 1;

            model.removeRow(i);
            service.delete(i + 1);
            label.setText("");

            setDefaultFields();
        } catch (Exception exep) {

            label.setText("Please choose which element do you want to delete.");

        }


    }//GEN-LAST:event_deleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField countryField;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField dayOfBirth;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField idfield;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jobField;
    private javax.swing.JLabel label;
    private javax.swing.JTextField monthOfBirth;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextField postCodeField;
    private javax.swing.JTextField salaryField;
    private javax.swing.JTextField streetField;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField yearOfBirth;
    // End of variables declaration//GEN-END:variables

    public void setDefaultFields() {
        idfield.setText("Id");
        nameField.setText("Name");
        phoneField.setText("Phone number");
        monthOfBirth.setText("MM");
        yearOfBirth.setText("YYYY");
        dayOfBirth.setText("DD");
        jobField.setText("Job");
        salaryField.setText("Salary");
        countryField.setText("Country");
        postCodeField.setText("PostCode");
        streetField.setText("Street");

    }

    private void createNewEmployee() {
        try {

            if (!service.getEmployeeMap().containsKey(Integer.parseInt(idfield.getText()))) {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                Address address = service.create(countryField.getText(), postCodeField.getText(), streetField.getText());
                ContactInfo contact = service.create(nameField.getText(), phoneField.getText(), address);
                int year = Integer.parseInt(yearOfBirth.getText());
                int month = Integer.parseInt(monthOfBirth.getText());
                int day = Integer.parseInt(dayOfBirth.getText());

                Employee employee = service.createEmployee(Integer.parseInt(idfield.getText()), contact, LocalDate.of(year, month, day), jobField.getText(), Double.parseDouble(salaryField.getText()));

                Object rowData[] = new Object[9];
                Integer key = service.getKey(employee);
                rowData[0] = key;
                rowData[1] = employee.getContact().getName();
                rowData[2] = employee.getContact().getPhoneNumber();
                rowData[3] = employee.getBirthday();
                rowData[4] = employee.getJob();
                rowData[5] = employee.getSalary();
                rowData[6] = employee.getContact().getAdress().getContry();
                rowData[7] = employee.getContact().getAdress().getPostCode();
                rowData[8] = employee.getContact().getAdress().getStreet();

                model.addRow(rowData);

                setDefaultFields();

                label.setText("");
            } else {

                label.setText("You can not add a new employee with existing ID");

            }

        } catch (NumberFormatException numE) {

            label.setText("Invalid number input");
        } catch (DateTimeException dateE) {
            label.setText("Invalid date input");

        }

    }

}
