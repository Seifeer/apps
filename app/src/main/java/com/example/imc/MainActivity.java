package com.example.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText imc_calculo;
    private EditText altura;
    private EditText peso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        altura=findViewById(R.id.tipo_altura);
        peso=findViewById(R.id.tipo_peso);

        imc_calculo=peso/altura*altura;

        CalcularImc(altura,peso);
    }

    public void CalcularImc(View altura, View peso){

    }
}
