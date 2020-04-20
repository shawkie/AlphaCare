/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * View that allows user to see a particular record and its details.
 * @author Brendan
 */

public class RecordView extends JFrame{
    private final PatientListModel model;
    private final ArrayList rArray;
    private final int currentIndex;
    private final PatientListCntrl pListCntrl;
    private JPanel content;
    private JPanel buttonPanel;
    private JButton backBtn;

    public RecordView(PatientListCntrl patientListCntrl, int startingIndex) {
        pListCntrl = patientListCntrl;
        model = PatientListModel.getInstance();
        currentIndex = startingIndex;
        rArray = model.getPatient(currentIndex).getRecord();
        
        initComponents();
    }

    private void initComponents() {
        setTitle("Patient Records");
        setSize(450,450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setResizable(false);
        
        content = new JPanel();
        content.setPreferredSize(new Dimension(350, 150));
        buttonPanel = new JPanel(new GridLayout(2,1));
        
        backBtn = new JButton("Back");
        backBtn.addActionListener(event -> goBackToListView());
        
        
        buttonPanel.add(backBtn);
        String[] records = splitRecordsIntoItems();
        for (String record : records) {
            content.add(new JTextField(record.replace("{", " ").replace("[", "").replace("\\", "")));
        }
        
        
        
        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(content, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        
    }

    private void goBackToListView() {
        this.setVisible(false);
        
    }
    
    private String[] splitRecordsIntoItems(){
        String[] split;
        String rArrayString = rArray.toString();
        rArrayString.replace("{", "");
        rArrayString.replace("]", "");
        rArrayString.replace(",", "");
        rArrayString.replace("\"","");
        rArrayString.replace("}","");
        rArrayString.replace(":","");
        rArrayString.replace("\" ", "");
        split = rArrayString.split("records");
        System.out.println(Arrays.toString(split));
        System.out.println(split[0]);
        return split;
    }

    
}
