package com.example.s111_progdispmoveis_e2;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Jogo implements Serializable {
    String nomeJogo;
    String tipoJogo;

    @NonNull
    @Override
    public String toString() {
        return "Jogo: "+ nomeJogo + ", Tipo: "+tipoJogo;
    }
}
