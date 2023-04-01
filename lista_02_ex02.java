package exercicio02;

public class Pessoa {
	public String nome;
    public int idade;
    public String sexo;
    
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}

package exercicio02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
	        Pessoa pessoa = new Pessoa("Yasmin Fadel", 18, "Feminino");
	        
	        String mensagem = "Nome: " + pessoa.getNome() +
	                          "\nIdade: " + pessoa.getIdade() +
	                          "\nSexo: " + pessoa.getSexo();
	        
	        JOptionPane.showMessageDialog(null, mensagem);
	    }
	}

