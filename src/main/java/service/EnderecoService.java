package service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import model.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface EnderecoService {
	
	@GetMapping("{cep}/json")
	Endereco consultacep(@PathVariable("cep") String cep);

}
