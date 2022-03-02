package bookmanager;

public class Publisher {

    String name;
    String city;

    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}