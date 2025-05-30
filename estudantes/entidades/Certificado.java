package estudantes.entidades;

import professor.entidades.CodigoCurso;

import java.util.Objects;

public class Certificado extends Registro {

    private String descricao;

    public Certificado(String criadorDoc, CodigoCurso codigoCursoDoc, int paginasDoc, long autenticacao, long matricula, String estudante, String descricao) {
        super(criadorDoc, codigoCursoDoc, paginasDoc, autenticacao, matricula, estudante);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj == null) return false;
        if(this == obj) return true;
        if(getClass() != obj.getClass()) return false;
        if(!super.equals(obj)) return false;

        Certificado cursed = (Certificado) obj;

        return descricao.equals(cursed.getDescricao());}

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDescricao());
    }
}
