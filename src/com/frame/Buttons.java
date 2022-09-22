package com.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends Panels implements ActionListener {

     JButton btn1 = new JButton("Create New Invoice");
    private JButton btn2 = new JButton("Delete Invoice");
    private JButton btn3 = new JButton("Save");
    private JButton btn4 = new JButton("Cancel");

    public void createButtonLP(Panels p){
        p.getLP().add(btn1);
        p.getLP().add(btn2);
        p.getLP().setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    public void createButtonRP(Panels p){
        p.getRP().add(btn3);
        p.getRP().add(btn4);
//        p.getRP().setLayout(new FlowLayout(FlowLayout.RIGHT));
        p.getRP().setLayout(new BoxLayout(leftPanel, BoxLayout.PAGE_AXIS));
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
