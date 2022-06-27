
/**
 * Write a description of class Emnotweni here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
public class Emnotweni 
{
    public static void main( String [] args )
    {
        CasinoBoard riverSide = new CasinoBoard();
        riverSide.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        riverSide.setSize(700,700);
        riverSide.setVisible(true);
        //riverSide.setBackground(Color.green);
    }
}
