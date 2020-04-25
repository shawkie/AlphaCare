package alphacare;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * View that will show patients to user that has access to those particular
 * patients.
 *
 * @author Brendan
 */
public class PatientListView extends JFrame {
    private MenuView mView;
    private PatientListCntrl patientListCntrl;
    private RecordView rView;
    private int currentIndex;
    private JPanel content;
    private JPanel buttonPanel;
    private JScrollPane scrollPane;

    private PatientListModel pList;
    private PatientListTable pListTable;
    private final String[] columnNames;
    private JTable table;
    private DefaultListModel<String> listModel;

    private JButton viewBtn;
    private JButton backBtn;
    private JButton addBtn;
    private JButton deleteBtn;

    public String getPatientInfo(String patientListInfo) {
        return patientListInfo;
    }

    public PatientListView(PatientListCntrl patientListCntrl) {
        this.patientListCntrl = patientListCntrl;
        pList = patientListCntrl.getPatientList();
        pListTable = new PatientListTable(pList.getPatientList());
        columnNames = pListTable.getColumnNames();
        table = new JTable(pListTable);
        table.setPreferredScrollableViewportSize(new Dimension(400, 350));
        table.setFillsViewportHeight(true);
        initComponents();

    }

    private void initComponents() {
        setTitle("Patient Directory");
        setSize(600, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        table.getModel().addTableModelListener(System.out::println);

        scrollPane = new JScrollPane(table, VERTICAL_SCROLLBAR_AS_NEEDED, HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(300, 100));
        scrollPane.getViewport().add(table);

        content = new JPanel();
        content.setPreferredSize(new Dimension(350, 150));

        content.add(scrollPane);
        
        buttonPanel = new JPanel((new FlowLayout()));
        viewBtn = new JButton("View Patient Details");
        viewBtn.addActionListener(event -> viewRecord());
        
        addBtn = new JButton("Add New Patient");
        addBtn.addActionListener(event -> addNew());
        
        deleteBtn = new JButton("Remove Patient");
        deleteBtn.addActionListener(event -> removePatient());

        backBtn = new JButton("Back");
        backBtn.addActionListener(event -> back());
        
        buttonPanel.add(backBtn);
        buttonPanel.add(addBtn);
        buttonPanel.add(deleteBtn);
        buttonPanel.add(viewBtn);
        
        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(content, BorderLayout.CENTER);
        getContentPane().add(buttonPanel,BorderLayout.SOUTH);

    }

    private void viewRecord() {
        if (table.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Select a student first.");
        } else {
            try {
                currentIndex = table.getSelectedRow();
                table.getValueAt(table.getSelectedRow(), table.getSelectedColumn());
                rView = new RecordView(patientListCntrl, currentIndex);
                rView.setDefaultCloseOperation(HIDE_ON_CLOSE);
                rView.setVisible(true);
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(rootPane, "There are no patients registered.");
            }
        }
    }

    private void back() {
        dispose();
    }

    private void addNew() {
        patientListCntrl.addNewPatient();
        table.updateUI();
    }

    private void removePatient() {
        patientListCntrl.removePatient(table.getSelectedRow());
        table.updateUI();
    }
}

