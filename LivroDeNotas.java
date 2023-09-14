public class LivroDeNotas{
    //variável de instância
    //instância é sinônimo de objeto
    //modificador de acesso
    //encapsulamento
    private String nomeDisciplina;
    //métodos getters/setters
    //princípio do menor privilégio
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    //setter
    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public void exibirMensagem(){
        System.out.printf("Bem vindo ao livro de %s\n", nomeDisciplina);
    }

    //construtor padrão (aquele cuja lista de parâmetros é vazia)
    LivroDeNotas(String nomeDisciplina) {
        //shadowing
        this.nomeDisciplina = nomeDisciplina;
    }
}