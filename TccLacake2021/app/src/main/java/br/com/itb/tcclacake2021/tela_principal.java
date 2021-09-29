package br.com.itb.tcclacake2021;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class tela_principal extends AppCompatActivity {

   // Button buttonToClick;
   // EditText editTextToclear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

      //  buttonToClick.setOnClickListener(new View.OnClickListener() {
      //      public void onClick(View v) {

      //          editTextToclear.setText("");

      //      }
      //  });

    AppCompatButton b1 = (AppCompatButton) findViewById(R.id.button_config);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(tela_principal.this, tela_settings.class);
                startActivity(it);
            }
        });

        ImageView b7 = (ImageView) findViewById(R.id.button_perfil);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(tela_principal.this, tela_profile.class);
                startActivity(it);
            }
        });

        ImageView categoria = (ImageView) findViewById(R.id.categoria);
        categoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(tela_principal.this, tela_categorias.class);
                startActivity(it);
            }
        });
        ImageView b2 = (ImageView) findViewById(R.id.btHome);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(tela_principal.this, tela_principal.class);
                startActivity(it);
            }
        });
        ImageView b3 = (ImageView) findViewById(R.id.botaoNavegacao);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(tela_principal.this, MapsActivity.class);
                startActivity(it);
            }
        });
        ImageView b4 = (ImageView) findViewById(R.id.botaPedidos);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(tela_principal.this, tela_de_pedidos.class);
                startActivity(it);
            }
        });

        ImageView profileButton = (ImageView) findViewById(R.id.button_perfil);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(tela_principal.this, tela_profile.class);
                startActivity(it);
            }
        });

    }
}

