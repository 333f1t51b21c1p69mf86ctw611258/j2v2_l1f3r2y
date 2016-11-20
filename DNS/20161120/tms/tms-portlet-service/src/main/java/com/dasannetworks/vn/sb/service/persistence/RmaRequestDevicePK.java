package com.dasannetworks.vn.sb.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RmaRequestDevicePK implements Comparable<RmaRequestDevicePK>,
    Serializable {
    public long rmaRequestId;
    public long deviceId;

    public RmaRequestDevicePK() {
    }

    public RmaRequestDevicePK(long rmaRequestId, long deviceId) {
        this.rmaRequestId = rmaRequestId;
        this.deviceId = deviceId;
    }

    public long getRmaRequestId() {
        return rmaRequestId;
    }

    public void setRmaRequestId(long rmaRequestId) {
        this.rmaRequestId = rmaRequestId;
    }

    public long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public int compareTo(RmaRequestDevicePK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (rmaRequestId < pk.rmaRequestId) {
            value = -1;
        } else if (rmaRequestId > pk.rmaRequestId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (deviceId < pk.deviceId) {
            value = -1;
        } else if (deviceId > pk.deviceId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RmaRequestDevicePK)) {
            return false;
        }

        RmaRequestDevicePK pk = (RmaRequestDevicePK) obj;

        if ((rmaRequestId == pk.rmaRequestId) && (deviceId == pk.deviceId)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(rmaRequestId) + String.valueOf(deviceId)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("rmaRequestId");
        sb.append(StringPool.EQUAL);
        sb.append(rmaRequestId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("deviceId");
        sb.append(StringPool.EQUAL);
        sb.append(deviceId);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
