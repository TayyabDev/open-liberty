/*******************************************************************************
 * Copyright (c) 2006, 2020 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package com.ibm.ws.ejbcontainer.ejblink.ejbo;

import javax.ejb.Stateless;

import com.ibm.ws.ejbcontainer.ejblink.ejb.AutoLinkLocalOtherJarWar;

/**
 * Basic Stateless Bean implementation for testing AutoLink to a bean in an
 * ejb-jar module and .war module
 **/
@Stateless
public class OtherJarWarBean implements AutoLinkLocalOtherJarWar {
    private static final String CLASS_NAME = OtherJarWarBean.class.getName();

    @Override
    public String getBeanName() {
        return CLASS_NAME;
    }

    public OtherJarWarBean() {
        // intentionally blank
    }
}
