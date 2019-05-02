package com.mazenrashed.fetchr.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.mazenrashed.fetchr.R;

public class InputActivity extends AppCompatActivity {

    public static final String USER_INPUT = "user input";

    private EditText oddNumberEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oddNumberEditText = findViewById(R.id.obbNumberEditText);

        findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int enteredNumber = Integer.parseInt(oddNumberEditText.getText().toString());

                if (enteredNumber % 2 == 0){
                    Toast.makeText(InputActivity.this, "Please enter an odd number", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent = new Intent(InputActivity.this, ResultActivity.class);
                intent.putExtra(USER_INPUT, enteredNumber);
                startActivity(intent);
            }
        });
    }
}
