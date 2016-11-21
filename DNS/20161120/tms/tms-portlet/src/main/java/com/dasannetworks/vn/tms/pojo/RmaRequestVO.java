package com.dasannetworks.vn.tms.pojo;

import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.springframework.beans.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import com.dasannetworks.vn.sb.model.RmaRequest;

import lombok.Data;

/**
 *
 */
@Data
public class RmaRequestVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long rmaRequestId;
	private Long companyId;
	private Long userId;
	private String userName;
	private Date createDate;
	private Date modifiedDate;
	private Long groupId;
	@NotNull
	private String rmaRequestNumber;
	private String cusCode;
	private String cusInCharge;
	@Email
	private String cusEmail;
	private String cusPhone;
	private String cusLocation;
	private String provInCharge;
	private Date creatingEstReturnDate;
	private Date creatingReturnedDate;
	private Date creatingAssignedDate;
	private String creatingNote;
	private String partnerCode;
	private String partnerInCharge;
	private String partnerEmail;
	private String partnerPhone;
	private String partnerLocation;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date sendingEstReturnDate;
	private Date sendingReturnedDate;
	private Date sendingAssignedDate;
	private String sendingNote;
	private Date receivingReturnedDate;
	private String receivingNote;
	private Date returningReturnedDate;
	private String returningNote;
	private Integer status;

	private List<RmaRequestDeviceVO> rmaRequestDeviceVOList;

	private File deviceListFile;

	private List<RmaRequestDeviceVO> rmaRequestDeviceList;

	public void update(RmaRequest rmaRequest) {
		Objects.nonNull(rmaRequest);
		
//		BeanUtils.copyProperties(this, rmaRequest);
		rmaRequest.setRmaRequestNumber(this.rmaRequestNumber);
		rmaRequest.setCreatingAssignedDate(this.creatingAssignedDate);
		rmaRequest.setCreatingAssignedDate(this.creatingAssignedDate);
		rmaRequest.setCreatingEstReturnDate(this.creatingEstReturnDate);
		rmaRequest.setCusCode(this.cusCode);
		rmaRequest.setCusEmail(this.cusEmail);
		rmaRequest.setCusInCharge(this.cusInCharge);
		rmaRequest.setCusPhone(this.cusPhone);
		rmaRequest.setCusLocation(this.cusLocation);
		rmaRequest.setProvInCharge(this.provInCharge);

	}

	public static RmaRequestVO create(RmaRequest rmaRequest) {
		RmaRequestVO rmaRequestVO = new RmaRequestVO();
		BeanUtils.copyProperties(rmaRequest, rmaRequestVO);
		return rmaRequestVO;
	}

	@Override
	public String toString() {
		return "RmaRequestVO [partnerCode=" + partnerCode + ", partnerInCharge=" + partnerInCharge + ", partnerEmail=" + partnerEmail + ", partnerPhone=" + partnerPhone + ", partnerLocation=" + partnerLocation + ", sendingEstReturnDate=" + sendingEstReturnDate + ", sendingReturnedDate=" + sendingReturnedDate + ", sendingAssignedDate=" + sendingAssignedDate + ", sendingNote=" + sendingNote + "]";
	}
	
	

}
