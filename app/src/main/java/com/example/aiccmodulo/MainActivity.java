package com.example.aiccmodulo;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.aiccmodulo.Views.ExecuteButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aModB = findViewById(R.id.SimpleModulo);

        Spinner operationChoice = findViewById(R.id.operationChoice);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.operationChoice, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        operationChoice.setAdapter(adapter);

        TextView a = findViewById(R.id.input_A);
        TextView b = findViewById(R.id.input_B);
        TextView m = findViewById(R.id.input_M);

        TextView out = findViewById(R.id.output);



        aModB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out.setText("not working");
                ExecuteButton.compute(operationChoice, out, a, b, m);
            }
        });

    }
}