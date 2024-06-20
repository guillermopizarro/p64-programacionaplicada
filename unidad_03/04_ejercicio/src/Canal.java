public interface Canal<E> {
    public void enviar(E elemento);
    public E recibir();
}