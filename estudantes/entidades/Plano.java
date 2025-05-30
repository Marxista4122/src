package estudantes.entidades;

import java.util.Objects;
import java.util.Arrays;

import professor.entidades.CodigoCurso;;

public class Plano extends DocumentoAcademico{

    private String responsavel;
    private String[] planejamento;

    public Plano(String criadorDoc, CodigoCurso codigoCursoDoc, int paginasDoc, long autenticacao, String responsavel, String[] planejamento) {
        super(criadorDoc, codigoCursoDoc, paginasDoc, autenticacao);
        this.responsavel = responsavel;
        this.planejamento = planejamento;
    }

    public String[] getPlanejamento() {
        return planejamento;
    }

    public String getResponsavel() {
        return responsavel;
    }

    @Override
    public boolean equals(Object obj) {
        
        if(obj == null) return false;
        if(obj == this) return true;

        if(obj.getClass() != getClass()) return false;
        if(!super.equals(obj)) return false;

        Plano converted = (Plano) obj;

        return Objects.equals(responsavel, converted.responsavel) && Arrays.equals(planejamento, converted.planejamento);

    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getResponsavel(), Arrays.hashCode(getPlanejamento()));
    }

    
}
