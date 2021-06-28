public class CodigoPostal {
    private String provincia;
    private int codigo;
    private String localidad;

    public String getProvincia() {
        return provincia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public CodigoPostal(String provincia, int codigo, String localidad) {
        this.provincia = provincia;
        this.codigo = codigo;
        this.localidad = localidad;
    }
}
