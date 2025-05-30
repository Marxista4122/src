package estudantes.entidades;

import professor.entidades.CodigoCurso;

import java.util.Objects;

/**
 * Classe que representa um documento genérico.
 * <br><br>
 * <strong>Seu trabalho começa aqui...</strong>
 * 
 * @author Bernardo Fontoura
 * @author Carrazoni
 * Equals está errado, mudar getClass por instanceOf
 */
public abstract class Documento {
    private String criador;
    private CodigoCurso codigoCurso;
    private int paginas;

    public Documento(String criadorDoc, CodigoCurso codigoCursoDoc, int paginasDoc){
        criador = criadorDoc;
        codigoCurso = codigoCursoDoc;
        paginas = paginasDoc;
    }

    public String getCriador() {
        return criador;
    }

    public CodigoCurso getCodigoCurso() {
        return codigoCurso;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(this == obj){
            return true;
        }
        if(getClass() != obj.getClass()){
            return false;
        }

        Documento objCasted = (Documento) obj;

        return criador.equals(objCasted.getCriador()) &&
               codigoCurso.equals(objCasted.getCodigoCurso()) &&
               paginas == objCasted.getPaginas();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCriador(), getCodigoCurso(), getPaginas());
    }
}
