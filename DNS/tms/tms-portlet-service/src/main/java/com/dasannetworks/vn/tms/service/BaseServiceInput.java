package com.dasannetworks.vn.tms.service;

public abstract class BaseServiceInput {

	private boolean andSearchCondition;
	private int start;
	private int end;
	private String sortField;
	private String sortDirection;

	public boolean isAndSearchCondition() {
		return andSearchCondition;
	}

	public void setAndSearchCondition(boolean andSearchCondition) {
		this.andSearchCondition = andSearchCondition;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public String getSortField() {
		return sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public String getSortDirection() {
		return sortDirection;
	}

	public void setSortDirection(String sortDirection) {
		this.sortDirection = sortDirection;
	}

}
