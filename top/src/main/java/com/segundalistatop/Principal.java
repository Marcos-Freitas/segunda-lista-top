package com.segundalistatop;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(" Marcos; ", 123456, 1);
        pessoa1.addEndereco(new Endereco(" Verde; ", " Centro; ", 26));
        pessoa1.mostraInfo();

        Pessoa pessoa2 = new Pessoa(" Marilia ", 54321, 2);
        Endereco endereco1 = new Endereco(" Joao; ", " Faleceu; ", 809);
        pessoa2.addEndereco(endereco1);
        //Endereco endereco2 = new Endereco(" Macete; ", " vivo; ", 555);
        //pessoa2.addEndereco(endereco2);

        //DEPOIS DE COPILADO PERCEBESSE QUE DEU CERTO, COLOQUEI APENAS DOIS ENDERECOS E NAO IMRPIME MAIS DO QUE DECLARADO
        Endereco endereco3 = new Endereco(" leia; ", " caixao; ", 222);
        pessoa2.addEndereco(endereco3);
        pessoa2.mostraInfo();

    }
}
