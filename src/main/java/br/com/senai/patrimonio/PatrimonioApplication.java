package br.com.senai.patrimonio;

import br.com.senai.patrimonio.model.Empresa;
import br.com.senai.patrimonio.model.Endereco;
import br.com.senai.patrimonio.service.ServiceTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatrimonioApplication {

	public PatrimonioApplication() {
	}

	public static void main(String[] args) {

		SpringApplication.run(PatrimonioApplication.class, args);

		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Senai LTDA");
		System.out.println(empresa.getRazaoSocial());

		Endereco endereco = new Endereco();
		endereco.setRua("Rua Morganita");
		System.out.println(endereco.getRua());

		Endereco bairro = new Endereco();
		bairro.setBairro("Venda Nova");
		System.out.println(bairro.getBairro());

		Endereco enderecoComArgumento = new Endereco("Líbano", "489", "perto da Pizzaria",
		"Venda Nova", "Belo Horizonte", "MG");

		System.out.println(enderecoComArgumento.getBairro());
	}
}