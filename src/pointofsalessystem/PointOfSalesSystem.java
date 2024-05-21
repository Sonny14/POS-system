package pointofsalessystem;
import java.util.*;
import javax.swing.*;

public class PointOfSalesSystem {
    
    //Main method
    public static void main(String[] args) {
        
        //Login Page
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frm = new NewJFrame();
                frm.setLocationRelativeTo(null);
                frm.setVisible(true);
            }
        });
    }
    
}
