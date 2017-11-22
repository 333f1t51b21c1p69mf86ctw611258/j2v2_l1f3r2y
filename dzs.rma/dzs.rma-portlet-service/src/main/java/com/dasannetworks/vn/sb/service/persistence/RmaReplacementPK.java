package com.dasannetworks.vn.sb.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RmaReplacementPK implements Comparable<RmaReplacementPK>,
    Serializable {
    public long rmaRequestId;
    public String replacedNumber;

    public RmaReplacementPK() {
    }

    public RmaReplacementPK(long rmaRequestId, String replacedNumber) {
        this.rmaRequestId = rmaRequestId;
        this.replacedNumber = replacedNumber;
    }

    public long getRmaRequestId() {
        return rmaRequestId;
    }

    public void setRmaRequestId(long rmaRequestId) {
        this.rmaRequestId = rmaRequestId;
    }

    public String getReplacedNumber() {
        return replacedNumber;
    }

    public void setReplacedNumber(String replacedNumber) {
        this.replacedNumber = replacedNumber;
    }

    @Override
    public int compareTo(RmaReplacementPK pk) {
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

        value = replacedNumber.compareTo(pk.replacedNumber);

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

        if (!(obj instanceof RmaReplacementPK)) {
            return false;
        }

        RmaReplacementPK pk = (RmaReplacementPK) obj;

        if ((rmaRequestId == pk.rmaRequestId) &&
                (replacedNumber.equals(pk.replacedNumber))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(rmaRequestId) + String.valueOf(replacedNumber)).hashCode();
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
        sb.append("replacedNumber");
        sb.append(StringPool.EQUAL);
        sb.append(replacedNumber);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
