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
public class Principal {
    public static void main(String[] args) {
        
        Automovel carro = new Automovel();
        Automovel moto = new Automovel();
        
        carro.setNumPlaca("JFDO");
        carro.setNumPortas(4);
        carro.setCor("Branco");
        carro.setNumRodas(4);
        carro.setCapacidade(5);
        
        moto.setNumPlaca("OEKL");
        moto.setNumPortas(0);
        moto.setCor("Vermelha");
        moto.setNumRodas(2);
        moto.setCapacidade(2);
        
        System.out.println("Carro: ");
        carro.imprimeAutomovel();
        System.out.println("\n");
        System.out.println("Moto: ");
        moto.imprimeAutomovel();
    }
}
