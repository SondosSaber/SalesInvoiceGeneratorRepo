package com.frame;

import javax.swing.*;
import java.awt.*;

public class Table extends SalesFrame{

    private JTable t;

    public void createInvoiceTable(){
        String[] cols = {"No.", "Date", "Customer", "Total"};
        String[][] data = {
                {"","","",""},
                {"","","",""},
                {"","","",""},
                {"","","",""}
        };
        t = new JTable(data, cols);
        f.add(new JScrollPane(t));
        f.setLayout(new FlowLayout());
    }

    public void createInvoiceItems(){
        String[] cols = {"No.", "Item Name", "Item Price", "Count", "Item Total"};
        String[][] data = {
                {"","","","", ""},
                {"","","","", ""},
                {"","","","", ""},
                {"","","","", ""}
        };
        t = new JTable(data, cols);
        f.add(new JScrollPane(t));
        f.setLayout(new FlowLayout());
    }
}
