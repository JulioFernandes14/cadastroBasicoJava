package br.estacio;

import br.estacio.input.UsersInput;
import br.estacio.model.Users;
import br.estacio.service.UsersService;

public class Main {

	public static void main(String[] args) {
		
		UsersInput input = new UsersInput();
		UsersService listaUsuarios = new UsersService();
		
		for (Integer i = 0; i < 3; i++) {
			
			Users users = new Users();
			
			users.setId(Integer.parseInt(input.lerId()));
			
			users.setNome(input.lerNome());
			
			users.setEmail(input.lerEmail());
			
			listaUsuarios.adicionarUsuario(users);
			
		}
		
		System.out.println(listaUsuarios.getUsers());
		
	}
	
}
