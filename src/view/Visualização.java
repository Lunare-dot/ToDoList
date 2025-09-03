package view;

import java.util.Scanner;
import control.Controle;

public class Visualização {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while (loop == true) {
			System.out.println("======LISTA DE TAREFAS======");
			System.out.println("1-Criar tarefa");
			System.out.println("2-Editar tarefa");
			System.out.println("3-Listar tarefa");
			System.out.println("4-Excluir tarefa");
			System.out.println("5-Sair");
			int escolha = sc.nextInt();
			
			switch (escolha) {
			case 1: {
				Controle con = new Controle();
				con.adicionarTarefa();
				break;
			}
			case 2: {
				Controle con = new Controle();
				con.editarTarefa();
				break;
			}
			case 3: {
				Controle con = new Controle();
				con.listarTarefa();
				break;
			}
			case 4: {
				Controle con = new Controle();
				con.excluirTarefa();
				break;
			}
			case 5: {
				System.out.println("SAIR");
				loop = false;
				break;
			}
			default:
				System.out.println("Opção inválida");
			}
		}
		
		sc.close();
	}
}
