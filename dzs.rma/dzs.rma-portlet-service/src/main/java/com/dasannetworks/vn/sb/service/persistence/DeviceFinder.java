package com.dasannetworks.vn.sb.service.persistence;

public interface DeviceFinder {
    public java.util.List<com.dasannetworks.vn.sb.model.Device> getListBySerialNumberAndPO(
        java.util.List<java.lang.String> serialNumbers,
        java.util.List<java.lang.String> gponSerialNumbers,
        java.util.List<java.lang.String> customerSerialNumbers,
        java.lang.Long purchaseOrderId, java.lang.String orderColumn,
        java.lang.String orderDirection, int begin, int end);

    public long getListBySerialNumberAndPO_GetTotalCount(
        java.util.List<java.lang.String> serialNumbers,
        java.util.List<java.lang.String> gponSerialNumbers,
        java.util.List<java.lang.String> customerSerialNumbers,
        java.lang.Long purchaseOrderId);
}
