package alphacare;
import java.util.ArrayList;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * View that will show a particular patient's records.
 * @author Brendan
 */

public class PatientRecordsView extends JFrame {
    private RecordListModel model;
    private ArrayList recordList;
    
    private PatientRecordsView(RecordListModel model){
        recordList = model.getRecordList();
    }
    
    public ArrayList getPatientRecords() {
        return recordList;
    }
}
