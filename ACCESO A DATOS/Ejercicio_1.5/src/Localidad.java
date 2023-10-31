import java.io.Serializable;

public class Localidad implements Serializable {
    String id;
    String latitude;
    String longitude;
    String elevation;
    String name;
    String url;
    String year;

    public Localidad(String latitude, String longitude, String elevation, String name, String url, String year) {

        this.latitude = latitude;
        this.longitude = longitude;
        this.elevation = elevation;
        this.name = name;
        this.url = url;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  "\n-------------------------------------------------------------------------------------------------------------------\n"+
                " | " + latitude + " | " + longitude + " | " + elevation +" | " + name +" | " + url +" | " + year + " | "+'\n' +
                "-------------------------------------------------------------------------------------------------------------------\n"
                ;

    }
}
