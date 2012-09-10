package org.agileskills.chapter4.exercise12.impl;

import java.util.HashMap;
import java.util.Map;

import org.agileskills.chapter4.exercise12.FileServer;
import org.agileskills.chapter4.exercise12.Server;
import org.agileskills.chapter4.exercise12.User;

public class FileServerImpl extends Server implements FileServer {
	private Map<String,Long> diskQuotas = new HashMap<String, Long>();

	public void setDiskQuota(User user, Long quota) {
		diskQuotas.put(user.getId(),quota);
	}
	
	public Long getDiskQuota(User user) {
		return diskQuotas.get(user.getId());
	}
}
