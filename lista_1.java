//Exercício 1
import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		int[] num = new int[10];
		int soma_par = 0, soma_impar = 0;
		
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número " + i + ": "));
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			if(num[i] % 2 == 0) { 
				JOptionPane.showMessageDialog(null, num[i] + " é par.");
				soma_par = soma_par + num[i];
			} else {
				JOptionPane.showMessageDialog(null, num[i] + " é ímpar.");
				soma_impar = soma_impar + num[i];
			}
		}
		JOptionPane.showMessageDialog(null, "A soma dos números pares é " + soma_par + " e a soma dos números ímpares é " + soma_impar);
	}
}


//Exercício 2
import javax.swing.JOptionPane;

public class Eexercicio02 {

	public static void main(String[] args) {
		String nomeDisciplina;
		double mediaFinal, frequencia;
		
		nomeDisciplina = JOptionPane.showInputDialog("Informe a disciplina: ");
		mediaFinal = Double.parseDouble(JOptionPane.showInputDialog("Informe sua média final na " + " disciplina " + nomeDisciplina));
		frequencia = Double.parseDouble(JOptionPane.showInputDialog("Informe sua frequência em % na disciplina " + nomeDisciplina));
		
		if(mediaFinal >= 7 && frequencia >= 75) {
			JOptionPane.showMessageDialog(null, "Com média " + mediaFinal + " e frequência " + frequencia + "%, você está APROVADO na disiciplina de " + nomeDisciplina);
		} else {
			JOptionPane.showMessageDialog(null, "Com média " + mediaFinal + " e frequência " + frequencia + "%, você está REPROVADO na disiciplina de " + nomeDisciplina);
		}
	}
}


//Exercício 3
import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		int[] num = new int[10];
		int valor = 0;
		
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número " + i + ": "));
		}
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro: "));
		
		int vetor = 1;
		int posicao = 0;
		
		for(int i = 0 ; i < num.length ; i++) {
			if(num[i] == valor) {
				vetor = 0;
				posicao = i;
				break;
			}
		}
		
		if(vetor == 0) {
			JOptionPane.showMessageDialog(null, "O valor " + valor + " encontra-se na posição " + posicao);
		} else {
			JOptionPane.showMessageDialog(null, "O valor " + valor + " não encontra-se no vetor.");
		}
	}
}


//Exercício 4
import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		int temp = 0;
		int tempConvertida = 0;
		
		temp = Integer.parseInt(JOptionPane.showInputDialog("Informe a temperatura em °F: "));
		
		tempConvertida = 5 * (temp - 32) / 9;
		
		JOptionPane.showMessageDialog(null, temp + "°F equivalem a " + tempConvertida + "°C.");

	}
}


//Exercício 5
import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		int[] nota = new int[4];
		float media = 0, soma = 0;
		
		for(int i = 0 ; i < nota.length ; i++) {
			nota[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota: "));
			soma = soma + nota[i];
		}
		
		media = soma / 4;
		
		if(media >= 9) {
			JOptionPane.showMessageDialog(null, "Conceito A");
		} else {
			if(media > 8 && media < 8.9) {
				JOptionPane.showMessageDialog(null, "Conceito B");
			} else {
				if(media > 7 && media < 7.9) {
					JOptionPane.showMessageDialog(null, "Conceito C");
				} else {
					JOptionPane.showMessageDialog(null, "Conceito D");
				}
			}
		}
	}
}


//Exercício 6
import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		float quilos = 0;
		quilos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de latão em quilos: "));
		
		float cobre = (float) (0.7 * quilos);
		float zinco = (float) (0.3 * quilos);
		
		JOptionPane.showMessageDialog(null, "Para fabricar " + quilos + "kg de latão, é necessário " + cobre + "kg de cobre e " + zinco + "kg de zinco.");
	}
}


//Exercício 7
import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		int idade = 0;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
		
		if(idade < 18) {
			JOptionPane.showMessageDialog(null, "Não eleitor.");
		} else {
			if(idade > 18 && idade < 65) {
				JOptionPane.showMessageDialog(null, "Eleitor obrigatório.");
			} else {
				JOptionPane.showMessageDialog(null, "Eleitor facultativo.");
			}
		}
	}
}


//Exercício 8
import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		float[] num = new float[3];
		
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe um número: "));
		}
		
		float maior = num[0] > num[1] ? (num[0] > num[2] ? num[0] : num[2]) : (num[1] > num[2] ? num[1] : num[2]);
        JOptionPane.showMessageDialog(null, "O maior número é o " + maior);
	}
}


//Exercício 9
import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		int placa;
		
		placa = Integer.parseInt(JOptionPane.showInputDialog("Informe o número final de sua placa: "));
		
		switch(placa) {
			case 0:
			case 5:
				JOptionPane.showMessageDialog(null, "Proibido circular na segunda-feira.");
				break;
			case 1:
			case 6:
				JOptionPane.showMessageDialog(null, "Proibido circular na terca-feira.");
				break;
			case 3:
			case 8:
				JOptionPane.showMessageDialog(null, "Proibido circular na quinta-feira.");
				break;
			case 4:
			case 9:
				JOptionPane.showMessageDialog(null, "Proibido circular na sexta-feira.");
				break;
			case 7:
			case 2:
				JOptionPane.showMessageDialog(null, "Proibido circular na quarta-feira.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Placa inexistente.");
				break;
		}
	}
}


//Exercício 10
import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		
		int irineu = 0, felipe = 0, jarbas = 0;
		
		for(int i = 0 ; i < 20 ; i++) {
			int voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do seu candidato: "));
			
			switch(voto) {
			case 88:
				irineu++;
				break;
			case 95:
				felipe++;
				break;
			case 23:
				jarbas++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Insira um número válido.");
				i--;
				break;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Resultados:\n\n" +
				"Irineu: " + irineu + " voto(s)\n" +
				"Felipe Smith: " + felipe + " voto(s)\n" +
				"Jarbas: " + jarbas + " voto(s)");
		
		if(irineu > felipe && irineu > jarbas) {
			JOptionPane.showMessageDialog(null, "O candidato favorito é o Irineu.");
		} else {
			if(felipe > irineu && felipe > jarbas) {
				JOptionPane.showMessageDialog(null, "O candidato favorito é o Felipe Smith.");
			} else {
				if(jarbas > irineu && jarbas > felipe) {
					JOptionPane.showMessageDialog(null, "O candidato favorito é o Jarbas.");
				} else {
					JOptionPane.showMessageDialog(null, "Empate.");
				}
			}
		}
	}
}


//Exercício 11
import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o elemento [" + i + "]" + "[" + j + "]"));
			}
		}
		
		int soma = 0;
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				soma = soma + matriz[i][j];
			}
		}
		
		JOptionPane.showMessageDialog(null, "A soma de todos os elementos da matriz é " + soma);
	}
}
