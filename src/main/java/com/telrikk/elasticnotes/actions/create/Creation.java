package com.telrikk.elasticnotes.actions.create;

import com.telrikk.elasticnotes.actions.AbstractSingleResultAction;
import com.telrikk.elasticnotes.actions.RollbackAction;
import com.telrikk.elasticnotes.actions.SingleResultAction;

public class Creation
    extends AbstractSingleResultAction
    implements RollbackAction, SingleResultAction {
    public void rollback() {
        // TODO Auto-generated method stub
    }

    public <T> T perform(Class<T> clazz) {
        // TODO Auto-generated method stub
        return null;
    }
}
