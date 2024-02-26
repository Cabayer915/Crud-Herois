package com.heroi.exercicioheroi;

public class Heroi {
    private String nome;
    private String descricao;
    private Integer forca;

    public Heroi(String nome, String descricao, Integer forca) {
        this.nome = nome;
        this.descricao = descricao;
        this.forca = forca;
    }

    public String getClasse(){
        if(forca > 20_000){
            return "S";
        }else if(forca >= 8_000){
            return "A";
        }else if(forca >= 500){
            return "B";
        }else{
            return "C";
        }
    }

    public Heroi() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }
}
