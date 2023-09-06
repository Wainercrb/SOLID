class User {
    private String fullName;
    private Integer age;

    public User(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void registerUser() {
        sendEmail();
        createSession();
    }

    private void sendEmail() {
        // Add logic to send email
        System.out.println("Sending email to: " + fullName);
    }

    private void createSession() {
        // Add logic to create a session
        System.out.println("Creating session for user: " + fullName);
    }
}

class Main {
    public static void main(String[] args) {
        User newUser = new User("Luis", 22);
        newUser.registerUser();
    }
}
