package pl.coderslab;

import java.sql.*;
import java.time.LocalDateTime;

public class OperationsDAO {
    private static final String CREATE_OPERATION_QUERY =
            "INSERT INTO operations (FIRST_NAME, LAST_NAME, OPERATION) VALUE (?, ?, ?)";

    public Customer create(Customer customer) {
        try (Connection conn = DBUtil.getConnection()) {
            PreparedStatement statement =
                    conn.prepareStatement(CREATE_OPERATION_QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, customer.getFirstName());
            statement.setString(2, customer.getLastName());
            statement.setString(3, LocalDateTime.now() + " Customer operation");
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                customer.setId(resultSet.getInt(1));
            }
            return customer;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
