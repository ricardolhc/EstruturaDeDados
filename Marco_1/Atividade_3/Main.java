package Marco_1.Atividade_3;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", 20, 7.5);

        Vetor vetAlunos = new Vetor();
        vetAlunos.adiciona(aluno1);

        System.out.println(vetAlunos.contem(aluno1));
        System.out.println(vetAlunos.getTamanho());
        System.out.println(vetAlunos.remove(aluno1));
        System.out.println(vetAlunos.getTamanho());
        System.out.println(vetAlunos.contem(aluno1));
    }    
}
