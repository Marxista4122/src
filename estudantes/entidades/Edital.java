package estudantes.entidades;

import professor.entidades.CodigoCurso;

import java.util.Arrays;
import java.util.Objects;

public class Edital extends Norma{
    private String[] responsaveis;
    public Edital(String criadorNorma, CodigoCurso codigoCursoNorma, int paginasNorma, int numeroNorma, boolean validoNorma, String textoNorma, String[] responsaveisEdital) {
        super(criadorNorma, codigoCursoNorma, paginasNorma, numeroNorma, validoNorma, textoNorma);
        responsaveis =responsaveisEdital;
    }

    public String[] getResponsaveis() {
        return responsaveis;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(obj.getClass() != this.getClass()){
            return false;
        }
        Edital objCasted = (Edital) obj;

        return Arrays.equals(responsaveis, objCasted.getResponsaveis());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(getResponsaveis()));
    }
}
