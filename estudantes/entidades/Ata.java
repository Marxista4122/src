package estudantes.entidades;

import professor.entidades.CodigoCurso;

import java.util.Arrays;
import java.util.Objects;


public class Ata extends Documento {
        private int numero;
        private String texto;
        private String[] presentes;

        public Ata(String criadorAta, CodigoCurso codigoCursoAta, int paginasAta, int numeroAta, String textoAta, String[] presentesAta){
            super(criadorAta,codigoCursoAta,paginasAta);
            numero = numeroAta;
            texto = textoAta;
            presentes = presentesAta;
        }

        public int getNumero() {
            return numero;
        }
        public String getTexto(){
            return texto;
        }
        public String[] getPresentes(){
                return presentes;
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

            Ata objCasted = (Ata) obj;

            return this.getCriador().equals(objCasted.getCriador()) &&
                    this.getCodigoCurso().equals(objCasted.getCodigoCurso()) &&
                    this.getPaginas() == objCasted.getPaginas()  &&
                    numero == objCasted.getNumero() &&
                    texto.equals(objCasted.getTexto()) &&
                    Arrays.equals(presentes, objCasted.getPresentes());
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), getNumero(), getTexto(), Arrays.hashCode(getPresentes()));
        }
}
