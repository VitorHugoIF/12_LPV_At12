/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at12.abstractFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor.marcelino
 */
public class CelularTest {
    
    @Test
    public void testDeveAcoplarMemoriaRAMBasica() {
        IFabricaAbstrata fabrica = new FabricaModeloBasico();
        Celular celular = new Celular(fabrica);
        assertEquals("Memória RAM 2gb acoplada", celular.acoplarMemoriaRAM());
    }

    @Test
    public void testDeveAcoplarMemoriaRAMIntermediaria() {
        IFabricaAbstrata fabrica = new FabricaModeloIntermediario();
         Celular celular = new Celular(fabrica);
        assertEquals("Memória RAM 8gb acoplada", celular.acoplarMemoriaRAM());
    }
    
    @Test
    public void testDeveAcoplarMemoriaRAMPremium() {
        IFabricaAbstrata fabrica = new FabricaModeloPremium();
         Celular celular = new Celular(fabrica);
        assertEquals("Memória RAM 16gb acoplada", celular.acoplarMemoriaRAM());
    }

    @Test
    public void testDeveAcoplarProcessadorBasico() {
        IFabricaAbstrata fabrica = new FabricaModeloBasico();
        Celular celular = new Celular(fabrica);
        assertEquals("Processador Cortex-A53 acoplado", celular.acoplarProcessador());
    }

    @Test
    public void testDeveAcoplarProcessadorIntermediario() {
        IFabricaAbstrata fabrica = new FabricaModeloIntermediario();
         Celular celular = new Celular(fabrica);
        assertEquals("Processador Kryo 470 Silver acoplado", celular.acoplarProcessador());
    }
    
    @Test
    public void testDeveAcoplarProcessadorPremium() {
        IFabricaAbstrata fabrica = new FabricaModeloPremium();
         Celular celular = new Celular(fabrica);
        assertEquals("Processador Snapdragon 865 acoplado", celular.acoplarProcessador());
    }
}
