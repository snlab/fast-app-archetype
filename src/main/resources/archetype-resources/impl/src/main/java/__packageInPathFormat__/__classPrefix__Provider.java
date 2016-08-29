/*
 * Copyright © ${copyrightYear} ${copyright} and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package ${package};

import fast.api.FastSystem;
import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ${classPrefix}Provider implements AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(${classPrefix}Provider.class);
    private FastSystem fastSystem;
    private DataBroker dataBroker;

    public void OnSessionInitiated(FastSystem fastSystem) {
        LOG.info("${classPrefix}Provider Session Initiated");
        this.fastSystem = fastSystem;
        this.dataBroker = fastSystem.getDataBroker();
        if(fastSystem == null || dataBroker == null || openflow == null){
            LOG.error("Intialized failed");
        }
        System.out.println("${classPrefix}Provider initialized successfully");
    }

    @Override
    public void close() throws Exception {
        LOG.info("${classPrefix}Provider Closed");
    }

}
