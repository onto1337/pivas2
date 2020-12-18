package view;

import controller.UserController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface extends JFrame {
    private UserController controller;

    private JPanel componentPanel = new JPanel();
    private JButton cookModeButton= new JButton("Войти как повар");
    private JButton chefModeButton= new JButton("Войти как шеф-повар");

    public UserInterface(UserController controller) {
        this.controller = controller;
        setLocation(400,200);
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        componentPanel.add(cookModeButton);
        componentPanel.add(chefModeButton);
        add(componentPanel);

        cookModeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        chefModeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


}
