package com.example.aiccmodulo.Views;

import android.content.Context;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.example.aiccmodulo.Calculation.Euclid;
import com.example.aiccmodulo.Calculation.ModuloOrder;
import com.example.aiccmodulo.Calculation.ModuloPower;
import com.example.aiccmodulo.Calculation.SimpleModulo;

public class ExecuteButton {

    private ExecuteButton() {}

    public static void compute(Spinner spinner, TextView out, TextView inA, TextView inB, TextView inM){
        long choice = spinner.getSelectedItemId();
        long a = Long.parseLong(inA.getText().toString());
        long b = Long.parseLong(inB.getText().toString());
        long m = Long.parseLong(inM.getText().toString());

        try {
            switch ((int) choice) {
                case 0 :
                    out.setText(Long.toString(SimpleModulo.simpleMod(a, m)));
                    break;
                case 1 :
                    out.setText(ModuloOrder.orderMultiplication(m).toString());
                    break;
                case 2 :
                    out.setText(ModuloOrder.orderAddition(m).toString());
                    break;
                case 3 :
                    out.setText(Long.toString(Euclid.gcd(a, b)));
                    break;
                case 4 :
                    out.setText(new Euclid(a, m).toString());
                    break;
                case 5 :
                    out.setText(Long.toString(ModuloPower.moduloPower(a, b, m)));
                    break;
            }
        } catch (Exception e){
            out.setText(String.format("Error of type %s", e));
        }

    }
}
