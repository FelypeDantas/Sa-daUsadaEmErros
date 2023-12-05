package Excecoes;

import javax.swing.JOptionPane;

public class Vermelho {
  public static void main(String args[]) {
	  String nome;
	  
	  nome = JOptionPane.showInputDialog("Informe o seu nome: ");
	  System.err.println("Caro " + nome + " é assim que faz a saida ficar vermelha");
  }
}
