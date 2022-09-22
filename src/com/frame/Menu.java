package com.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends SalesFrame implements ActionListener {

    private JMenuBar menuBar = new JMenuBar();;
    private JMenu fileMenu = new JMenu("File");
    private JMenuItem loadFile = new JMenuItem("Load File");
    private JMenuItem saveFile = new JMenuItem("Save File");

    public void createMenu(SalesFrame sf){
        menuBar.add(fileMenu);
        fileMenu.add(loadFile);
        fileMenu.add(saveFile);
        sf.getF().setJMenuBar(menuBar);
        sf.getF().setLayout(new FlowLayout());
    }

    public void performMenuActions(){
        loadFile.addActionListener(this);
        saveFile.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(loadFile)){
            JOptionPane.showInternalMessageDialog(
                    this,
                    "Upload your file",
                    "Load file",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else if (e.getSource().equals(saveFile)) {
            JOptionPane.showInternalMessageDialog(
                    this,
                    "Save your file",
                    "Save file",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
