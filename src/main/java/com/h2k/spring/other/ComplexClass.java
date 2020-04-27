package com.h2k.spring.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ComplexClass {
	
	private Properties props = new Properties();
	private ArrayList<String> simpleList = new ArrayList<String>();
	private Map<Integer, String> courses = new HashMap<Integer, String>();
	private Set<String> faculty = new HashSet<String>();

	/**
	 * @return the props
	 */
	public Properties getProps() {
		System.out.println(props);
		return props;
	}

	/**
	 * @param props the props to set
	 */
	public void setProps(Properties props) {
		this.props = props;
	}

	/**
	 * @return the simpleList
	 */
	public ArrayList<String> getSimpleList() {
		System.out.println(simpleList);
		return simpleList;
	}

	/**
	 * @param simpleList the simpleList to set
	 */
	public void setSimpleList(ArrayList<String> simpleList) {
		this.simpleList = simpleList;
	}

	/**
	 * @return the courses
	 */
	public Map<Integer, String> getCourses() {
		System.out.println(courses);
		return courses;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setCourses(Map<Integer, String> courses) {
		this.courses = courses;
	}

	/**
	 * @return the faculty
	 */
	public Set<String> getFaculty() {
		System.out.println(faculty);
		return faculty;
	}

	/**
	 * @param faculty the faculty to set
	 */
	public void setFaculty(Set<String> faculty) {
		this.faculty = faculty;
	}

}
