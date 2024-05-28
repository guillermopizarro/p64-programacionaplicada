public class Nodo2<T, U extends Number>  {
    private T dato1;
    private U dato2;

    public Nodo2(T dato1, U dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    public void setDato1(T dato1) {
        this.dato1 = dato1;
    }
    public void setDato2(U dato2) {
        this.dato2 = dato2;
    }
    public T getDato1() {
        return dato1;
    }
    public U getDato2() {
        return dato2;
    }
}
