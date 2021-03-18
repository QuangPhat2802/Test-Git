package com.demo.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonRowMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person person = new Person();
		person.setPersonId(rs.getInt("personId"));
		person.setFirst_Name(rs.getString("first_Name"));
		person.setLast_Name(rs.getString("last_Name"));
		return person;
	}

}
