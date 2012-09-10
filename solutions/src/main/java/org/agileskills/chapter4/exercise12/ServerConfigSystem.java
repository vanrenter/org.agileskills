package org.agileskills.chapter4.exercise12;

import java.util.List;
import java.util.Map;

import org.agileskills.chapter4.exercise12.impl.DhcpConfig;

@SuppressWarnings("unused")
public class ServerConfigSystem {
	private Server[] servers;
	private Map<Administrator,List<Server>> serversByAdmin;
	private Map<Server,DhcpConfig> dhcpConfigByServer;
}