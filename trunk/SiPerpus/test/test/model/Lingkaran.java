/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.model;

import javax.swing.JOptionPane;

/**
 *
 * @author puspa
 */
public class Lingkaran {

    private int jejari;

    public Lingkaran() {
    }

    public Lingkaran(int jejari) {
        try {
            setJejari(jejari);
        } catch (Exception ex) {
            System.out.println("message :" + ex.getMessage());
        }
    }

    /**
     * @return the jejari
     */
    public int getJejari() {
        return jejari;
    }

    /**
     * @param jejari the jejari to set
     */
    public void setJejari(int jejari) throws InputValueException {
        if (jejari > 0) {
            this.jejari = jejari;
        } else {
            throw new InputValueException("input negatif");
        }
    }

    public static void main(String[] args) {
        try {
            Lingkaran test = new Lingkaran();
            test.setJejari(-5);
            System.out.println("jejari = " + test.getJejari());
        } catch (InputValueException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}

class InputValueException extends Exception {

    public InputValueException() {
    }

    public InputValueException(String message) {
        super(message);
    }
}


