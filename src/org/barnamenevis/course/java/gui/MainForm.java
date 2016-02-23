package org.barnamenevis.course.java.gui;

import org.barnamenevis.course.java.employee.Payable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Teacher3 on 2/16/2016.
 */
public class MainForm extends JFrame {

    public static ArrayList<Payable> payableArrayList = new ArrayList<>();

    private JPanel mainPanel = new JPanel();
    private JButton invoiceButton = new JButton("Add Invoice");
    private JButton totalButton = new JButton("Total");
    private InvoiceDialog invoiceDialog = new InvoiceDialog();

    public MainForm() throws HeadlessException {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainPanel.setLayout(new GridLayout(1 , 2));

        addComponents();

        add(mainPanel);

        pack();

        setLocationRelativeTo(null);

    }

    private void addComponents() {
        mainPanel.add(invoiceButton);
        mainPanel.add(totalButton);

        invoiceButton.addActionListener(e -> {
            invoiceDialog.setModal(true);
            invoiceDialog.setVisible(true);
        });

        totalButton.addActionListener(e -> {
            double costs = 0;

            for (Payable payable : MainForm.payableArrayList){
                costs += payable.getPaymentAmount();
            }

            JOptionPane.showMessageDialog(MainForm.this, "Total cost is "+costs);
        });
    }



}
