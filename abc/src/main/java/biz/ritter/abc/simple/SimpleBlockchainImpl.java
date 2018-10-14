/*
 * Copyright (c) 2018, Sͬeͥbͭaͭsͤtͬian.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package biz.ritter.abc.simple;

import java.util.LinkedList;

/**
 * Einfache Implementierung einer Blockchain zur GreyPaper Visualisierung 
 * 
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
public class SimpleBlockchainImpl {

	/**
	 * Die Blockchain als verkette Liste
	 */
	private LinkedList<SimpleBlockImpl> chain = new LinkedList<SimpleBlockImpl>();
	
	/**
	 * Standarkonstruktor
	 */
	public SimpleBlockchainImpl () {
		chain.add(new SimpleBlockImpl("No previous block"));
	}
	
	public SimpleBlockchainImpl addNextBlock (SimpleBlockImpl newBlock) {
		final String previousHashValue = newBlock.getHashValuePrevious();
		if (previousHashValue.equals(this.getLastHashCode())) {
			this.chain.add(newBlock);
		}
		else {
			throw new IllegalArgumentException("This block does not follow!");
		}
		
		return this;
	}
	
	/**
	 * Liefert den letzten Blockhash zurück
	 * @return
	 */
	public String getLastHashCode () {
		return chain.getLast().hashValueThisBlock ();
	}
}
