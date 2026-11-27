//For checking whether the setup is correct or not
public class CheckSetup {
    public static void main(String[] args){
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("Java vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java home: " + System.getProperty("java.home"));
        System.out.println("OS name: " + System.getProperty("os.name"));
        System.out.println("CPU cores: " + Runtime.getRuntime().availableProcessors());
        System.out.println("Setup OK - u are ready to write Java!");
        if(args.length > 0){
            System.out.println("Compiled by: " + args[0]);
        }
    }
}
