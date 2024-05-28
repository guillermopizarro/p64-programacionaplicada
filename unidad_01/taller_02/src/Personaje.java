public class Personaje extends Persona {
    
    private String alias;
    private int nivelPoder;
    private String tipoBando;
    
    public Personaje(String nombre, String apellido, String alias, int nivelPoder, String tipoBando) {
        super(nombre, apellido);
        this.alias = alias;
        this.nivelPoder = nivelPoder;
        this.tipoBando = tipoBando;
    }

    public String getAlias() {
        return alias;
    }
    public int getNivelPoder() {
        return nivelPoder;
    }
    public String getTipoBando() {
        return tipoBando;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }
    public void setTipoBando(String tipoBando) {
        this.tipoBando = tipoBando;
    }

    public String toString() {
        return "Nombre: " + this.getNombre() + " Apellido: " + this.getApellido() + " Alias: " + this.alias + " Nivel de poder: " + this.nivelPoder;
    }
}
