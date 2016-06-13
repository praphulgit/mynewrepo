package com.demo;

import java.io.IOException;
import org.jpos.util.*;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISORequestListener;
import org.jpos.iso.ISOServer;
import org.jpos.iso.ISOSource;
import org.jpos.iso.ServerChannel;
import org.jpos.iso.channel.XMLChannel;
import org.jpos.iso.packager.XMLPackager;

public class ISOChannelTest implements ISORequestListener {

	ISOChannelTest() {
		super();
	}

	public boolean process(ISOSource source, ISOMsg m) {
		try {
			m.setResponseMTI();
			m.set(39, "00");
			source.send(m);
		} catch (ISOException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		Logger logger = new Logger();
		logger.addListener(new SimpleLogListener(System.out));
		ServerChannel channel = new XMLChannel(new XMLPackager());
		((LogSource) channel).setLogger(logger, "channel");
		ISOServer server = new ISOServer(8000, channel, null);
		server.setLogger(logger, "server");
		server.addISORequestListener(new ISOChannelTest());
		new Thread(server).start();
	}

}
