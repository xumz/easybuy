package sdkd.com.ec.model;
import java.util.Date;
/**
 * 用户表
 * Created  on 2016/7/5.
 */
public class EbUser {
    private String euId;
    private String euName;
    private String euPassword;
    private String euSex;
    private String euBirthday;
    private String euIdCode;
    private String euEmail;
    private String euMobile;
    private String euAddress;
    private Integer euStatus;

    public String getEuId() {
        return euId;
    }

    public void setEuId(String euId) {
        this.euId = euId;
    }

    public String getEuName() {
        return euName;
    }

    public void setEuName(String euName) {
        this.euName = euName;
    }

    public String getEuPassword() {
        return euPassword;
    }

    public void setEuPassword(String euPassword) {
        this.euPassword = euPassword;
    }

    public String getEuSex() {
        return euSex;
    }

    public void setEuSex(String euSex) {
        this.euSex = euSex;
    }

    public String getEuBirthday() {
        return euBirthday;
    }

    public void setEuBirthday(String euBirthday) {
        this.euBirthday = euBirthday;
    }

    public String getEuIdCode() {
        return euIdCode;
    }

    public void setEuIdCode(String euIdCode) {
        this.euIdCode = euIdCode;
    }

    public String getEuEmail() {
        return euEmail;
    }

    public void setEuEmail(String euEmail) {
        this.euEmail = euEmail;
    }

    public String getEuMobile() {
        return euMobile;
    }

    public void setEuMobile(String euMobile) {
        this.euMobile = euMobile;
    }

    public String getEuAddress() {
        return euAddress;
    }

    public void setEuAddress(String euAddress) {
        this.euAddress = euAddress;
    }

    public Integer getEuStatus() {
        return euStatus;
    }

    public void setEuStatus(Integer euStatus) {
        this.euStatus = euStatus;
    }
}
