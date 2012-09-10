package org.agileskills.chapter4.exercise02;

import java.net.InetAddress;

public class DHCPServer extends Server {
	private InetAddress[] addressScope;
	
	public InetAddress[] getAddressScope() {
		return addressScope;
	}
}
