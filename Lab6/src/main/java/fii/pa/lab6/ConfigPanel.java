/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fii.pa.lab6;

import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author mike
 */
public class ConfigPanel extends JPanel {

    final MainFrame frame;
    JLabel sidesLabel; // we’re drawing regular polygons
    JSpinner sidesField; // number of sides
    JComboBox shapeCombo; // the shape
    JComboBox colorCombo; // the color of the shape

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
        shapeCombo.addActionListener((ActionEvent e) -> {
            if (shapeCombo.getSelectedIndex() == 1) {
                remove(sidesLabel);
                remove(sidesField);
            } else {
                add(sidesLabel);
                add(sidesField);
            }
            repaint();
        });
    }

    private void init() {
        //create the label and the spinner
        sidesLabel = new JLabel("Number of sides:");
        sidesField = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        sidesField.setValue(6); //default number of sides
        String[] shapes = {"Regular Polygon", "Circle"};
        shapeCombo = new JComboBox(shapes);
        //create the colorCombo, containing the values: Random and Black
        String[] colors = {"Random", "Black"};
        colorCombo = new JComboBox(colors);

        add(shapeCombo);
        add(colorCombo);
        add(sidesLabel);
        add(sidesField);
    }

}
