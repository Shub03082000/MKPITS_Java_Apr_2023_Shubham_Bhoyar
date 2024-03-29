package BankingServices;

import com.example.banking_application_jsp.Admin;
import com.example.banking_application_jsp.BankAccount_details;
import com.example.banking_application_jsp.LogDetails;
import com.example.banking_application_jsp.Transactions;

import java.sql.*;
import java.sql.Date;


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
            preparedStatement = connection.prepareStatement("insert into Bank_account(User_id,User_password,name,address,city,balance,Created_on) values(?,?,?,?,?,?,?)");
        preparedStatement.setString(1,bankAccountDetails.getUserName());
        preparedStatement.setString(2,bankAccountDetails.getPassword());
        preparedStatement.setString(3,bankAccountDetails.getName());
        preparedStatement.setString(4,bankAccountDetails.getAddress());
        preparedStatement.setString(5,bankAccountDetails.getCity());
        preparedStatement.setInt(6,bankAccountDetails.getBalance());
        preparedStatement.setTimestamp(7,bankAccountDetails.getCreatedOn());

        result = preparedStatement.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
        return result;

    }

    public ResultSet loginAccount(BankAccount_details bankAccountDetails){
        ResultSet resultSet=null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Bank_account where User_id=? and User_password=?");
            preparedStatement.setString(1,bankAccountDetails.getUserName());
            preparedStatement.setString(2,bankAccountDetails.getPassword());
            resultSet = preparedStatement.executeQuery();

        }catch (Exception e){
            System.out.println(e);
        }
        return resultSet;
    }

    public int depositAmount(BankAccount_details bankAccountDetails, Transactions transactions){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update Bank_account set Balance=Balance+? where User_id=?");
            preparedStatement.setInt(1,bankAccountDetails.getBalance());
            preparedStatement.setString(2, bankAccountDetails.getUserName());
            result = preparedStatement.executeUpdate();


        }catch (Exception e){
            System.out.println(e);
        }
        if(result!=0){
            try {
                PreparedStatement preparedStatement1 = connection.prepareStatement("insert into Transaction_details values(?,?,?,?)");
                preparedStatement1.setString(1, transactions.getUserId());
                preparedStatement1.setDate(2, transactions.getDate());
                preparedStatement1.setInt(3, transactions.getBalance());
                preparedStatement1.setString(4, transactions.getTransactionType());
                result = preparedStatement1.executeUpdate();
            }catch (Exception e){
                System.out.println(e);
            }
        }
        return result;
    }

    public int withdrawAmount(BankAccount_details bankAccountDetails,Transactions transactions){
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("update Bank_account set Balance = Balance - ? where User_id=?");
            preparedStatement.setInt(1,bankAccountDetails.getBalance());
            preparedStatement.setString(2,bankAccountDetails.getUserName());
            result = preparedStatement.executeUpdate();
        }catch (Exception e){
            System.out.println(e);
        }
        if(result!=0){
            try{
                PreparedStatement preparedStatement = connection.prepareStatement("insert into Transaction_details values(?,?,?,?)");
                preparedStatement.setString(1,transactions.getUserId());
                preparedStatement.setDate(2,transactions.getDate());
                preparedStatement.setInt(3,transactions.getBalance());
                preparedStatement.setString(4,transactions.getTransactionType());
                result = preparedStatement.executeUpdate();
            }catch (Exception e){
                System.out.println(e);
            }
        }
        return result;
    }

    public int transferReduceAmount(Transactions transactions1, String user_id){
        //Insert Transactions details in transaction table
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Transaction_details values(?,?,?,?)");
            preparedStatement.setString(1,transactions1.getTransfer_id());
            preparedStatement.setDate(2,transactions1.getDate());
            preparedStatement.setInt(3,transactions1.getBalance());
            preparedStatement.setString(4,"Out");
            result = preparedStatement.executeUpdate();

        }catch (Exception e){
            System.out.println(e);
        }
        if(result!=0) {
            try {
                PreparedStatement preparedUpdateStatement = connection.prepareStatement("update Bank_account set Balance = Balance - ? where User_id=?");
                preparedUpdateStatement.setInt(1, transactions1.getBalance());
                preparedUpdateStatement.setString(2, transactions1.getTransfer_id());
                result = preparedUpdateStatement.executeUpdate();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        if(result!=0){
            try{
                PreparedStatement preparedStatement = connection.prepareStatement("insert into Transaction_details values(?,?,?,?)");
                preparedStatement.setString(1,user_id);
                preparedStatement.setDate(2,transactions1.getDate());
                preparedStatement.setInt(3,transactions1.getBalance());
                preparedStatement.setString(4,"In");
                result = preparedStatement.executeUpdate();
            }catch (Exception e){
                System.out.println(e);
            }
        }
        if(result!=0){
            try{
                PreparedStatement preparedUpdateStatement1 = connection.prepareStatement("update Bank_account set Balance = Balance + ? where User_id=?");
                preparedUpdateStatement1.setInt(1,transactions1.getBalance());
                preparedUpdateStatement1.setString(2,user_id);
                result = preparedUpdateStatement1.executeUpdate();

            }catch (Exception e){
                System.out.println(e);
            }
        }
        return result;
    }

    public ResultSet displayRecord(Transactions transactions){
        ResultSet resultSet=null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select Transaction_date,Amount,Transaction_type from Transaction_details where UserId=?");
            preparedStatement.setString(1,transactions.getUserId());
            resultSet = preparedStatement.executeQuery();
        }catch (Exception e){
            System.out.println(e);
        }
        return resultSet;
    }

    public ResultSet adminLogin(Admin admin){
        ResultSet resultSet = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from AdminTable where UserId=? and admin_password=?");
            preparedStatement.setString(1,admin.getAdminUsername());
            preparedStatement.setString(2,admin.getAdminPassword());
            resultSet = preparedStatement.executeQuery();
        }catch (Exception ex){
            System.out.println(ex);
        }
        return resultSet;
    }

    public ResultSet displayRecord(BankAccount_details bankAccountDetails){
        ResultSet resultSet = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select User_id,Created_on,is_Approved from Bank_account where is_Approved='false'");
            resultSet= preparedStatement.executeQuery();

        }catch (Exception ex){
            System.out.println(ex);
        }
        return resultSet;
    }

    public ResultSet displayIndividualRecord(String userId){
        ResultSet resultSet=null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Bank_account where User_id=?");
            preparedStatement.setString(1,userId);
            resultSet = preparedStatement.executeQuery();
        }catch (Exception ex){
            System.out.println(ex);
        }
        return resultSet;
    }

    public int approvedRegistration(BankAccount_details bankAccountDetails, String userID){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update Bank_account set Approved_at=?, Approved_by=?, is_Approved='true' where User_id=?");
            preparedStatement.setString(3,userID);
            preparedStatement.setTimestamp(1,bankAccountDetails.getApproved_at());
            preparedStatement.setString(2,bankAccountDetails.getApproved_by());
            result = preparedStatement.executeUpdate();
        }catch (Exception ex){
            System.out.println(ex);
        }
        return result;
    }

    public int displayLogDetails(LogDetails logDetails){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into log values(?,?,?)");
            preparedStatement.setTimestamp(1,logDetails.getLogTime());
            preparedStatement.setString(2, logDetails.getTask());
            preparedStatement.setString(3, logDetails.getUserId());
            result = preparedStatement.executeUpdate();
        }catch (Exception ex){
            System.out.println(ex);
        }
        return result;
    }

}
