package CienciadaComputação;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos professores tem no curso?");
		int numeroprof = teclado.nextInt();
		
		disciplina m1 = new disciplina("Matemática", "1", "6", 7);
		disciplina m2 = new disciplina("Inglês", "3", "3", 8);
		disciplina m3 = new disciplina("Espanhol", "2", "5", 6);

		for(int i = 0;i<numeroprof; i++) {
			professores p = new professores();
			int numprofessor = i + 1;
			System.out.println("Quantas disciplinas o prof n "+ numprofessor +" tem?");
			int numerodisci = teclado.nextInt();
			for(int j = 0;j<numerodisci; j++) {
				System.out.println("Qual disciplina você deseja adicionar para o professor " + numprofessor + "? " + " 1, 2 ou 3");
				int coddisci = teclado.nextInt();
				if(coddisci==1) {
					p.disciplinas.add(m1);
				}
				else if(coddisci==2) {
					p.disciplinas.add(m2);
				}
				else if(coddisci==3) {
					p.disciplinas.add(m3);
				}
				else {
					System.out.println("Código informado não encontrado!");
				}
			}
			System.out.println("Disciplinas do professor " + numprofessor + ":");
			p.mostrarDisciplinas();
		}
	}
}