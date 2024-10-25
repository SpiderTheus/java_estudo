package mapa02;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Cliente> clientes = new ArrayList<>();
	static int op = 0;
	static boolean verificador = false;
	
	public static void main(String[] args) { 
		System.out.println("*- Sistema de Gerenciamento de Clientes -*");
			while(!verificador) {
				try { 
					System.out.println("*- MENU - Escolha uma opção -*");
					System.out.println("*- 1- Cadastrar");
					System.out.println("*- 2- Listar");
					System.out.println("*- 3- Atualizar");
					System.out.println("*- 4- Remover");
					System.out.println("*- 5- Buscar");
					System.out.println("*- 0- Sair -*");
					op = sc.nextInt();
					
					int id = 0;
					boolean veri = false;
					switch(op) {
						case 1:
							System.out.println("Nome:");
							String nome = sc.next();
									
							System.out.println("E-mail:");
							String email = sc.next();
									
							System.out.println("Telefone:");
							String telefone = sc.next();
									
							cadastrarCliente(nome, email, telefone);
							break;	
						case 2:
							listarClientes();
							break;
						case 3:
							while(!veri) {
								try {
									if(clientes.size() == 0) {
										System.out.println("Sem clientes cadastrado.");
									} else {
										System.out.println("Digite o id do cliente:");
										id = sc.nextInt();
									}
									veri = true;	
									
							} catch(InputMismatchException e) {
									System.out.println("ERROR: Digite um numero inteiro!(ex: 1)");
									sc.nextLine();
								}
							}
						atualizarUsuario(id);
						break;
						
					case 4:
						while(!veri) {
							try {
								if(clientes.size() == 0) {
									System.out.println("Sem clientes cadastrado.");
								} else {
									System.out.println("Digite o id do cliente:");
									id = sc.nextInt();
									}
								veri = true;
								
						} catch(InputMismatchException e) {
								System.out.println("ERROR: digite um numero inteiro");
								sc.nextLine();
							}
						}
						removerCliente(id);
						break;
					case 5:
							while(!veri) {
								try {
									if(clientes.size() == 0) {
										System.out.println("Sem clientes cadastrado.");
									} else {
										System.out.println("Digite o id do cliente:");
										id = sc.nextInt();
										buscarCliente(id);
									}
									veri = true;
									
									
								} catch(InputMismatchException e) {
									System.out.println("ERROR: digite um numero inteiro!(ex: 1)");
									sc.nextLine();
								}
							
							
						}
						break;
					case 0:
						System.out.println("Programa sendo encerrado.");
						verificador = true;
						break;
					default: 
						System.out.println("Não existe essa opção. Digite Novamente");
					}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Algorismo invalido, para continuar digite uma opção valida:(");
				sc.nextLine();
			}
		}
		System.out.println("-Sistema Finalizado-");
		sc.close();
	}
	
	private static void buscarCliente(int id) {
		final boolean[] veri = {false};
		
		clientes.forEach( (n) -> {
			if(n.getId() == id) {
				System.out.println("Cliente encontrado com sucesso!");
				n.exibirDetalhes();
				veri[0] = true;	
			} 
		});
		
		if(!veri[0])
		System.out.println("Cliente não encontrado!");
		
	}
	
	private static void removerCliente(int id) {
		final boolean[] veri = {false};
		for(int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i).getId() == id) {
				System.out.printf("Cliente %s, foi removido com sucesso!\n", clientes.get(i).getNome());
				clientes.remove(i);
				veri[0] = true;	
				break;
				
			}
		}
		if(!veri[0])
			System.out.println("Cliente não encontrado!");
	}
	private static void atualizarUsuario(int id) {
		final boolean[] veri = {false};
			clientes.forEach( (n) -> {
				if(n.getId() == id) {
					while(true) {
						System.out.printf("Atualizando %s do id: %d: \n", n.getNome(), n.getId());
						System.out.println("Novo nome:");
						String nome = sc.next();
						System.out.println("Novo email:");
						String email = sc.next();
						System.out.println("Novo telefone:");
						String telefone = sc.next();
						n.setNome(nome);
						n.setEmail(email);
						n.setTelefone(telefone);
						System.out.println("Cliente atualizado com sucesso!");
						veri[0] = true;	
						break;
					}
				} 
			});
			
			if(!veri[0])
				System.out.println("Cliente não encontrado!");
		}
	
	private static void listarClientes() {
		if(clientes.size() == 0) {
			System.out.println("Sem clientes cadastrado.");
		}
		System.out.println("Lista de Clientes:");
		for(int i = 0; i < clientes.size(); i++) {
			clientes.get(i).exibirDetalhes();
		} 
	}
	
	private static void cadastrarCliente(String nome, String email, String telefone) {
		Cliente novoCliente = new Cliente(nome, email, telefone);
		clientes.add(novoCliente);
		System.out.println("Cliente cadastrado com sucesso!");
	}

}
