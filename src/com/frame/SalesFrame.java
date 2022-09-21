package com.frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalesFrame extends Component{
    protected JFrame f = new JFrame("Sales Invoice Generator");
    public void createTheFrame() {
        f.setVisible(true);
        f.setSize(900, 730);
        f.setLocation(250, 0);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
