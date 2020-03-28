package alphacare;

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
    private JLabel name;
    private JLabel birthdate;
    private JLabel address;
    private JLabel username;
    private JLabel password;
    private JTextField nameBox;
    private JTextField birthdateBox;
    private JTextField addressBox;
    private JTextField usernameBox;
    private JTextField passwordBox;
    private JButton create;
    private JPanel panel;

    // private UserListModel model;
    
    public CreateAccountView() {
        super("Create New Account");
        setLayout(new FlowLayout());

        name = new JLabel("Name");
        nameBox = new JTextField();
        birthdate = new JLabel("Birthdate");
        birthdateBox = new JTextField();
        address = new JLabel("Address");
        addressBox = new JTextField();
        username = new JLabel("Username");
        usernameBox = new JTextField();
        password = new JLabel("Password");
        passwordBox = new JTextField();
        create = new JButton("Create User");
        create.addActionListener(l);
        
        panel.add(name);
        panel.add(nameBox);
        panel.add(birthdate);
        panel.add(birthdateBox);
        panel.add(address);
        panel.add(addressBox);
        panel.add(username);
        panel.add(usernameBox);
        panel.add(password);
        panel.add(passwordBox);
        panel.add(create);
        
    }

    @Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == create) {
            //Create and pass stuff for username and password (i.e. user list model)
            //Create and pass stuff for name, birthdate, and address (i.e. patient list model)
        }
		
    }
}
