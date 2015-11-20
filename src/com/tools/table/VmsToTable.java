package com.tools.table;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.overview.VmData;
import controller.overview.vms.VmDataGetter;

public class VmsToTable {
	public static String[][] vmdatasToTable(List<VmData> vms) {
		String[][] tableArr = new String[vms.size()][8];
		int count = 0;
		Iterator<VmData> it = vms.iterator();
		VmData vm = null;
		while (it.hasNext()) {
			vm = it.next();
			List<String> stringList = new ArrayList<String>();
			stringList.add(String.valueOf(count + 1));
			stringList.add(vm.getVmIpAddr() != null ? vm.getVmIpAddr() : "None");
			stringList.add(vm.getVmMacAddr() != null ? vm.getVmMacAddr() : "None");
			stringList.add(vm.getVmSwitch() != null ? vm.getVmSwitch() : "None");
			stringList.add(vm.getVmSwitchPort() != null ? vm.getVmSwitchPort() : "None");
			stringList.add(vm.getLastSeen() != null ? vm.getLastSeen().toString() : "None");
			stringList.add(vm.getVmVifNumber() != null ? vm.getVmVifNumber() : "None");
			stringList.add(vm.getVmUuid() != null ? vm.getVmUuid() : "None");
			tableArr[count] = stringList.toArray(new String[stringList.size()]);
			count ++;
		}
		
		return tableArr;
	}
}