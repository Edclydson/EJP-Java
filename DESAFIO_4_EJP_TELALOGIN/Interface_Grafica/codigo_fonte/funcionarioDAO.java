import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class funcionarioDAO {
    Connection conn;

    /**
     * @param dto   
     * instância da classe loginDTO, onde os dados informados no login são armazenados para verificação
     * 
     * @return
     * resultado apos a checagem
     */
    public ResultSet authLogin(loginDTO dto)
    {
        conn = new conexaodb().conecta_banco();
        try {
            String sql = "SELECT user_funcionario,password_funcionario from funcionario_tb where user_funcionario = ? and password_funcionario = ?;";
            PreparedStatement pstm = conn.prepareStatement(sql);

            pstm.setString(1, dto.getLogin());
            pstm.setString(2, dto.getSenha());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"funcionarioDAO "+e);
            return null;
        }

    }

}
