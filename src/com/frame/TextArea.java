package com.frame;

import javax.swing.*;
import javax.swing.text.BoxView;
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
        p.getMP().add(invoiceNumber);
        p.getMP().add(new JLabel("Invoice date"));
        p.getMP().add(invoiceDate);
        p.getMP().add(new JLabel("Customer name"));
        p.getMP().add(customerName);
        p.getMP().add(invoiceTotal);
        p.getMP().setLayout(new FlowLayout(BoxLayout.PAGE_AXIS));
    }
}
