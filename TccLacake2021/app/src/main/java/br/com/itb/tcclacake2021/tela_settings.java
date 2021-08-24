package br.com.itb.tcclacake2021;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import org.w3c.dom.Text;

import br.com.itb.tcclacake2021.ui.login.LoginActivity;

public class tela_settings extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_settings);
            Context context = getApplicationContext();

            TextView b1 = (TextView) findViewById(R.id.abouts);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(tela_settings.this, tela_sobre.class);
                    startActivity(it);
                }
            });
            TextView b2 = (TextView) findViewById(R.id.contacts);
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(tela_settings.this, tela_fale_conosco.class);
                    startActivity(it);
                }
            });
            TextView b3 = (TextView) findViewById(R.id.cleans);
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    CharSequence text = "Histórico Apagado com Sucesso!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }
            });
            final int[] notifyss = {1};
            TextView b4 = (TextView) findViewById(R.id.notifys);
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(notifyss[0] == 1){
                    CharSequence text = "Notificações Ligadas!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    notifyss[0] = 0;
                    }
                    else {
                        CharSequence text = "Notificações Desligadas!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                        notifyss[0] = 1;
                    }

                }
            });

            TextView b5 = (TextView) findViewById(R.id.exits);
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(tela_settings.this, LoginActivity.class);
                    startActivity(it);
                }
            });


        }
    }

