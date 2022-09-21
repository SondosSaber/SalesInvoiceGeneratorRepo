package com.frame;

import javax.swing.*;
import java.awt.*;

public class TextArea extends SalesFrame{
    private JTextField invoiceDate;
    private JTextField customerName;
    private JLabel invoiceNumber;
    private JLabel invoiceTotal;

    public void createTextArea(){
        f.setLayout(new FlowLayout());
        invoiceNumber = new JLabel("Invoice Number    23");
        invoiceDate = new JTextField(10);
        customerName = new JTextField(10);
        invoiceTotal = new JLabel("Invoice Total    350.50");
        f.add(invoiceNumber);
        f.add(new JLabel("Invoice date"));
        f.add(invoiceDate);
        f.add(new JLabel("Customer name"));
        f.add(customerName);
        f.add(invoiceTotal);
    }
}
