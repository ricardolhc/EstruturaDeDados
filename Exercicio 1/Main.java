public class Main {

    public static void main(String[] args) {
        PontoCartesiano ponto1 = new PontoCartesiano(1, 2);
        PontoCartesiano ponto2 = new PontoCartesiano(1, 4);
        PlanoCartesiano pc = new PlanoCartesiano();
        pc.setP1(ponto1);
        pc.setP2(ponto2);
        System.out.println(pc.calcularDistanciaEuclidiana());
    }
    
}
