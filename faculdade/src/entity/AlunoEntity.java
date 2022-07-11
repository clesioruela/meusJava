package entity;

public class AlunoEntity {
	private int id;
	private String nome;
	private String sobrenome;
	private CursoTipo cursotipo;
	private boolean promocional;

	public AlunoEntity(String nome, String sobrenome, CursoTipo cursotipo, boolean promocional) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cursotipo = cursotipo;
		this.promocional = promocional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public CursoTipo getCursotipo() {
		return cursotipo;
	}

	public void setCursotipo(CursoTipo cursotipo) {
		this.cursotipo = cursotipo;
	}

	public boolean isPromocional() {
		return promocional;
	}

	public void setPromocional(boolean promocional) {
		this.promocional = promocional;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
