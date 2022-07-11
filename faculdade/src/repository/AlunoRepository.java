package repository;

import entity.AlunoEntity;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {

	private static int mAlunoID = 0;
	private static List<AlunoEntity> mAlunosList = new ArrayList<>();

	public int createId() {
		return ++mAlunoID;
	}

	public List<AlunoEntity> getlist() {
		return mAlunosList;
	}

	public AlunoEntity getAlunoById(int id) {
		AlunoEntity alunoEntity = null;
		for (AlunoEntity aluno : mAlunosList) {
			if (aluno.getId() == id) {
				alunoEntity = aluno;
				break;
			}
		}
		return alunoEntity;
	}

	public void creat(AlunoEntity alunoEntity) {
		mAlunosList.add(alunoEntity);
	}

	public void update(AlunoEntity alunoEntity) {
		for (AlunoEntity aluno : mAlunosList) {
			if (aluno.getId() == alunoEntity.getId()) {
				aluno.setNome(alunoEntity.getNome());
				aluno.setSobrenome(alunoEntity.getSobrenome());
				aluno.setCursotipo(alunoEntity.getCursotipo());
				aluno.setPromocional(alunoEntity.isPromocional());
			}
		}
	}

	public void delete(int id) {
		int indexRemove = 0;
		for (int i = 0; i < mAlunosList.size(); i++) {
			AlunoEntity aluno = mAlunosList.get(i);
			if (mAlunosList.get(i).getId() == id) {
				indexRemove = i;
				break;
			}
		}
		mAlunosList.remove(indexRemove);
	}

}
