package br.com.beasousa.magicfactory.factorymethod.classesconcretas;

import br.com.beasousa.magicfactory.factorymethod.interfaceabstrata.Brinquedo;

public class Carrinho implements Brinquedo {
    @Override
    public String criar() {
        return "Carrinho criado!";
    }
}
