package domain;

import java.util.Set;

public class Spa {
    private String spaName,location;

    public Spa(){}

    private Spa(Builder builder)
    {
        this.spaName = builder.spaName;
        this.location = builder.location;

    }

    public String getSpaName()
    {
        return spaName;
    }

    public String getLocation()
    {
        return location;
    }

    public static class Builder{
        private String spaName, location;
        //private Set<Spa> spa;

        public Builder spaName(String spaName){
            this.spaName = spaName;
            return this;
        }

        public Builder location(String location){
            this.location = location;
            return this;
        }

        public Spa build(){
            return new Spa(this);
        }
    }

    public String toString(){
        return"Spa{" +
                "spaName='" +spaName+ '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
