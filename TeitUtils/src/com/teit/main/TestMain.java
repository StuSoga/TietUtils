package com.teit.main;

import java.util.ArrayList;
import java.util.List;

import com.teit.entity.CallLog;

public class TestMain {

	public static void main(String[] args) {
		List<CallLog> logs = new ArrayList<CallLog>();
		CallLog log_1 = new CallLog();

		log_1.setLogID(1);
		log_1.setNumber("18876306790");
		log_1.setCallType(CallLog.CALL_IN);
		log_1.setDate(Long.parseLong("20150525000000"));

		CallLog log_2 = new CallLog();

		log_2.setLogID(2);
		log_2.setNumber("18876306791");
		log_2.setCallType(CallLog.CALL_OUT);
		log_2.setDate(Long.parseLong("20150524000000"));

		CallLog log_3 = new CallLog();

		log_3.setLogID(1);
		log_3.setNumber("18876306792");
		log_3.setCallType(CallLog.CALL_MISS);
		log_3.setDate(Long.parseLong("20150517000000"));

		CallLog log_4 = new CallLog();

		log_4.setLogID(4);
		log_4.setNumber("18876306790");
		log_4.setCallType(CallLog.CALL_IN);
		log_4.setDate(Long.parseLong("20150516000000"));

		logs.add(log_1);
		logs.add(log_2);
		logs.add(log_3);
		logs.add(log_4);
		CallLogSort.nativeSort(logs);

	}

}
