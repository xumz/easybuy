package sdkd.com.ec.dao.impl;

import sdkd.com.ec.dao.BaseDao;
import sdkd.com.ec.model.EbProduct;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 韩爽 on 2016/7/7.
 */
public class EbProductDao extends BaseDao {
    public List<EbProduct> getProduct(){
        List<EbProduct> productList=new ArrayList<EbProduct>();
        String sql="select * from easybuy_product order by epc_id desc limit 0,8";
        ResultSet rs=this.executeSearch(sql,null);
        try {
            while (rs.next()){
                EbProduct product=new EbProduct();
                product.setEp_id(rs.getInt("ep_id"));
                product.setEp_name(rs.getString("ep_name"));
                product.setEp_description(rs.getString("ep_description"));
                product.setEp_price(rs.getDouble("ep_price"));
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return productList;
    }
}
