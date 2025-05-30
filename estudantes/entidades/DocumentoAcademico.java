package estudantes.entidades;

import professor.entidades.CodigoCurso;

public abstract class  DocumentoAcademico extends Documento{

    private long autenticacao;


    public DocumentoAcademico(String criadorDoc, CodigoCurso codigoCursoDoc, int paginasDoc, long autenticacao) {
        super(criadorDoc, codigoCursoDoc, paginasDoc);
        this.autenticacao = autenticacao;
    }

    public long getAutenticacao() {
        return autenticacao;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj == null)
        {
            return false;
        }

        if(this == obj)
        {
            return true;
        }

        if(!super.equals(obj)) return false;

        if(getClass() != obj.getClass()) return false;

        DocumentoAcademico cursed = (DocumentoAcademico) obj;

        return autenticacao == cursed.getAutenticacao();
    }
}
