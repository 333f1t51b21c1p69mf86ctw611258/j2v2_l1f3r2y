package com.dasannetworks.vn.sb.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HandOverDevicePK implements Comparable<HandOverDevicePK>,
    Serializable {
    public long handOverFormId;
    public long deviceId;

    public HandOverDevicePK() {
    }

    public HandOverDevicePK(long handOverFormId, long deviceId) {
        this.handOverFormId = handOverFormId;
        this.deviceId = deviceId;
    }

    public long getHandOverFormId() {
        return handOverFormId;
    }

    public void setHandOverFormId(long handOverFormId) {
        this.handOverFormId = handOverFormId;
    }

    public long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public int compareTo(HandOverDevicePK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (handOverFormId < pk.handOverFormId) {
            value = -1;
        } else if (handOverFormId > pk.handOverFormId) {
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

        if (!(obj instanceof HandOverDevicePK)) {
            return false;
        }

        HandOverDevicePK pk = (HandOverDevicePK) obj;

        if ((handOverFormId == pk.handOverFormId) && (deviceId == pk.deviceId)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(handOverFormId) + String.valueOf(deviceId)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("handOverFormId");
        sb.append(StringPool.EQUAL);
        sb.append(handOverFormId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("deviceId");
        sb.append(StringPool.EQUAL);
        sb.append(deviceId);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
