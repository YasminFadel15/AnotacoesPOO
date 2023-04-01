package exercicio04;

public class Gabarito {
	private char questao01;
    private char questao02;
    private char questao03;
    private char questao04;
    private char questao05;
    
	public char getQuestao01() {
		return questao01;
	}
	public void setQuestao01(char questao01) {
		this.questao01 = questao01;
	}
	public char getQuestao02() {
		return questao02;
	}
	public void setQuestao02(char questao02) {
		this.questao02 = questao02;
	}
	public char getQuestao03() {
		return questao03;
	}
	public void setQuestao03(char questao03) {
		this.questao03 = questao03;
	}
	public char getQuestao04() {
		return questao04;
	}
	public void setQuestao04(char questao04) {
		this.questao04 = questao04;
	}
	public char getQuestao05() {
		return questao05;
	}
	public void setQuestao05(char questao05) {
		this.questao05 = questao05;
	}
}

package exercicio04;

public class Resposta {
	private char questao01;
    private char questao02;
    private char questao03;
    private char questao04;
    private char questao05;
    
	public char getQuestao01() {
		return questao01;
	}
	public void setQuestao01(char questao01) {
		this.questao01 = questao01;
	}
	public char getQuestao02() {
		return questao02;
	}
	public void setQuestao02(char questao02) {
		this.questao02 = questao02;
	}
	public char getQuestao03() {
		return questao03;
	}
	public void setQuestao03(char questao03) {
		this.questao03 = questao03;
	}
	public char getQuestao04() {
		return questao04;
	}
	public void setQuestao04(char questao04) {
		this.questao04 = questao04;
	}
	public char getQuestao05() {
		return questao05;
	}
	public void setQuestao05(char questao05) {
		this.questao05 = questao05;
	}
}

package exercicio04;

public class Validacoes {
	public static boolean validar(char entrada) {
        return entrada == 'A' || entrada == 'B' || entrada == 'C' || entrada == 'D' || entrada == 'E';
    }
}

package exercicio04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Gabarito gab = new Gabarito();
		
		JOptionPane.showMessageDialog(null, "Preencha o gabarito do professor: ");
		
		char entrada;
		do {
			entrada = JOptionPane.showInputDialog("Questão 01:").charAt(0);
		} while(!Validacoes.validar(entrada));
		gab.setQuestao01(entrada);
		
		do {
			entrada = JOptionPane.showInputDialog("Questão 02:").charAt(0);
		} while(!Validacoes.validar(entrada));
		gab.setQuestao02(entrada);
		
		do {
			entrada = JOptionPane.showInputDialog("Questão 03:").charAt(0);
		} while(!Validacoes.validar(entrada));
		gab.setQuestao03(entrada);
		
		do {
			entrada = JOptionPane.showInputDialog("Questão 04:").charAt(0);
		} while(!Validacoes.validar(entrada));
		gab.setQuestao04(entrada);
		
		do {
			entrada = JOptionPane.showInputDialog("Questão 05:").charAt(0);
		} while(!Validacoes.validar(entrada));
		gab.setQuestao05(entrada);
		
		
		
		Resposta resp = new Resposta();
		
		int corretas = 0;
		
		JOptionPane.showMessageDialog(null, "Preencha as respostas do aluno: ");
		
		do {
			entrada = JOptionPane.showInputDialog("Questão 01:").charAt(0);
		} while(!Validacoes.validar(entrada));
		resp.setQuestao01(entrada);
		if(resp.getQuestao01() == gab.getQuestao01())
			corretas++;
		
		do {
			entrada = JOptionPane.showInputDialog("Questão 02:").charAt(0);
		} while(!Validacoes.validar(entrada));
		resp.setQuestao02(entrada);
		if(resp.getQuestao02() == gab.getQuestao02())
			corretas++;
		
		do {
			entrada = JOptionPane.showInputDialog("Questão 03:").charAt(0);
		} while(!Validacoes.validar(entrada));
		resp.setQuestao03(entrada);
		if(resp.getQuestao03() == gab.getQuestao03())
			corretas++;
		
		do {
			entrada = JOptionPane.showInputDialog("Questão 04:").charAt(0);
		} while(!Validacoes.validar(entrada));
		resp.setQuestao04(entrada);
		if(resp.getQuestao04() == gab.getQuestao04())
			corretas++;
		
		do {
			entrada = JOptionPane.showInputDialog("Questão 05:").charAt(0);
		} while(!Validacoes.validar(entrada));
		resp.setQuestao05(entrada);
		if(resp.getQuestao05() == gab.getQuestao05())
			corretas++;
	
		
		float nota = (float) (2.00 * corretas);
		
		JOptionPane.showMessageDialog(null, "Nota do aluno: " + nota);
	}
}
