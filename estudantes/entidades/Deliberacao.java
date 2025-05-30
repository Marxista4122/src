package estudantes.entidades;

import professor.entidades.CodigoCurso;

import java.util.Arrays;

public abstract class  Deliberacao extends DocumentoAdministrativo{
    private String texto;
    public Deliberacao(String criadorDoc, CodigoCurso codigoCursoDoc, int paginasDoc, String textoDeliberacao) {
        super(criadorDoc, codigoCursoDoc, paginasDoc);
        texto = textoDeliberacao;
    }

    public String getTexto() {
        return texto;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(obj.getClass() != this.getClass()){
            return false;
        }
        Deliberacao objCasted = (Deliberacao) obj;

        return texto.equals(objCasted.getTexto());
    }
}
