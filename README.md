# Card game

## An example run

```console
Game of Cards
status
 Nr. of cards in deck: '52'
 Hand: ''
restart 2
 Game restarted
status
 Nr. of cards in deck: '104'
 Hand: ''
restart simple
 Game restarted
status
 Nr. of cards in deck: '9'
 Hand: ''
status deck
 Deck: 'AS AS AH AC AT KH KT KH KS'
draw
 Drew 'KS'
status deck hand
 Hand: 'KS'
 Deck: 'AS AS AH AC AT KH KT KH'
draw
 Drew 'KH'
status deck hand
 Hand: 'KS KH'
 Deck: 'AS AS AH AC AT KH KT'
sort
 Sorted deck
status deck
 Deck: 'AC AT KT AH KH AS AS'
shuffle
 Shuffled deck
status deck
 Deck: 'AS AC AH AT KT AS KH'
restart
 Nr. of cards in deck: '52'
 Hand: ''
draw s
 Failed to process command
draw 5
 Drew 'KS KH KT KC QS'
staus
 Unknown command
status
 Nr. of cards in deck: '47'
 Hand: 'KS KH KT KC QS'
```
