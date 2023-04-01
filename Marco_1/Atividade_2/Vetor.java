package Marco_1.Atividade_2;

public class Vetor {

    private Aluno[] vetor;
    private int total;

    public Vetor(int tamanhoMaximo) {
        vetor = new Aluno[tamanhoMaximo];
        total = 0;
    }

    public Vetor() {
        vetor = new Aluno[3];
    }

    public void adiciona(Aluno aluno) {
        vetor[total] = aluno;
        total++;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < total; i++) {
            if (vetor[i].equals(aluno)) {
                return true;
            } 
        }
        return false;
    }

    public int getTamanho() {
        return total;
    }







}
