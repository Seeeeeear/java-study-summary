public class Statest {
    public static void main(String[] args){
        Person p1 = new Person();
        Person.count++;
        Person p2 = new Person();
        Person.count++;
        System.out.println("total persons:"+Person.getCount());
    }
    
}

class Person{
    protected String name;
    protected int age;
    public static int count =0;
    public static int getCount(){
        return count;
    }
}

