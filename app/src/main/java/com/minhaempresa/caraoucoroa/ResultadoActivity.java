package com.minhaempresa.caraoucoroa;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageResultado;
    private TextView resultadoTextView;
    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResultado = findViewById(R.id.imageResultado);
        resultadoTextView = findViewById(R.id.resultadoTextView);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        //recuperar dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if (numero == 0) {//cara
            imageResultado.setImageResource(R.drawable.cara);
            resultadoTextView.setText("Cara");
        } else {//coroa
            imageResultado.setImageResource(R.drawable.coroa);
            resultadoTextView.setText("Coroa");
        }
        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {finish();}
        });
    }
}
