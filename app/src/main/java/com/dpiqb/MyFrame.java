package com.dpiqb;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
  JLabel label;

  ImageIcon icon;

  MyFrame(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 500);
    this.setLayout(null);
    this.addKeyListener(this);

    icon = new ImageIcon("100.jpg");

    label = new JLabel();
    label.setBounds(0, 0, 100, 100);
    label.setIcon(icon);
//    label.setBackground(Color.RED);
//    label.setOpaque(true);

    this.add(label);
    this.setVisible(true);
  }

  @Override
  public void keyTyped(KeyEvent e) {
    switch (e.getKeyChar()) {
      case 'a' -> label.setLocation(label.getX() - 5, label.getY()); // L
      case 'w' -> label.setLocation(label.getX(), label.getY() - 5); // U
      case 'd' -> label.setLocation(label.getX() + 5, label.getY()); // R
      case 's' -> label.setLocation(label.getX(), label.getY() + 5); // D
    }
  }

  @Override
  public void keyPressed(KeyEvent e) {
    switch (e.getKeyCode()) {
      case 37 -> label.setLocation(label.getX() - 5, label.getY()); // L
      case 38 -> label.setLocation(label.getX(), label.getY() - 5); // U
      case 39 -> label.setLocation(label.getX() + 5, label.getY()); // R
      case 40 -> label.setLocation(label.getX(), label.getY() + 5); // D
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
    System.out.println("keyReleased CHAR: "+ e.getKeyChar());
    System.out.println("keyReleased CODE: "+ e.getKeyCode());
  }
}
