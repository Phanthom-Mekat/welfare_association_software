
package main_pkg;
import java.io.Serializable;

public class Workers implements Serializable{
    private String name;
    private int phonenumber;
    private String details;
    private String clientType;
    private String gender;

    public Workers(String name, int phonenumber, String details, String clientType, String gender) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.details = details;
        this.clientType = clientType;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Workers{" + "name=" + name + ", phonenumber=" + phonenumber + ", details=" + details + ", clientType=" + clientType + ", gender=" + gender + '}';
    }

}

