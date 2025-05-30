package estudantes.entidades;

import professor.entidades.CodigoCurso;
import java.util.Arrays;
import java.util.Objects;

public class Historico extends Registro {

    private double coeficiente;
    private String[] componentes;

    public Historico(String criadorDoc, CodigoCurso codigoCursoDoc, int paginasDoc, long autenticacao, long matricula, String estudante, double coeficiente, String[] componentes)  {
        super(criadorDoc, codigoCursoDoc, paginasDoc, autenticacao, estudante, matricula);
        this.coeficiente = coeficiente;
        this.componentes = componentes;
    }

    public double getCoeficiente() {
        return coeficiente;
    }
    public String[] getComponentes() {
        return componentes;
    }
    
    @Override
    public boolean equals(Object obj) {
        
        if(obj == null) return false;
        if(obj == this) return true;

        if(obj.getClass() != getClass()) return false;
        if(!super.equals(obj)) return false;
        
        Historico converted = (Historico) obj;

        return this.coeficiente == converted.getCoeficiente() && Arrays.equals(this.componentes, converted.getComponentes());

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCoeficiente(), Arrays.hashCode(getComponentes()));
    }
}
