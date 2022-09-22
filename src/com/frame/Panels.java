package com.frame;

import javax.swing.*;
import javax.swing.text.BoxView;
import java.awt.*;

public class Panels extends SalesFrame{

    protected JPanel leftPanel = new JPanel();;
    protected JPanel rightPanel = new JPanel();
    protected JPanel middlePanel = new JPanel();

    public void createLPanel(SalesFrame sf){
        leftPanel.setBounds(0,0,700,1000);
        leftPanel.setLayout(new FlowLayout(BoxView.TOP));
        leftPanel.setBackground(Color.lightGray);
        sf.getF().add(leftPanel);
    }

    public void createRPanel(SalesFrame sf){
        rightPanel.setBounds(100,0,650,1000);
        rightPanel.setLayout(new FlowLayout(BoxView.CENTER));
        rightPanel.setBackground(Color.white);
        sf.getF().add(rightPanel);
    }

    public void createMPanel(SalesFrame sf){
        middlePanel.setBounds(100,50,650,1000);
        rightPanel.setLayout(new FlowLayout(BoxView.TOP));
        middlePanel.setBackground(Color.white);
        sf.getF().add(middlePanel);
    }

    public JPanel getLP() {
        return leftPanel;
    }
    public JPanel getRP() {
        return rightPanel;
    }
    public JPanel getMP() {
        return middlePanel;
    }
}
