package br.com.itb.tcclacake2021;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class tela_sobre_informacoes_legais extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_sobre_informacoes_legais);

        // Licenças do Software - começo
        RelativeLayout buttonRelativelicenca = (RelativeLayout) findViewById(R.id.adicionar_licenca);
        buttonRelativelicenca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent licenca = new Intent(tela_sobre_informacoes_legais.this,tela_info_licenca_do_software.class);
                startActivity(licenca);
            }
        });

        TextView buttonTextlicenca = (TextView) findViewById(R.id.texto_licenca);
        buttonTextlicenca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent licenca = new Intent(tela_sobre_informacoes_legais.this,tela_info_licenca_do_software.class);
                startActivity(licenca);
            }
        });

        androidx.appcompat.widget.AppCompatButton buttonArrowlicenca = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.mais_botao_licenca);
        buttonArrowlicenca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent licenca = new Intent(tela_sobre_informacoes_legais.this,tela_info_licenca_do_software.class);
                startActivity(licenca);
            }
        });
        //Licenças do Software - fim

        //Politica de Privacidade - Começo
        RelativeLayout buttonRelativepolitica = (RelativeLayout) findViewById(R.id.adicionar_politica);
        buttonRelativepolitica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent politica = new Intent(tela_sobre_informacoes_legais.this, tela_info_politica_de_privacidade.class);
                startActivity(politica);
            }
        });

        TextView buttonTextpolitica = (TextView) findViewById(R.id.texto_politica);
        buttonTextpolitica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent politica = new Intent(tela_sobre_informacoes_legais.this, tela_info_politica_de_privacidade.class);
                startActivity(politica);
            }
        });

        androidx.appcompat.widget.AppCompatButton buttonArrowpolitica = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.mais_botao_politica);
        buttonArrowpolitica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent politica = new Intent(tela_sobre_informacoes_legais.this, tela_info_politica_de_privacidade.class);
                startActivity(politica);
            }
        });
        //Politica de Privacidade - Fim

        //Termos e Condições - Começo
        RelativeLayout buttonRelativetermos = (RelativeLayout) findViewById(R.id.adicionar_termos);
        buttonRelativetermos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent termos = new Intent(tela_sobre_informacoes_legais.this, tela_info_termos_e_condicoes.class);
                startActivity(termos);
            }
        });

        TextView buttonTexttermos = (TextView) findViewById(R.id.texto_termos);
        buttonTexttermos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent termos = new Intent(tela_sobre_informacoes_legais.this, tela_info_termos_e_condicoes.class);
                startActivity(termos);
            }
        });

        androidx.appcompat.widget.AppCompatButton buttonArrowtermos = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.mais_botao_termos);
        buttonArrowtermos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent termos = new Intent(tela_sobre_informacoes_legais.this, tela_info_termos_e_condicoes.class);
                startActivity(termos);
            }
        });
        //Termos e Condições - Fim

        //Dados de Localização - Começo
        RelativeLayout buttonRelativedados = (RelativeLayout) findViewById(R.id.adicionar_dados);
        buttonRelativedados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dados = new Intent(tela_sobre_informacoes_legais.this, tela_info_dados_de_localizacao.class);
                startActivity(dados);
            }
        });

        TextView buttonTextdados = (TextView) findViewById(R.id.texto_dados);
        buttonTextdados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dados = new Intent(tela_sobre_informacoes_legais.this, tela_info_dados_de_localizacao.class);
                startActivity(dados);
            }
        });

        androidx.appcompat.widget.AppCompatButton buttonArrowdados = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.mais_botao_dados);
        buttonArrowdados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dados = new Intent(tela_sobre_informacoes_legais.this, tela_info_dados_de_localizacao.class);
                startActivity(dados);
            }
        });
        //Dados de Localização - Fim


    }
    }