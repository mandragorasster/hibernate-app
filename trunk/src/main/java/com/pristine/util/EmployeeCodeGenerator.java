package com.pristine.util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class EmployeeCodeGenerator implements IdentifierGenerator {


    public Serializable generate(SessionImplementor session, Object object)
            throws HibernateException {

        String prefix = "E";
        Connection connection = session.connection();
        try {

            PreparedStatement ps = connection
                    .prepareStatement("SELECT nextval ('EMPLOYEE_SEQ') as nextval");

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("nextval");
                String code = prefix + StringUtils.leftPad("" + id,3, '0');
                return code;
            }

        } catch (SQLException e) {
            throw new HibernateException(
                    "Unable to generate Stock Code Sequence");
        }
        return null;
    }
}