package com.mazenrashed.fetchr.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mazenrashed.fetchr.R;
import com.mazenrashed.fetchr.data.DataManager;
import com.mazenrashed.fetchr.data.local.MagicSqareHelper;

public class ResultActivity extends AppCompatActivity {

    private ResultViewModel viewModel = new ResultViewModel(new DataManager(new MagicSqareHelper()));
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultTextView = findViewById(R.id.resultTextView);

        int enteredNumber = getIntent().getIntExtra(InputActivity.USER_INPUT, 0);
        resultTextView.setText(viewModel.getMagicSquare(enteredNumber));
    }
}
