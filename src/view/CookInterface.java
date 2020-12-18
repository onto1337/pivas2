package view;

import controller.CookController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CookInterface extends JFrame {
    CookController controller;

    private JPanel componentPanel = new JPanel();
    private JButton findRecipeButton= new JButton("Найти рецепт");
    private JButton getAllRecipesButton= new JButton("Список рецептов");
    private JButton getChosenRecipesButton= new JButton("Избранные рецепты");

    public CookInterface(CookController controller) {
        this.controller = controller;

        findRecipeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        getAllRecipesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        getChosenRecipesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


}
