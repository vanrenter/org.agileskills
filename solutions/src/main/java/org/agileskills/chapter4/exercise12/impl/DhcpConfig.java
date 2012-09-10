package org.agileskills.chapter4.exercise12.impl;

import java.net.InetAddress;

public class DhcpConfig {
	private InetAddress startIp;
	private InetAddress endIp;
	/**
	 * @return the startIp
	 */
	public InetAddress getStartIp() {
		return startIp;
	}
	/**
	 * @param startIp the startIp to set
	 */
	public void setStartIp(InetAddress startIp) {
		this.startIp = startIp;
	}
	/**
	 * @return the endIp
	 */
	public InetAddress getEndIp() {
		return endIp;
	}
	/**
	 * @param endIp the endIp to set
	 */
	public void setEndIp(InetAddress endIp) {
		this.endIp = endIp;
	}
}
