package exercicio01;

public class Marca {
	public String nomeProd;
}

package exercicio01;

public class Produto {
	public int quantProd;
    public float precoProd;
    public String corProd;
    public String marcaProd;
    public Marca marca;
}

package exercicio01;

import javax.swing.JOptionPane;

public class Principal {

	static String infoProd = "Informações do produto\n";
	
	public static void main(String[] args) {
		
		Produto produto = new Produto();
        
        JOptionPane.showMessageDialog(null, "Informe os dados do produto: ");
        
        Marca marca = new Marca();
        marca.nomeProd = JOptionPane.showInputDialog("Informe o nome do produto: \n");
        produto.marca = marca;
        
        
        produto.quantProd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade: \n"));
        produto.precoProd = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço: \n"));
        produto.corProd = JOptionPane.showInputDialog("Informe a cor: \n");
        produto.marcaProd = JOptionPane.showInputDialog("Informe a marca: \n");
        
        infoProd += "\nNome: " + marca.nomeProd + "\nQuantidade: " + produto.quantProd + 
                "\nPreço: " + produto.precoProd + "\nCor: " + produto.corProd + "\nMarca: " +
                produto.marcaProd;
        
        JOptionPane.showMessageDialog(null, infoProd);
	}
}
