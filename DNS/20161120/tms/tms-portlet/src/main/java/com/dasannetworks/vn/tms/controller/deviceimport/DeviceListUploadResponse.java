package com.dasannetworks.vn.tms.controller.deviceimport;

/**
 *
 */
public class DeviceListUploadResponse {
    private final String status;
    private final String message;

    public DeviceListUploadResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
