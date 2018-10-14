/*
 * Copyright (c) 2018, Sͬeͥbͭaͭsͤtͬian.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package biz.ritter.abc;

/**
 * 
 * Implementation eines einfachen Angriffs auf Blockchains
 * 
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
public class AttackBlockChainApplication {

	/**
	 * Startet einen Angriff auf die angegebenen Blockchain
	 * @param arguments ignored
	 */
	public static void main(final String ... arguments) {
		for (String argument : arguments) {
			switch (argument) {
				default:
					
			}
		}
		new AttackBlockChainSimple().initalize().attack();
	}
	
}
