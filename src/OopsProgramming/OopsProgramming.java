package OopsProgramming;
class Task{

    void payment(){


        System.out.println("payment completed!!");
    }
}

class SubTask extends Task{

    void updateStatus(){
        System.out.println("status successfully updated");
    }
}
public class OopsProgramming {
    public static void main(String[] args) {
        SubTask subTask = new SubTask();
        subTask.payment();
        subTask.updateStatus();


    }
}
