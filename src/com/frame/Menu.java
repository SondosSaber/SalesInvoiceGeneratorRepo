package com.frame;

import javax.swing.*;
import java.awt.*;

public class Menu extends SalesFrame{

    private JMenuBar menuBar = new JMenuBar();;
    private JMenu fileMenu = new JMenu("File");
    private JMenuItem loadFile = new JMenuItem("Load File");
    private JMenuItem saveFile = new JMenuItem("Save File");

    public void createMenu(){
        f.setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        fileMenu.add(loadFile);
        fileMenu.add(saveFile);
        f.setLayout(new FlowLayout());
    }
}
