public class Main {
    public static void main(String[] args){

        Berserker vikingo  = new Berserker();
        Batallon soldado = new Batallon();
        Jotun ymir = new Jotun();
        int num = 0;

        soldado.agregarBerseker(num);

        vikingo.setIdentificador(1);
        vikingo.setNombreDeBatalla("Ivarr el deshuesado");
        vikingo.setNombre("Ivarr Ragnarson");
        vikingo.atacar();

        System.out.println("identificador: " + vikingo.getIndentificador());
        System.out.println("Nombre de batalla:" + vikingo.getNombreDeBatalla());
        System.out.println("Nombre: " + vikingo.getNombre());

        System.out.println("_______________________________________");

       ymir.setIdentificador(1);
        ymir.setNombreDeBatalla("gigante de hielo");
        ymir.setNombre("ymir");
        ymir.setPuntajeFuerza(55);

        System.out.println("identificador: " + ymir.getIndentificador());
        System.out.println("Nombre de batalla:" + ymir.getNombreDeBatalla());
        System.out.println("Nombre: " + ymir.getNombre());
        System.out.println("Fuerza: " + ymir.getPuntajeFuerza());
    }
}
