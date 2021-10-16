import java.util.Objects;

public class Quest {
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public short getB() {
        return b;
    }

    public void setB(short b) {
        this.b = b;
    }

    public Quest() {
        a = 299999999;
        b = 128;
    }

    private int a;
    private short b;

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB());
    }
}
