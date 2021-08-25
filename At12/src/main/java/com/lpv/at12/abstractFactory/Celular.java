/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at12.abstractFactory;

/**
 *
 * @author vitor.marcelino
 */
public class Celular {
    private IProcessador processador;
    private IMemoriaRAM memoria;

    public Celular (IFabricaAbstrata fabrica) {
        this.processador = fabrica.criarProcessador();
        this.memoria = fabrica.criarMemoriaRAM();
    }

    public String acoplarProcessador() {
        return this.processador.acoplar();
    }

    public String acoplarMemoriaRAM() {
        return this.memoria.acoplar();
    }
}
