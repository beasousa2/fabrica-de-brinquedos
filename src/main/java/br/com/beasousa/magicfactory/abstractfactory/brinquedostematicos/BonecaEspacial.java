package br.com.beasousa.magicfactory.abstractfactory.brinquedostematicos;

import br.com.beasousa.magicfactory.abstractfactory.interfacebrinquedos.Boneca;

public class BonecaEspacial implements Boneca {
    @Override
    public String criar() {
        return "Boneca Espacial criada!";
    }
}
