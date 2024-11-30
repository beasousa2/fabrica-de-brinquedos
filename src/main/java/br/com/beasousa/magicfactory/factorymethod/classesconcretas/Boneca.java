package br.com.beasousa.magicfactory.factorymethod.classesconcretas;

import br.com.beasousa.magicfactory.factorymethod.interfaceabstrata.Brinquedo;

public class Boneca implements Brinquedo {
    @Override
    public String criar() {
        return "Boneca criada!";
    }
}
