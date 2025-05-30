package estudantes.entidades;

import professor.entidades.CodigoCurso;

import java.util.Objects;

public class Norma extends DocumentoAdministrativo{
    private int numero;
    private boolean valido;
    private String texto;

    public Norma(String criadorNorma, CodigoCurso codigoCursoNorma, int paginasNorma,int numeroNorma, boolean validoNorma, String textoNorma) {
        super(criadorNorma, codigoCursoNorma, paginasNorma);
        numero = numeroNorma;
        valido = validoNorma;
        texto = textoNorma;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isValido() {
        return valido;
    }

    public String getTexto() {
        return texto;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if (this == obj){
            return true;
        }
        if (getClass() != obj.getClass()){
            return false;
        }

        if (!super.equals(obj)) {
            return false;
        }
        Norma norma = (Norma) obj;
        return getNumero() == norma.getNumero() && isValido() == norma.isValido() && Objects.equals(getTexto(), norma.getTexto());
    }

}
