package estudantes.entidades;

import professor.entidades.CodigoCurso;

import java.util.Objects;

public class Oficio extends Deliberacao {

    private String destinario;


    public Oficio(String criadorDoc, CodigoCurso codigoCursoDoc, int paginasDoc, String textoDeliberacao, String destinarioOficio) {
        super(criadorDoc, codigoCursoDoc, paginasDoc, textoDeliberacao);
        destinario = destinarioOficio;
    }

    public String getDestinario() {
        return destinario;
    }

    public void setDestinario(String destinario) {
        this.destinario = destinario;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj == null) {
            return false;
        }
        if(this == obj)
        {
            return true;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        if(!super.equals(obj))
        {
            return false;
        }

        Oficio objCasado = (Oficio) obj;

        return destinario.equals(objCasado.getDestinario());

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDestinario());
    }
}
