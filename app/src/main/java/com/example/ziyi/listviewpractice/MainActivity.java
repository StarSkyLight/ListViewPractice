package com.example.ziyi.listviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private final static String NAME = "name";
    private final static String SEX = "sex";
    private final static String CLASS = "class";
    private final static String NO = "no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] names = {"张强","孙红","王丽","李名"};
        String[] sexes = {"男","女","女","男"};
        String[] classes = {"一班","二班","三班","四班"};
        String[] nos = {"001","002","003","004"};

        List<Map<String,Object>> students = new ArrayList<Map<String, Object>>();

        for(int index = 0;index<names.length;index++){
            Map<String,Object> student = new HashMap<String,Object>();
            student.put(NAME,names[index]);
            student.put(SEX,sexes[index]);
            student.put(CLASS,classes[index]);
            student.put(NO,nos[index]);
            students.add(student);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(
                this,
                students,
                R.layout.item,
                new String[]{NAME,SEX,CLASS,NO},
                new int[]{R.id.name,R.id.sex,R.id.clas,R.id.no});

        ListView listView = (ListView)findViewById(R.id.listView);

        listView.setAdapter(simpleAdapter);
    }
}
