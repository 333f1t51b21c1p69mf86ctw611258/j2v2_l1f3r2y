package com.dasannetworks.tms.customfield.admin;

import com.dasannetworks.tms.sb.model.Book;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.expando.model.BaseCustomAttributesDisplay;

public class CustomAttributeDisplay extends BaseCustomAttributesDisplay {

	public static final String CLASS_NAME = Book.class.getName();

	@Override
	public String getClassName() {

		return CLASS_NAME;
	}

	@Override
	public String getIconPath(ThemeDisplay themeDisplay) {

		return themeDisplay.getPathThemeImages() + "/common/pages.png";
	}
	
}
