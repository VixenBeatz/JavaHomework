import java.util.Objects;

public class Bus {
    protected String type;

    public Bus(String type) {
        this.type = type != null ? type : "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Objects.equals(type, bus.type);
    }
}
