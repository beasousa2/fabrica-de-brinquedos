package br.com.beasousa.magicfactory.abstractfactory.controller;

import br.com.beasousa.magicfactory.abstractfactory.superfabrica.SuperFabricaMagica;
import br.com.beasousa.magicfactory.abstractfactory.superfabricasespecificas.FabricaDeNatal;
import br.com.beasousa.magicfactory.abstractfactory.superfabricasespecificas.FabricaEspacial;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temas")
public class TemaController {

    @GetMapping("/natal")
    public String criarBrinquedosDeNatal() {
        SuperFabricaMagica fabrica = new FabricaDeNatal();
        String carrinho = fabrica.criarCarrinho().criar();
        String boneca = fabrica.criarBoneca().criar();
        return carrinho + " e " + boneca;
    }

    @GetMapping("/espaco")
    public String criarBrinquedosEspaciais() {
        SuperFabricaMagica fabrica = new FabricaEspacial();
        String carrinho = fabrica.criarCarrinho().criar();
        String boneca = fabrica.criarBoneca().criar();
        return carrinho + " e " + boneca;
    }
}
