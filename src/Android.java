import java.lang.String;
public class Android extends Mobile
{
    public Android(String manufacture, String operating_system, String model, double cost)
    {
        super(manufacture, operating_system, model, cost);
    }

    public Android(String manufacture, String operating_system) {
        super(manufacture, operating_system);
    }
}
