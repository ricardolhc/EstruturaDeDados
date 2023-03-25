public class PlanoCartesiano {

    PontoCartesiano p1;
    PontoCartesiano p2;

    public double calcularDistanciaEuclidiana() {
        final double distanciaX = Math.pow(p1.getX() - p1.getX(), 2);
        final double distanciaY = Math.pow(p2.getY() - p2.getY(), 2);

        return Math.sqrt(distanciaX + distanciaY);
    }

    public PontoCartesiano getP1() {
        return p1;
    }
    public void setP1(PontoCartesiano p1) {
        this.p1 = p1;
    }

    public PontoCartesiano getP2() {
        return p2;
    }
    public void setP2(PontoCartesiano p2) {
        this.p2 = p2;
    }

    
}
