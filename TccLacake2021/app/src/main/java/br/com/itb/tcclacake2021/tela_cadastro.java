package br.com.itb.tcclacake2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import br.com.itb.tcclacake2021.databinding.ActivityLoginBinding;
import br.com.itb.tcclacake2021.ui.login.LoginActivity;

public class tela_cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        RelativeLayout buttonRelativeLogin = (RelativeLayout) findViewById(R.id.mudar_para_tela_login);
        buttonRelativeLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(tela_cadastro.this, LoginActivity.class);
                startActivity(it);
            }
        });
    }
}