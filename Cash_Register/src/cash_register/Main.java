
package cash_register;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Main {

   
    public static void main(String[] args) {
        CashFrame cashFrame = new CashFrame();
        cashFrame.setLocationRelativeTo(null);
        cashFrame.setVisible(true);
        cashFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
    }
    
}
