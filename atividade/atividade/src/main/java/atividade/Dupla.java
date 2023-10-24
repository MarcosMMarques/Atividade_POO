package atividade.src.main.java.atividade;

public class Dupla<T, U> {
    private T x;
    private U y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public U getY() {
        return y;
    }

    public void setY(U y) {
        this.y = y;
    }

    public Dupla() {
    }

    public Dupla(T x, U y) {
        this.x = x;
        this.y = y;
    }
}