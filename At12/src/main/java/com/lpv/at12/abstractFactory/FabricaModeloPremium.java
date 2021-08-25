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
public class FabricaModeloPremium implements IFabricaAbstrata{

    @Override
    public IProcessador criarProcessador() {
        return new ModeloProcessadorPremium();
    }

    @Override
    public IMemoriaRAM criarMemoriaRAM() {
        return new ModeloMemoriaRAMPremium();
    }
}
