package com.tools.util;

public class FormatLong {

	/* Formats longs for proper representation in the paint */
	public static String formatBytes(long paramLong, boolean MB, boolean GB) {
		if (paramLong >= 1000000000L && GB) {
			return paramLong / 1000000000L + " GB";
		}
		if (paramLong >= 10000000L && MB) {
			return paramLong / 1000000L + " MB";
		}
		if (paramLong >= 1000L) {
			return paramLong / 1000L + " KB";
		}
		return paramLong + "B";
	}
	
	/* Formats longs for proper representation in the paint */
	public static String formatPackets(long paramLong, boolean MB, boolean GB) {
		if (paramLong >= 1000000000L && GB) {
			return paramLong / 1000000000L + " G";
		}
		if (paramLong >= 10000000L && MB) {
			return paramLong / 1000000L + " M";
		}
		if (paramLong >= 1000L) {
			return paramLong / 1000L + " K";
		}
		return "" + paramLong;
	}
	/* Formats longs for proper representation in the paint */
	public static String formatPackets(long paramLong) {
		if (paramLong >= 1000000000L) {
			return paramLong / 1000000000L + " G";
		}
		if (paramLong >= 10000000L) {
			return paramLong / 1000000L + " M";
		}
		if (paramLong >= 1000L) {
			return paramLong / 1000L + " K";
		}
		return "" + paramLong;
	}

	public static String formatBytes(long paramLong) {
		// TODO Auto-generated method stub
		if (paramLong >= 1000000000L) {
			return paramLong / 1000000000L + " GB";
		}
		if (paramLong >= 10000000L) {
			return paramLong / 1000000L + " MB";
		}
		if (paramLong >= 1000L) {
			return paramLong / 1000L + " KB";
		}
		return paramLong + "B";
	}
}
