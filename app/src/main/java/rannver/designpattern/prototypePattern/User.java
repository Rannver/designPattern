package rannver.designpattern.prototypePattern;


/**
 * Created by Rannver on 2018/3/15.
 * 用户实体类
 */

public class User implements Cloneable {

    private int age;
    private String name;
    private String phone;
    private Address address;

    @Override
    public String toString() {
        return "User: "+name+", "+age+"," +phone+", ("+address.toString()+")";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * 反回已登录用户的拷贝
     * @return
     */
    @Override
    protected User clone()  {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
