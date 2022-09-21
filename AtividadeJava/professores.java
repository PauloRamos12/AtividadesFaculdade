package CienciadaComputação;

import java.util.*;

public class professores {
	private String codigo;
	private String nome;
	public List<disciplina> disciplinas = new ArrayList<disciplina>();
	
	public List<disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void mostrarDisciplinas() {
		this.disciplinas.forEach(disciplina -> System.out.println(disciplina.getNome()));	
	}
}