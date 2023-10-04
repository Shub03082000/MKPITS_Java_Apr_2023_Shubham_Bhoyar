import DBConnectivity.DabaseConnectivity;

import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Insert data \n 2 - Display data \n 3 - Delete data");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Insert employeId,name,age,mobileNo,address,city");
                String employeeId=scanner.next();
                String name=scanner.next();
                String age=scanner.next();
                String mobileNo=scanner.next();
                String address=scanner.next();
                String city=scanner.next();
                DabaseConnectivity.insertData(employeeId,name,age,mobileNo,address,city);
                break;
            case 2:
                DabaseConnectivity.displayData();
                break;
            case 3:
                System.out.println("Enter employeeId to delete record");
                String emplyeeId=scanner.next();
                DabaseConnectivity.deleteData(emplyeeId);
                break;
        }

//        try {
//            //driver loader
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Driver loaded");
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_details","root","shubham@123");
//            System.out.println("connection established");
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from employee");
//            while (resultSet.next()){
//                System.out.println(resultSet.getString(1)+ " " + resultSet.getString(2) + " " +
//                        resultSet.getString(3) + " " + resultSet.getString(4) + " " +
//                        resultSet.getString(5) + " " + resultSet.getString(6));
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
}