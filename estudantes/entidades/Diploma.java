package estudantes.entidades;

import professor.entidades.CodigoCurso;
import java.util.Objects;

public class Diploma extends Certificado {

    private String habilitacao;

    public Diploma(String criadorDoc, CodigoCurso codigoCursoDoc, int paginasDoc, long autenticacao, long matricula,
            String estudante, String descricao, String habilitacao) {
        super(criadorDoc, codigoCursoDoc, paginasDoc, autenticacao, matricula, estudante, descricao);
        this.habilitacao = habilitacao;
    }
    
    public String getHabilitacao() {
        return habilitacao;
    }

    @Override
    public boolean equals(Object obj) {
        
        if(obj == null) return false;
        if(obj == this) return true;

        if(obj.getClass() != getClass()) return false;
        if(!super.equals(obj)) return false;

        Diploma converted = (Diploma) obj;

        return Objects.equals(habilitacao, converted.habilitacao);

    }

}
