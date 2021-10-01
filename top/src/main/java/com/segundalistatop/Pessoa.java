package com.segundalistatop;


public class Pessoa 
{
    public String nome;
    public int cpf;
    public  Endereco enderecos[];
    
    public Pessoa(String nome, int cpf, int qtdEnd) {
        this.nome = nome;
        this.cpf = cpf;
        this.enderecos = new Endereco[qtdEnd];
    }

    public void addEndereco(Endereco end){
        for (int i = 0; i < enderecos.length; i++) {
            if(enderecos[i] == null){
                enderecos[i] = end;
                break;
            }
        }

    }

    public void mostraInfo(){
        System.out.println("Noma da pessoa: " + this.nome);
        for (Endereco endereco : enderecos) {
            if(endereco == null)
            break;
            System.out.println("Nome do Bairro: " + endereco.getBairro() + 
                                    "Nome do Rua: " + endereco.getRua()+
                                        "Número da Casa: " + endereco.getNum());
        }

       
    }

    
}
