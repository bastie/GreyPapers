/*
 * Copyright (c) 2018, Sͬeͥbͭaͭsͤtͬian.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package biz.ritter.abc;

import biz.ritter.abc.simple.SimpleBlockImpl;
import biz.ritter.abc.simple.SimpleBlockchainImpl;

/**
 * Angriff auf die einfache Implementation einer Blockchain
 * 
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
public class AttackBlockChainSimple {

	public AttackBlockChainSimple initalize() {
		return this;
	}
	
	public AttackBlockChainSimple attack () {
		// Erzeugen einer neuen Blockchain mit einem initialen Block
		SimpleBlockchainImpl blockChain = new SimpleBlockchainImpl();

		int i = 0;
		System.out.println(String.format("%010d: %60.60s",++i, blockChain.getLastHashCode()));
		
		// Erzeugen eines zweiten Block
		for (;i< 10;) {
			SimpleBlockImpl newBlock = new SimpleBlockImpl(blockChain.getLastHashCode());
			final int nextContent = ((int)System.currentTimeMillis())%777;
			newBlock.addContent(nextContent);
			blockChain.addNextBlock(newBlock);
			
			System.out.println(String.format("%010d: %60.60s",++i, blockChain.getLastHashCode()));
		}
		
		return this;
	}
}
