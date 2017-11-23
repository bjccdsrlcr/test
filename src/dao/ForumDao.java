package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Author: bjccdsrlcr
 * Date: 2017/11/23 0023
 * Time: 14:08
 */
@Repository
public class ForumDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void initDao(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dao/dao.xml");
        jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "select * from t_user";
        jdbcTemplate.execute(sql);
    }
}
