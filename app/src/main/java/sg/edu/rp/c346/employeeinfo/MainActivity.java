package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvInfo;
    ArrayList<EmployeeInfo> infoList;
    CustomAdapter caInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvInfo = (ListView) findViewById(R.id.listViewEmployee);
        infoList = new ArrayList<EmployeeInfo>();

        caInfo = new CustomAdapter(this, R.layout.employee_row, infoList);
        lvInfo.setAdapter(caInfo);

        EmployeeInfo item1 = new EmployeeInfo("John", "Software Technical Leader", 3400); //Create a ToDoItem object named item1
        infoList.add(item1);  //Add the ToDoItem object to the toDoList ArrayList

        EmployeeInfo item2 = new EmployeeInfo("May", "Programmer", 2200);
        infoList.add(item2);

    }
}
