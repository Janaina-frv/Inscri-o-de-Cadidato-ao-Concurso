package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import connection.ConnectionFactory;
import model.modelCandidato;

public class CandidatoDao {
	
	public int create(modelCandidato candidato) {
		
		Connection con = null;
		PreparedStatement pst = null;
		String sqlInsert = "INSERT INTO candidato (Nome, CPF, Cargo) VALUES (?,?,?)";

		con = ConnectionFactory.getConnection();
		
		try{
			pst = con.prepareStatement(sqlInsert);
			pst.setString(1, candidato.getNome());
			pst.setString(2, candidato.getCpf());
			pst.setString(3, candidato.getCargo());

			pst.execute();
			return 1;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro de inserção dos dados: "+e.getMessage(), "Erro", 2);
			return 0;
		}
		finally {
			ConnectionFactory.CloseConnection(con, pst);
		}
	}
	

}
