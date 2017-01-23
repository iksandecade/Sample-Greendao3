package com.example.iksan.greendao3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    DaoSession daoSession;
    RecyclerView rvMain;
    MainAdapter mainAdapter;
    List<User> userList = new ArrayList<User>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMain = (RecyclerView) findViewById(R.id.rvMain);
        daoSession = DaoHandler.getInstance(this);

        userList = daoSession.getUserDao().queryBuilder().list();
        mainAdapter = new MainAdapter(this, userList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvMain.setLayoutManager(layoutManager);
        rvMain.setAdapter(mainAdapter);

    }

    public void toAdd(View view) {
        Intent i = new Intent(this, AddActivity.class);
        startActivity(i);
    }
}
