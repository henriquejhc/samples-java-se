package collections;

public class Pessoa  implements Comparable {

	private int id;
	private String nome;
	
	public Pessoa() {
	}
	
	public Pessoa(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return id + "-" + nome;
	}

	public int compareTo(Object o) {
		if (o instanceof Pessoa) {
			Pessoa p = (Pessoa) o;
			String nomePessoa = p.getNome();
			return this.getNome().compareTo(nomePessoa);
		}
		return -1;
	}
	
	
}
