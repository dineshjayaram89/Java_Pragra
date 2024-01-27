package Jan27.Static;

public class staticBlock {
    public  static void print(){
        System.out.println("Static Method");
    }

    static {
        int x = 2;
        int y = 3;
        int z = 20;
        System.out.println("Static Block Executed");
        System.out.println("x = " +x+ " y = " +y+ " z = "+z);
    }

    public void run(){
        System.out.println("Values initialized by static ");
    }

    {
        System.out.println("Instance Block");
    }

    public static void main(String[] args) {
        new staticBlock();

    }
}

