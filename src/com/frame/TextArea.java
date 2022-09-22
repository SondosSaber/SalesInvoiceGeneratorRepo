package com.frame;

import javax.swing.*;
import java.awt.*;

public class TextArea extends Panels{
    private JTextField invoiceDate;
    private JTextField customerName;
    private JLabel invoiceNumber;
    private JLabel invoiceTotal;

    public void createTextArea(Panels p){
        p.getRP().setLayout(new FlowLayout());
        invoiceNumber = new JLabel("Invoice Number    23");
        invoiceDate = new JTextField(10);
        customerName = new JTextField(10);
        invoiceTotal = new JLabel("Invoice Total    350.50");
        p.getRP().add(invoiceNumber);
        p.getRP().add(new JLabel("Invoice date"));
        p.getRP().add(invoiceDate);
        p.getRP().add(new JLabel("Customer name"));
        p.getRP().add(customerName);
        p.getRP().add(invoiceTotal);
        p.getRP().setLayout(new FlowLayout(FlowLayout.RIGHT));
    }
}
