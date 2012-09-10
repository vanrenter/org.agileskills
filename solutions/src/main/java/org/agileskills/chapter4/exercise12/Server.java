package org.agileskills.chapter4.exercise12;

import java.net.InetAddress;

public class Server {
	private String name;
	private String cpuModel;
	private int ramSizeInMB;
	private int diskSizeInMB;
	private InetAddress ipAddress;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the cpuModel
	 */
	public String getCpuModel() {
		return cpuModel;
	}
	/**
	 * @param cpuModel the cpuModel to set
	 */
	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}
	/**
	 * @return the ramSizeInMB
	 */
	public int getRamSizeInMB() {
		return ramSizeInMB;
	}
	/**
	 * @param ramSizeInMB the ramSizeInMB to set
	 */
	public void setRamSizeInMB(int ramSizeInMB) {
		this.ramSizeInMB = ramSizeInMB;
	}
	/**
	 * @return the diskSizeInMB
	 */
	public int getDiskSizeInMB() {
		return diskSizeInMB;
	}
	/**
	 * @param diskSizeInMB the diskSizeInMB to set
	 */
	public void setDiskSizeInMB(int diskSizeInMB) {
		this.diskSizeInMB = diskSizeInMB;
	}
	/**
	 * @return the ipAddress
	 */
	public InetAddress getIpAddress() {
		return ipAddress;
	}
	/**
	 * @param ipAddress the ipAddress to set
	 */
	public void setIpAddress(InetAddress ipAddress) {
		this.ipAddress = ipAddress;
	}
}
