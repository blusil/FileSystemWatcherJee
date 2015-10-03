package org.maverick.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Stateless
@LocalBean
public class MessageSenderService {

    private static final Logger LOG = LogManager.getLogger(MessageSenderService.class);
    
    public void SendMessage() {
    	LOG.info("This is a test message");
    }

}
