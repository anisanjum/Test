package DesignPattern.BuilderDP.Example1;

public class ShopMain {
//    https://www.youtube.com/watch?v=k4EkJgY9P4c&list=PLsyeobzWxl7r2ZX1fl-7CKnayxHJA_1ol&index=6

    public static void main(String[] args) {
//        Phone phone = new Phone("Android", 2, "Qualcomm", 5.5, 3100);

        Phone phone = new PhoneBuilder().setOs("Android").setRam(3).setBattery(5000).getPhone();
        System.out.println(phone);
    }

}
