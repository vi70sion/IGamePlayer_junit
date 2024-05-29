TDD Užduotis
public interface IGamePlayerManager {
// Metodas registruoti naują žaidėją sistemoje
void registerPlayer(String playerId, String playerName);

// Metodas grąžinti žaidėjo duomenis pagal ID
String getPlayerDetails(String playerId);

// Metodas atnaujinti žaidėjo taškus
void updatePlayerScore(String playerId, int scoreToAdd);

// Metodas patikrinti, ar žaidėjas pasiekė naują lygį
boolean checkLevelUp(String playerId);

// Metodas ištrinti žaidėją iš sistemos
boolean deletePlayer(String playerId);
}
TDD Procesas:Parašyti Unit Testus - Prieš rašant funkcijų realizaciją, parašyti testus, 
kurie patikrintų kiekvieną funkciją atsižvelgiant į aprašytas specifikacijas.

Įgyvendinti Funkcijas - Tik tada, kai testai yra parašyti ir jie nepraeina (nes funkcijos neegzistuoja), 
rašyti funkcijų kodą, siekiant praeiti visus testus.

Refaktorizacija - Gavus veikiantį kodą, galima tęsti tobulinant kodo struktūrą ir efektyvumą, užtikrinant, kad testai vis dar praeina.

Aprašymas metodų funkcionalumo:

registerPlayer(String playerId, String playerName) - metodas turėtų registruoti naują žaidėją su unikaliu ID ir vardu.

getPlayerDetails(String playerId) - metodas turėtų grąžinti žaidėjo informaciją (pvz., vardą, taškus, lygį) pagal nurodytą ID.

updatePlayerScore(String playerId, int scoreToAdd) - metodas turėtų pridėti taškus prie žaidėjo sąskaitos. 
Taškai gali būti teigiami arba neigiami.

checkLevelUp(String playerId) - metodas turėtų nustatyti, ar žaidėjas pasiekė pakankamai taškų naujam lygiui ir grąžinti true arba false.

deletePlayer(String playerId) - metodas turėtų ištrinti žaidėją iš sistemos ir grąžinti true, jei ištrynimas pavyko, arba false, jei žaidėjo su tokiu ID nėra.
