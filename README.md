# Java projekt určený pre online školenie Java Developer Junior 2025_1
Súbor zdrojových ukážkových Java kódov určených pre online vzdelávanie Java Developer Junior 2025, skupina č.1

Tu bude nejaký ďalší popis
Toto je **tučný text**.

Toto je *šikmý text*.

Toto je zdrojový kód:

``` 
// Kazdy program bude zacinat triedou, cize musime pouzit klucove slovo class a obycajne aj v spojenie s public
// Nazov triedy koresponduje s konvenciou Camel, cize budeme pouzivate velke a male pisme a viacere slova oddelime velkymi pismenami
public class HelloWorld {
    public static void main(String[] args) { // Metoda main je dolezita pre spustenie programu
        System.out.println("\nHello, \nWorld!"); // System.out.println je kombinacia Java prikazov, ktore vypisuju do "konzoly" = Run dialogu a zaroven text potvrdia "Enter-om"
        System.out.println("Ján Žitniak");
        System.out.println("Online kurz Java Developer Junior");
        System.out.print("Nejaký text č.1");
        // Ukazka Escape characters (znakov)
        // Kombinacia znakov \n vlozi novy riadok
        System.out.print("\n\n\nNejaký text č.2"); // AltGr + q     vpise znak \
        System.out.println("\n\tOdsadený text");

        System.out.println("Vypisať uvodzovku môžeme takto: \" ");
        System.out.println("Vypisať apostrof môžeme takto: \' ");
        System.out.println("Vypisať spätnú lomku môžeme takto: \\ ");
        System.out.print("Použiť backspace môžeme takto\b: ");
        //System.out.print("YYY");
        System.out.println("\rXXX");

        System.out.println(20);
        System.out.println(1.2);

        System.out.println("Text pred\fText po");
    }
} // AltGr + n  vlozi zlozenu zatvorku, teda }
```

a tu je ďalšia ukážka Markdown značiek vrátane jednoduchého popisu projektu

# 🌟 Jednoduchý Java projekt – Pozdrav

Tento projekt je jednoduchý Java program, ktorý sa opýta používateľa na jeho meno a potom ho pozdraví.

## 📌 Požiadavky
- **Java JDK** (verzia 8 alebo novšia)
- Terminál alebo príkazový riadok

## 🚀 Ako spustiť program

1. Naklonujte tento repozitár alebo si stiahnite súbor `HelloUser.java`.
2. Otvorte terminál a prejdite do priečinka so súborom.
3. Spustite tieto príkazy:

```bash
# Kompilácia programu
javac HelloUser.java

# Spustenie programu
java HelloUser
