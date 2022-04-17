package com.example.aiccmodulo;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.aiccmodulo.Calculation.SimpleModulo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aModB = findViewById(R.id.SimpleModulo);
        TextView a = findViewById(R.id.input_A);
        TextView b = findViewById(R.id.input_B);
        TextView m = findViewById(R.id.input_M);

        TextView out = findViewById(R.id.output);

        aModB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out.setText(SimpleModulo.simpleMod(Long.parseLong(a.getText().toString()), Long.parseLong(m.getText().toString())));
                if (out.getText().toString() != ""){
                    out.setPadding(100, 20, 100, 20);
                } else {
                    out.setPadding(0,0,0,0);
                }
            }
        });
    }
}