package org.agileskills.chapter4.exercise12;

import java.util.List;

public class Administrator extends User {
	private List<Server> managedServers;

	/**
	 * @return the managedServers
	 */
	public List<Server> getManagedServers() {
		return managedServers;
	}

	/**
	 * @param managedServers the managedServers to set
	 */
	protected void setManagedServers(List<Server> managedServers) {
		this.managedServers = managedServers;
	}
	
	public void assignResponsabilityOf(Server server) {
		managedServers.add(server);
	}

}
