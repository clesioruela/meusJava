package business;

import entity.AlunoEntity;
import entity.CursoTipo;
import entity.InscricoesEntity;
import infrastructure.ValidationException;
import repository.AlunoRepository;

import java.util.List;

public class AlunoBusiness {


    private AlunoRepository mAlunoRepository;

    public AlunoBusiness() {
        this.mAlunoRepository = new AlunoRepository();
    }

    public void validate(AlunoEntity alunoEntity) throws ValidationException {

        if ("".equals(alunoEntity.getNome())) {
            throw new ValidationException("Nome Obrigatorio!");
        }

        if ("".equals(alunoEntity.getSobrenome())) {
            throw new ValidationException("Sobrenome Obrigatorio!");
        }
    }

    public List<AlunoEntity> getList() {
        return this.mAlunoRepository.getlist();
    }

    public AlunoEntity getAlunoById(int id) {
        return this.mAlunoRepository.getAlunoById(id);
    }

    public void create(AlunoEntity alunoEntity) {
        alunoEntity.setId(this.mAlunoRepository.createId());
        this.mAlunoRepository.creat(alunoEntity);
    }

    public void update(AlunoEntity alunoEntity) {
        this.mAlunoRepository.update(alunoEntity);
    }

    public void delete(int id) {
        this.mAlunoRepository.delete(id);
    }

    public InscricoesEntity getInscricoes() {
        InscricoesEntity inscricoesEntity = new InscricoesEntity();

        List<AlunoEntity> list = this.getList();

        for (AlunoEntity alunoEntity : list) {
            if (alunoEntity.getCursotipo() == CursoTipo.MATEMATICA) {
                inscricoesEntity.setMatematica(inscricoesEntity.getMatematica() + 1);
            } else if (alunoEntity.getCursotipo() == CursoTipo.INFORMATICA) {
                inscricoesEntity.setInformatica(inscricoesEntity.getInformatica() + 1);
            } else {
                inscricoesEntity.setEngenharia(inscricoesEntity.getEngenharia() + 1);
            }
        }
        return inscricoesEntity;
    }

}
