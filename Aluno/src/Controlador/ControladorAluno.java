/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import dao.DaoAluno;
import javax.swing.JOptionPane;
import modelo.Aluno;
import tela.manutencao.ManutencaoAluno;
/**
 *
 * @author Administrador
 */
public class ControladorAluno {
    public static void inserir(ManutencaoAluno man){
        Aluno objeto = new Aluno();
        objeto.setNome(man.jtfNome.getText());
        objeto.setNome(man.jtfSobrenome.getText());
        
        boolean resultado = DaoAluno.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
    
}
