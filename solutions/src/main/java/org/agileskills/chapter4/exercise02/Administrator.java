package org.agileskills.chapter4.exercise02;

public class Administrator extends User {
	private Server[] managedServers;

	/**
	 * @return the managedServers
	 */
	public Server[] getManagedServers() {
		return managedServers;
	}

	/**
	 * @param managedServers the managedServers to set
	 */
	private void setManagedServers(Server[] managedServers) {
		this.managedServers = managedServers;
	}
	
	public void assignResponsabilityOf(Server server) {
		managedServers = new Server[managedServers.length+1];
		managedServers[managedServers.length] = server;
	}

}
