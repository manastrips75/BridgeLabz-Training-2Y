interface LightAction {
    void execute();
}

public class SmartLightAutomation {
    public static void main(String[] args) {
        LightAction motion = () -> System.out.println("Lights ON due to motion");
        LightAction time = () -> System.out.println("Lights ON for evening mode");
        LightAction voice = () -> System.out.println("Lights ON by voice command");

        motion.execute();
        time.execute();
        voice.execute();
    }
}
