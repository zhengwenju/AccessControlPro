package com.sv.mjxt.web.tcp.server.utils;

import com.google.protobuf.Timestamp;

public class TimestampDateUtil {

	public static Timestamp getCurrentTimestamp() {
		return LongToTimestamp(System.currentTimeMillis());
	}
	
	public static Timestamp LongToTimestamp(long millis) {
		Timestamp.Builder timeBuilder = Timestamp.newBuilder();
		timeBuilder.setSeconds(millis / 1000);
		timeBuilder.setNanos((int) (millis % 1000) * 1000000);
		return timeBuilder.build();
	}
}
