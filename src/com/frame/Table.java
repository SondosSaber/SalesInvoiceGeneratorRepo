package com.frame;

import javax.swing.*;
import java.awt.*;

public class Table extends Panels{

    private JTable t;

    public void createInvoiceTable(Panels p){
        String[] cols = {"No.", "Date", "Customer", "Total"};
        String[][] data = {
                {"","","",""},
                {"","","",""},
                {"","","",""},
                {"","","",""}
        };
        t = new JTable(data, cols);
        p.getLP().add(new JScrollPane(t));
        p.getLP().setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    public void createInvoiceItems(Panels p){
        String[] cols = {"No.", "Item Name", "Item Price", "Count", "Item Total"};
        String[][] data = {
                {"","","","", ""},
                {"","","","", ""},
                {"","","","", ""},
                {"","","","", ""}
        };
        t = new JTable(data, cols);
        p.getRP().add(new JScrollPane(t));
        p.getRP().setLayout(new FlowLayout(FlowLayout.RIGHT));
    }
}
