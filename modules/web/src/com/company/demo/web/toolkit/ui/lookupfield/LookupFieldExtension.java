package com.company.demo.web.toolkit.ui.lookupfield;

import com.company.demo.web.toolkit.ui.client.lookupfield.LookupFieldExtensionClientRpc;
import com.haulmont.cuba.gui.components.LookupField;
import com.vaadin.server.AbstractExtension;
import com.vaadin.ui.ComboBox;

public class LookupFieldExtension extends AbstractExtension {

    public LookupFieldExtension(LookupField lookupField) {
        super(lookupField.unwrap(ComboBox.class));
    }

    public static LookupFieldExtension extendWith(LookupField lookupField) {
        return new LookupFieldExtension(lookupField);
    }

    public void openDropDown() {
        getRpcProxy(LookupFieldExtensionClientRpc.class).openDropDown();
    }
}
