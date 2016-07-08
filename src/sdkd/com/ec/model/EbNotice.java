package sdkd.com.ec.model;

/**
 * Created by sdust on 2016/7/7.
 */
public class EbNotice {
    private int eno_id;
    private String eno_title;
    private String eno_content;

    public int getEno_id() {
        return eno_id;
    }

    public void setEno_id(int eno_id) {
        this.eno_id = eno_id;
    }

    public String getEno_content() {
        return eno_content;
    }

    public void setEno_content(String eno_content) {
        this.eno_content = eno_content;
    }

    public String getEno_title() {
        return eno_title;
    }

    public void setEno_title(String eno_title) {
        this.eno_title = eno_title;
    }

    @Override
    public String toString() {
        return "EbNotice{" +
                "eno_id=" + eno_id +
                ", eno_title='" + eno_title + '\'' +
                ", eno_content='" + eno_content + '\'' +
                '}';
    }
}
