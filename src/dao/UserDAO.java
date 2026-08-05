package dao;

import database.DatabaseConnection;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    public void saveUser(User user) {

        String sql = "INSERT INTO users(name, age, gender, height, weight, goal, fitness_level, equipment, activity_level, bmi, bmi_category, bmr, tdee, water_intake) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection connection = DatabaseConnection.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, user.getName());
            ps.setInt(2, user.getAge());
            ps.setString(3, user.getGender());
            ps.setDouble(4, user.getHeight());
            ps.setDouble(5, user.getWeight());
            ps.setString(6, user.getGoal());
            ps.setString(7, user.getFitnesslevel());
            ps.setString(8, user.getEquipment());
            ps.setString(9, user.getActivitylevel());
            ps.setDouble(10, user.getBmi());
            ps.setString(11, user.getBmiCategory());
            ps.setDouble(12, user.getBmr());
            ps.setDouble(13, user.getTdee());
            ps.setDouble(14, user.getWaterIntake());

            ps.executeUpdate();

            System.out.println("User saved to database successfully!");

            ps.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<User> getAllUsers() {

        List<User> users = new ArrayList<>();

        String sql = "SELECT * FROM users";

        try {
            Connection connection = DatabaseConnection.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                User user = new User();

                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                user.setGender(rs.getString("gender"));
                user.setHeight(rs.getDouble("height"));
                user.setWeight(rs.getDouble("weight"));

                user.setGoal(rs.getString("goal"));
                user.setFitnesslevel(rs.getString("fitness_level"));
                user.setEquipment(rs.getString("equipment"));
                user.setActivitylevel(rs.getString("activity_level"));

                user.setBmi(rs.getDouble("bmi"));
                user.setBmiCategory(rs.getString("bmi_category"));
                user.setBmr(rs.getDouble("bmr"));
                user.setTdee(rs.getDouble("tdee"));
                user.setWaterIntake(rs.getDouble("water_intake"));

                users.add(user);
            }

            rs.close();
            ps.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
    public User searchUserById(int id) {

        String sql = "SELECT * FROM users WHERE id = ?";

        try {
            Connection connection = DatabaseConnection.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                User user = new User();

                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                user.setGender(rs.getString("gender"));
                user.setHeight(rs.getDouble("height"));
                user.setWeight(rs.getDouble("weight"));

                user.setGoal(rs.getString("goal"));
                user.setFitnesslevel(rs.getString("fitness_level"));
                user.setEquipment(rs.getString("equipment"));
                user.setActivitylevel(rs.getString("activity_level"));

                user.setBmi(rs.getDouble("bmi"));
                user.setBmiCategory(rs.getString("bmi_category"));
                user.setBmr(rs.getDouble("bmr"));
                user.setTdee(rs.getDouble("tdee"));
                user.setWaterIntake(rs.getDouble("water_intake"));

                rs.close();
                ps.close();
                connection.close();

                return user;
            }

            rs.close();
            ps.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    public void updateUser(User user) {

        String sql = "UPDATE users SET name=?, age=?, gender=?, height=?, weight=?, goal=?, fitness_level=?, equipment=?, activity_level=?, bmi=?, bmi_category=?, bmr=?, tdee=?, water_intake=? WHERE id=?";

        try {
            Connection connection = DatabaseConnection.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, user.getName());
            ps.setInt(2, user.getAge());
            ps.setString(3, user.getGender());
            ps.setDouble(4, user.getHeight());
            ps.setDouble(5, user.getWeight());
            ps.setString(6, user.getGoal());
            ps.setString(7, user.getFitnesslevel());
            ps.setString(8, user.getEquipment());
            ps.setString(9, user.getActivitylevel());
            ps.setDouble(10, user.getBmi());
            ps.setString(11, user.getBmiCategory());
            ps.setDouble(12, user.getBmr());
            ps.setDouble(13, user.getTdee());
            ps.setDouble(14, user.getWaterIntake());

            ps.setInt(15, user.getId());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("User updated successfully!");
            } else {
                System.out.println("User not found.");
            }

            ps.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean deleteUser(int id) {

        String sql = "DELETE FROM users WHERE id = ?";

        try {
            Connection connection = DatabaseConnection.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            ps.close();
            connection.close();

            return rows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}