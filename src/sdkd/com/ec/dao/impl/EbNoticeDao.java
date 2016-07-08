package sdkd.com.ec.dao.impl;

import sdkd.com.ec.dao.BaseDao;
import sdkd.com.ec.model.EbNotice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * Created  on 2016/7/7.
 */
public class EbNoticeDao  extends BaseDao {
    public List<EbNotice>  getNotice() {
        List<EbNotice> noticeList=new ArrayList<EbNotice>();
       String sql="select * from easybuy_annuncement order by eba_time desc limit 0,2";
        try {
            ResultSet rs=this.executeSearch(sql,null);
            while (rs.next()){
                EbNotice notice=new EbNotice();
                notice.setEba_id(rs.getInt("eba_id"));
                notice.setEba_title(rs.getString("eba_title"));
                noticeList.add(notice);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return noticeList;
    }
}
