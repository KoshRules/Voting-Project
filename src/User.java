public class User {


    /**
     * User Class
     *
     */

    private String name;
    private String streetAddress;
    private String zipcode;
    private String country;
    private String state;
    private String mail;
    private String phone;

    public User(String nameIn, String streetAddressIn, String zipcodeIn, String countryIn, String stateIn, String mailIn, String phoneIn)
    {
        if (Utilities.max30Chars(nameIn)) this.name = nameIn;
        else this.name = nameIn.substring(0, 30);

        this.streetAddress = streetAddressIn;
        //else this.streetAddress = streetAddressIn;

        if (Utilities.onlyContainsNumbers(zipcodeIn)) this.zipcode = zipcodeIn;
        else this.zipcode = "unknown";

        this.country = countryIn;
        //else this.country = countryIn;

        this.state = stateIn;
        //else this.state = stateIn;

        if (Utilities.validEmail(mailIn)) this.mail = mailIn;
        else this.mail = "Invalid format email";

        if (Utilities.onlyContainsNumbers(phoneIn)) this.phone = phoneIn;
        else this.phone = "unknown";
    }

    /**
     * Getters & Setters
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
