package org.agileskills.chapter4.exercise12;

import java.util.List;
import java.util.Map;

import org.agileskills.chapter4.exercise12.impl.DhcpConfig;

public class ServerConfigSystem {
	public Server[] servers;
	public Map<Administrator,List<Server>> serversByAdmin;
	public Map<Server,DhcpConfig> dhcpConfigByServer;
}