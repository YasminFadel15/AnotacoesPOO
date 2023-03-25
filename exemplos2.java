//Versão 0: "código estático", sem orientação a objeto
package versao0;
import javax.swing.JOptionPane;

public class Principal {
	
	static String titulo;
	static int duracao;
	static String genero;
	static int classIndicativa;
	static String listaFilmes="Filme adicionados na lista\n";

	public static void main(String[] args) {
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos filmes deseja adicionar à lista"));
		
		for (int i=0; i<opcao; i++) {
			
			JOptionPane.showMessageDialog(null, "Informe os dados do filme "+(i+1)+" que pretende adicionar");
			
			titulo = JOptionPane.showInputDialog("Informe o nome do título");
			duracao = Integer.parseInt(JOptionPane.showInputDialog("Informe a duração em minutos"));
			genero = JOptionPane.showInputDialog("Informe o gênero");
			classIndicativa = Integer.parseInt(JOptionPane.showInputDialog("Informe classificação indicativa"));	
			
			listaFilmes+= "\nFilme "+(i+1)+" adicionado:\n"+"Título "+titulo+" Duração "+duracao+
						  " Clasificação indicativa "+classIndicativa+" Gênero "+genero;		
		}
		
		JOptionPane.showMessageDialog(null,listaFilmes);

	}

}


//////////////////////////////////////


//Versão 1
package versao1;

public class Filme {
	
	public String titulo;
	public int duracao;
	public String genero;
	public int classIndicativa;
	
}


package versao1;

import javax.swing.JOptionPane;

public class Principal {
	
	static String listaFilmes = "Filme adicionados na lista\n";

	public static void main(String[] args) {

		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos filmes deseja adicionar à lista"));
		
		for (int i = 0 ; i < opcao ; i++) {
			
			//Filme() é um método construtor, ou seja, constrói o objeto Filme --> Inicializa os atributos
			//{Classe} {nome do objeto} = new {nome do método}
			Filme filme = new Filme(); 
			
			JOptionPane.showMessageDialog(null, "Informe os dados do filme " + (i + 1) +" que pretende adicionar");
			
			//atributo.método:
			filme.titulo = JOptionPane.showInputDialog("Informe o nome do título");
			filme.duracao = Integer.parseInt(JOptionPane.showInputDialog("Informe a duração em minutos"));
			filme.genero = JOptionPane.showInputDialog("Informe o gênero");
			filme.classIndicativa = Integer.parseInt(JOptionPane.showInputDialog("Informe classificação indicativa"));	
			
			listaFilmes += "\nFilme " + (i + 1) + " adicionado:\n" + "Título " + filme.titulo + "\nDuração " + filme.duracao +
						  "\nClasificação indicativa " + filme.classIndicativa + "\nGênero " + filme.genero;		
		}
		
		JOptionPane.showMessageDialog(null,listaFilmes);
		
	}

}




//Versão 2
package versao2;

public class Filme {

	private String genero;
	private int classIndicativa;
	
	private String titulo;
	private int duracao;
	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getClassIndicativa() {
		return classIndicativa;
	}

	public void setClassIndicativa(int classIndicativa) {
		this.classIndicativa = classIndicativa;
	}

	
	public String gettitulo(){
		//Retorna o título do qual ele está sendo chamado; o this faz referencia ao objeto
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
}


//////////////////////////////////////



package versao2;

	import javax.swing.JOptionPane;

	public class Principal {
		
		static String listaFilmes = "Filme adicionados na lista\n";

		public static void main(String[] args) {

			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos filmes deseja adicionar à lista"));
			
			for (int i = 0 ; i < opcao ; i++) {
				
				//Filme() é um método construtor, ou seja, constrói o objeto Filme --> Inicializa os atributos
				//{Classe} {nome do objeto} = new {nome do método}
				Filme filme = new Filme(); 
				
				JOptionPane.showMessageDialog(null, "Informe os dados do filme " + (i + 1) +" que pretende adicionar");
				
				//atributo.método:
				filme.setTitulo(JOptionPane.showInputDialog("Informe o nome do título"));
				filme.setDuracao(Integer.parseInt(JOptionPane.showInputDialog("Informe a duração em minutos")));
				filme.setGenero(JOptionPane.showInputDialog("Informe o gênero"));
				filme.setClassIndicativa(Integer.parseInt(JOptionPane.showInputDialog("Informe classificação indicativa")));	
				
				listaFilmes += "\nFilme " + (i + 1) + " adicionado:\n" + "Título " + filme.gettitulo() + "\nDuração " + filme.getDuracao() +
							  "\nClasificação indicativa " + filme.getClassIndicativa() + "\nGênero " + filme.getGenero();		
			}
			
			JOptionPane.showMessageDialog(null,listaFilmes);
			
		}

	}




//Versão 3
package versao3;

import java.util.ArrayList;

public class minhaLista {
	
	//Configuração para que o array apenas aceite os tipos de "filme", por isso o <>
	private ArrayList<Filme> listaFilmes = 
			new ArrayList<Filme>();
	
	public void adicionarFilme(Filme filme) {
		this.listaFilmes.add(filme);
	}
	
	public String verFilme() {
		String todosOsFilmes = "Filmes adicionados \n";
		
		for(Filme f : this.listaFilmes) {
			todosOsFilmes = "Titulo: " + f.gettitulo() + "\nDuração: " + f.getDuracao() + "\nGênero: " + f.getGenero() + "\nClassificação: " + f.getClassIndicativa();
		}
		
		return todosOsFilmes;
	}
	
}


//////////////////////////////////////


package versao3;

public class Filme {

		private String genero;
		private int classIndicativa;
		
		private String titulo;
		private int duracao;
		public int getDuracao() {
			return duracao;
		}

		public void setDuracao(int duracao) {
			this.duracao = duracao;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public int getClassIndicativa() {
			return classIndicativa;
		}

		public void setClassIndicativa(int classIndicativa) {
			this.classIndicativa = classIndicativa;
		}

		
		public String gettitulo(){
			//Retorna o título do qual ele está sendo chamado; o this faz referencia ao objeto
			return this.titulo;
		}
		
		public void setTitulo(String titulo) {
			this.titulo=titulo;
		}
	}



//////////////////////////////////////


package versao3;

import javax.swing.JOptionPane;

import versao3.Filme;

public class Principal {
			
			static String listaFilmes = "Filme adicionados na lista\n";

			public static void main(String[] args) {

				int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos filmes deseja adicionar à lista"));
				
				minhaLista minhaLista = new minhaLista();
				
				for (int i = 0 ; i < opcao ; i++) {
					
					//Filme() é um método construtor, ou seja, constrói o objeto Filme --> Inicializa os atributos
					//{Classe} {nome do objeto} = new {nome do método}
					Filme filme = new Filme(); 
					
					JOptionPane.showMessageDialog(null, "Informe os dados do filme " + (i + 1) +" que pretende adicionar");
					
					//atributo.método:
					filme.setTitulo(JOptionPane.showInputDialog("Informe o nome do título"));
					filme.setDuracao(Integer.parseInt(JOptionPane.showInputDialog("Informe a duração em minutos")));
					filme.setGenero(JOptionPane.showInputDialog("Informe o gênero"));
					filme.setClassIndicativa(Integer.parseInt(JOptionPane.showInputDialog("Informe classificação indicativa")));	
					
					minhaLista.adicionarFilme(filme);
			
				}
				
				JOptionPane.showMessageDialog(null,minhaLista.verFilme());
				
			}

	}

}

