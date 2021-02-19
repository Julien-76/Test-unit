package be.technifutur.java2020;

public class Framework implements Runnable{
    Application application;
    User user;


    public void start() {

    }

    public void isFinish() {

    }

    public void setApplication(Application a) {
        this.application = a;
    }

    public void setUser(User u) {
        this.user = u;
    }


    public void run() {
        application.start();
        while( ! application.isFinish()){
            String screen = application.getScreen();
            user.sendMessage(screen);
            String response = user.getResponse();
            application.newInput(response);
        }
        String screen = application.getScreen();
        user.sendMessage(screen);
        application.stop();
    }

}
