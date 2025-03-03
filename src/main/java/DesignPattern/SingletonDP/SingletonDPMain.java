package DesignPattern.SingletonDP;

public class SingletonDPMain {
    public static void main(String[] args) {

        SingletonDateUtil sdu = SingletonDateUtil.getInstance();
        SingletonDateUtil sdu1 = SingletonDateUtil.getInstance();
        SingletonDateUtil sdu2 = SingletonDateUtil.getInstance();
        System.out.println("sdu: " + sdu);
        System.out.println("sdu1: " + sdu1);
        System.out.println("sdu2: " + sdu2);

        SingletonDateUtilUsingEagerInitialization sduei = SingletonDateUtilUsingEagerInitialization.getInstance();
        SingletonDateUtilUsingEagerInitialization sduei1 = SingletonDateUtilUsingEagerInitialization.getInstance();
        SingletonDateUtilUsingEagerInitialization sduei2 = SingletonDateUtilUsingEagerInitialization.getInstance();
        System.out.println("sduei: " + sduei.hashCode());
        System.out.println("sduei1: " + sduei1.hashCode());
        System.out.println("sduei2: " + sduei2.hashCode());

        SingletonDateUtilUsingStaticBlock sdusb = SingletonDateUtilUsingStaticBlock.getInstance();
        SingletonDateUtilUsingStaticBlock sdusb1 = SingletonDateUtilUsingStaticBlock.getInstance();
        SingletonDateUtilUsingStaticBlock sdusb2 = SingletonDateUtilUsingStaticBlock.getInstance();
        System.out.println("sdusb: " + sdusb.hashCode());
        System.out.println("sdusb1: " + sdusb1.hashCode());
        System.out.println("sdusb2: " + sdusb2.hashCode());

    }
}

