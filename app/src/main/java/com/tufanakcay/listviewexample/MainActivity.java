package com.tufanakcay.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<UsersModel> usersList; // veri modeli tipinde liste oluştur
    UsersListAdapter adp; // List Adapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        usersData();
    }

    public void usersData() {

        usersList = new ArrayList<>();
        UsersModel user1 = new UsersModel("Tufan", "Akcay", "15/09/80", "Male", "example@gmail.com");
        UsersModel user2 = new UsersModel("Alfred", "Morrison", "15/09/91", "Male", "example@gmail.com");
        UsersModel user3 = new UsersModel("Jackie", "Romero", "15/09/89", "Female", "example@gmail.com");

        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);

        adp = new UsersListAdapter(usersList, this);

        listView.setAdapter(adp);

    }

    private void init() {

        listView = findViewById(R.id.listView);

    }
}