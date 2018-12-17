package com.trevorpc.weekendwarrior5.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.trevorpc.weekendwarrior5.R;
import com.trevorpc.weekendwarrior5.viewmodels.DataFetch;

public class MainActivity extends AppCompatActivity {

    Button button;
    public static TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textview);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "onClick: click");
                DataFetch process = new DataFetch();
                process.execute();
            }
        });
    }
}
