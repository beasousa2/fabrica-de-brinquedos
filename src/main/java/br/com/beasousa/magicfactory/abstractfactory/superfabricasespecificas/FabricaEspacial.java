package br.com.beasousa.magicfactory.abstractfactory.superfabricasespecificas;

import br.com.beasousa.magicfactory.abstractfactory.brinquedostematicos.BonecaEspacial;
import br.com.beasousa.magicfactory.abstractfactory.brinquedostematicos.CarrinhoEspacial;
import br.com.beasousa.magicfactory.abstractfactory.interfacebrinquedos.Boneca;
import br.com.beasousa.magicfactory.abstractfactory.interfacebrinquedos.Carrinho;
import br.com.beasousa.magicfactory.abstractfactory.superfabrica.SuperFabricaMagica;

public class FabricaEspacial implements SuperFabricaMagica {

    @Override
    public Carrinho criarCarrinho() {
        return new CarrinhoEspacial();
    }

    @Override
    public Boneca criarBoneca() {
        return new BonecaEspacial();
    }
}
