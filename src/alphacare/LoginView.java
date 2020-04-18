package alphacare;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * View that prompts the user to enter their credentials to log in.
 *
 * @author Brendan
 */
public class LoginView extends JFrame {

    private JTextField usernameTextbox;
    private JTextField passwordTextbox;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JButton loginButton;
    private JButton newUserButton;
    private JPanel content;
    private LoginCntrl loginCntrl;

    public LoginView(LoginCntrl loginCntrl) {
        this.setTitle("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        this.loginCntrl = loginCntrl;

        usernameLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");
        usernameTextbox = new JTextField(20);
        passwordTextbox = new JTextField(20);
        content = new JPanel();
        this.setResizable(false);

        newUserButton = new JButton("New User");
        loginButton = new JButton("Login");

        content.setPreferredSize(new Dimension(350, 150));

        content.add(usernameLabel);
        content.add(usernameTextbox);
        content.add(passwordLabel);
        content.add(passwordTextbox);
        content.add(loginButton);
        content.add(newUserButton);
        this.setContentPane(content);
        this.pack();// helps display nicers
        

        newUserButton.addActionListener(event -> loginCntrl.switchToCreateAccount());
        loginButton.addActionListener(event -> loginCntrl.loginAccount());
    }

    public void loginButtonListener(ActionListener al) {
        loginButton.addActionListener(event -> loginCntrl.loginAccount());
        System.out.println("login button clicked");
    }

    public void newUserButtonListener(ActionListener al) {
        newUserButton.addActionListener(event -> loginCntrl.switchToCreateAccount());
    }

    public String getUserName() {
        return usernameTextbox.getText();
    }

    public String getPassword() {
        return passwordTextbox.getText();
    }

}
