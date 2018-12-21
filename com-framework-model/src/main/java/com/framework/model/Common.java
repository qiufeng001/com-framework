package com.framework.model;

import com.framework.core.security.BasicEntity;

public class Common extends BasicEntity {

    /* 各模块排序用 */
    private String sequence;

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
}
