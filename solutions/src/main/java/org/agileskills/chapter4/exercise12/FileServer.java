package org.agileskills.chapter4.exercise12;

public interface FileServer {
	void setDiskQuota(User user, Long quota);
	Long getDiskQuota(User user);
}