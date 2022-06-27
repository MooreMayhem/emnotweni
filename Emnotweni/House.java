
/**
 * Write a description of class House here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.io.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
public class House
{
    private JFrame frames, rul, leav;
    private JButton but;
    private Container pane;
    /** public static void main(String [] args)
    {
    JFrame frames = new JFrame();
    frames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frames.setSize(900,700);
    frames.setVisible(true);
    frames.setBackground(Color.green);
    }
     */

    public void mouse()
    {
        //super("Top Ten");
        //The Jframe set up
        frames = new Cards();
        //setBackground(Color.green);
        //setLayout(null);
        frames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frames.setSize(700,600);
        frames.setVisible(true);
    }

    public void ruling() throws Exception
    {
        rul = new Regulations();
        //setLayout(null);
        //rul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rul.setSize(900,900);
        rul.setVisible(true);
    }
    
    public void leaves()
    {
        leav = new Departure();
        
        leav.setSize(300,300);
        leav.setVisible(true);
    }
    /** public void Housed()
    {
    but = new JButton("yes");
    pane.but.setBounds(20,20,200,200);
    add(but);
    }
     */
}
