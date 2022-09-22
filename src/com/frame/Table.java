package com.frame;

import javax.swing.*;
import java.awt.*;

public class Table extends SalesFrame{

    private JTable t;

    public void createInvoiceTable(SalesFrame sf){
        String[] cols = {"No.", "Date", "Customer", "Total"};
        String[][] data = {
                {"","","",""},
                {"","","",""},
                {"","","",""},
                {"","","",""}
        };
        t = new JTable(data, cols);
        sf.getF().add(new JScrollPane(t));
        sf.getF().setLayout(new FlowLayout());
    }

    public void createInvoiceItems(SalesFrame sf){
        String[] cols = {"No.", "Item Name", "Item Price", "Count", "Item Total"};
        String[][] data = {
                {"","","","", ""},
                {"","","","", ""},
                {"","","","", ""},
                {"","","","", ""}
        };
        t = new JTable(data, cols);
        sf.getF().add(new JScrollPane(t));
        sf.getF().setLayout(new FlowLayout());
    }
}
