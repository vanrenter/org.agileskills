package org.agileskills.chapter4.exercise01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class ParticipantsInDB {
	Connection conn;
	final String tableName = "participants";

	/**
	 * @param part
	 */
	private void execute(String sql, ParametersSetter setter) {
		PreparedStatement st=null;
		try {
			st=conn.prepareStatement(sql);
			setter.setParameters(st);
			st.executeUpdate();
		} catch (SQLException sqle) {
			// do something
		} finally {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	void addParticipant(final Participant part) {
		execute("INSERT INTO " + tableName+ "VALUES (?,?,?,?,?)", new ParametersSetter() {
			
			public void setParameters(PreparedStatement satement) throws SQLException {
				satement.setString(1, part.getId());
				satement.setString(2, part.getEFirstName());
				satement.setString(3, part.getELastName());
				// ...
			}
		});
	}

	void deleteAllParticipants() {
			execute("DELETE FROM " + tableName,new ParametersSetter() {
				public void setParameters(PreparedStatement satement) throws SQLException {
				}
			});
	}

	void deleteParticipant(final String participantId) {
		execute("DELETE FROM " + tableName+ "WHERE id=?", new ParametersSetter() {
			
			public void setParameters(PreparedStatement satement) throws SQLException {
				satement.setString(1, participantId);
			}
		});
	}
}
