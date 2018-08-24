package lk.it.uom;

import javax.swing.*;

public class CalculatorUI {

    public static void main(String args[]){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter input 1 :"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter input 2 :"));
        JOptionPane.showConfirmDialog(
                null,
                CalculatorLogic.add(x,y),
                "Result is :",JOptionPane.YES_OPTION
        );
    }
}
