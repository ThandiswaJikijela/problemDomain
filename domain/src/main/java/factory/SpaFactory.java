package factory;

import domain.Spa;

public class SpaFactory {
    public static Spa getSpa(String spaName,String location) {
        return new Spa.Builder().spaName(spaName)
                .location(location)
                .build();
    }
}
