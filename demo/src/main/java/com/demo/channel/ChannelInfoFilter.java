package com.demo.channel;

import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.iso.*;
import org.jpos.util.LogEvent;

import java.net.InetSocketAddress;
import java.net.Socket;

@SuppressWarnings("unused")
public class ChannelInfoFilter implements ISOFilter, Configurable {
    String channelNameField;
    String socketInfoField;
    public ChannelInfoFilter() {
        super();
    }
   /**
    * @param cfg
    * <ul>
    *  <li>channel-name: put the channel name in the given field</li>
    *  <li>socket-info: put socket information in the given field 
    *  (if the channel is an instance of BaseChannel)
    *  </li>
    * </ul>
    */
    public void setConfiguration (Configuration cfg) 
        throws ConfigurationException
    {
        channelNameField = cfg.get("channel-name", null);
        socketInfoField  = cfg.get("socket-info", null);
    }

    public ISOMsg filter(ISOChannel channel, ISOMsg m, LogEvent evt) {
        if (channelNameField != null)
			try {
				m.set(channelNameField, channel.getName());
			} catch (ISOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        if (socketInfoField != null && channel instanceof BaseChannel) {
            Socket socket = ((BaseChannel) channel).getSocket();
            InetSocketAddress remoteAddr =
                (InetSocketAddress) socket.getRemoteSocketAddress();
            InetSocketAddress localAddr =
                (InetSocketAddress) socket.getLocalSocketAddress();

            StringBuilder sb = new StringBuilder();
            if (socketInfoField.equals(channelNameField)) {
                sb.append(channel.getName());
                sb.append(' ');
            }
            sb.append(localAddr.getAddress().getHostAddress());
            sb.append(':');
            sb.append(Integer.toString (localAddr.getPort()));
            sb.append(' ');
            sb.append(remoteAddr.getAddress().getHostAddress());
            sb.append(':');
            sb.append(Integer.toString (remoteAddr.getPort()));
            try {
				m.set (socketInfoField, sb.toString());
			} catch (ISOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        return m;
    }
}