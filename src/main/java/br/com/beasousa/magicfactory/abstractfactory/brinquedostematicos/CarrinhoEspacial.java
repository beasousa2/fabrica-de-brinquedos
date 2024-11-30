package br.com.beasousa.magicfactory.abstractfactory.brinquedostematicos;

import br.com.beasousa.magicfactory.abstractfactory.interfacebrinquedos.Carrinho;

public class CarrinhoEspacial implements Carrinho {
    @Override
    public String criar() {
        return "Carrinho Espacial criado!";
    }
}
