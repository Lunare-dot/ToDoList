package view;

import java.util.Scanner;
import control.Controle;

public class Visualização {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                Controle con = new Controle();
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
			case 1 ->  {
				con.adicionarTarefa();
			}
			case 2 ->  {
				con.editarTarefa();
			}
			case 3 ->  {
				con.listarTarefa();
			}
			case 4 ->  {
				con.excluirTarefa();
			}
			case 5 ->  {
				System.out.println("SAIR");
				loop = false;
			}
			default -> System.out.println("Opção inválida");
			}
		}
		
		sc.close();
	}
}
