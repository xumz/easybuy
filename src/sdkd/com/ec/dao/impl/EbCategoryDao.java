package sdkd.com.ec.dao.impl;

import sdkd.com.ec.dao.BaseDao;
import sdkd.com.ec.model.EbCategory;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2016/7/7.
 */
public class EbCategoryDao extends BaseDao {
      public List<EbCategory> getCategory(){
        List<EbCategory> categoryList=new ArrayList<EbCategory>();
          String sql="select * from easybuy_product_category";
          try {
              ResultSet rs=this.executeSearch(sql,null);
              while(rs.next()){
                  EbCategory category=new EbCategory();
                  category.setEpc_id(rs.getInt("epc_id"));
                  category.setEpc_name(rs.getString("epc_name"));
                  category.setEpc_parent_id(rs.getInt("epc_parent_id"));
                  categoryList.add(category);
              }
          } catch (Exception e) {
              e.printStackTrace();
          } finally {
          }
          return categoryList;
      }
}
