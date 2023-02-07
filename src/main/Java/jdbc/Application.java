package jdbc;

import jdbc.dao.EmployeeDAO;
import jdbc.dao.EmployeeDAOImpl;
import jdbc.model.City;
import jdbc.model.Employee;

import java.sql.*;

public class Application {
    public static void main(String[] args) throws SQLException {
        final String user = "postgres";
        final String pass = "153847320";
        final String url = "jdbc:postgresql://localhost:5432/skypro";
//        try (final Connection connection = DriverManager.getConnection(url, user, pass);
//             PreparedStatement statement = connection.prepareStatement(
//                     "SELECT * FROM employee WHERE id = (?)"
//             )) {
//            statement.setInt(1, 5);
//
//            final ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                String firstName = "First name: " + resultSet.getString("first_name");
//                String lastName = "Last name: " + resultSet.getString("last_name");
//                String gender = "gender: " + resultSet.getString("gender");
//                String age = "Age: " + resultSet.getInt(5);
//                System.out.println(firstName);
//                System.out.println(lastName);
//                System.out.println(age);
//                System.out.println(gender);
//            }
//
//        }
//        try (final Connection connection = DriverManager.getConnection(url, user, pass)) {
//            City city1 = new City(4, "Омск-Омск");
//            Employee employee1 = new Employee("Иванов", "Сергей", "male", 1, city1);
//            employeeDAO.create(employee1);
//            System.out.println(employeeDAO.getById(6));
//            System.out.println(employeeDAO.getAllEmployees());
//            employeeDAO.updateAgeById(8, 2);
//            employeeDAO.deleteById(8);

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        Employee employee = new Employee(10,"Иван", "Иванов", "male", 41, 1);
//        employeeDAO.create(employee);
//        System.out.println(employeeDAO.getById(10));
//        System.out.println(employeeDAO.getAllEmployees());
//        employeeDAO.updateById(new Employee(6, "Иван", "Иванов", "male", 42, 1));
        employeeDAO.deleteById(employee);

    }
}

