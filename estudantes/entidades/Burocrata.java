package estudantes.entidades;

import professor.entidades.*;

/**
 * Classe que traz a lógica do algoritmo de organização e despacho de processos.
 * <br><br>
 * Você pode incluir novos atributos e métodos nessa classe para criar
 * lógicas mais complexas para o gerenciamento da organização e despacho de 
 * processos, mas esses <strong>atributos e métodos devem ser todos 
 * privados</strong> e eles não serão invocados diretamente pelo simulador.
 * <br><br>
 * Os únicos métodos públicos devem ser: getEstresse, trabalhar, estressar e
 * estressarMuito.
 * 
 * @author Rafael Carrazoni e Bernardo Fontoura
 */
public class Burocrata {
    private int estresse = 0;
    private Mesa mesa;
    private Universidade universidade;
    
    /**
     * Construtor de Burocrata.
     * 
     * @param mesa com os processos
     * @param universidade com os montes dos cursos e a secretaria
     */
    public Burocrata(Mesa mesa, Universidade universidade){
        this.mesa = mesa;
        this.universidade = universidade;
    }
    
    /**
     * Retorna o nível atual de estresse do burocrata.
     * 
     * @return estresse do Burocrata
     */
    public int getEstresse(){
        return estresse;
    }
    
    /**
     * Executa a lógica de criação e despacho dos processos.
     * <br><br>
     * Esse método é o único método de controle invocado durante a simulação 
     * da universidade.
     * <br><br>
     * Aqui podem ser feitas todas as verificações sobre os documentos nos 
     * montes dos cursos e dos processos abertos na mesa do Burocrata. A partir 
     * dessas informações, você pode colocar documentos nos processos abertos
     * e despachar os processos para a secretaria acadêmica.
     * <br><br>
     * Cuidado com a complexidade do seu algoritmo, porque se ele demorar muito
     * serão criados menos documentos na sua execução e sua produtividade geral
     * vai cair.
     * <br><br>
     * <strong>O burocrata não pode manter documentos com ele</strong> depois
     * que o método trabalhar terminar de executar, ou seja, você deve devolver
     * para os montes dos cursos todos os documentos que você removeu dos montes
     * dos cursos.
     * 
     * @see professor.entidades.Universidade#despachar(Processo)
     * @see professor.entidades.Universidade#removerDocumentoDoMonteDoCurso(estudantes.entidades.Documento, professor.entidades.CodigoCurso)
     * @see professor.entidades.Universidade#devolverDocumentoParaMonteDoCurso(estudantes.entidades.Documento, professor.entidades.CodigoCurso) 
     */
    public void trabalhar()
    {
  Documento[] MonteAtual = null;
        CodigoCurso codigoCursoEscolhido = null;

        //Percorrendo até encontrar um curso com documentos 
        for (CodigoCurso curso : CodigoCurso.values()){
            MonteAtual = universidade.pegarCopiaDoMonteDoCurso(curso);
            if(MonteAtual.length == 0){
                continue;
            }
            codigoCursoEscolhido = curso;
            break;
        }

        if(MonteAtual == null) return;
        
        Documento documentoEscolhido = MonteAtual[0];
        Processo processo = mesa.getProcesso(1);

        if(documentoEscolhido.getClass() == Edital.class || documentoEscolhido.getClass() == Portaria.class)
        {
            if (documentoEscolhido.getPaginas() > 100)
            {
                processo = mesa.getProcesso(2);
            }
            return;
        }
        else if(documentoEscolhido.getClass() == Ata.class)
        {
            Documento[] documentosProcesso = processo.pegarCopiaDoProcesso();
            if((documentosProcesso[0].getCodigoCurso().ordinal() <= 6 && documentoEscolhido.getCodigoCurso().ordinal() > 6) || (documentosProcesso[0].getCodigoCurso().ordinal() > 6 && documentoEscolhido.getCodigoCurso().ordinal() <= 6 ))
            {
                
            }
            universidade.removerDocumentoDoMonteDoCurso(documentoEscolhido, codigoCursoEscolhido);
            return;
        }

        processo.adicionarDocumento(documentoEscolhido);
        universidade.despachar(processo);
        universidade.removerDocumentoDoMonteDoCurso(documentoEscolhido, codigoCursoEscolhido);
    }
    
    /**
     * Aumenta o estresse do burocrata em uma unidade.
     */
    public void estressar(){
        estresse++;
    }
    
    /**
     * Aumenta o estresse do burocrata em dez unidades.
     */
    public void estressarMuito(){
        estresse += 10;
    }
}