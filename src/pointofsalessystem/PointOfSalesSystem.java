package pointofsalessystem;
import java.awt.Image;
import java.io.File;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class PointOfSalesSystem {
        
        
    //Main method
    public static void main(String[] args) {
        
        
        
        //Login Page
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frm = new Login();
                frm.setLocationRelativeTo(null);
                frm.setVisible(true);
            }
        });
    }
    
}
