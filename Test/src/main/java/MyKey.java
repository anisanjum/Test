/*public class MyKey {
    private int id;

    public MyKey(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyKey myKey = (MyKey) o;
        return id == myKey.id;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}*/

import java.util.Random;

public class MyKey {

    private int id ;

    public MyKey(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyKey myKey = (MyKey) o;
        return id == myKey.id;
    }

    @Override
    public int hashCode() {
        return new Random().nextInt();
    }

}