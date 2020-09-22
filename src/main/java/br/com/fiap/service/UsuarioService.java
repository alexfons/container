package br.com.fiap.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.domain.Usuario;
import br.com.fiap.domain.UsuarioDTO;
import br.com.fiap.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {
	final UsuarioRepository repository;
	@Autowired
	private ModelMapper modelMapper;

	private List<UsuarioDTO> convertToDto(Iterable<Usuario> usuarios) {
		return StreamSupport.stream(usuarios.spliterator(), false).map(this::convertToDto).collect(Collectors.toList());
	}

	private UsuarioDTO convertToDto(Usuario usuario) {
		return modelMapper.map(usuario, UsuarioDTO.class);
	}

	private Usuario convertToEntity(UsuarioDTO usuario) {
		return modelMapper.map(usuario, Usuario.class);
	}

	public void delete(Long id) {
		repository.delete(id);
	}

	public List<UsuarioDTO> findByCpfContaining(String q) {
		return convertToDto(repository.findByCpfContaining(q));
	}

	public List<UsuarioDTO> findByNome(String q) {
		return convertToDto(repository.findByNome(q));
	}

	public List<UsuarioDTO> list() {
		return convertToDto(repository.findAll());
	}

	public UsuarioDTO save(UsuarioDTO usuario) {
		return convertToDto(repository.save(convertToEntity(usuario)));
	}

	public UsuarioDTO update(UsuarioDTO usuario) {
		return convertToDto(repository.save(convertToEntity(usuario)));
	}
}