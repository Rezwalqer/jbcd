package jdbc;

import jdbc.dao.CityDAO;
import jdbc.dao.CityDAOImpl;
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


        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        CityDAO cityDAO = new CityDAOImpl();

        City city = new City("Санкт-Петербург");
//        cityDAO.create(city);
//        Employee employee = new Employee("Светлана", "Суркова", "female", 23, city);
        City city1 = cityDAO.getById(6);
//        employee.setCity(city1);
//        employeeDAO.create(employee);
        cityDAO.delete(city1);
    }
}

