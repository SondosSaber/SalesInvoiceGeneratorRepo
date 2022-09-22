package com.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends SalesFrame implements ActionListener {

     JButton btn1 = new JButton("Create New Invoice");
    private JButton btn2 = new JButton("Delete Invoice");
    private JButton btn3 = new JButton("Save");
    private JButton btn4 = new JButton("Cancel");

    public void createButton(SalesFrame sf){
        sf.getF().add(btn1);
        sf.getF().add(btn2);
        sf.getF().add(btn3);
        sf.getF().add(btn4);
        sf.getF().setLayout(new FlowLayout());
    }

    public void performCreateBtnsActions(){
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn1)){
            JOptionPane.showInternalMessageDialog(
                    this,
                    "Create New Invoice",
                    "Create New Invoice",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else if (e.getSource().equals(btn2)) {
            JOptionPane.showInternalMessageDialog(
                    this,
                    "Delete Current Selected Invoice",
                    "Delete Invoice",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else if (e.getSource().equals(btn3)) {
            JOptionPane.showInternalMessageDialog(
                    this,
                    "Save Changes for new or update invoice",
                    "Save Invoice",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else if (e.getSource().equals(btn4)) {
            JOptionPane.showInternalMessageDialog(
                    this,
                    "Cancel changes",
                    "Cancel Invoice",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
