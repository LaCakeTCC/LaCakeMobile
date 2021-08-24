package br.com.itb.tcclacake2021;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class tela_de_pedidos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_pedidos);
        AppCompatButton b1 = (AppCompatButton) findViewById(R.id.button_config);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(tela_de_pedidos.this, tela_settings.class);
                startActivity(it);
            }
        });


        ImageButton b2 = (ImageButton) findViewById(R.id.botaoHome);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(tela_de_pedidos.this, tela_principal.class);
                startActivity(it);
            }
        });
        ImageButton b3 = (ImageButton) findViewById(R.id.botaoNavegacao);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(tela_de_pedidos.this, MapsActivity.class);
                startActivity(it);
            }
        });
        ImageButton b4 = (ImageButton) findViewById(R.id.botaPedidos);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(tela_de_pedidos.this, tela_de_pedidos.class);
                startActivity(it);
            }
        });
    }
}

