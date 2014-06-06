package br.com.caelum.stella.boleto;

import org.junit.Assert;
import org.junit.Test;

public class EnderecoTest {

	@Test
	public void deveImprimirEnderecoCompleto() {
		
	    Endereco end = Endereco.novoEndereco()
	    		.comLogradouro("RODOVIA SC 401, KM 1 - EDIFÍCIO CELTA")
	    		.comBairro("PARQTEC ALFA")
	    		.comCep("88030-000")
	    		.comCidade("FLORIANÓPOLIS")
	    		.comUf("SC");
	    
	    Assert.assertEquals("RODOVIA SC 401, KM 1 - EDIFÍCIO CELTA, "
	    		+ "PARQTEC ALFA 88030-000 - FLORIANÓPOLIS - SC", end.getEnderecoCompleto());
	    
	}

}
