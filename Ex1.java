package exerciciobasico;

public class Ex1 {
	
	private String nome, sobrenome;

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
	
	public String NomeCompleto() {
        return nome + " " + sobrenome;
    }

}
