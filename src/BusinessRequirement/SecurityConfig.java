package BusinessRequirement;

public class SecurityConfig {
    public boolean configure() {
        configure(141,true);
        return true;
    }   //A
    public int configure(int code) {
        return code + 1;
    }; //B
    public int configure(int code, boolean allow) {
        return configure(code);
    }
    public static void main(String[] args) {
        System.out.print(new SecurityConfig().configure());//C
    }
}