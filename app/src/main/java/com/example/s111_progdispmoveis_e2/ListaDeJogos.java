package com.example.s111_progdispmoveis_e2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class ListaDeJogos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_jogos);

        ArrayList<Jogo> listagemJogos = (ArrayList<Jogo>) getIntent().getSerializableExtra("listagem_jogos");

        StringBuilder texto = new StringBuilder();
        for(Jogo jogo : listagemJogos){
            Log.i("AULAEXERCICIO-E2",jogo.nomeJogo + " - " + jogo.tipoJogo);
            texto.append(jogo.nomeJogo);
            texto.append(jogo.tipoJogo);
            texto.append("\n");
        }
        texto.toString();
    }
}