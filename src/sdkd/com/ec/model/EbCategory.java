package sdkd.com.ec.model;

/**
 * Created  on 2016/7/7.
 */
public class EbCategory {
    private int epc_id;
    private String epc_name;
    private int epc_parent_id;

    public int getEpc_id() {
        return epc_id;
    }

    public void setEpc_id(int epc_id) {
        this.epc_id = epc_id;
    }

    public int getEpc_parent_id() {
        return epc_parent_id;
    }

    public void setEpc_parent_id(int epc_parent_id) {
        this.epc_parent_id = epc_parent_id;
    }

    public String getEpc_name() {
        return epc_name;
    }

    public void setEpc_name(String epc_name) {
        this.epc_name = epc_name;
    }
}
