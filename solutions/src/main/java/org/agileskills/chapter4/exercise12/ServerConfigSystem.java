package org.agileskills.chapter4.exercise12;

import java.util.List;
import java.util.Map;


public final class ServerConfigSystem {
	//private ServerConfigSystem() {}
	private List<Server> servers;
	private Map<Administrator,List<Server>> serversByAdmin;
	private Map<Server,DhcpConfig> dhcpConfigByServer;
	/**
	 * @return the servers
	 */
	public List<Server> getServers() {
		return servers;
	}
	/**
	 * @param servers the servers to set
	 */
	public void setServers(List<Server> servers) {
		this.servers = servers;
	}
	/**
	 * @return the serversByAdmin
	 */
	public Map<Administrator, List<Server>> getServersByAdmin() {
		return serversByAdmin;
	}
	/**
	 * @param serversByAdmin the serversByAdmin to set
	 */
	public void setServersByAdmin(Map<Administrator, List<Server>> serversByAdmin) {
		this.serversByAdmin = serversByAdmin;
	}
	/**
	 * @return the dhcpConfigByServer
	 */
	public Map<Server, DhcpConfig> getDhcpConfigByServer() {
		return dhcpConfigByServer;
	}
	/**
	 * @param dhcpConfigByServer the dhcpConfigByServer to set
	 */
	public void setDhcpConfigByServer(Map<Server, DhcpConfig> dhcpConfigByServer) {
		this.dhcpConfigByServer = dhcpConfigByServer;
	}
}