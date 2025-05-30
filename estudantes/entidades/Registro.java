package estudantes.entidades;

import professor.entidades.CodigoCurso;

import java.util.Objects;

public abstract class Registro extends DocumentoAcademico {

    private String estudante;
    private long matricula;


    public Registro(String criadorDoc, CodigoCurso codigoCursoDoc, int paginasDoc, long autenticacao, String estudante, long matricula) {
        super(criadorDoc, codigoCursoDoc, paginasDoc, autenticacao);
        this.matricula = matricula;
        this.estudante = estudante;
    }

    public long getMatricula() {
        return matricula;
    }

    public String getEstudante() {
        return estudante;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(getClass() !=  obj.getClass()) return false;
        if(!super.equals(obj)) return false;

        Registro registro = (Registro) obj;
        return getMatricula() == registro.getMatricula() && Objects.equals(getEstudante(), registro.getEstudante());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMatricula(), getEstudante());
    }
}
