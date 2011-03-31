/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pagesbeans;

/**
 *
 * @author islam
 */
public class SignUpBean {
String name;
String email;
String birthDay;
String adress;
String credit;
String job;
String interests;
String password;
String confirm;
String sex;
String nationality;
    public SignUpBean(){}
    public String getAdress() {
        return adress;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getConfirm() {
        return confirm;
    }

    public String getCredit() {
        return credit;
    }

    public String getEmail() {
        return email;
    }
    public String getInterests() {
        return interests;
    }

    public String getJob() {
        return job;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
}
