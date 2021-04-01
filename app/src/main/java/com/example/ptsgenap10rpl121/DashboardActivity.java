package com.example.ptsgenap10rpl121;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdapter userAdapter;
    private ArrayList<User> userArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        addData();

        recyclerView = findViewById(R.id.recyclerview);
        userAdapter = new UserAdapter(userArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DashboardActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(userAdapter);
    }

    private void addData() {
        userArrayList = new ArrayList<>();
        userArrayList.add(new User("Raehan", "OrsterdOhm"));

        for (int i = 1; i <= 100; i++) {
            userArrayList.add(new User("User "+ i, "user "+ i));
        }

    }

}