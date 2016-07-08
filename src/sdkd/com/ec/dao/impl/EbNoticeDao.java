package sdkd.com.ec.dao.impl;

import sdkd.com.ec.dao.BaseDao;
import sdkd.com.ec.model.EbNotice;

import java.sql.ResultSet;
import java.util.*;

/**
 * Created by sdust on 2016/7/7.
 */
public class EbNoticeDao  extends BaseDao {
    public List<EbNotice>  getNews() {
        List<EbNotice> noticeList=new ArrayList<EbNotice>();
       String sql="select * from easybuy_notice order by eno_create_time desc limit 0,7";
        try {
            ResultSet rs=this.executeSearch(sql,null);
            while (rs.next()){
                EbNotice n=new EbNotice();
                n.setEno_id(rs.getInt("eno_id"));
                n.setEno_title(rs.getString("eno_title"));
                noticeList.add(n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }


        return noticeList;
    }
}
