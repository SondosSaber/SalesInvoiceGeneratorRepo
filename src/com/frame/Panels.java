package com.frame;

import javax.swing.*;
import java.awt.*;

public class Panels extends SalesFrame{

    protected JPanel leftPanel = new JPanel();;
    protected JPanel rightPanel = new JPanel();

    public void createLPanel(SalesFrame sf){
        leftPanel.setBounds(0,0,700,1000);
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.LINE_AXIS));
        leftPanel.setBackground(Color.lightGray);

        sf.getF().add(leftPanel);
        sf.getF().setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    public void createRPanel(SalesFrame sf){
        rightPanel.setBounds(0,0,650,1000);
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.LINE_AXIS));
        rightPanel.setBackground(Color.white);

        sf.getF().add(rightPanel);
        sf.getF().setLayout(new FlowLayout(FlowLayout.RIGHT));
    }

    public JPanel getLP() {
        return leftPanel;
    }
    public JPanel getRP() {
        return rightPanel;
    }
}
