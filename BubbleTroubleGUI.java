//*************************************************
//  
//  CS230 Final Project
//  BubbleTroubleGUI.java
//
//  The game driver, adds in the 3 tabs and contains
//  an instance of PlayGame that is used by the
//  setup panel and play panel
//
//*************************************************

import java.awt.*;
import javax.swing.*; 
import javax.swing.event.*;

public class BubbleTroubleGUI{
  //protected PlayGame game;
  public static void main(String[] args){
    // creates and shows a Frame 
    JFrame frame= new JFrame("Bubble Trouble");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    PlayGame game= new PlayGame();

    
    //creates tabbed pane with 3 tabs 
    //creates panels and adds them to the frame
    JTabbedPane tb= new JTabbedPane();
    InfoPanel info= new InfoPanel();
    tb.addTab("About",info);
        //JScrollPane scrollPane = new JScrollPane(info);
    //scrollPane.setBounds(0,0,900,700);
        //JPanel contentPane = new JPanel(null);
        //contentPane.setPreferredSize(new Dimension(900, 700));
        //contentPane.add(scrollPane);
        //frame.getContentPane().add(contentPane);
    
    SetupPanel add = new SetupPanel(game);
    tb.addTab("Setup",add);
    PlayPanel play= new PlayPanel(game);
    tb.addTab("Play",play);
    frame.getContentPane().add(tb);
    frame.setSize(1100,700);
    frame.setVisible(true);

    
    
  }
  
}