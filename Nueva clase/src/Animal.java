public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public abstract void hacerSonido();
    public void dorimir(){
        System.out.println("El animal esta durmiendo");
    }
    public void comiendo() {
        System.out.println("El animal esta comiendo");
    }
    public void bebiendo(){
        System.out.println("El animal esta bebiendo");
    }
}