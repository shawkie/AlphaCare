/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alphacare;

import java.util.ArrayList;

/**
 * Model that will hold a list of different patient records.
 * @author Project Team 5
 */

public class RecordListModel {
    private final ArrayList<RecordModel> recordList;
    
    public RecordListModel(){
        recordList = new ArrayList();
        recordList.add(new RecordModel("name", "date", "record"));
    }
    
    public Object getRecord(int index)
    {
       return recordList.get(index);
    }
     
    public ArrayList getRecordList() {
        return recordList;
    }
    
    public void putRecord(String putRecord){
        recordList.add(new RecordModel("name", "date",putRecord));
    }
    
    public void addRecord(String name, String date, String record){
        recordList.add(new RecordModel(name, date, record));
    }
}
