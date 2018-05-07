package com.company.demo.web.screens;

import com.company.demo.web.toolkit.ui.lookupfield.LookupFieldExtension;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.LookupField;

import javax.inject.Inject;
import java.util.Map;

public class Screen extends AbstractWindow {
    @Inject
    private LookupField lookupField;

    private LookupFieldExtension extension;

    @Override
    public void init(Map<String, Object> params) {
        extension = LookupFieldExtension.extendWith(lookupField);
    }

    public void alohomora() {
        extension.openDropDown();
    }
}