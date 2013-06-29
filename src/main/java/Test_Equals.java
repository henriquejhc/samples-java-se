
class Pessoa {
	
	int id;
	String nome;
	long rg;
	
	public Pessoa(int id, String nome, long rg) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + (int) (rg ^ (rg >>> 32));
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
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg != other.rg)
			return false;
		return true;
	}

	
	
}


public class Test_Equals {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1, "Rodrigo", 123);
		Pessoa p2 = new Pessoa(2, "Rodrigo", 123);
		
		System.out.println("Equals() == " + p1.equals(p2));
		System.out.println("Hashcode() == " + p1.hashCode());
		System.out.println("Hashcode() == " + p2.hashCode());
		
//		if (p1.equals(null)) {
//			System.out.println("Iguais");
//		} else {
//			System.out.println("Diferentes");
//		}
	}
	
}
