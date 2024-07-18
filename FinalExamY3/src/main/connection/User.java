package main.connection;

import main.service.MySqlService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String id, lastName, firstName, phone;

    public User() {

        id = "";
        lastName = "";
        firstName = "";
        phone = "";
    }

    public User(String fullName, String email, String gender, String dateOfBirth, String phone) {
        setId(id);
        setLastName(lastName);
        setFirstName(firstName);
        setPhone(phone);
    }


    public static List<User> getUser() {
        List<User> toDoList = new ArrayList<>();
        String sql = "SELECT id, lastName, lastName phonecontact FROM customer;";

        MySqlService mySqlService = new MySqlService();
        mySqlService.openConnection();
        Statement statement = mySqlService.getStatement();
        try {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                toDoList.add(new User(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5)
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        mySqlService.closeConnection();
        return toDoList;
    }

    public String getId() {
        return id;
    }

    public void setId(String name) {
        this.id = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}


