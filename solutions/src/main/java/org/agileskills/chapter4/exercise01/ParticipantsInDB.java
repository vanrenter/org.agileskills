package org.agileskills.chapter4.exercise01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class ParticipantsInDB {
	private static final class DeleteParticipantParameterSetter implements
			ParametersSetter {
		private final String participantId;

		private DeleteParticipantParameterSetter(String participantId) {
			this.participantId = participantId;
		}

		public void setParameters(PreparedStatement satement) throws SQLException {
			satement.setString(1, participantId);
		}
	}

	private static final class EmptyParametersSetter implements ParametersSetter {
		public void setParameters(PreparedStatement satement) throws SQLException {
		}
	}

	private static final class AddPartParameterSetter implements ParametersSetter {
		private final Participant part;

		private AddPartParameterSetter(Participant part) {
			this.part = part;
		}

		public void setParameters(PreparedStatement satement) throws SQLException {
			satement.setString(1, part.getId());
			satement.setString(2, part.getEFirstName());
			satement.setString(3, part.getELastName());
			// ...
		}
	}

	private Connection conn;
	private static final String TABLE_NAME = "participants";

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
				if(st!=null){st.close();}
			} catch (SQLException e) {
			}
		}
	}

	void addParticipant(final Participant part) {
		execute("INSERT INTO " + TABLE_NAME+ "VALUES (?,?,?,?,?)", new AddPartParameterSetter(part));
	}

	void deleteAllParticipants() {
			execute("DELETE FROM " + TABLE_NAME,new EmptyParametersSetter());
	}

	void deleteParticipant(final String participantId) {
		execute("DELETE FROM " + TABLE_NAME+ "WHERE id=?", new DeleteParticipantParameterSetter(participantId));
	}

	/**
	 * @param conn the conn to set
	 */
	public void setConn(Connection conn) {
		this.conn = conn;
	}
}
