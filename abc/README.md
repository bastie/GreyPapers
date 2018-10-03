# Angriff auf Blockchain

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
