package alphacare;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
    private MenuCntrl menuCntrl;
    private JFrame frame;
    private JLabel menu;
    private JPanel content;
    private JPanel buttonPanel;
    
    private JButton viewPatientsButton;
    private JButton newPatientButton;
    
    public MenuView(MenuCntrl menuCntrl){
        this.menuCntrl = menuCntrl;
        initComponents();
    }
    
    private void initComponents(){
        setTitle("Main Menu");
        setSize(600,450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        content = new JPanel();
        content.setPreferredSize(new Dimension(350, 150));

        menu = new JLabel("Main Menu");
        menu.setSize(15, 30);
        content.add(menu);
        
        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        viewPatientsButton = new JButton("View Patients");
        viewPatientsButton.addActionListener(event -> menuCntrl.switchToPaitentList());
        
        newPatientButton = new JButton("Add New Patient");
        newPatientButton.addActionListener(event -> menuCntrl.addNewPatient());
        
        buttonPanel.add(viewPatientsButton);
        buttonPanel.add(newPatientButton);
        
        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(content, BorderLayout.NORTH);
        getContentPane().add(buttonPanel, BorderLayout.CENTER);
    }
    
}
