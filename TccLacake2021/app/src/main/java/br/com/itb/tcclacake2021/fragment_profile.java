package br.com.itb.tcclacake2021;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class fragment_profile extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //Método de pagamento - Começo
        TextView buttonpagamento = (TextView) findViewById(R.id.paymethod);
        buttonpagamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagamento = new Intent(fragment_profile.this, tela_pagamento.class);
                startActivity(pagamento);
            }
        });
        //Método de pagamento - Fim
    }
}