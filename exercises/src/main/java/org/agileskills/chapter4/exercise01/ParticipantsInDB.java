package org.agileskills.chapter4.exercise01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class ParticipantsInDB {
	private Connection conn;
	public static final String tableName = "participants";

	void addParticipant(Participant part) {
		PreparedStatement st=null;
		try {
			st = conn.prepareStatement("INSERT INTO " + tableName
					+ "VALUES (?,?,?,?,?)");
			st.setString(1, part.getId());
			st.setString(2, part.getEFirstName());
			st.setString(3, part.getELastName());
			// ...
			st.executeUpdate();
		} catch (SQLException sqle) {
			// do something
		} finally {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	void deleteAllParticipants() {
		PreparedStatement st=null;
		try {
			st = conn.prepareStatement("DELETE FROM " + tableName);
			st.executeUpdate();
		} catch (SQLException sqle) {
			// do something
		}finally {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	void deleteParticipant(String participantId) {
		PreparedStatement st=null;
		try {
			 st= conn.prepareStatement("DELETE FROM " + tableName
					+ "WHERE id=?");
			st.setString(1, participantId);
			st.executeUpdate();
		} catch (SQLException sqle) {
			// do something
		}finally {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
