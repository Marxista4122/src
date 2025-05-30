package estudantes.entidades;

import professor.entidades.CodigoCurso;

import java.util.Objects;

public class Portaria extends Norma{
    private int anoInicio;

    public Portaria(String criadorNorma, CodigoCurso codigoCursoNorma, int paginasNorma, int numeroNorma, boolean validoNorma, String textoNorma, int anoInicioPortaria) {
        super(criadorNorma, codigoCursoNorma, paginasNorma, numeroNorma, validoNorma, textoNorma);
        anoInicio = anoInicioPortaria;
    }

    public int getAnoInicio() {
        return anoInicio;
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
        if(!super.equals(obj)){
            return false;
        }
        Portaria objCasted = (Portaria) obj;
        return this.getAnoInicio() == objCasted.getAnoInicio();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAnoInicio());
    }

}
