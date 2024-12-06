package com.spring.jdbc.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.Entity.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		
		String sql="insert into student values(?,?,?)";
        int result=jdbcTemplate.update(sql, student.getId(),student.getName(),student.getCity());
		return result;
	}

	public int update(Student student) {
		
		String sql="update student set name=?, city=? where id=? ";
		int result = jdbcTemplate.update(sql, student.getName(),student.getCity(),student.getId());
		return result;
	}

	public int delete(int studentId) {

        String sql="delete from student where id=?";
        int result = jdbcTemplate.update(sql, studentId);
		return result;
	}

	public Student select(int studentId) {

        String sql="select * from student where id=?";
        RowMapper<Student> rowMapper=new RowMapperImpl();
        Student student=jdbcTemplate.queryForObject(sql, rowMapper, studentId);
		return student;
	}

	public List<Student> selectAll() {
		
		String sql="select * from student";
		List<Student> students=jdbcTemplate.query(sql, new RowMapperImpl());
		return students;
	}
}
