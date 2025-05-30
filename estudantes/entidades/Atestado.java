package estudantes.entidades;


import professor.entidades.CodigoCurso;
import java.util.Objects;

public class Atestado extends Registro 
{

    private String descricao;
    private String categoria;

    public Atestado(String criadorDoc, CodigoCurso codigoCursoDoc, int paginasDoc, long autenticacao, long matricula, String estudante, String descricao, String categoria) {
        super(criadorDoc, codigoCursoDoc, paginasDoc, autenticacao, matricula, estudante);
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public boolean equals(Object obj) {
        
        if(obj == null) return false;
        if(obj == this) return true;

        if(obj.getClass() != getClass()) return false;
        if(!super.equals(obj)) return false;
        
        Atestado converted = (Atestado) obj;

        return Objects.equals(this.descricao, converted.getDescricao()) && Objects.equals(this.categoria, converted.getCategoria());

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDescricao(), getCategoria());
    }
}
