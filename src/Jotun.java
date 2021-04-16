public class Jotun extends Soldado {
    private int indentificador;
    private String nombreDeBatalla;
    private String nombre;
    private float puntajeFuerza;

    @Override
    public void atacar() {
        float dañoDeAtaque = 40;
    }

    public int getIndentificador() {
        return indentificador;
    }
    public void setIdentificador(int indentificador){
        this.indentificador = indentificador;
    }

    public String getNombreDeBatalla(){
        return nombreDeBatalla;
    }
    public void setNombreDeBatalla(String nombreDeBatalla){
        this.nombreDeBatalla = nombreDeBatalla;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public float getPuntajeFuerza(){
        return puntajeFuerza;
    }
    public void setPuntajeFuerza(float puntajeFuerza) {
        this.puntajeFuerza = puntajeFuerza;
    }
}
