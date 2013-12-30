package com.telrikk.elasticnotes.actions.update;

import com.telrikk.elasticnotes.actions.AbstractSingleResultAction;
import com.telrikk.elasticnotes.actions.RollbackAction;
import com.telrikk.elasticnotes.actions.SingleResultAction;

public class Update 
    extends AbstractSingleResultAction
    implements RollbackAction, SingleResultAction {
    public <T> T perform(Class<T> clazz) {
        // TODO Auto-generated method stub
        return null;
    }

    public void rollback() {
        // TODO Auto-generated method stub
        
    }
}
