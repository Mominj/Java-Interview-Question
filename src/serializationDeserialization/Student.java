package serializationDeserialization;

import java.io.Serializable;

public class Student implements Serializable {

    private static final Long serialVersionUID = 1234132412L;

    private String name;
    private String addrress;
    private transient Integer roll;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getAddrress() {return addrress;}

    public void setAddrress(String addrress) {this.addrress = addrress;}

    public Integer getRoll() {return roll;}

    public void setRoll(Integer roll) {
        this.roll = roll;
    }
}
