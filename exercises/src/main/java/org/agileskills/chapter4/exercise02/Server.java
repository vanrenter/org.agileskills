package org.agileskills.chapter4.exercise02;

class Server {
	String id;
	String CPUModel;
}

class DNSServer extends Server {
	String domainName;
}

class WINSServer extends Server {
	String replicationPartner;
	int replicationInterval;
}

class DomainController extends Server {
	boolean remainNT4Compatible;
}
