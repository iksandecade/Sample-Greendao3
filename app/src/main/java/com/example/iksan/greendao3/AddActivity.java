package com.example.iksan.greendao3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class AddActivity extends AppCompatActivity {

    Spinner spCategory;
    EditText etTitle;
    DaoSession daoSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        spCategory = (Spinner) findViewById(R.id.spCategory);
        etTitle = (EditText) findViewById(R.id.etTitle);

        daoSession = DaoHandler.getInstance(this);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.category_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spCategory.setAdapter(adapter);
    }

    public void insertData(View view) {
        if (isValidate()) {
            User user = new User(System.currentTimeMillis(), etTitle.getText().toString(), spCategory.getSelectedItem().toString(), "nuul");
            daoSession.getUserDao().insert(user);

            finish();
        }
    }

    private boolean isValidate() {
        Boolean result = true;

        String title = etTitle.getText().toString();

        if (title.trim().isEmpty()) {
            etTitle.setError("Insert Title");
            result = false;
        }

        return result;
    }

}
