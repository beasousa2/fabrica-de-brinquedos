package br.com.beasousa.magicfactory.factorymethod.fabricasespecificas;

import br.com.beasousa.magicfactory.factorymethod.classesconcretas.Carrinho;
import br.com.beasousa.magicfactory.factorymethod.interfaceabstrata.Brinquedo;
import br.com.beasousa.magicfactory.factorymethod.interfacefabrica.FabricaDeBrinquedos;

public class FabricaDeCarrinho implements FabricaDeBrinquedos {
    @Override
    public Brinquedo fabricar() {
        return new Carrinho();
    }
}
