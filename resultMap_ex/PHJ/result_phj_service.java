package com.ict.resultMap.phj;

import com.ict.resultMap.phj.result_phj_map;
import com.ict.resultMap.phj.result_phj_user;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class result_phj_service {
    private final SqlSessionFactory sqlSessionFactory;
    
    static private SqlSessionFactory factory;
	// config.xml 위치
	static String resource = "com/ict/resultMap/phj/result_phj.xml";
	
    public result_phj_service() {
    	try {
			InputStream in = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(in);
		} catch (Exception e) {
			System.out.println(e);
		}
    	
        this.sqlSessionFactory = factory;
    }

    public result_phj_user getUserById(int id) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
        	result_phj_map mapper = session.getMapper(result_phj_map.class);
            return mapper.getUserById(id); // resultMap 적용된 결과 반환
        }
    }
}
