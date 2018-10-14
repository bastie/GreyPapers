/*
 * Copyright (c) 2018, Sͬeͥbͭaͭsͤtͬian.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */package biz.ritter.abc.simple;

/**
 * Einfache Implementation eines Blockes zur GreyPaper Visualisierung
 * 
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
public class SimpleBlockImpl {

	/**
	 * Jeder Block enthält den Hashwert des vorhergehenden Blockes
	 * als Kleber für die Kettenglieder.
	 */
	private final String hashvaluePerviousBlock;
	
	public SimpleBlockImpl (final String _hashvaluePerviousBlock) {
		this.hashvaluePerviousBlock = _hashvaluePerviousBlock;
	}
	
	
}
