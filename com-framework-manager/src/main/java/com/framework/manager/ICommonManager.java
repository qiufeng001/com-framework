package com.framework.manager;

import com.framework.core.exception.manager.ManagerException;
import com.framework.core.query.Query;
import com.framework.model.Common;

public interface ICommonManager extends IManager<Common, String> {
    Common findMaxSequence(Query query) throws ManagerException;
}
