
/**
 * Write a description of class Departure here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
public class Departure extends JFrame
{
    private JButton leave, stay;
    private BufferedImage imagi;
    public Departure()
    {
        this.setLayout(null);
        //background image
        try
        {
            imagi= ImageIO.read(new File("back2.jpg"));
            this.setContentPane((new JLabel(new ImageIcon(imagi))));
           
        }catch(Exception e)
        {
            System.out.print("Not found");
        }
        //buttons
        leave = new JButton("Yes");
        leftButtonHandle leaving = new leftButtonHandle();
        leave.addActionListener(leaving);
        leave.setBounds( 30, 40, 90, 27);
        add(leave);

        stay = new JButton("No");
        stayButtonHandle stick = new stayButtonHandle();
        stay.addActionListener(stick);
        stay.setBounds( 150, 40, 90, 27);
        add(stay);

    }
    
    private class leftButtonHandle implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            
            System.exit(1);
            
        }
        
    }
    
    private class stayButtonHandle implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            JOptionPane.showMessageDialog(null,"Good Choice, Remember Real Winners know when to Stop");
        }
        
    }
}

