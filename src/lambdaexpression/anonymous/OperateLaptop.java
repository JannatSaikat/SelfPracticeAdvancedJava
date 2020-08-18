package lambdaexpression.anonymous;

public class OperateLaptop {

    public static void main(String[] args) {
        //Please implement anonymous class for interface laptop
        Laptop laptop = new Laptop() {
            @Override
            public void ramSize(int memorySize) {
                System.out.println("RAM size is: " + memorySize + " GB");
            }

            @Override
            public void monitorSize(int screenSize) {
                System.out.println("Monitor size is: " + screenSize);
            }
        };

        laptop.ramSize(16);
        laptop.monitorSize(15);

        //please implement anonymous function for Phone FunctionalInterface
        Phone phone = network -> System.out.println("New Network: " + network);
        phone.cellularNetwork("5G");
    }
}
