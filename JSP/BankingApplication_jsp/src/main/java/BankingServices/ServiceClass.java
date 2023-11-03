package BankingServices;

import com.example.banking_application_jsp.BankAccount_details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ServiceClass {
    private Connection connection;
    int result;
    public ServiceClass() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Banking_application_JSP","root","shubham@123");
            System.out.println("connection established");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public int insertRecord(BankAccount_details bankAccountDetails) {
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement("insert into Bank_account(User_id,User_password,name,address,city,balance) values(?,?,?,?,?,?)");
        preparedStatement.setString(1,bankAccountDetails.getUserName());
        preparedStatement.setString(2,bankAccountDetails.getPassword());
        preparedStatement.setString(3,bankAccountDetails.getUserName());
        preparedStatement.setString(4,bankAccountDetails.getAddress());
        preparedStatement.setString(5,bankAccountDetails.getCity());
        preparedStatement.setInt(6,bankAccountDetails.getBalance());
        result = preparedStatement.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
        return result;

    }
}
