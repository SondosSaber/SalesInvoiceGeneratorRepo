package com.frame;

import javax.swing.*;
import java.awt.*;

public class Panels extends SalesFrame{

    private JPanel leftPanel;
    private JPanel rightPanel;

    public void createPanels(SalesFrame sf){
        leftPanel = new JPanel();
        leftPanel.setBounds(0,0,700,1000);
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.LINE_AXIS));
        leftPanel.setBackground(Color.lightGray);

        rightPanel = new JPanel();
        rightPanel.setBounds(0,0,650,1000);
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.LINE_AXIS));
        rightPanel.setBackground(Color.white);

        sf.getF().add(leftPanel);
        sf.getF().add(rightPanel);
        sf.getF().setLayout(new FlowLayout());
    }
    public JPanel getLP() {
        return leftPanel;
    }
    public JPanel getRP() {
        return rightPanel;
    }
}
