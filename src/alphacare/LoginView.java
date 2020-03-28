package alphacare;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * View that prompts the user to enter their credentials to log in.
 * @author Brendan
 */


public class LoginView extends JFrame{
    
    private JTextField usernameInput;
    private JTextField passwordInput;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JButton loginButton;
    private JButton newUserButton;
    private JPanel content;

    private LoginCntrl loginCntrl;
    

 
   
    LoginView(LoginCntrl loginCntrl){
        this.loginCntrl = loginCntrl;
        
        
        usernameLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");
        usernameInput = new JTextField(20);
        passwordInput = new JTextField(20);
        content = new JPanel();

        newUserButton = new JButton("New User");
        loginButton = new JButton("Login");
        
        
        content.setPreferredSize(new Dimension(350, 150));
        content.add(usernameLabel);
        content.add(usernameInput);
        content.add(passwordLabel);
        content.add(passwordInput);
        content.add(loginButton);
        content.add(newUserButton);
        this.setContentPane(content);
        this.pack();// helps display nicers
        this.setTitle("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        newUserButton.addActionListener(event -> loginCntrl.switchToCreateAccount());

    }
    
    public void loginButtonListener(ActionListener al) 
    {    
        loginButton.addActionListener(event -> loginCntrl.loginAccount());
    }
    
    public void newUserButtonListener(ActionListener al) 
    {    
        newUserButton.addActionListener(event -> loginCntrl.switchToCreateAccount());
    }
    
    public String getUserName(){
        return usernameInput.getText();
    }
    
    public String getPassword(){
        return passwordInput.getText();
    }

    
}
