package solid.dip;

public class UserService {
    private Logger logger;

    // Inject dependency
    public UserService(Logger logger) {
        this.logger = logger;
    }

    public void createUser(String name) {
        System.out.println("User created: " + name);
        logger.log("Created user " + name);
    }
}