package sdkd.com.ec.dao.impl;

import sdkd.com.ec.dao.BaseDao;
import sdkd.com.ec.model.EbProduct;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2016/7/7.
 */
public class EbHotProductDao extends BaseDao {
    public List<EbProduct> getHotProduct(){
        List<EbProduct> hotproductList=new ArrayList<EbProduct>();
        String sql="select * from easybuy_product order by epc_id asc limit 0,12";
        ResultSet rs=this.executeSearch(sql,null);
        try {
            while (rs.next()){
                EbProduct product=new EbProduct();
                product.setEp_id(rs.getInt("ep_id"));
                product.setEp_name(rs.getString("ep_name"));
                product.setEp_description(rs.getString("ep_description"));
                product.setEp_price(rs.getDouble("ep_price"));
                hotproductList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return hotproductList;
    }
}
