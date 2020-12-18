package view;

import controller.ChefAuthorizationController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChefAuthorizationInterface extends JFrame {

    ChefAuthorizationController controller;

    private JPanel componentPanel = new JPanel();
    private JButton authorizationButton= new JButton("Войти");

    public ChefAuthorizationInterface(ChefAuthorizationController controller) {
        this.controller = controller;

        authorizationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
