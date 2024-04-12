package departments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Department {
    private int departmentId;
    private String departmentName;

    public Department(int id, String name) {
        this.departmentId = id;
        this.departmentName = name;
    }

    public static void main(String[] args) {
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/departments", "rukku",
                    " ");

            String query = "INSERT INTO department (id, name) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            Department department1 = new Department(1, "ECE");
            Department department2 = new Department(2, "IT");

            preparedStatement.setInt(1, department1.getDepartmentId());
            preparedStatement.setString(2, department1.getDepartmentName());
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, department2.getDepartmentId());
            preparedStatement.setString(2, department2.getDepartmentName());
            preparedStatement.executeUpdate();

            System.out.println("Department objects have been successfully stored in the database.");

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
