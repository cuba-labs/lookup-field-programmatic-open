package com.company.demo.web.toolkit.ui.client.lookupfield;

import com.company.demo.web.toolkit.ui.lookupfield.LookupFieldExtension;
import com.vaadin.client.ServerConnector;
import com.vaadin.client.extensions.AbstractExtensionConnector;
import com.vaadin.client.ui.VFilterSelect;
import com.vaadin.client.ui.combobox.ComboBoxConnector;
import com.vaadin.shared.ui.Connect;

@Connect(value = LookupFieldExtension.class, loadStyle = Connect.LoadStyle.LAZY)
public class LookupFieldExtensionConnector extends AbstractExtensionConnector {
    @Override
    protected void extend(ServerConnector target) {
        final VFilterSelect combobox = ((ComboBoxConnector) target).getWidget();

        registerRpc(LookupFieldExtensionClientRpc.class,
                (LookupFieldExtensionClientRpc) combobox::applyNewSuggestions);
    }
}
