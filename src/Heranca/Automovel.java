/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

/**
 *
 * @author IFSC
 */
public class Automovel extends Terrestre{
    private int numPortas;
    private String cor;
    private String numPlaca;
    
    public Automovel(){
        
    }
    
    public void imprimeAutomovel(){
        System.out.println("Placa: "+numPlaca);
        System.out.println("Numero de portas: "+numPortas);
        System.out.println("Cor: "+cor);
        System.out.println("Numero de rodas:"+numRodas);
        System.out.println("Capacidade: "+capacidade);
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }
}
