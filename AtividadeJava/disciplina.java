package CienciadaComputação;

public class disciplina {
	private String codigo;
	private String nome;
	private String fase;
	private int cargaHoraria;
	
	disciplina(String nome, String codigo, String fase, int cargaHoraria){
		this.nome=nome;
		this.codigo=codigo;
		this.fase=fase;
		this.cargaHoraria=cargaHoraria;
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
	public String getFase() {
		return fase;
	}
	public void setFase(String fase) {
		this.fase = fase;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
}