package org.agileskills.chapter4.exercise12.impl;

import org.agileskills.chapter4.exercise12.DHCPServer;
import org.agileskills.chapter4.exercise12.DhcpConfig;
import org.agileskills.chapter4.exercise12.FileServer;
import org.agileskills.chapter4.exercise12.Server;
import org.agileskills.chapter4.exercise12.User;

public class ConcreteServer extends Server implements DHCPServer, FileServer {
	private DHCPServer dhcpServer;
	private FileServer fileServer;
	public void setDiskQuota(User user, Long quota) {
		fileServer.setDiskQuota(user, quota);
	}
	public Long getDiskQuota(User user) {
		return fileServer.getDiskQuota(user);
	}
	public DhcpConfig getAddressScope() {
		return dhcpServer.getAddressScope();
	}

}
