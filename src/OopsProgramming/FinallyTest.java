package OopsProgramming;


final class Tree{
    private final int count;

    private final String treeName;

    Tree(int count, String treeName){
        this.count = count;
        this.treeName = treeName;
    }

    public int getCount() {
        return count;
    }

    public String getTreeName() {
        return treeName;
    }
}
public class FinallyTest {
    static final String tree = "coconut Tree";
    public static void main(String[] args) {
         String name = new String();
        name = "solanki";
        name = "niketa";
        System.out.println(name.equals(name));
        System.out.println(tree);

        Tree obj = new Tree(101, "Tulsi");
        System.out.println(obj.getTreeName());



    }
}
