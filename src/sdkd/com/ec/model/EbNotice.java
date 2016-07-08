package sdkd.com.ec.model;

import java.util.Date;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * Created  on 2016/7/7.
 */
public class EbNotice {
    private Integer eba_id;
    private String eba_title;
    private String eba_text;
    private Date  eba_time;

    public Integer getEba_id() {
        return eba_id;
    }

    public void setEba_id(Integer eba_id) {
        this.eba_id = eba_id;
    }

    public String getEba_title() {
        return eba_title;
    }

    public void setEba_title(String eba_title) {
        this.eba_title = eba_title;
    }

    public String getEba_text() {
        return eba_text;
    }

    public void setEba_text(String eba_text) {
        this.eba_text = eba_text;
    }

    public Date getEba_time() {
        return eba_time;
    }

    public void setEba_time(Date eba_time) {
        this.eba_time = eba_time;
    }

    //@Override
//    public String toString() {
//        return "EbNotice{" +
//                "eba_id=" + eba_id +
//                ", eba_title='" + eba_title + '\'' +
//                ", eba_text='" + eba_text+ '\'' +
//                '}';
//    }
}
