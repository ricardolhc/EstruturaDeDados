package Marco_1.Atividade_2;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", 20, 7.5);
        Aluno aluno2 = new Aluno("Maria", 19, 8.5);

        Vetor vetAlunos = new Vetor();
        vetAlunos.adiciona(aluno1);

        System.out.println(vetAlunos.contem(aluno1));
        System.out.println(vetAlunos.getTamanho());
        System.out.println(vetAlunos.contem(aluno2));
        System.out.println(vetAlunos.getTamanho());
    }    
}
