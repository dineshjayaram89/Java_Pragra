package Feb17.InnerClass;

public class innerClassDemo {
    public static void main(String[] args) {
        OuterClass outObj = new OuterClass();
        OuterClass.InnerClass innerObj = outObj.new InnerClass();
        outObj.outterMethod();
        innerObj.innerMethod();
    }
}
