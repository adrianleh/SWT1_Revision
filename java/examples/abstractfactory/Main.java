package net.adrianlehmann.swt_revision.patterns.variation_patterns.abstractfactory;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public class Main {
    public static void main(String[] args) {
        final String OS = "edit me"; //srsly edit this
        GUIFactory guiFactory;
        switch (OS) {
            case "macOS":
                guiFactory = new OSXGUIFactory();
                break;
            case "windows":
                guiFactory = new WindowsGUIFactory();
                break;
            case "linux":
                guiFactory = new LinuxGUIFactory();
                break;
            default:
                System.out.println("Error");
                return;
        }
        guiFactory.makeNavBar();

        //If linux:
        //You shouldn't have a GUI here

        //If macOS:
        //I am a NavBar

        //If windows:
        //Sorry I crashed
    }

}
