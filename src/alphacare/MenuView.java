package alphacare;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * View of a main menu that will show different options to users that have logged in.
 * @author Brendan
 */

public class MenuView extends JFrame{
    
    private JFrame frame;
    private JLabel menu;
    private JPanel content;
    private JButton viewPatientsButton;
    
    public MenuView(){
        menu = new JLabel("menu");
        viewPatientsButton = new JButton("View Patients");
        frame = new JFrame();
        content = new JPanel();
        content.setPreferredSize(new Dimension(350, 150));
        
        frame.setLayout(new GridLayout(1,3));
        frame.add(content);
        
//        this.setContentPane(content);
        this.pack();// helps display nicers
        this.setTitle("Menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
