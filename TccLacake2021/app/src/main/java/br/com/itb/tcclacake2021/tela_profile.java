package br.com.itb.tcclacake2021;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.itb.tcclacake2021.ui.login.LoginActivity;

public class tela_profile extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_profile);

            TextView b5 = (TextView) findViewById(R.id.address);
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(tela_profile.this, tela_endereco.class);
                    startActivity(it);
                }
            });

            TextView b6 = (TextView) findViewById(R.id.paymethod);
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(tela_profile.this, tela_pagamento.class);
                    startActivity(it);
                }
            });

            TextView b7 = (TextView) findViewById(R.id.cleans);
            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(tela_profile.this, tela_favoritos.class);
                    startActivity(it);
                }
            });

            TextView b8 = (TextView) findViewById(R.id.contacts);
            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(tela_profile.this, tela_settings.class);
                    startActivity(it);
                }
            });





        }
    }

