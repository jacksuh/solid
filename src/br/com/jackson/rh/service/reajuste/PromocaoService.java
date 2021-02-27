package br.com.jackson.rh.service.reajuste;

import br.com.jackson.rh.ValidacaoException;
import br.com.jackson.rh.model.Cargo;
import br.com.jackson.rh.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida){
        Cargo cargoAtual = funcionario.getCargo();
        if (Cargo.GERENTE == cargoAtual){
            throw new ValidacaoException("Gerente não podem ser promovidos");
        }
        if (metaBatida){
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        }
    }
}
