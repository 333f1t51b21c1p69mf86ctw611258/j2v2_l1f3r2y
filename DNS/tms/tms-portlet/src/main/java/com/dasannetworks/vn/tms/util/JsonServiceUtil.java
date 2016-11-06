package com.dasannetworks.vn.tms.util;

import java.io.PrintWriter;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * Utility class manages uses to perform json related functionality
 * 
 * @author aspire20
 *
 */
public class JsonServiceUtil {

	private static Log LOGGER = LogFactoryUtil.getLog(JsonServiceUtil.class);

	/**
	 * Write json data in the response
	 * 
	 * @param writer
	 * @param map
	 */
	public static void writeJson(PrintWriter writer, Map<String, Object> map) {
		LOGGER.debug("in writeJson method");
		Gson gson = new GsonBuilder().serializeNulls().create();
		if (writer == null) {
			LOGGER.error("writer is null :");
			return;
		}
		try {
			String jsonString = gson.toJson(map);
			LOGGER.info("Gson is " + jsonString);
			writer.print(jsonString);
			writer.flush();
		} catch (Exception e) {
			LOGGER.error("Error in writeJson object :", e);
		}
	}
}
