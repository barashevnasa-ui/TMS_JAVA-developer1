//@author Aliaksandra_Baranava

public class Region implements Cloneable{
    public String country;
    public String language;
    public Integer timeZone;

    public Region(String country, String language, Integer timeZone){
        this.language = language;
        this.country = country;
        this.timeZone = timeZone;
    }

    public Region(Region otherRegion) {
        this.country = otherRegion.country;
        this.language = otherRegion.language;
        this.timeZone = otherRegion.timeZone;
    }

    @Override
    public Region clone() throws CloneNotSupportedException {
        return (Region) super.clone();
    }
}
