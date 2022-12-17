/*Esercizio 3 (si potrebbe usare come implementazione dell’esercizio 1)
Scrivere un programma che generi un numero casuale e lo associ ad una delle seguenti risposte:
- Giornata fortunata
- Potrebbe andare meglio
- I prossimi giorni saranno migliori
- Oggi è un giorno eccezionale
(è possibile eventualmente inserirne altre)
*/
public class RandomFortune {
    public static void main(String[] args) {
        System.out.println("HAPPY RANDOM FORTUNE FOR YOU, BABY!");

        int giorno= (int) (Math.random()*31) +1;
        System.out.print("Per la data " +giorno + " io ti dico ");

        if(giorno>=1 && giorno<=5){
            System.out.print("Potrebbe andare meglio!\n");}
        else if(giorno>=6 && giorno<=12){
                System.out.print("Giornata fortunata!\n");}
        else if(giorno>=13 && giorno<=17){
            System.out.print("Io oggi nei tuoi panni non uscirei da casa!\n");}
        else if(giorno>=18 && giorno<=23){
            System.out.print("Oggi vinci la lotteria!\n");}
        else if(giorno>=24 && giorno<=28){
            System.out.print("Il mondo finisce fra poco...\n");}
        else if(giorno>=29 && giorno<=31){
            System.out.print("Non fare caso a ciò che ti dicono gli altri...\n");}
    }
}