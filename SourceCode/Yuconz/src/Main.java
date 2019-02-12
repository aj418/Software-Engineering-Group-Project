/**
 * creates all needed objects to start the program
 *
 * @author Alice Jaffray and Kieran D'Arcy
 * @version 2019/02/12v2
 */
public class Main {

    /**
     * Starts the app
     */
    public static void main(String[] args) {
        AuthServer authServer = new AuthServer();
        authServer.addDetails("kieran", "password");
        authServer.addDetails("conor", "password");
        authServer.addDetails("alice", "password");
        AppController appController = new AppController(authServer);
        appController.runController();
    }
}
