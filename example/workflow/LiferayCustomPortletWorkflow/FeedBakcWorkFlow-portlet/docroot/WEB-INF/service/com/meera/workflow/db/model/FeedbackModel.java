/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.meera.workflow.db.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Feedback service. Represents a row in the &quot;LS_Feedback&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.meera.workflow.db.model.impl.FeedbackModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.meera.workflow.db.model.impl.FeedbackImpl}.
 * </p>
 *
 * @author LiferaySavvy
 * @see Feedback
 * @see com.meera.workflow.db.model.impl.FeedbackImpl
 * @see com.meera.workflow.db.model.impl.FeedbackModelImpl
 * @generated
 */
public interface FeedbackModel extends BaseModel<Feedback> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a feedback model instance should use the {@link Feedback} interface instead.
	 */

	/**
	 * Returns the primary key of this feedback.
	 *
	 * @return the primary key of this feedback
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this feedback.
	 *
	 * @param primaryKey the primary key of this feedback
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this feedback.
	 *
	 * @return the uuid of this feedback
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this feedback.
	 *
	 * @param uuid the uuid of this feedback
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the feedback ID of this feedback.
	 *
	 * @return the feedback ID of this feedback
	 */
	public long getFeedbackId();

	/**
	 * Sets the feedback ID of this feedback.
	 *
	 * @param feedbackId the feedback ID of this feedback
	 */
	public void setFeedbackId(long feedbackId);

	/**
	 * Returns the feedback date of this feedback.
	 *
	 * @return the feedback date of this feedback
	 */
	public Date getFeedbackDate();

	/**
	 * Sets the feedback date of this feedback.
	 *
	 * @param feedbackDate the feedback date of this feedback
	 */
	public void setFeedbackDate(Date feedbackDate);

	/**
	 * Returns the feedback text of this feedback.
	 *
	 * @return the feedback text of this feedback
	 */
	@AutoEscape
	public String getFeedbackText();

	/**
	 * Sets the feedback text of this feedback.
	 *
	 * @param feedbackText the feedback text of this feedback
	 */
	public void setFeedbackText(String feedbackText);

	/**
	 * Returns the feedback subject of this feedback.
	 *
	 * @return the feedback subject of this feedback
	 */
	@AutoEscape
	public String getFeedbackSubject();

	/**
	 * Sets the feedback subject of this feedback.
	 *
	 * @param feedbackSubject the feedback subject of this feedback
	 */
	public void setFeedbackSubject(String feedbackSubject);

	/**
	 * Returns the feed back status of this feedback.
	 *
	 * @return the feed back status of this feedback
	 */
	public int getFeedBackStatus();

	/**
	 * Sets the feed back status of this feedback.
	 *
	 * @param feedBackStatus the feed back status of this feedback
	 */
	public void setFeedBackStatus(int feedBackStatus);

	/**
	 * Returns the status by user ID of this feedback.
	 *
	 * @return the status by user ID of this feedback
	 */
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this feedback.
	 *
	 * @param statusByUserId the status by user ID of this feedback
	 */
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this feedback.
	 *
	 * @return the status by user uuid of this feedback
	 * @throws SystemException if a system exception occurred
	 */
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this feedback.
	 *
	 * @param statusByUserUuid the status by user uuid of this feedback
	 */
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status date of this feedback.
	 *
	 * @return the status date of this feedback
	 */
	public Date getStatusDate();

	/**
	 * Sets the status date of this feedback.
	 *
	 * @param statusDate the status date of this feedback
	 */
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the company ID of this feedback.
	 *
	 * @return the company ID of this feedback
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this feedback.
	 *
	 * @param companyId the company ID of this feedback
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this feedback.
	 *
	 * @return the group ID of this feedback
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this feedback.
	 *
	 * @param groupId the group ID of this feedback
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this feedback.
	 *
	 * @return the user ID of this feedback
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this feedback.
	 *
	 * @param userId the user ID of this feedback
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this feedback.
	 *
	 * @return the user uuid of this feedback
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this feedback.
	 *
	 * @param userUuid the user uuid of this feedback
	 */
	public void setUserUuid(String userUuid);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.meera.workflow.db.model.Feedback feedback);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.meera.workflow.db.model.Feedback> toCacheModel();

	@Override
	public com.meera.workflow.db.model.Feedback toEscapedModel();

	@Override
	public com.meera.workflow.db.model.Feedback toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}