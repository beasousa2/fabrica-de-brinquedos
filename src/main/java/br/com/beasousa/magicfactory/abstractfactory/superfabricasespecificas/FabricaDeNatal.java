package br.com.beasousa.magicfactory.abstractfactory.superfabricasespecificas;

import br.com.beasousa.magicfactory.abstractfactory.brinquedostematicos.BonecaDeNatal;
import br.com.beasousa.magicfactory.abstractfactory.brinquedostematicos.CarrinhoDeNatal;
import br.com.beasousa.magicfactory.abstractfactory.interfacebrinquedos.Boneca;
import br.com.beasousa.magicfactory.abstractfactory.interfacebrinquedos.Carrinho;
import br.com.beasousa.magicfactory.abstractfactory.superfabrica.SuperFabricaMagica;

public class FabricaDeNatal implements SuperFabricaMagica {

    @Override
    public Carrinho criarCarrinho() {
        return new CarrinhoDeNatal();
    }

    @Override
    public Boneca criarBoneca() {
        return new BonecaDeNatal();
    }
}
