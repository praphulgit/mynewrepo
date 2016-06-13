package com.demo;

import java.io.IOException;

import org.jpos.iso.BaseChannel;
import org.jpos.iso.ISOException;

public class CSChannel extends BaseChannel {

	protected void sendMessageLength(int len) throws IOException {
		serverOut.write(len >> 8);
		serverOut.write(len);
		serverOut.write(0);
		serverOut.write(0);
	}

	protected int getMessageLength() throws IOException, ISOException {
		int l = 0;
		byte[] b = new byte[4];
		while (l == 0) {
			serverIn.readFully(b, 0, 4);
			l = ((((int) b[0]) & 0xFF) << 8) | (((int) b[1]) & 0xFF);
			if (l == 0) {
				serverOut.write(b);
				serverOut.flush();
			}
		}
		return l;
	}

}
