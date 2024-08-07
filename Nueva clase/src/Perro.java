public  class Perro extends Animal{
    public Perro(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println("El perro ladra");
    }
    public void comiendo() {
        System.out.println("El animal esta comiendo");
    }
    public void bebiendo(){
        System.out.println("El animal esta bebiendo");
    }
}