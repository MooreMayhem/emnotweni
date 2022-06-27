
/**
 * Write a description of class Cards here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
public class Cards extends JFrame
{
    private JButton j;
    private JLabel five,image,firstCard;
    private BufferedImage imag;
    
    public Cards()
    {
        //background
            try
        {
            imag= ImageIO.read(new File("back2.jpg"));
            this.setContentPane((new JLabel(new ImageIcon(imag))));
           
        }catch(Exception e)
        {
            System.out.print("Not found");
        }
        //frame layout
        this.setLayout(null);
        //image
        ImageIcon two = new ImageIcon("Untitled.jpg");
        firstCard = new JLabel(two);
        firstCard.setBounds(300, 90, 800, 800);
        firstCard.setVisible(true);
        add(firstCard);
        
        j = new JButton("Flip");
        j.setBounds( 10,50,120,40);
        showCard hand = new showCard();
        j.addActionListener(hand);
        add(j);

        image = new JLabel();
        image.setSize(350,318);
        image=image();
        image.setLocation(60,300);
        image.setVisible(false);
        add(image);
    }

    private class showCard implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            image.setVisible(true);
        }
    }
    public JLabel image()
    {
        try{
            five= new JLabel(new ImageIcon("2000.jpeg"));

        }catch(Exception e)
        {
            System.out.print("Not found");
        }
        return five;
    }
}
