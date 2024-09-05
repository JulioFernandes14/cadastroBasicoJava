package br.estacio.service;

import java.util.ArrayList;
import java.util.List;

import br.estacio.model.Users;

public class UsersService {

	private List<Users> lista;
	
	

	public UsersService() {
		this.lista = new ArrayList<Users>();
	}

	public List<Users> adicionarUsuario(Users users) {
		
		lista.add(users);
		
		return this.lista;
		
	}
	
	public List<Users> getUsers() {
		
		return this.lista;
		
	}
	
}
