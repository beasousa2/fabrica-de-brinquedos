package br.com.beasousa.magicfactory.abstractfactory.brinquedostematicos;

import br.com.beasousa.magicfactory.abstractfactory.interfacebrinquedos.Carrinho;

public class CarrinhoDeNatal implements Carrinho {
    @Override
    public String criar() {
        return "Carrinho de Natal criado!";
    }
}
