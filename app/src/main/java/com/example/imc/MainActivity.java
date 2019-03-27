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
    private TextView textRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        altura=findViewById(R.id.tipo_altura);
        peso=findViewById(R.id.tipo_peso);
        textRes=findViewById(R.id.txt_resultado);
        btn_imc=findViewById(R.id.tipo_calculo);
    }

    public void calcular_imc(View view) {
        if (b)

        float imc_altura= Float.parseFloat(altura.getText().toString());
        float imc_peso= Float.parseFloat(peso.getText().toString());
        float calculo_imc= imc_peso/(imc_altura*imc_altura);
        String classif="";

        if (calculo_imc<18){
            classif="ABAIXO DO PESO";
        }else if(calculo_imc>30){
            classif="OBESIDADE";
        }else {
            classif = "Normal";
        }
        String result=textRes.setText("Altura: %.2f\nPeso: %.1f\nIMC: %.1f\nSit.:);

        result= String.format(result, altura, peso, calculo_imc);
        textRes.setVisibility(View.VISIBLE);
        //Toast.makeText(this, "IMC: "+calculo_imc+"\n"+"Teste", Toast.LENGTH_SHORT).show();
    }
}
