package Prototype;

public interface Reteta extends Cloneable{
    void descriere();
    Reteta clone() throws CloneNotSupportedException;
}
