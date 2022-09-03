public class Main {
    public static void main(String[] args) {
        
        Persona persona = new Persona();

        persona.setEdad(22);
        persona.setNombre("Michael");
        persona.setTelefono(3202153939L);

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}