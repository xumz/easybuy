package sdkd.com.ec.dao.impl;

import sdkd.com.ec.dao.BaseDao;
import  sdkd.com.ec.model.EbUser;
import java.sql.*;

/**
 * 用户DAO
 * Created by SDUST-132 on 2016/7/5.
 */
public class EbUserDao extends BaseDao{

    public EbUser getUser(String ID) {
        EbUser user = null;
        String sql = "select eu_user_id,eu_password from easybuy_user";
        try {
            ResultSet rs = this.executeSearch(sql, null);
            while (rs.next())
            {
                if(rs.getString("eu_user_id").equals(ID))
                {
                    user=new EbUser();
                    user.setEuId(ID);
                    user.setEuPassword(rs.getString("eu_password"));
                    user.setEuStatus(1);
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public int setUser(EbUser user){
        String sql="insert into easybuy_user（eu_user_id,eu_password，eu_status) values（"+user.getEuId()+"，"+user.getEuPassword()+"，"+user.getEuStatus()+"）";
        int res=this.exeucteModify(sql,null);
        return res;
    }

    public boolean IsExistId(String ID)
    {
        String sql = "select eu_user_id from easybuy_user";
        String id;
        boolean IsExist=false;
        try {
            ResultSet rs = this.executeSearch(sql,null);
            while (rs.next()){
                id=rs.getString("eu_user_id");
                if(id.equals(ID))
                {
                    IsExist=true;
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return IsExist;
    }

}
