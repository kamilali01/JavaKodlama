package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

//DAL-data access layer == DAO-data access object
public class JdbcProductDao implements ProductDao {
    public void add(Product product) {
        //sadece db erisim kodlari buraya yazilir... SQL
        System.out.println("JDBC ile varitabanina eklendi");
    }
}

//JDBC
//Hibernate