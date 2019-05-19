package service;

import javax.jws.WebService;

@WebService(endpointInterface = "service.TempConverter")
public class TempConverterImpl implements TempConverter {
    @Override
    public double c2F(double degrees) {
        return (degrees - 32) * 5/9 + 32;
    }

    @Override
    public double f2C(double degrees) {
        return degrees * 9/5 + 32;
    }
}
