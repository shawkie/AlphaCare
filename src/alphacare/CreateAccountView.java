package alphacare;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.*;


public class CreateAccountView extends JFrame implements ActionListener{
    /**
     *
     */
    private static final long serialVersionUID = 2954612794261113380L; //IDE said "The serializable class CreateAccountView does not declare a static final serialVersionUID field of type long"
    private JLabel nameLabel;
    private JLabel birthdateLabel;
    private JLabel addressLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField nameTextbox;
    private JTextField birthdateTextbox;
    private JTextField addressTextbox;
    private JTextField usernameTextbox;
    private JTextField passwordTextbox;
    private JButton createButton;
    private JPanel panel;
    
    private LoginCntrl loginCntrl;

    // private UserListModel model;
    
    public CreateAccountView(LoginCntrl loginCntrl) {
        super("Create New Account");
        this.loginCntrl = loginCntrl;
        this.setResizable(false);
        
        setLayout(new FlowLayout());

        panel = new JPanel();
        nameLabel = new JLabel("Name");
        nameTextbox = new JTextField("", 20);
        birthdateLabel = new JLabel("Birthdate");
        birthdateTextbox = new JTextField("", 20);
        addressLabel = new JLabel("Address");
        addressTextbox = new JTextField("", 20);
        usernameLabel = new JLabel("Username");
        usernameTextbox = new JTextField("", 20);
        passwordLabel = new JLabel("Password");
        passwordTextbox = new JTextField("", 20);
        createButton = new JButton("Create User");
        
        panel.setPreferredSize(new Dimension(350, 200));
        panel.add(nameLabel);
        panel.add(nameTextbox);
        panel.add(birthdateLabel);
        panel.add(birthdateTextbox);
        panel.add(addressLabel);
        panel.add(addressTextbox);
        panel.add(usernameLabel);
        panel.add(usernameTextbox);
        panel.add(passwordLabel);
        panel.add(passwordTextbox);
        panel.add(createButton);
        
        this.setContentPane(panel);
        this.pack();// helps display nicers
        this.setTitle("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        createButton.addActionListener(event -> loginCntrl.createNewUser(nameTextbox.getText(), addressTextbox.getText(), birthdateTextbox.getText(), usernameTextbox.getText(), passwordTextbox.getText()));
    }
    public void createButtonListener(ActionListener al) 
    {    
        createButton.addActionListener(al);
    }
    
    public void createUserInputs(){
        
    }

    @Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == createButton) {
            //Create and pass stuff for username and password (i.e. user list model)
            //Create and pass stuff for name, birthdate, and address (i.e. patient list model)
        }
		
    }
}
