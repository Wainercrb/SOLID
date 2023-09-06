class User {
    private String fullName;
    private Integer age;

    public User(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }
}

class UserRegistrationService {
    public void registerUser(User user) {
        // Add logic to create a session
        System.out.println("Register user: " + fullName);
    }
}

class EmailService {
    public void sendEmail(User user) {
        // Add logic to send email
        System.out.println("Sending email to: " + fullName);
    }
}

class SessionManagementService {
    public void createSession(User user) {
        // Add logic to create a session
        System.out.println("Creating session for user: " + fullName);
    }
}


class Main {
    public static void main(String[] args) {
        User newUser = new User("Luis", 22);
        
        // Initialize the services
        UserRegistrationService registrationService = new UserRegistrationService();
        EmailService emailService = new EmailService();
        SessionManagementService sessionService = new SessionManagementService();

        // Perform user registration
        registrationService.registrarUsuario(user);

        // Send a confirmation email
        emailService.enviarCorreoConfirmacion(user);

        // Establish a user session
        sessionService.establecerSesionUsuario(user);

        // Additional logic or actions as needed
    }
}