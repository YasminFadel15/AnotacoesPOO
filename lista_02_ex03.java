package exercicio03;

public class Marca {
	private String nomeProd;

	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
}

package exercicio03;

public class Produto {
	private int quantProd;
    private float precoProd;
    private String corProd;
    private String marcaProd;
    private Marca marca;
    
	public int getQuantProd() {
		return quantProd;
	}
	public void setQuantProd(int quantProd) {
		this.quantProd = quantProd;
	}
	public float getPrecoProd() {
		return precoProd;
	}
	public void setPrecoProd(float precoProd) {
		this.precoProd = precoProd;
	}
	public String getCorProd() {
		return corProd;
	}
	public void setCorProd(String corProd) {
		this.corProd = corProd;
	}
	public String getMarcaProd() {
		return marcaProd;
	}
	public void setMarcaProd(String marcaProd) {
		this.marcaProd = marcaProd;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
}

package exercicio03;

import javax.swing.JOptionPane;

public class Principal {
	
	static String infoProd = "Informações do produto\n";

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		JOptionPane.showConfirmDialog(null, "Informe os dados do produto: ");
		
		Marca marca = new Marca();
		marca.setNomeProd(JOptionPane.showInputDialog("Informe o nome do produto: \n"));
		produto.setMarca(marca);
		
		produto.setQuantProd(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade: \n")));
		produto.setPrecoProd(Float.parseFloat(JOptionPane.showInputDialog("Informe o preço: \n")));
		produto.setCorProd(JOptionPane.showInputDialog("Informe a cor: \n"));
		produto.setMarcaProd(JOptionPane.showInputDialog("Informe a marca do produto: \n"));
		
		infoProd += "\nNome: " + produto.getMarca().getNomeProd() + "\nQuantidade: " + produto.getQuantProd() + 
				"\nPreço: " + produto.getPrecoProd() + "\nCor: " + produto.getCorProd() + "\nMarca: " +
				produto.getMarcaProd();
		
		JOptionPane.showMessageDialog(null, infoProd);
	}
}
