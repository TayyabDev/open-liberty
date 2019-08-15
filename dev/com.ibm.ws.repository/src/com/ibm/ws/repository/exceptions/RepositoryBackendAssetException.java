/*******************************************************************************
 * Copyright (c) 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.repository.exceptions;

import java.util.List;

import com.ibm.ws.repository.transport.model.Asset;

/**
 *
 */
public class RepositoryBackendAssetException extends RepositoryBackendException {
    private final List<Asset> invalidAssets;

    public RepositoryBackendAssetException(String message, List<Asset> invalidAssets) {
        super();
        this.invalidAssets = invalidAssets;
    }

    public List<Asset> getInvalidAssets() {
        return this.invalidAssets;
    }

}
