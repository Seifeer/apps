package com.example.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private float calculo_imc;
    private EditText altura;
    private EditText peso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        altura=findViewById(R.id.tipo_altura);
        peso=findViewById(R.id.tipo_peso);

        CalcularImc();

    }

    public void CalcularImc(){
        float imc_altura= Float.parseFloat(altura.getText().toString());
        float imc_peso= Float.parseFloat(peso.getText().toString());

        calculo_imc= imc_peso/(imc_altura*imc_altura);
        Toast.makeText(this, "IMC: "+calculo_imc+"\n"+"Teste", Toast.LENGTH_SHORT).show();
    }
}
