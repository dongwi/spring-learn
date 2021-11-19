package com.dong.mybatis.ch01;

import com.dong.mybatis.ch01.entity.TUser;
import com.dong.mybatis.ch01.mapper.TUserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Test01 {
    static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
//    static final String DB_URL = "jdbc:mysql://192.168.176.143:3306/test?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true";
    static final String DB_URL = "jdbc:mysql://192.168.78.129:3306/springdb?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true";

    static final String USER="root";
    static final String PASSWORD = "123456";

    @Test
    public void query() {
        Connection conn;
        Statement stmt;
        List<TUser> userList = new ArrayList<>();

        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("connection to database");
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            System.out.println("create statement");
            stmt = conn.createStatement();
            String userName = "dong";
            String sql = "SELECT * FROM t_user where user_name='" + userName + "'";
            ResultSet resultSet = stmt.executeQuery(sql);
            System.out.println(stmt.toString());

            while (resultSet.next()) {
                System.out.println("----------------------------------");
                TUser tUser = new TUser();
                tUser.setId(resultSet.getInt("id"));
                tUser.setUserName(resultSet.getString("user_name"));
                tUser.setRealName(resultSet.getString("real_name"));
                tUser.setMobile(resultSet.getString("mobile"));
                tUser.setNote(resultSet.getString("note"));
                System.out.println(tUser.toString());
                userList.add(tUser);
            }

            resultSet.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
        }
    }

    @Test
    public void preparedQuery() {
        Connection conn;
        PreparedStatement stmt;
        List<TUser> userList = new ArrayList<>();

        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("connection to database");
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            System.out.println("create statement");
            String userName = "dong";
            String sql = "SELECT * FROM t_user where user_name=?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, userName);
            System.out.println(stmt.toString());
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                System.out.println("----------------------------------");
                TUser tUser = new TUser();
                tUser.setId(resultSet.getInt("id"));
                tUser.setUserName(resultSet.getString("user_name"));
                tUser.setRealName(resultSet.getString("real_name"));
                tUser.setMobile(resultSet.getString("mobile"));
                tUser.setNote(resultSet.getString("note"));
                System.out.println(tUser.toString());
                userList.add(tUser);
            }

            resultSet.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
        }
    }

    @Test
    public void update() {
        Connection connection;
        PreparedStatement stmt;
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("connecting to database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            connection.setAutoCommit(false);
            String sql = "update t_user set mobile=? where user_name=?";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, "9876543210");
            stmt.setString(2, "dong");
            System.out.println(stmt.toString());
            int ret = stmt.executeUpdate();
            System.out.println("effect ret : " + ret);
            connection.commit();

            stmt.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Test
    public void quickStartMybatis() {
        SqlSessionFactory sqlSessionFactory;
        try (InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml")) {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        SqlSession sqlSession = sqlSessionFactory.openSession();
        TUserMapper mapper = sqlSession.getMapper(TUserMapper.class);
        TUser tUser = mapper.selectUserByPrimaryKey(1);
        System.out.println(tUser);
    }
}