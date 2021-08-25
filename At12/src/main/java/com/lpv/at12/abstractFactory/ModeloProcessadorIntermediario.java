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
public class ModeloProcessadorIntermediario implements IProcessador {

    @Override
    public String acoplar() {
        return "Processador Kryo 470 Silver acoplado";
    }
}
