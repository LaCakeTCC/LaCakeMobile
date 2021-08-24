package br.com.itb.tcclacake2021;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class tela_sobre extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_sobre);

        //Tool Bar - Começo
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.activity_tela_sobre);
        //Tool Bar - Fim

        // Quem somos - começo
        RelativeLayout buttonRelativequemSomos = (RelativeLayout) findViewById(R.id.adicionar_quem_somos);
        buttonRelativequemSomos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quemSomos = new Intent(tela_sobre.this,tela_sobre_quem_somos.class);
                startActivity(quemSomos);
            }
        });

        TextView buttonTextquemSomos = (TextView) findViewById(R.id.texto_quem_somos);
        buttonTextquemSomos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quemSomos = new Intent(tela_sobre.this,tela_sobre_quem_somos.class);
                startActivity(quemSomos);
            }
        });

        androidx.appcompat.widget.AppCompatButton buttonArrowquemSomos = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.mais_botao);
        buttonArrowquemSomos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quemSomos = new Intent(tela_sobre.this,tela_sobre_quem_somos.class);
                startActivity(quemSomos);
            }
        });
        //Quem somos - fim

        //Fundadores - começo
        RelativeLayout buttonRelativefundadores = (RelativeLayout) findViewById(R.id.adicionar_fundadores);
        buttonRelativefundadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fundadores = new Intent(tela_sobre.this, tela_sobre_fundadores.class);
                startActivity(fundadores);
            }
        });

        TextView buttonTextfundadores = (TextView) findViewById(R.id.texto_fundadores);
        buttonTextfundadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fundadores = new Intent(tela_sobre.this, tela_sobre_fundadores.class);
                startActivity(fundadores);
            }
        });

        androidx.appcompat.widget.AppCompatButton buttonArrowfundadores = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.mais_botao_fundadores);
        buttonArrowfundadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fundadores = new Intent(tela_sobre.this, tela_sobre_fundadores.class);
                startActivity(fundadores);
            }
        });
        //Fundadores - Fim

        //Colaboradores - Começo
        RelativeLayout buttonRelativeColaboradores = (RelativeLayout) findViewById(R.id.adicionar_colaboradores);
        buttonRelativeColaboradores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colaboradores = new Intent(tela_sobre.this, tela_sobre_colaboradores.class);
                startActivity(colaboradores);
            }
        });

        TextView buttonTextColaboradores = (TextView) findViewById(R.id.texto_colaboradores);
        buttonTextColaboradores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colaboradores = new Intent(tela_sobre.this, tela_sobre_colaboradores.class);
                startActivity(colaboradores);
            }
        });

        androidx.appcompat.widget.AppCompatButton buttonArrowColaboradores = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.mais_botao_colaboradores);
        buttonArrowColaboradores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colaboradores = new Intent(tela_sobre.this, tela_sobre_colaboradores.class);
                startActivity(colaboradores);
            }
        });
        //Colaboradores - Fim

        //Versão do software - Começo
        RelativeLayout buttonRelativeVS = (RelativeLayout) findViewById(R.id.adicionar_versao_do_software);
        buttonRelativeVS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vs = new Intent(tela_sobre.this, tela_sobre_versao_do_software.class);
                startActivity(vs);
            }
        });

        TextView buttonTextVS = (TextView) findViewById(R.id.texto_versao_do_software);
        buttonTextVS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vs = new Intent(tela_sobre.this, tela_sobre_versao_do_software.class);
                startActivity(vs);
            }
        });

        androidx.appcompat.widget.AppCompatButton buttonArrowVS = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.mais_botao2);
        buttonArrowVS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vs = new Intent(tela_sobre.this, tela_sobre_versao_do_software.class);
                startActivity(vs);
            }
        });
        //Versão do Software - Fim

        //Informações Legais - Começo
        RelativeLayout buttonRelativeinfo = (RelativeLayout) findViewById(R.id.adicionar_informações_legais);
        buttonRelativeinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent(tela_sobre.this, tela_sobre_informacoes_legais.class);
                startActivity(info);
            }
        });

        TextView buttonTextinfo = (TextView) findViewById(R.id.texto_informações_legais);
        buttonTextinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent(tela_sobre.this,tela_sobre_informacoes_legais.class);
                startActivity(info);
            }
        });

        androidx.appcompat.widget.AppCompatButton buttonArrowinfo = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.mais_botao_info);
        buttonArrowinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent(tela_sobre.this,tela_sobre_informacoes_legais.class);
                startActivity(info);
            }
        });
        //Informações Legais - Fim

        //Perguntas Frequentes - Começo
        RelativeLayout buttonRelativePerguntasFrequentes = (RelativeLayout) findViewById(R.id.adicionar_perguntas_frequentes);
        buttonRelativePerguntasFrequentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent PerguntasFrequentes = new Intent(tela_sobre.this, tela_sobre_perguntas_frequentes.class);
                startActivity(PerguntasFrequentes);
            }
        });

        TextView buttonTextPerguntasFrequentes = (TextView) findViewById(R.id.texto_perguntas_frequentes);
        buttonTextPerguntasFrequentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent PerguntasFrequentes = new Intent(tela_sobre.this, tela_sobre_perguntas_frequentes.class);
                startActivity(PerguntasFrequentes);
            }
        });

        androidx.appcompat.widget.AppCompatButton buttonArrowPerguntasFrequentes = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.mais_botao4);
        buttonArrowPerguntasFrequentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent PerguntasFrequentes = new Intent(tela_sobre.this, tela_sobre_perguntas_frequentes.class);
                startActivity(PerguntasFrequentes);
            }
        });
        //Perguntas Frequentes - Fim

        //Quero Ser um Boleiro - Começo
        RelativeLayout buttonRelativeBoleiro = (RelativeLayout) findViewById(R.id.adicionar_boleiro);
        buttonRelativeBoleiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Boleiro = new Intent(tela_sobre.this, tela_sobre_quero_ser_um_boleiro.class);
                startActivity(Boleiro);
            }
        });

        TextView buttonTextBoleiro = (TextView) findViewById(R.id.texto_boleiro);
        buttonTextBoleiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Boleiro = new Intent(tela_sobre.this, tela_sobre_quero_ser_um_boleiro.class);
                startActivity(Boleiro);
            }
        });

        androidx.appcompat.widget.AppCompatButton buttonArrowBoleiro = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.mais_botao5);
        buttonArrowBoleiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Boleiro = new Intent(tela_sobre.this, tela_sobre_quero_ser_um_boleiro.class);
                startActivity(Boleiro);
            }
        });
        //Quero Ser um Boleiro - Fim



    }
    }