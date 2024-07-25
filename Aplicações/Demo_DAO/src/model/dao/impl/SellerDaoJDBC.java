package model.dao.impl;

import data.DataBaseControl;
import exception.DbGenericError;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;

public class SellerDaoJDBC implements SellerDao {

    private Connection connection = null;

    public SellerDaoJDBC(Connection conn) {
        this.connection = conn;
    }
    @Override
    public void insert(Seller seller) {

    }

    @Override
    public void update(Seller seller) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<Seller> findByDepartment(Department department) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Seller> sellerList = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement(
                    "select seller.*, department.Name as DepartmentName "
                        +"from seller inner join department "
                        +"on seller.DepartmentId = department.Id "
                        +"where department.Id = ?");

            preparedStatement.setInt(1, department.getId());
            resultSet = preparedStatement.executeQuery();

            Map<Integer, Department> departmentMap = new HashMap<>();

            while (resultSet.next()) {
                //testing if department has be initialized
                Department departmentFind = departmentMap.get(resultSet.getInt("DepartmentId"));

                if (departmentFind == null) {
                    departmentFind = instatiateDepartment(resultSet);
                    departmentMap.put(resultSet.getInt("DepartmentId"), departmentFind);
                }
                sellerList.add(instatiateSeller(resultSet, departmentFind));
            }

            return sellerList;
        } catch (SQLException error) {
            throw new DbGenericError(error.getMessage());
        }
        finally {
            DataBaseControl.closeStatement(preparedStatement);
            DataBaseControl.closeResultSet(resultSet);
        }
    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(
                "select seller.*, department.Name as DepartmentName "
                    +"from seller inner join department "
                    +"on seller.DepartmentId = department.Id "
                    +"where seller.Id = ?");

            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                Department department = instatiateDepartment(resultSet);
                return instatiateSeller(resultSet, department);
            }
            return null;
        } catch (SQLException error) {
            throw new DbGenericError(error.getMessage());
        }
        finally {
            DataBaseControl.closeResultSet(resultSet);
            DataBaseControl.closeStatement(preparedStatement);
        }
    }

    @Override
    public List<Seller> findAll() {
        Statement statement = null;
        ResultSet resultSet = null;
        List<Seller> sellerList = new ArrayList<>();
         try {
             statement = connection.createStatement();
             resultSet = statement.executeQuery("select seller.*, department.Name as DepartmentName from seller join department on department.Id = seller.DepartmentId");

             Map<Integer, Department> departmentMap = new HashMap<>();
             Department department;

             while (resultSet.next()) {
                 department = departmentMap.get(resultSet.getInt("DepartmentId"));

                 if (department == null) {
                     department = instatiateDepartment(resultSet);
                     departmentMap.put(resultSet.getInt("DepartmentId"), department);
                 }
                 sellerList.add(instatiateSeller(resultSet, department));
             }
             return sellerList;

         } catch (SQLException error) {
             throw new DbGenericError(error.getMessage());
         }
         finally {
             DataBaseControl.closeResultSet(resultSet);
             DataBaseControl.closeStatement(statement);
         }

    }

    private Department instatiateDepartment(ResultSet resultSet) throws SQLException {
        return new Department(
                resultSet.getInt("DepartmentId"),
                resultSet.getString("DepartmentName"));
    }

    private Seller instatiateSeller(ResultSet resultSet, Department department) throws SQLException {
        return new Seller(resultSet.getInt("Id"),
                resultSet.getString("Name"),
                resultSet.getString("Email"),
                resultSet.getDate("BirthDate"),
                resultSet.getDouble("BaseSalary"),
                department);
    }
}
