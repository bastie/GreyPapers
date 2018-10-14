/*
 * Copyright (c) 2018, Sͬeͥbͭaͭsͤtͬian.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */package biz.ritter.abc.simple;

import java.util.LinkedList;

import org.mindrot.BCrypt;

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
	private final String hashValuePerviousBlock;
	/**
	 * Unser Kommentar um den Hashcode zu modifizieren.
	 */
	private String comment = "http://www.ritter.biz?";
	
	/**
	 * Der Inhalt des Blockes zum Beispiel Transaktionen.
	 */
	private LinkedList<Object> blockContent = new LinkedList<>();
	
	/**
	 * Erzeugen eines neuen Block mit dem Hashwert des vorhergehenden Blocks.
	 * @param _hashvaluePerviousBlock
	 */
	public SimpleBlockImpl (final String _hashvaluePerviousBlock) {
		this.hashValuePerviousBlock = _hashvaluePerviousBlock;
		this.blockContent.add(777);
	}
	
	/**
	 * Erzeugt einen neuen Kommentar, über den wir den Hashwert anpassen
	 * können.
	 * @param newComment
	 * @return this (Fluent)
	 */
	public SimpleBlockImpl setComment (final String newComment) {
		this.comment += newComment;
		return this;
	}
	
	/**
	 * Erzeugt unseren Hashcode
	 * @return has value for this block
	 */
	public String hashValueThisBlock() {
		final String blockAsString = 
				String.format("%17.17s%3.3s%60.60s",comment,this.blockContent.getFirst().toString(),hashValuePerviousBlock);
		return BCrypt.hashpw(blockAsString, "$2a$12$SB1Hl7wFbv5q5hy62fmG3.");
	}
	
	/**
	 * Hinzufügen eines Inhalt zum Block. In dieser Implementation
	 * gibt es immer nur genau einen Inhalt.
	 * @param newContent content for block
	 * @return this (Fluent)
	 */
	public SimpleBlockImpl addContent (Integer newContent) {
		this.blockContent.set(0,newContent);
		
		return this;
	}

	/**
	 * Liefert den Hashwert des Blockes auf den dieser Block folgen soll.
	 * @return previous block hash value
	 */
	public String getHashValuePrevious() {
		return this.hashValuePerviousBlock;
	}
}
