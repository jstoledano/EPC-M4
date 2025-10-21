public class Persona {
    String nombre;
    int edad;

    void saludar() {
        System.err.println("Hola, mi nombre es " + nombre);
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Javier";
        persona1.edad = 53;
        persona1.saludar();
    }
}

