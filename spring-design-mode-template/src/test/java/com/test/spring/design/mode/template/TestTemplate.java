package com.test.spring.design.mode.template;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/5 12:25
 */
public class TestTemplate {
    public static  void main(String[] args){
        Coffee coffee = new Coffee();
        coffee.create();
    }

    // SpringJDBC用的是模板模式
    // 是java规范，各个数据库厂商自己去实现
    // 1、 加载驱动类DriverManager
    // 2、 建立连接
    // 3、 创建语句集（标准语句集、预处理语句集） (语句集不确定MySql、Oracle、SqlServer、Access)
    // 4、 执行语句集
    // 5、 结果集ResultSet 游标
    // 6、 ORM
}
