package com.segundalistatop;

public class Endereco {
    public String rua, bairro;
    public int num;


    public Endereco(String rua, String bairro, int num) {
        this.rua = rua;
        this.bairro = bairro;
        this.num = num;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public int getNum() {
        return num;
    }
}
