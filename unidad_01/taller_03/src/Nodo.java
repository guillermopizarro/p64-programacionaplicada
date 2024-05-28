public class Nodo<T, U, V> {
    private T dato1;
    private U dato2;
    private V dato3;

    public Nodo() {
    }
    public Nodo(T dato1, U dato2, V dato3) {
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.dato3 = dato3;
    }

    public void setDato1(T dato1) {
        this.dato1 = dato1;
    }
    public void setDato2(U dato2) {
        this.dato2 = dato2;
    }
    public void setDato3(V dato3) {
        this.dato3 = dato3;
    }
    public T getDato1() {
        return dato1;
    }
    public U getDato2() {
        return dato2;
    }
    public V getDato3() {
        return dato3;
    }    
}
