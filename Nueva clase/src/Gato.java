public  class Gato extends Animal{
    public Gato(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println("El gato Shuko");
    }
    public void Corriendo() {
        System.out.println("El animal esta Corriendo");
    }
    public void bebiendo(){
        System.out.println("El animal esta bebiendo");
    }
}