package br.com.beasousa.magicfactory.factorymethod.controller;

import br.com.beasousa.magicfactory.factorymethod.interfacefabrica.FabricaDeBrinquedos;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.beasousa.magicfactory.factorymethod.fabricasespecificas.FabricaDeCarrinho;
import br.com.beasousa.magicfactory.factorymethod.fabricasespecificas.FabricaDeBoneca;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @GetMapping("/carrinho")
    public String criarCarrinho() {
        FabricaDeBrinquedos fabrica = new FabricaDeCarrinho();
        return fabrica.fabricar().criar();
    }

    @GetMapping("/boneca")
    public String criarBoneca() {
        FabricaDeBrinquedos fabrica = new FabricaDeBoneca();
        return fabrica.fabricar().criar();
    }
}
