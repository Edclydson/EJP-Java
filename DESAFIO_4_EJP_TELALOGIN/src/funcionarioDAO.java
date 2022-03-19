package DESAFIO_4_EJP_TELALOGIN.src;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class funcionarioDAO {
    Connection conn;
    PreparedStatement pstm;

    /**
     * @param dto   
     * instância da classe loginDTO, onde os dados informados no login são armazenados para verificação
     * 
     * @return
     * resultado apos a checagem
     * 
     * REALIZA A CHECAGEM NO BANCO SE OS DADOS DE LOGIN INFORMADOS CONSTAM NO BANCO
     */
    public ResultSet authLogin(loginDTO dto){
        conn = new conexaodb().conecta_banco();
        try {
            String sql = "SELECT user_funcionario,password_funcionario FROM funcionario_tb WHERE user_funcionario = ? AND password_funcionario = ?;";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, dto.getLogin());
            pstm.setString(2, dto.getSenha());
            ResultSet rs = pstm.executeQuery();
            return rs;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"funcionarioDAO "+e);
            return null;
        }
    }
}/*
    public ResultSet buscaFuncionario(Funcionario func){
        conn = new conexaodb().conecta_banco();
        try{
            String sql = "SELECT * FROM funcionario_tb WHERE matricula_funcionario = ?;";
            pstm = conn.prepareStatement(sql);
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"funcionarioDAO "+e);
            return null;
        }
    }
}

public void nomeFuncionario(loginDTO dto){
    conn = new conexaodb().conecta_banco();
    try {
        String sql = "SELECT nome_funcionario from funcionario_tb where user_funcionario = ? and password_funcionario = ?;";
        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, dto.getLogin());
        pstm.setString(2, dto.getSenha());

        ResultSet rs = pstm.executeQuery();
        ResultSetMetaData metaRS = rs.getMetaData();
        int columnCount = metaRS.getColumnCount();
        
        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                final Object value = rs.getObject(i);
                String[] primeiroNome = value.toString().split(" ");
                dto.setNome(primeiroNome[0]);
            }
        }
    } 
    catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"funcionarioDAO "+e);
    }
}*/
