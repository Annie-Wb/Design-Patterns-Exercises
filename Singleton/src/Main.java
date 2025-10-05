public class Main {
    public static void main(String[] args) {
        Logger instance1 = Logger.getInstance();
        Logger instance2 = Logger.getInstance();
        
        System.out.println("The two instances are the same: " + instance1.equals(instance2));
        instance1.log("Instance1 hashcode: " + instance1.hashCode());
        instance2.log("Instance2 hashcode: " + instance1.hashCode());
    }


}
