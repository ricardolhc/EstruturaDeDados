public class Main {

    public static void main(String[] args) {
        PontoCartesiano ponto1 = new PontoCartesiano(1, 2);
        PontoCartesiano ponto2 = new PontoCartesiano(1, 4);

        System.out.println(PontoCartesiano.calcularDistanciaEuclidiana(ponto1, ponto2));
    }
    
}
