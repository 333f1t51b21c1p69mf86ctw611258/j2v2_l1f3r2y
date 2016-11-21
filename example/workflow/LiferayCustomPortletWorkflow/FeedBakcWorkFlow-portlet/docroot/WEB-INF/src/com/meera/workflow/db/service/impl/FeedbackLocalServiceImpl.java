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

package com.meera.workflow.db.service.impl;

import com.meera.workflow.db.service.base.FeedbackLocalServiceBaseImpl;
import com.meera.workflow.db.service.persistence.FeedbackUtil;

/**
 * The implementation of the feedback local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.meera.workflow.db.service.FeedbackLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author LiferaySavvy
 * @see com.meera.workflow.db.service.base.FeedbackLocalServiceBaseImpl
 * @see com.meera.workflow.db.service.FeedbackLocalServiceUtil
 */
public class FeedbackLocalServiceImpl extends FeedbackLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.meera.workflow.db.service.FeedbackLocalServiceUtil} to access the feedback local service.
	 */
	public  java.util.List<com.meera.workflow.db.model.Feedback> findByG_S(
			long groupId, int status)
			throws com.liferay.portal.kernel.exception.SystemException {
			return FeedbackUtil.findByG_S(groupId, status);
		}
}