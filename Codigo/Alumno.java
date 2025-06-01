public class Alumno {
    private int codigo;
    private String nombre;
    private String carnet;

    public Alumno() {
    }

    public Alumno(int codigo, String nombre, String carnet) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carnet = carnet;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Carnet: " + carnet;
    }
}