# Angriff auf Blockchain 
AttackBlockChain [ABC] 

## Zusammenfassung
   - Angriff auf einzelne Blöcke der Blockchain
  
## Voraussetzungen
   - Standardblockchain
   - Hashkollisionen
   - langlebige Transaktionsobjekte
  
## Abgrenzung
   - die technische Verbreitung der komprimitierten Blockchain wird nicht betrachtet
  
## Konzept
   - Eine Blockchain wird konzeptionell als sicher auch in dem hier angesprochenden Kontext gesehen.
   - Abweichend wird der einzelne Block als angreifbar betrachtet.
   - Ein Block beinhaltet eine Menge von Transaktionen, welche durch einen Hashwert 'abgesichert' wird.
   - Am Anfang eines Blockes wird der Hash des vorhergehenden Blockes übernommen, um die Blöcke zu einer Kette zu verschmelzen.
   - Diese Hashcode mit den neuen Transaktionen und ein Freitextfeld wird über den (anzugreifenden) neuen Hash abgesichert.
  
   - Eine Transaktion wird nun geändert und über die Freitextmanipulation eine Hashkollision herbeigeführt.
  Anschliessend ist die komplette Blockchain komprimitiert.


## Details

Die Blockchain im Sinne des Whitepaper von Satoshi Nakamato (hier auf Basis der 
deutschen Übersetzung von Bitcoin.de) erstellt eine Kette von Blöcken. Die
Blöcke werden dabei durch einen Hashwert zusammen "geklebt", indem immer der 
Hashwert des Blockes n-1 dem Block n hinzugefügt wird. Mit Hilfe einer "Nonce"
wird hierbei erreicht, dass der Hashwert des Blockes den technischen Erfordernissen
genügt (Anzahl der erforderlichen Nullbits). Hierdurch soll sichergestellt werden,
dass der einzelne Block nicht manipulierbar ist.

Der Block selbst besteht aus einer Anzahl x von Transaktionen, welche jeweils durch
eine Signierung geschützt werden. Hierdurch soll sicher gestellt werden, dass
die einzelne Transaktion nicht manipulierbar ist.

Im Rahmen des ABC wird weder die Blockchain noch die einzelne Transaktion angegriffen. Ziel des Angriffs ist der Block b(orginal) und insbesondere dessen Hashwert. Dazu wird im Rahmen des Angriffs in diesem Block eine Transaktion durch eine andere Transaktion ausgetauscht und der Block b(viral) erzeugt. Entsprechend wird der Block b(orginal)+1 unseren manipulierten Block b(viral) aufgrund der Abweichung des Hashwertes als modifiziert entlarven. Die Blockchain macht es aufgrund der Verkettung der Blöcke nun grds. nötig alle Blöcke b(original)+1 bis b(letzter) neu zu berechnen, oder ...

Es bedarf somit des nächsten Schrittes, der Herbeiführung einer Hashwertkollision. Hierzu wird das "Nonce" im Block b(viral) solange angepasst, bis es zu einer Hashwertkollision mit dem Block b(original) kommt. Der hierdurch entstandene Block b(virus)

Im letzten nicht betrachteten Schritt ist die Blockchain(virus) als allgemein akzeptierte Blockchain zu etablieren.

### Einschränkungen

Der Angriff eignet sich insbesondere für private Blockchain und Transaktionsobjekte, die möglichst lange in keinem neuen Block erscheinen. 

Die Einbringung in eine öffentliche Blockchain bedarf grds. nur der einmaligen Akzeptanz der Blockchainbeteiigten (Nodes). In diesem Sinne ist lediglich einmalig ein erfolgreicher Miningprozess durchzuführen. Aufgrund der derzentralen Synchronisation wird die Blockchain(virus) entsprechend repliziert.

Es Bedarf eine nicht unerheblichen Rechenleistung um zur Hashwertkollision zu kommen. Aufgrund des Moorschen Gesetzes erscheint dies aber auch für derzeit gängige Hashverfahren denkbar.

### Folgerungen

Sofern das hier angedachte Szenario erfolgreich sein kann, ist nicht auszuschließen, dass verbreitete Blockchains wie Bitcoin, Etherium, etc. bereits mit modifizierten Daten betrieben werden.