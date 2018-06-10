package de.dfki.iui.basys.runtime.communication;

import java.io.IOException;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple utility for getting the local host name.
 * <p>
 * 
 * @author Aaron Smuts
 */
public class CommUtils {

	/** The logger. */
	private static final Logger LOGGER = LoggerFactory.getLogger(CommUtils.class);


	public static ArrayList<String> serverList = new ArrayList<>(Arrays.asList("lns-90165.sb.dfki.de", "basys-lnv-1", "10.2.10.4", "localhost" ));
	
	public static String getPreferredBasysMiddleware() throws UnknownHostException {

		
		for (int i = 0; i < serverList.size(); i++) {

			try {
				InetAddress address = InetAddress.getByName(serverList.get(i));
				if (address.isReachable(10000)) {
					return address.getHostName();
				}
			} catch (IOException e) {
				// do nothing
			}
		}
		
		throw new UnknownHostException("Cannot reach the BaSys 4.0 middleware");
		
	}
	
	
	/**
	 * Gets the address for the local machine.
	 * <p>
	 * 
	 * @return InetAddress.getLocalHost().getHostAddress()
	 * @throws UnknownHostException
	 */
	public static String getLocalHostAddress() throws UnknownHostException {
		try {
			String hostAddress = getLocalHostLANAddress().getHostAddress();
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("hostAddress = [" + hostAddress + "]");
			}
			return hostAddress;
		} catch (UnknownHostException e1) {
			LOGGER.error("Couldn't get localhost address", e1);
			throw e1;
		}
	}

	/**
	 * Returns an <code>InetAddress</code> object encapsulating what is most likely
	 * the machine's LAN IP address.
	 * <p>
	 * This method is intended for use as a replacement of JDK method
	 * <code>InetAddress.getLocalHost</code>, because that method is ambiguous on
	 * Linux systems. Linux systems enumerate the loopback network interface the
	 * same way as regular LAN network interfaces, but the JDK
	 * <code>InetAddress.getLocalHost</code> method does not specify the algorithm
	 * used to select the address returned under such circumstances, and will often
	 * return the loopback address, which is not valid for network communication.
	 * Details <a href=
	 * "http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4665037">here</a>.
	 * <p>
	 * This method will scan all IP addresses on all network interfaces on the host
	 * machine to determine the IP address most likely to be the machine's LAN
	 * address. If the machine has multiple IP addresses, this method will prefer a
	 * site-local IP address (e.g. 192.168.x.x or 10.10.x.x, usually IPv4) if the
	 * machine has one (and will return the first site-local address if the machine
	 * has more than one), but if the machine does not hold a site-local address,
	 * this method will return simply the first non-loopback address found (IPv4 or
	 * IPv6).
	 * <p/>
	 * If this method cannot find a non-loopback address using this selection
	 * algorithm, it will fall back to calling and returning the result of JDK
	 * method <code>InetAddress.getLocalHost</code>.
	 * <p>
	 * <a href="http://issues.apache.org/jira/browse/JCS-40">JIR ISSUE JCS-40</a>
	 * <p>
	 * 
	 * @return InetAddress
	 * @throws UnknownHostException
	 *             If the LAN address of the machine cannot be found.
	 */
	public static InetAddress getLocalHostLANAddress() throws UnknownHostException {
		try {
			InetAddress candidateAddress = null;
			// Iterate all NICs (network interface cards)...
			for (Enumeration<NetworkInterface> ifaces = NetworkInterface.getNetworkInterfaces(); ifaces
					.hasMoreElements();) {
				NetworkInterface iface = ifaces.nextElement();
				// Iterate all IP addresses assigned to each card...
				for (Enumeration<InetAddress> inetAddrs = iface.getInetAddresses(); inetAddrs.hasMoreElements();) {
					InetAddress inetAddr = inetAddrs.nextElement();
					if (!inetAddr.isLoopbackAddress()) {
						if (inetAddr.isSiteLocalAddress()) {
							// Found non-loopback site-local address. Return it immediately...
							return inetAddr;
						} else if (candidateAddress == null) {
							// Found non-loopback address, but not necessarily site-local.
							// Store it as a candidate to be returned if site-local address is not
							// subsequently found...
							candidateAddress = inetAddr;
							// Note that we don't repeatedly assign non-loopback non-site-local addresses as
							// candidates,
							// only the first. For subsequent iterations, candidate will be non-null.
						}
					}
				}
			}
			if (candidateAddress != null) {
				// We did not find a site-local address, but we found some other non-loopback
				// address.
				// Server might have a non-site-local address assigned to its NIC (or it might
				// be running
				// IPv6 which deprecates the "site-local" concept).
				// Return this non-loopback candidate address...
				return candidateAddress;
			}
			// At this point, we did not find a non-loopback address.
			// Fall back to returning whatever InetAddress.getLocalHost() returns...
			InetAddress jdkSuppliedAddress = InetAddress.getLocalHost();
			if (jdkSuppliedAddress == null) {
				throw new UnknownHostException("The JDK InetAddress.getLocalHost() method unexpectedly returned null.");
			}
			return jdkSuppliedAddress;
		} catch (Exception e) {
			UnknownHostException unknownHostException = new UnknownHostException(
					"Failed to determine LAN address: " + e);
			unknownHostException.initCause(e);
			throw unknownHostException;
		}
	}
}
