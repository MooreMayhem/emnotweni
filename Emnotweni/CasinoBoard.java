
/**
 * Write a description of class CasinoBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;

public class CasinoBoard extends JFrame 
{
    private JButton startGame, rules, exitcasino,freeze;
    // private Container greenTable;
    private BufferedImage imag;
    private JTextArea table;
    private JTextField hand;
    private JFrame framed, picaso;
    private JLabel optional, size, sized, cards,firstCard;

    House nine = new House();
    public CasinoBoard()
    {
        super("Gaming Board Of Mpumalanga");
        //The Jframe set up
      
        framed = new JFrame();
        this.setBackground(Color.magenta);
        setLayout(null);
           try
        {
            imag= ImageIO.read(new File("back.jpg"));
            this.setContentPane((new JLabel(new ImageIcon(imag))));
           
        }catch(Exception e)
        {
            System.out.print("Not found");
        }
        
        //capturing the image
        
        //creating buttons
        startGame = new JButton("Start\nGame");
        startGame.setBounds(5,70,96,30);
        startGame.setBackground(Color.orange);
        add(startGame);
        startButtonHandle controls = new startButtonHandle();
        startGame.addActionListener(controls);

        rules = new JButton("Rules & History");
        rules.setBounds(5, 125, 123,30);
        rules.setBackground(Color.orange); 
        add(rules);
        ruleButtonHandle straight = new ruleButtonHandle();
        rules.addActionListener(straight);

        exitcasino = new JButton("Exit Casino");
        exitcasino.setBounds(5, 180, 121, 30);
        exitcasino.setBackground(Color.orange);
        add(exitcasino);
        exitButtonHandle close = new exitButtonHandle();
        exitcasino.addActionListener(close);

        //creating labels
        optional = new JLabel("Optional Info");
        optional.setBounds(5,230, 110,30);
        optional.setBackground(Color.blue);
        optional.setFont( new Font("Arial", Font.BOLD, 17));
        add(optional);

        size = new JLabel("Emnotweni Casino");
        size.setBounds(220,150,250,70);
        size.setFont( new Font("Casteller", Font.ITALIC, 28));
        size.setBackground(Color.orange);
        //add(size);

        sized = new JLabel("Emnotweni Casino");
        sized.setBounds(220,150,250,70);
        sized.setFont( new Font("Arial", Font.BOLD, 24));
        sized.setBackground(Color.orange);
        add(sized);
        //creating the table
        table = new JTextArea();
        table.setSize(100,100);
        table.setLocation(90,90);

        //creating the money slot
        hand = new JTextField();
        hand.setSize(55,30);
        hand.setLocation(10,10);
        //hand.
        hand.setBackground(Color.blue);

        //setting the scene
        //table = new JTextArea();
        //table.setBounds(0,0,700,700);
       // table.setBackground(Color.green);
        //add(table);
        //creating signage
        // signMaster = new JLabel("EMNOTWENI CASINO", SwingConstants.CENTER);
        //signMaster.setFont( new Font("Arial", Font.BOLD, 14));
        //signMaster.setSize(10,10);
        //signMaster.setLocation(200,30);

        //creating the pane
        // greenTable = getContentPane();
        //greenTable.setBackground(Color.green);
        //greenTable.setLayout(null);
        //this.add(startJButton);

        //Adding content to the pane
        //greenTable.add(startJButton);
        //greenTable.add(table);
        //greenTable.add(hand);

    }
    private class startButtonHandle implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
           // rules.setVisible(false);
            //exitcasino.setBounds(5,620,120,30);
           //dispose();
           // optional.setVisible(false);
            //signs.setVisible(false);
            // creating the card image
           // firstCard.setVisible(true);
            //frame
            
            
           nine.mouse(); 
           //nine.image();
            
            /**freeze = new JButton("Shuffle");
            freeze.setBounds(300, 40, 90,28);
            add(freeze);
            */
        }

    }
    private class exitButtonHandle implements ActionListener
    {

        public void actionPerformed( ActionEvent e )
        {
            nine.leaves();
        }

    }
    
    private class ruleButtonHandle implements ActionListener
    {

        public void actionPerformed( ActionEvent e ) 
        {
           //dispose();
            try
            {
                
            nine.ruling();
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,"Not found");
            }
        }

    }
    
    
    
    
    
    
    
    

}
