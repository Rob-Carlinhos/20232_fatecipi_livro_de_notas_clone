public class TesteLivroDeNotas {
    static public void main(String args []){
        //nome completamente qualificado da classe
        String nomeDisciplina = javax.swing.JOptionPane.showInputDialog("digite o nome  da disciplina");
        //inferência de tipo
        //var: somnente a partir do Java 10
        var livroDeNotas = new LivroDeNotas(nomeDisciplina);
        //livroDeNotas.nomeDisciplina= new LivroDeNotas
        //enviando a mensagem "exibirMensagem" ao objeto livroDeNotas
        livroDeNotas.exibirMensagem();
        //livroDeNotas.nomeDisciplina = "Português";
        System.out.println("A disciplina é " + livroDeNotas.getNomeDisciplina());
        String nome = "ABC";
        System.out.println("Até logo");
        livroDeNotas.setNomeDisciplina("Português");
    }
}