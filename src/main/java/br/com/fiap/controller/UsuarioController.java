package br.com.fiap.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.fiap.domain.UsuarioDTO;
import br.com.fiap.service.UsuarioService;
import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/usuario")
@RequiredArgsConstructor
public class UsuarioController {
	final private UsuarioService service;

	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
		service.delete(id);
		return ResponseEntity.ok().build();
	}

	@PutMapping
	public ResponseEntity<UsuarioDTO> fullUpdate(@RequestBody UsuarioDTO usuario) throws Exception {
		if (usuario.getId() == null) {
			throw new Exception("Invalid ID");
		}
		return ResponseEntity.ok(service.update(usuario));
	}

	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> list(@RequestParam(name = "cpf", required = false) String cpf, @RequestParam(name = "nome", required = false) String nome) {
		if (cpf != null && !cpf.trim().isEmpty()) {
			return ResponseEntity.ok(service.findByCpfContaining(cpf));
		}
		if (nome != null && !nome.trim().isEmpty()) {
			return ResponseEntity.ok(service.findByNome(nome));
		}
		return ResponseEntity.ok(service.list());
	}

	@PostMapping
	public ResponseEntity<UsuarioDTO> save(@RequestBody UsuarioDTO usuario) {
		return ResponseEntity.ok(service.save(usuario));
	}
}
