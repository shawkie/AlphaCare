package alphacare;
import java.awt.BorderLayout;
import java.awt.Dimension;
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
 * View that will show patients to user that has access to those particular patients.
 * @author Brendan
 */


public class PatientListView extends JFrame{
    
    private PatientListCntrl patientListCntrl;
    private RecordView rView;
    private int currentIndex;
    private JPanel content;
    private JScrollPane scrollPane;
    
    private PatientListModel pList;
    private PatientListTable pListTable;
    private final String[] columnNames;
    private JTable table;
    private DefaultListModel<String> listModel;
    
    private JButton viewBtn;
    private JButton backBtn;
    
    public String getPatientInfo(String patientListInfo) {
        return patientListInfo;
    }
    
    public PatientListView(PatientListCntrl patientListCntrl){
        this.patientListCntrl = patientListCntrl;
        pList = patientListCntrl.getPatientList();
        pListTable = new PatientListTable(pList.getPatientList());
        columnNames = pListTable.getColumnNames();
        table = new JTable(pListTable);
        table.setPreferredScrollableViewportSize(new Dimension(400,350));
        table.setFillsViewportHeight(true);
        initComponents();
        
    }

    private void initComponents() {
        setTitle("Patient Directory");
        setSize(600,450);
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
        
        viewBtn = new JButton("View Student Details");
        viewBtn.addActionListener(event -> viewRecord());

        backBtn = new JButton("Done");
        backBtn.addActionListener(event -> back());
        
        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(content, BorderLayout.CENTER);

    }

    private void viewRecord() {
         if (table.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Select a student first.");
        } else {

            try {
                currentIndex = table.getSelectedRow();
                table.getValueAt(table.getSelectedRow(), table.getSelectedColumn());
                sUI = new recordView(patientListCntrl, currentIndex);
                sUI.setDefaultCloseOperation(HIDE_ON_CLOSE);
                sUI.setVisible(true);
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(rootPane, "There are no students registered.");
            }
        }
    }

    }

    private void back() {
        
    }
}
