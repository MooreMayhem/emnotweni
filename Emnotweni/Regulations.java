
/**
 * Write a description of class Regulations here.
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
public class Regulations extends JFrame
{
    private JTextArea letter;
    private JLabel pics;
    private JButton read, listen;
    Scanner fagas = new Scanner(new File("rules.txt"));
   
    public Regulations() throws Exception
    {

        this.setLayout(null);
        //labels
        pics = new JLabel("Get the most points");
        pics.setBounds(0,30,100,80);
        add(pics);
        //buttons
        read = new JButton("Read");
        read.setBounds( 70, 10, 90, 27);
        readButtonHandle cross = new readButtonHandle();
        read.addActionListener(cross);
        add(read);

        listen = new JButton("Listen");
        listen.setBounds( 200, 10, 90, 27);
        listenButtonHandle hear = new listenButtonHandle();
        listen.addActionListener(hear);
        add(listen);
        //listen.setVisible(false);
        //text area

        letter = new JTextArea();
        letter.setBounds(50,150,400,400);
        //letter.setText(newline);
        add(letter);
        letter.setVisible(false);

        
    }

    private class readButtonHandle implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            //String [] text = new String [150];
            letter.setVisible(true);
            //int counter = 0;
            while (fagas.hasNext())
            {
                 String newline = fagas.nextLine();
                letter.setText(newline + "\n");
                //text[counter] = newline;
                //counter++;
            }
            fagas.close();
        }
    }

    private class listenButtonHandle implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            //listen.setVisible(true);
        }
    }

    
    
}
