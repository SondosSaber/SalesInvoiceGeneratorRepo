package com.frame;

import javax.swing.*;
import java.awt.*;

public class Panels extends SalesFrame{

    private JPanel leftPanel;
    private JPanel rightPanel;

    public void createPanels(){
        leftPanel = new JPanel();
        leftPanel.setBounds(0,0,700,1000);
        rightPanel = new JPanel();
        rightPanel.setBounds(0,0,650,1000);
        leftPanel.setBackground(Color.lightGray);
        rightPanel.setBackground(Color.white);
        f.add(leftPanel);
        f.add(rightPanel);
        f.setLayout(new FlowLayout());
    }
}
