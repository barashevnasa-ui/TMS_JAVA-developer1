//@author Aliaksandra_Baranava

import java.util.Objects;

public class SystemUser implements Cloneable{
private Integer id;
private String login;
private String password;
private String userName;
private Region userRegion;

    public SystemUser(){}

    public SystemUser(Integer id, String password, String userName, String login, Region userRegion){
    this.id = id;
    this.userName = userName;
    this.password = password;
    this.login = login;
    this.userRegion = userRegion;
    }

    public SystemUser(SystemUser otherUser){
        this(otherUser.getID(), otherUser.getPassword(), otherUser.getUserName(), otherUser.getLogin(), otherUser.getUserRegion());
    }

    public SystemUser(SystemUser otherUser, boolean isDeep) {
        this.id = otherUser.id;
        this.login = otherUser.login;
        this.password = otherUser.password;
        this.userName = otherUser.userName;
        this.userRegion = new Region(otherUser.userRegion);
    }

    public void setID(Integer id) {this.id = id;}
    public void setUserName(String userName) {this.userName = userName;}
    public void setPassword(String password) {this.password = password;}
    public void setLogin(String login) {this.login = login;}
    public void setUserRegion(Region userRegion) {this.userRegion = userRegion;}

    public Integer getID() {return id;}
    public String getUserName() {return userName;}
    public String getPassword() {return password;}
    public String getLogin() {return login;}
    public Region getUserRegion() {return userRegion;}

    @Override
    public String toString() {
       return "Имя пользователя: " + userName + ", логин: " + login + ", язык: " + userRegion.language;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        SystemUser systemUser = (SystemUser) o;
        return Objects.equals(login, systemUser.login) &&
                Objects.equals(id, systemUser.id) &&
                Objects.equals(userName, systemUser.userName) &&
                Objects.equals(userRegion, systemUser.userRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, id, userName, userRegion);
    }

    public SystemUser clone(String option) throws CloneNotSupportedException {
        if (option.equalsIgnoreCase(CloneOption.SHALLOW)) {
            return new SystemUser(this);
        } else if (option.equalsIgnoreCase(CloneOption.DEEP)) {
            return new SystemUser(this, true);
        } else  throw new CloneNotSupportedException("Такой опции нет.");
    }
}
