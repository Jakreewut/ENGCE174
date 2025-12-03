public class address {
    private String street;
    private String city;
    private String zipCode;

    public address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String fullAddress() {
        return "[" + street +"],[" + city + "],[" + zipCode + "]";
    }
}
