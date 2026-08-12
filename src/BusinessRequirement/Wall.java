package BusinessRequirement;

public class Wall {
    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public int compareHeight(Wall anotherWall) {
        if (this.height > anotherWall.height) return 1;
        if (this.height < anotherWall.height) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Wall obj = new Wall();
        Wall wall1 = new Wall();
       wall1.setHeight(10);

        Wall wall2 = new Wall();
        wall2.setHeight(15);

        wall1.compareHeight(wall2);
    }
}
