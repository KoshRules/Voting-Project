public class UserInfo {




    /**
     * User Class
     *
     */

    private String ssn;
    private String name;
    private String streetAddress;
    private String zipcode;
    private String country;
    private String state;
    private String mail;
    private String phone;

    /** User Constructor
     * @param username - social security number; this will take in the ssn that is provided by the user
     *                 to be permanently assigned as the username for access by the user
     * @param nameIn - this is the persons name
     * @param streetAddressIn- street name
     * @param zipcodeIn - 5 digit zip
     * @param countryIn - country of residence
     * @param stateIn
     * @param mailIn
     * @param phoneIn
     */
    public UserInfo(String username, String nameIn, String streetAddressIn, String zipcodeIn, String countryIn, String stateIn, String mailIn, String phoneIn)
    {
        if (Utilities.onlyContainsNumbers(username)) this.ssn = username;
        else this.ssn = "invalid entry";

        this.name = nameIn;

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
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String username) {
        this.ssn = username;
    }

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
