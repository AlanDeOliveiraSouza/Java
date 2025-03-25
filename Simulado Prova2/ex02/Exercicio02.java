package ex02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String args[]){
		
		Scanner leitor = new Scanner(System.in);
		
		Classe02 aluno = new Classe02();

		System.out.println("Insira o nome do aluno:");
		aluno.setNome(leitor.next());
		
		System.out.println("Digite a primeira nota do aluno:");
		aluno.setNota1(leitor.nextDouble());
		
		System.out.println("Digite a segunda nota do aluno:");
		aluno.setNota2(leitor.nextDouble());
		
		System.out.println("Digite a terceira nota do aluno:");
		aluno.setNota3(leitor.nextDouble());
		
		aluno.setMedia(aluno.getNota1(), aluno.getNota2(), aluno.getNota3());
		
		System.out.print("A média de " + aluno.getNome() + " é: " + Math.floor(aluno.getMedia()));
		
		leitor.close();
		
	}
	
}
