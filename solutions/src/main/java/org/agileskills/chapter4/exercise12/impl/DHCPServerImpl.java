package org.agileskills.chapter4.exercise12.impl;

import org.agileskills.chapter4.exercise12.DHCPServer;
import org.agileskills.chapter4.exercise12.DhcpConfig;
import org.agileskills.chapter4.exercise12.Server;

public class DHCPServerImpl extends Server implements DHCPServer {
	private DhcpConfig addressScope;
	
	public DhcpConfig getAddressScope() {
		return addressScope;
	}

	/**
	 * @param addressScope the addressScope to set
	 */
	public void setAddressScope(DhcpConfig addressScope) {
		this.addressScope = addressScope;
	}
}
