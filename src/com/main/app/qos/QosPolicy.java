package com.main.app.qos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class QosPolicy {
	private String uuid;
	private String switchdpid;
	private String vifport;

	private long maxRate;
	private long minRate;

	// <id, uuid>; max is 7
	private Map<Integer, String> queues;

	public QosPolicy() {
		queues = Collections.synchronizedMap(new HashMap<Integer, String>());
		for (int i = 0; i < 7; i++) {
			queues.put(i, null);
		}
	}

	public QosPolicy(String uuid) {
		this();
		this.uuid = uuid;
	}

	public QosPolicy(long maxRate, long minRate) {
		this();
		this.maxRate = maxRate;
		this.minRate = minRate;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getSwitchdpid() {
		return switchdpid;
	}

	public void setSwitchdpid(String switchdpid) {
		this.switchdpid = switchdpid;
	}

	public String getVifport() {
		return vifport;
	}

	public void setVifport(String vifport) {
		this.vifport = vifport;
	}

	public long getMaxRate() {
		return maxRate;
	}

	public void setMaxRate(long maxRate) {
		this.maxRate = maxRate;
	}

	public long getMinRate() {
		return minRate;
	}

	public void setMinRate(long minRate) {
		this.minRate = minRate;
	}

	/**
	 * @param queueUuid to add
	 * @return queue id, 0-6, -1 if all 7 queues are full
	 */
	public int addQueue(String queueUuid) {
		for (Integer id : queues.keySet()) {
			if (queues.get(id) == null) {
				queues.remove(id);
				queues.put(id, queueUuid);
				return id;
			}
		}
		return -1;
	}

	public Map<Integer, String> getQueues() {
		return queues;
	}
}
