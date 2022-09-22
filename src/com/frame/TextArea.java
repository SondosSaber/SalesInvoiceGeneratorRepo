package com.frame;

import javax.swing.*;
import java.awt.*;

public class TextArea extends SalesFrame{
    private JTextField invoiceDate;
    private JTextField customerName;
    private JLabel invoiceNumber;
    private JLabel invoiceTotal;

    public void createTextArea(SalesFrame sf){
        sf.getF().setLayout(new FlowLayout());
        invoiceNumber = new JLabel("Invoice Number    23");
        invoiceDate = new JTextField(10);
        customerName = new JTextField(10);
        invoiceTotal = new JLabel("Invoice Total    350.50");
        sf.getF().add(invoiceNumber);
        sf.getF().add(new JLabel("Invoice date"));
        sf.getF().add(invoiceDate);
        sf.getF().add(new JLabel("Customer name"));
        sf.getF().add(customerName);
        sf.getF().add(invoiceTotal);
    }
}
