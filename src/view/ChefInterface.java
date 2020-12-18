package view;

import controller.ChefController;
import controller.CookController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChefInterface extends JFrame {
    ChefController controller;

    private JPanel componentPanel = new JPanel();
    private JButton findRecipeButton= new JButton("Найти рецепт");
    private JButton getAllRecipesButton= new JButton("Список рецептов");
    private JButton getChosenRecipesButton= new JButton("Избранные рецепты");
    private JButton addRecipeButton= new JButton("Добавить рецепт");
    private JButton makeRecipeChosenButton= new JButton("Добавить в избранные");

    public ChefInterface(ChefController controller) {
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

        addRecipeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        makeRecipeChosenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
