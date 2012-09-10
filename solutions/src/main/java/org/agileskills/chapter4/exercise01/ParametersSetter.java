package org.agileskills.chapter4.exercise01;

import java.sql.PreparedStatement;
import java.sql.SQLException;

interface ParametersSetter {
	public void setParameters(PreparedStatement satement) throws SQLException;
	

}