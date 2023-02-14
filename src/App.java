public class App {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();

        persona.setEdad(25);
        persona.setNombre("Juan");
        persona.setTelefono(77243727);
        
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Teléfono: " + persona.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int numero) {
        this.telefono = numero;
    }


}