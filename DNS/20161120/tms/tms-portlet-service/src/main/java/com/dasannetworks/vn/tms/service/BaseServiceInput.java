package com.dasannetworks.vn.tms.service;

import lombok.Data;

@Data
public abstract class BaseServiceInput {

    private boolean andSearchCondition;
    private int start = -1;
    private int end = -1;
    private String sortField;
    private String sortDirection;
    private boolean exactly = false;    
    
    public abstract void advanceSearch(boolean advancedSearch, String keywords);

}
