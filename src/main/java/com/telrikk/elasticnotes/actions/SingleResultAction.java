package com.telrikk.elasticnotes.actions;

public interface SingleResultAction { 
    public <T> T perform (Class<T> clazz);
}
