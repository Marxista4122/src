package estudantes.entidades;

import professor.entidades.CodigoCurso;



public abstract class DocumentoAdministrativo extends Documento{


    public DocumentoAdministrativo(String criadorDoc, CodigoCurso codigoCursoDoc, int paginasDoc) {
        super(criadorDoc, codigoCursoDoc, paginasDoc);
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

        DocumentoAdministrativo objCasted = (DocumentoAdministrativo) obj;

        return this.getCriador().equals(objCasted.getCriador()) &&
                this.getCodigoCurso().equals(objCasted.getCodigoCurso()) &&
                this.getPaginas() == objCasted.getPaginas();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
