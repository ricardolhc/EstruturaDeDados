package Marco_1.Atividade_5;

public interface Lista {

    public void insereInicio(int info);
    public void insereFim(int info);
    public boolean estahVazia();
    public boolean remove(int info);
    public int tamanho();

    // Retorna uma String que representa a lista a partir do inicio até o fim
    public String getListaInicio();

    // Retorna uma String que representa a lista a partir do fim até o inicio
    public String getListaFim();

}
