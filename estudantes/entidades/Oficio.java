package estudantes.entidades;

import professor.entidades.CodigoCurso;

import java.util.Objects;

public class Oficio extends Deliberacao {

    private String destinatario;


    public Oficio(String criadorDoc, CodigoCurso codigoCursoDoc, int paginasDoc, String textoDeliberacao, String destinarioOficio) {
        super(criadorDoc, codigoCursoDoc, paginasDoc, textoDeliberacao);
        destinatario = destinarioOficio;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinario(String destinario) {
        this.destinatario = destinario;
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

        return destinatario.equals(objCasado.getDestinatario());

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDestinatario());
    }
}
