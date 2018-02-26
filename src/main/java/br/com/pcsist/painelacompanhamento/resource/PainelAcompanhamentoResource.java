package br.com.pcsist.painelacompanhamento.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PainelAcompanhamentoResource {

	public static final String URL_PAINEL_ACOMPANHAMENTO = "painelacompanhamento";

//	@Autowired
//	private PainelAcompanhamentoRepository painelAcompanhamentoRepository;

	@PostMapping(URL_PAINEL_ACOMPANHAMENTO)
	public ResponseEntity<?> enviarMonitoramento(@RequestBody String informacao) {
//		String inf = painelAcompanhamentoRepository.save(informacao);
//
//		System.out.println(inf);

		return ResponseEntity.ok(informacao);
	}

}
