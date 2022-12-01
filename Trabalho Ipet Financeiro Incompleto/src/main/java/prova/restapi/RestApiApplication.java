package prova.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import prova.restapi.model.EnviarInstrucao;

import static prova.restapi.model.InstrucaoUnica.instrucaoUnica;
import static prova.restapi.model.Pagador.pagador;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);


		EnviarInstrucao enviarInstrucao = new EnviarInstrucao()
				.comInstrucaoUnica(instrucaoUnica()
						.comRazao("Uma motivo pela compra")
						.comIdProprio("teste")
						.com(pagador()
								.comNome("Breno Oliveira")
								.comEmail("breno26@gmail.com")
								.comIdentidade("222.222.222-22")
								.comTelefoneCelular("(61)9999-9999")));
	}


}
