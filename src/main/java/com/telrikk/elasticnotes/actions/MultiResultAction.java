package com.telrikk.elasticnotes.actions;

import java.util.List;

public interface MultiResultAction {
    public <T> List<T> perform (Class<T> clazz);
}
