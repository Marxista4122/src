package estudantes.entidades;

import professor.entidades.CodigoCurso;

import java.util.Arrays;
import java.util.Objects;

public class Circular extends Deliberacao{
    private String[] destinatarios;

    public Circular(String criadorDoc, CodigoCurso codigoCursoDoc, int paginasDoc, String textoDeliberacao,
                    String[] DestinatariosCircular) {
        super(criadorDoc, codigoCursoDoc, paginasDoc, textoDeliberacao);
        destinatarios = DestinatariosCircular;
    }

    public String[] getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(String[] destinatarios) {
        this.destinatarios = destinatarios;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        if(!super.equals(obj)){
            return false;
        }

        Circular obj_casted = (Circular) obj;
        return Arrays.equals(destinatarios, obj_casted.getDestinatarios());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(getDestinatarios()));
    }
}
