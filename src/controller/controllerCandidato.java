package controller;

import dao.CandidatoDao;
import model.modelCandidato;

public class controllerCandidato {
	
	public int cadastrar (String nome, String cpf, String cargo) {
		modelCandidato c = new modelCandidato(nome, cpf, cargo);
		CandidatoDao d = new CandidatoDao();
		return (d.create(c));

}
}
