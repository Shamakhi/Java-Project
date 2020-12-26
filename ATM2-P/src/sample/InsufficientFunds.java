package sample;

import javax.swing.*;


public class InsufficientFunds extends Exception {

    /**
     * This exception is thrown for when the account balance
     * is less than 0.
     */

    public InsufficientFunds() {
        JOptionPane frame = new JOptionPane();
        JOptionPane.showMessageDialog(frame, "Insufficient Funds!");
    }
}
