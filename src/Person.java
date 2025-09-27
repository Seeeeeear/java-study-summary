public class Person {
    public static void main(String[] args){
        Personinstance p1 = new Personinstance("Alice",30);
        Personinstance p2 = new Personinstance();
        System.out.println(p1.name + " " + p1.age);
        System.out.println(p2.name + " " + p2.age);
    }
    
}

class Personinstance{
    String name;
    int age;
    public Personinstance(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Personinstance(){
        this("unknow",12);

    }

}