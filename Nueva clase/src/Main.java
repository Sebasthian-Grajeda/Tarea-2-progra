public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("SHADOW",4);
        Gato gato = new Gato("SHUSHU",14);

        System.out.println("Nombre: " + perro.getName()  + " edad: " + perro.getAge());
        perro.hacerSonido();
        perro.comiendo();
        perro.bebiendo();
        perro.dorimir();

        System.out.println("Nombre: " + gato.getName()  + " edad: " + gato.getAge());
        gato.hacerSonido();
        gato.Corriendo();
        gato.bebiendo();
        gato.dorimir();
    }
}