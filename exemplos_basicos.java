import javax.swing.JOptionPane;

public class exemplos_basicos {

	public static void main(String[] args) {
		String nomePessoa;
		int idadePessoa;
		String dataNasc = "";
				
		nomePessoa = JOptionPane.showInputDialog("Entre com o nome: ");
		idadePessoa = Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade: "));
		dataNasc = JOptionPane.showInputDialog("Entre com a data de nascimento: ");
		
		if(idadePessoa < 18) {
			System.out.print("Menor de idade.\n");
		} else {
			System.out.print("Maior de idade.\n");
		}

		int cont = 0;
		
		switch(idadePessoa) {
			case 48:
				System.out.print("Verdadeiro.");
			case 2:
				break;
			default:
		}
				
		while(cont > 10) {
			cont++;
		}
		
		do {
			cont++;
		} while (cont < 10);
		
		
	}

}
