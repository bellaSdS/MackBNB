package com.pratico.projeto;

import java.util.ArrayList;
import java.util.List;

public class Propriedade {
    private long id;
    private String endereco;
    private String tipo;
    private boolean areaUtil;
    private int quantidadeDeQuartos;
    private double precoAluguel;
    private boolean statusDisponibilidade;
    private String cidade;
    private String bairro;
    public void setId(long id) {
        this.id = id;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    private static List<Propriedade> listaPropriedades = new ArrayList<>();

    public Propriedade(){
        listaPropriedades.add(this);
    }
    public static void listarPropriedades(){
        for (Propriedade propriedade : listaPropriedades) {
            System.out.println(propriedade);
        }
    }

    public static Propriedade buscarPorId(long id){
        for (Propriedade propriedade : listaPropriedades) {
            if(propriedade.getId() == id){
                return propriedade;
            }
        }
        return null;
    }
    public static Propriedade buscarPorBairroLocalizacao(String regiao){
        for (Propriedade propriedade : listaPropriedades) {
            if(propriedade.getCidade().equals(regiao)
            || propriedade.getBairro().equals(regiao)){
                return propriedade;
            }
        }
        return null;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isAreaUtil() {
        return this.areaUtil;
    }

    public boolean getAreaUtil() {
        return this.areaUtil;
    }

    public void setAreaUtil(boolean areaUtil) {
        this.areaUtil = areaUtil;
    }

    public int getQuantidadeDeQuartos() {
        return this.quantidadeDeQuartos;
    }

    public void setQuantidadeDeQuartos(int quantidadeDeQuartos) {
        this.quantidadeDeQuartos = quantidadeDeQuartos;
    }

    public double getPrecoAluguel() {
        return this.precoAluguel;
    }

    public void setPrecoAluguel(double precoAluguel) {
        this.precoAluguel = precoAluguel;
    }

    public boolean isStatusDisponibilidade() {
        return this.statusDisponibilidade;
    }

    public boolean getStatusDisponibilidade() {
        return this.statusDisponibilidade;
    }

    public void setStatusDisponibilidade(boolean statusDisponibilidade) {
        this.statusDisponibilidade = statusDisponibilidade;
    }

    
    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String input) {
        this.endereco = input;
    }
    public long getId(){
        return id;
    }
}
