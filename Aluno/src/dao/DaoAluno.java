/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Aluno;

/**
 *
 * @author Administrador
 */
public class DaoAluno {
        public static boolean inserir(Aluno objeto) {
        String sql = "INSERT INTO Aluno ( nome, Codigo, sobrenome, sexo) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome());
            ps.setInt(2, objeto.getCodigo());
            ps.setString(3, objeto.getSobrenome());
            ps.setString(4, objeto.getSexo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
     public static void main(String[] args) {
       Aluno objeto = new Aluno();
        objeto.setNome("BRUNO");
        objeto.setCodigo(1356);
        objeto.setSobrenome("Henrique");
        objeto.setSexo("M");
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    
}
