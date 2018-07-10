
package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conexaobanco {
    String driver = "com.mysql.jdbc.Driver";
    String banco = "bancodedados";
    String host = "localhost";
    String str_conn = "jdbc:mysql://"+host+":3306/"+banco;
    String usuario = "root";
    String senha = "12345";
    
    public Connection conexao;
    Statement estados;
    
    public void conectar(){
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(str_conn, usuario, senha);
            estados = conexao.createStatement();
        }catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Erro no driver!");
        }catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro na conexao!");
        }
    }
    
    public void fecharconexao(){
        try {
            estados.close();
            conexao.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao fechar conexao!");   
        } 
}
 public void cadastrafuncionario(String cpf, String nome){
        String sqlinserir = "Insert into funcionario (cpf,nome) values ('"+cpf+"','"+nome+"')";
        try {
            int x = estados.executeUpdate(sqlinserir);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Error ao efetuar cadastro!"); 
        }
 }

}
