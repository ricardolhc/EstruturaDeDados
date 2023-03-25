public class PlanoCartesiano {

    public static double calcularDistanciaEuclidiana(PontoCartesiano x, PontoCartesiano y) {
        final double distanciaX = Math.pow(x.getX() - y.getX(), 2);
        final double distanciaY = Math.pow(x.getY() - y.getY(), 2);

        return Math.sqrt(distanciaX + distanciaY);
    }
    
}
