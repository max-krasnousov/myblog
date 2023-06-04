package my.sumdu.blog.dao;

import org.apache.log4j.Logger;
import my.sumdu.blog.entities.User;
import my.sumdu.blog.tools.exceptions.WrongEntityIdException;
import my.sumdu.blog.tools.exceptions.WrongLoginDataException;
import my.sumdu.blog.tools.strings.SQLRequests;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.sql.Types;

@Repository
public class DAOUser extends OracleConnection {

    private static final Logger logger = Logger.getLogger(DAOUser.class);

    public User getUserById(String id) throws WrongEntityIdException {
        try {
            connect();
            statement = connection.prepareStatement(
                    SQLRequests.USER_BY_ID.getQuery());

            statement.setInt(1, Integer.parseInt(id));
            result = statement.executeQuery();
            if(result.next()) {
                return User.parse(result);
            } else {
                throw new WrongEntityIdException("desc ");
            }
        } catch (SQLException | WrongEntityIdException e) {
            logger.warn(e);
            throw new WrongEntityIdException("desc ", e);
        } finally {
            disconnect();
        }
    }

    public boolean isExistUserByEmail(String email) throws SQLException {
        try {
            connect();
            statement = connection.prepareStatement(
                    SQLRequests.EXIST_USER_BY_EMAIL.getQuery());

            statement.setString(1, email);
            result = statement.executeQuery();
            return result.next();
        } catch (SQLException e) {
            logger.warn(e);
            throw new SQLException("desc ", e);
        } finally {
            disconnect();
        }
    }

    public User getUserByEmailAndPassword(String email, String password) throws WrongLoginDataException {
        try {
            connect();
            statement = connection.prepareStatement(
                    SQLRequests.USER_BY_EMAIL_AND_PASSWORD.getQuery());

            statement.setString(1, email);
            statement.setString(2, password);

            result = statement.executeQuery();
            if(result.next()) {
                return User.parse(result);
            } else {
                throw new WrongLoginDataException("desc ");
            }
        } catch (SQLException | WrongLoginDataException e) {
            logger.warn(e);
            throw new WrongLoginDataException("desc ", e);
        } finally {
            disconnect();
        }
    }

    public void addUser(User user) throws SQLException {
        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.ADD_USER.getQuery());
            statement.setString(1, user.getEmail());
            statement.setString(2, user.getFirstName());
            statement.setString(3, user.getLastName());
            statement.setString(4, user.getPassword());
            statement.setString(5, user.getBirthday());
            statement.execute();
        } catch (SQLException e) {
            logger.warn(e);
            throw new SQLException("desc", e);
        } finally {
            disconnect();
        }
    }

    public void updateUserCommon(String userId, String firstName, String lastName, String birthday) throws SQLException {
        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.UPDATE_USER_COMMON.getQuery());
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, birthday);
            statement.setInt(4, Integer.parseInt(userId));
            statement.execute();
        } catch (SQLException e) {
            logger.warn(e);
            throw new SQLException("desc", e);
        } finally {
            disconnect();
        }
    }

    public void updateUser(User user) throws SQLException {
        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.UPDATE_USER_COMMON.getQuery());
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getBirthday());
            statement.setInt(4, Integer.parseInt(user.getUserId()));
            statement.execute();
        } catch (SQLException e) {
            logger.warn(e);
            throw new SQLException("desc", e);
        } finally {
            disconnect();
        }
    }

    public void setResetToken(String userId, String token) throws SQLException {
        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.SET_RESET_PASSWORD_TOKEN.getQuery());
            if (token == null) {
                statement.setNull(1, Types.VARCHAR);
            } else {
                statement.setString(1, token);
            }
            statement.setInt(2, Integer.parseInt(userId));
            statement.execute();
        } catch (SQLException e) {
            logger.warn(e);
            throw new SQLException("desc", e);
        } finally {
            disconnect();
        }
    }

    public User getUserByToken(String token) throws WrongEntityIdException {
        try {
            connect();
            statement = connection.prepareStatement(
                    SQLRequests.GET_USER_BY_RESET_PASSWORD_TOKEN.getQuery());

            statement.setString(1, token);
            result = statement.executeQuery();
            if(result.next()) {
                return User.parse(result);
            } else {
                throw new WrongEntityIdException("desc ");
            }
        } catch (SQLException | WrongEntityIdException e) {
            logger.warn(e);
            throw new WrongEntityIdException("desc ", e);
        } finally {
            disconnect();
        }
    }

    public User getUserByEmail(String email) throws WrongEntityIdException {
        try {
            connect();
            statement = connection.prepareStatement(
                    SQLRequests.GET_USER_BY_EMAIL.getQuery());

            statement.setString(1, email);
            result = statement.executeQuery();
            if(result.next()) {
                return User.parse(result);
            } else {
                throw new WrongEntityIdException("desc ");
            }
        } catch (SQLException | WrongEntityIdException e) {
            logger.warn(e);
            throw new WrongEntityIdException("desc ", e);
        } finally {
            disconnect();
        }
    }

    public void setNewPassword(String userId, String password) throws SQLException {
        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.SET_NEW_PASSWORD.getQuery());
            statement.setString(1, password);
            statement.setInt(2, Integer.parseInt(userId));
            statement.execute();
        } catch (SQLException e) {
            logger.warn(e);
            throw new SQLException("desc", e);
        } finally {
            disconnect();
        }
    }

    public void deleteUserByEmail(String email) {
        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.DELETE_USER_BY_EMAIL.getQuery());
            statement.setString(1, email);
            statement.execute();
        } catch (SQLException e) {
            logger.warn(e);
        } finally {
            disconnect();
        }
    }
}
