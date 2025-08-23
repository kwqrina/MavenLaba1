/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ekate
 */
public class App extends JFrame {
    private final JButton importButton, calculationButton, exportButton, exitButton;
    private final JTextArea outputArea;

    public App() {        
        setTitle("Программа для расчета статистических показателей");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        importButton = new JButton("Импорт данных");
        calculationButton = new JButton("Расчет данных");
        exportButton = new JButton("Экспорт данных");
        exitButton = new JButton("Выход");
        outputArea = new JTextArea();

      
        JPanel panel = new JPanel();
        panel.add(importButton);
        panel.add(calculationButton);
        panel.add(exportButton);
        panel.add(exitButton);
        panel.add(new JLabel("Введите уровень надежности для расчета доверительного интервала:"));

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        setVisible(true);
    }

    public JButton getImportButton() {return importButton;}
    public JButton getCalculationButton() {return calculationButton;}
    public JButton getExportButton() {return exportButton;}
    public JButton getExitButton() {return exitButton;}
    public JTextArea getOutputArea() {return outputArea;}
    
}