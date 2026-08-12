package coreJava;

class Helper{
    private int id;
    private String name;

    public Helper(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}



public class Immutable2 {
    public static void main(String[] args) {
        Helper obj = new Helper(10, "niketa");

      
        System.out.println(obj.getId() + ", " + obj.getName());
    }

}
