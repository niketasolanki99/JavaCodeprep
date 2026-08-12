package BusinessRequirement;

public class User {
    private String email;
    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        email = e;
    }

    public static void modifyEmail(User user, String email) {
        user = new User();
        user.setEmail(email);
    }

    public static void main(String[] args) {
        User u1 = new User();
        u1.setEmail("xyz123@hmail.com");
        User u2 = new User();
        u2.setEmail("user123@ymail.com");
        modifyEmail(u1, "abc123@zmail.com");
        System.out.println(u1.getEmail());
        System.out.println(u2.getEmail());

        String text = "\"For pet\'s sake";
        System.out.println(text.replace(" ", "").length());
    }
}




