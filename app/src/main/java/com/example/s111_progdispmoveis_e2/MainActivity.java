package com.example.s111_progdispmoveis_e2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Jogo> listagemJogos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void salvarJogo(View view) {
        EditText nomeJogo = findViewById(R.id.editTextNomeJogo);
        String nomeJogoString = nomeJogo.getText().toString();
        EditText tipoJogo = findViewById(R.id.editTextTipoJogo);
        String tipoJogoString = tipoJogo.getText().toString();

        Jogo jogo = new Jogo();
        jogo.nomeJogo = nomeJogoString;
        jogo.tipoJogo = tipoJogoString;
        listagemJogos.add(jogo);
    }

    public void startListagemJogos(View view) {
        Bundle sacolaParametros = new Bundle();
        sacolaParametros.putSerializable("listagem_jogos",listagemJogos);
        Intent intent = new Intent(this,ListaDeJogos.class);
        intent.putExtras(sacolaParametros);
        startActivity(intent);
    }
}