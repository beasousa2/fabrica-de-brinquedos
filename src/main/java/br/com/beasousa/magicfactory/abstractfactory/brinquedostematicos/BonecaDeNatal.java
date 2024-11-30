package br.com.beasousa.magicfactory.abstractfactory.brinquedostematicos;

import br.com.beasousa.magicfactory.abstractfactory.interfacebrinquedos.Boneca;

public class BonecaDeNatal implements Boneca {
    @Override
    public String criar() {
        return "Boneca de Natal criada!";
    }
}
