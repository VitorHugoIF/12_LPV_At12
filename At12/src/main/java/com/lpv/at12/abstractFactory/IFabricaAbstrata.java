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
public interface IFabricaAbstrata {
    IProcessador criarProcessador();
    IMemoriaRAM criarMemoriaRAM();
}
