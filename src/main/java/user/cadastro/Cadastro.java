package user.cadastro;

import javax.swing.JOptionPane;

/**
 *
 * @author Joao Victor
 */
public class Cadastro {

    public static void main(String[] args) {
        
        String nomeArmazenado = "João";

        var nome = JOptionPane.showInputDialog("Insira o Seu Nome de Usuário:");
        if(nome.equals(nomeArmazenado)) {
            
        System.out.println("Esse Usuário já Está Cadastrado em Nossas Bases!");
        }else{
        System.out.println("Usuário Cadastrado Com Sucesso!");

        }
    }
}
