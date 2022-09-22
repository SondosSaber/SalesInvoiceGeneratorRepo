package com.frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SalesFrame extends Component {
    protected JFrame f = new JFrame("Sales Invoice Generator");

    public SalesFrame createTheFrame() {
        f.setVisible(true);
        f.setSize(900, 730);
        f.setLocation(250, 0);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return this;
    }

    public JFrame getF() {
        return f;
    }
    
}