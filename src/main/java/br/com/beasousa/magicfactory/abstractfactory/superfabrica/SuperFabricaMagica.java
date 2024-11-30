package br.com.beasousa.magicfactory.abstractfactory.superfabrica;

import br.com.beasousa.magicfactory.abstractfactory.interfacebrinquedos.Boneca;
import br.com.beasousa.magicfactory.abstractfactory.interfacebrinquedos.Carrinho;

public interface SuperFabricaMagica {

    Carrinho criarCarrinho();
    Boneca criarBoneca();
}
