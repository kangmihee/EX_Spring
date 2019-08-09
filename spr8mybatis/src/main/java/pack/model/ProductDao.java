package pack.model;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pack.resource.SqlMapConfig;

 

public class ProductDao implements DaoInter{
      private SqlSessionFactory factory = SqlMapConfig.getSqlSession();

      public List<ProductDto> selectDataAll() {
            SqlSession session = factory.openSession();
            List<ProductDto> list = null; // 읽을 려고 list준비     

            try {
                  list = session.selectList("selectDataAll"); // 여러개 가져올 때는 selectList, 한개 가져올 때는 selectone
            } catch (Exception e) {
                  System.out.println("selectDataAll err : " + e);
            } finally{
                  if(session != null) session.close();
            }
            
            return list;
      }
}
