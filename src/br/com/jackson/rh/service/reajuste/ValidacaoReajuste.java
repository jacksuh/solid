package br.com.jackson.rh.service.reajuste;

import java.math.BigDecimal;

import br.com.jackson.rh.model.Funcionario;

public interface ValidacaoReajuste {
	
	void validar(Funcionario funcionario, BigDecimal aumento);

}
