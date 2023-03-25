public class PontoCartesiano {

    private float x;
    private float y;

    public PontoCartesiano(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public static double calcularDistanciaEuclidiana(PontoCartesiano x, PontoCartesiano y) {
        final double distanciaX = Math.pow(x.getX() - y.getX(), 2);
        final double distanciaY = Math.pow(x.getY() - y.getY(), 2);

        return Math.sqrt(distanciaX + distanciaY);
    }
}