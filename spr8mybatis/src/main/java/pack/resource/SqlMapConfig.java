package pack.resource;

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapConfig {
      public static SqlSessionFactory sqlSession;

      static {
            String resource = "pack/resource/Configuration.xml";
            // Configuration.xml 에 있는 정보를 sqlSession에게 내용 전달
            try {
                  Reader reader = Resources.getResourceAsReader(resource);
                  sqlSession = new SqlSessionFactoryBuilder().build(reader);
                  reader.close();
            } catch (Exception e) {
                  System.out.println("SqlMapConfig 오류 : " + e);
            }
      }
      
      public static SqlSessionFactory getSqlSession() {
            return sqlSession;
      }
}
