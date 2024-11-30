package br.com.beasousa.magicfactory.factorymethod.fabricasespecificas;

import br.com.beasousa.magicfactory.factorymethod.classesconcretas.Boneca;
import br.com.beasousa.magicfactory.factorymethod.interfaceabstrata.Brinquedo;
import br.com.beasousa.magicfactory.factorymethod.interfacefabrica.FabricaDeBrinquedos;


public class FabricaDeBoneca implements FabricaDeBrinquedos {
    @Override
    public Brinquedo fabricar() {
        return new Boneca();
    }
}
