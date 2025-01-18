package hillel.hw;

public class PlaneFactory  extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
