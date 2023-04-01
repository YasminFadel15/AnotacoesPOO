package exercicio05;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Estoque {
	private ArrayList<Peca> listaDePecas =
			new ArrayList<Peca>();

	public ArrayList<Peca> getListaDePecas() {
		return listaDePecas;
	}

	public void setListaDePecas(ArrayList<Peca> listaDePecas) {
		this.listaDePecas = listaDePecas;
	}
	
	Peca novaPeca = new Peca();
	
	public  void cadastrar() {
		int quant = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de pecas: \n"));
		
		for(int i = 1 ; i <= quant ; i++) {
			novaPeca.setDescricao(JOptionPane.showInputDialog("Descrição da peça " + i + ": \n"));
			novaPeca.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Preço da peça " + i + ": \\n")));
			novaPeca.setCor(JOptionPane.showInputDialog("Cor da peça " + i + ": \n"));
			novaPeca.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Altura da peça " + i + ": \n")));
			novaPeca.setLargura(Float.parseFloat(JOptionPane.showInputDialog("Largura da peça " + i + ": \n")));
			this.listaDePecas.add(novaPeca);
		}
		JOptionPane.showMessageDialog(null, quant + " peças foram cadastradas.");
	}
	
	public void remover() {
		int posicao = Integer.parseInt(JOptionPane.showInputDialog("Insira a posição da peça: \n"));
		
		if(posicao >= 0 && posicao < listaDePecas.size()) {
			listaDePecas.remove(posicao);
			JOptionPane.showMessageDialog(null, "Peça removida.");
		} else
			JOptionPane.showMessageDialog(null, "Digite uma posição válida.");
	}
	
	public void mostrar() {
		String mensagem = "";
	    for (int i = 0; i < listaDePecas.size(); i++) {
	        Peca peca = listaDePecas.get(i);
	        mensagem += "Peça " + (i+1) + "\n" +
	                    "Descrição: " + peca.getDescricao() + "\n" +
	                    "Preço: " + peca.getPreco() + "\n" +
	                    "Cor: " + peca.getCor() + "\n" +
	                    "Altura: " + peca.getAltura() + "\n" +
	                    "Largura: " + peca.getLargura() + "\n\n";
	    }
	    if (mensagem.equals("")) {
	        mensagem = "Não há peças cadastradas.";
	    }
	    JOptionPane.showMessageDialog(null, mensagem);
	}
	
}
 
package exercicio05;

public class Peca {
	private String descricao;
	private float preco;
	private String cor;
	private float altura;
	private float largura;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getLargura() {
		return largura;
	}
	public void setLargura(float largura) {
		this.largura = largura;
	}
}

package exercicio05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Estoque estoque = new Estoque();
		
		int opcao;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha uma opção:\n" +
					"[1]. Cadastrar peça(s)\n" +
					"[2]. Remover peça(s)\n" +
					"[3]. Ver peças\n" +
					"[4]. sair"));
			
			switch(opcao) {
			case 1:
				estoque.cadastrar();
				break;
			case 2:
				estoque.remover();
				break;
			case 3:
				estoque.mostrar();
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Programa finalizado!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma opção válida.");
			}
		} while(opcao != 4);

	}

}
