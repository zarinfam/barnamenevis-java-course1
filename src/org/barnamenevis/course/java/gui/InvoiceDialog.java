package org.barnamenevis.course.java.gui;

import org.barnamenevis.course.java.employee.Invoice;
import org.barnamenevis.course.java.employee.Payable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Teacher3 on 2/16/2016.
 */
public class InvoiceDialog extends JDialog {



    private JPanel mainPanel = new JPanel();
    private JTextField partNumberFiled = new JTextField();
    private JTextField partDescriptionFiled = new JTextField();
    private JTextField quantityFiled = new JTextField();
    private JTextField pricePerItemFiled = new JTextField();
    private JButton addButton = new JButton("Add");
    private JButton cancelButton = new JButton("Cancel");

    public InvoiceDialog() throws HeadlessException {
        mainPanel.setLayout(new GridLayout(5 , 2));

        addComponents();

        add(mainPanel);

        pack();

        setLocationRelativeTo(null);
    }

    private void addComponents() {
        mainPanel.add(new JLabel("Part Number:"));
        mainPanel.add(partNumberFiled);
        mainPanel.add(new JLabel("Part Desc:"));
        mainPanel.add(partDescriptionFiled);
        mainPanel.add(new JLabel("Part Quantity:"));
        mainPanel.add(quantityFiled);
        mainPanel.add(new JLabel("Part Price:"));
        mainPanel.add(pricePerItemFiled);

        mainPanel.add(addButton);
        mainPanel.add(cancelButton);

        addButton.addActionListener(new AddButtonClickListener());
        cancelButton.addActionListener(new AddButtonClickListener());
    }

    private class AddButtonClickListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == addButton) {
                if (validateForm()) {
                    MainForm.payableArrayList.add(new Invoice(
                            partNumberFiled.getText(), partDescriptionFiled.getText()
                            , Integer.parseInt(quantityFiled.getText())
                            , Double.parseDouble(pricePerItemFiled.getText())
                    ));

                } else {
                    JOptionPane.showMessageDialog(InvoiceDialog.this, "Please fill all fields.");
                }

                JOptionPane.showMessageDialog(InvoiceDialog.this, "Add invoice");
            }else if (e.getSource() == cancelButton) {
                setVisible(false);
            }
        }
    }

    private boolean validateForm() {
        return true;
    }
}
