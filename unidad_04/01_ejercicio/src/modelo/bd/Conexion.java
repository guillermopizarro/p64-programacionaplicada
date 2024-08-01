package modelo.bd;

public class Conexion {
    private String driverClass;
    private String driver;
    private String usuario;
    private String clave;
    private String host;
    private String puerto;
    private String nombre;

    public Conexion() {
    }

    public String urlConexion() {
        String url = "";
        if (this.driver.equals("jdbc:sqlserver")) {
            url = this.driver + "://" + this.host + ":" + this.puerto + ";databaseName=" + this.nombre + 
                ";encrypt=true;trustServerCertificate=true";
        } else {
            url = this.driver + "://" + this.host + ":" + this.puerto + "/" + this.nombre;
        }
        return url;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">     
    public String getClave() {
        return clave;
    }

    public String getDriver() {
        return driver;
    }

    public String getDriverClass() {
        return driverClass;
    }

    public String getHost() {
        return host;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuerto() {
        return puerto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    // </editor-fold>
}
