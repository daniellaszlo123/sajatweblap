package halallabirintusproba;

import java.util.Random;
import java.util.Scanner;

public class HalalLabirintus {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int beker;
        int ugyesseg, eletero, szerencse;

        ugyesseg = 6 + rnd.nextInt(6) + 1;
        eletero = 12 + rnd.nextInt(12) + 1;
        szerencse = 6 + rnd.nextInt(6) + 1;
        
        String oldal1, oldal56, oldal66, oldal137, oldal215, oldal270, oldal293, oldal373, oldal387;

        oldal1 = "Miután öt percet haladtál lassan az "
                + "alagútban, egy kőasztalhoz érsz, amely a bal "
                + "oldali fal mellett áll. Hat doboz van rajta, "
                + "egyikükre a te neved festették. Ha kiakarod "
                + "nyitni a dobozt, lapozz a 270-re. Ha inkább "
                + "tovább haladsz észak felé, lapozz a 66-ra.";

        oldal56 = "Látod, hogy az akadály egy "
                + "széles, barna, sziklaszerű tárgy. "
                + "Megérinted, és meglepve tapasztalod, "
                + "hogy lágy, szivacsszerű. Ha át szeretnél"
                + " mászni rajta, lapozz a 373-ra. Ha ketté "
                + "akarod vágni a kardoddal, lapozz a 215-re.";

        oldal66 = "Néhány perc "
                + "gyaloglás után "
                + "egy elágazáshoz érsz az alagútban."
                + " Egy, a falra festett fehér nyíl nyugatfelé mutat."
                + " A földön nedves lábnyomok jelzik, merre haladtak az "
                + "előtted járók. Nehéz biztosan megmondani, de úgy tűnik, "
                + "hogy három közülük a nyíl irányába halad, míg egyikük úgy "
                + "döntött, hogy keletnek megy. Ha nyugat felé kívánsz menni, "
                + "lapozz a 293-ra. Ha keletnek, lapozz a 56-re.";

        oldal137 = "Ahogy végigmész az alagúton, csodálkozva látod, hogy egy jókora vasharang csüng alá a boltozatról.";

        oldal215 = "Kardod könnyedén áthatol a spóragolyó "
                + "vékonykülső burkán. Sűrű barna spórafelhő "
                + "csap ki a golyóból, és körülvesz. Némelyik "
                + "spóra a bőrödhöz tapad, és rettenetes viszketést "
                + "okoz. Nagy daganatok nőnek az arcodon és karodon, "
                + "és a bőröd mintha égne. 2 ÉLETERŐ pontot veszítesz. "
                + "Vadul vakarózva átléped a leeresztett golyót, és keletnek "
                + "veszed az utad.";

        oldal270 = "A doboz teteje könnyedén nyílik. "
                + "Benne két aranypénzt találsz, és "
                + "egy üzenetet, amely egy kis pergamenen "
                + "neked szól. Előbb zsebre vágod az aranyakat,"
                + " aztán elolvasod az üzenetet: - „Jól tetted. "
                + "Legalább volt annyi eszed, hogy megállj és elfogadd"
                + " az ajándékot. Most azt tanácsolom neked, hogy keress"
                + " és használj különféle tárgyakat, ha sikerrel akarsz áthaladni"
                + " Halállabirintusomon.” Azaláírás Szukumvit. Megjegyzed a tanácsot,"
                + " apródarabokra téped a pergament, és tovább mészészak felé. Lapozz a 66-ra.";

        oldal293 = "A három pár nedves lábnyomot követve az alagútnyugati"
                + " elágazásában hamarosan egy újabb el-ágazáshoz érsz."
                + " Ha továbbmész nyugat felé a lábnyomokat követve, lapozz "
                + "a 137-re. Ha inkább észak felé mész a harmadik pár lábnyom után, lapozz a 387-re.";

        oldal373 = "Fölmászol a lágy sziklára, attól tartasz, hogy "
                + "bár-melyik pillanatban elnyelhet. Nehéz átvergődni "
                + "rajta, mert puha anyagában alig tudod a lábadat emelni,"
                + " de végül átvergődsz rajta. Megkönnyebbülten érsz újra "
                + "szilárd talajra, és fordulsz kelet felé.";

        oldal387 = "Hallod, hogy elölről súlyos lépések közelednek. "
                + "Egy széles, állatbőrökbe öltözött, kőbaltás, primitívlény "
                + "lép elő. Ahogy meglát, morog, a földre köp, majd a kőbaltát "
                + "felemelve közeledik, és mindennek kinéz, csak barátságosnak nem."
                + " Előhúzod kardodat, és felkészülsz, hogy megküzdj a Barlangi Emberrel.";

        System.out.println("Kezdés!");
        System.out.println("Egy versenyre nevezel, aminek a lényege, "
                + "hogy át kell kelni a halállabirintuson. A labirintusban tárgyakat "
                + "találhatsz és szörnyekkel kell harcoljál.");
        System.out.printf("Ügyességed: %d, Életerőd: %d, Szerencséd: %d\n", ugyesseg, eletero, szerencse);
        
        String allapot="Egyelőre a játék véget ért. Jelenlegi állapotod változatlan."
                + " Ügyességed: %d, Életerőd: %d, Szerencséd: %d\n";
        String bekeres="Hova szeretnél tovább menni? Oldalszám: ";
        
        System.out.println("1. oldal");
        System.out.println(oldal1);
        System.out.print(bekeres);
        beker = sc.nextInt();

        if (beker == 270) {
            System.out.println(oldal270);
            System.out.print(bekeres);
            beker = sc.nextInt();
            if (beker == 66) {
                System.out.println(oldal66);
                System.out.print(bekeres);
                beker = sc.nextInt();
                if (beker == 293) {
                    System.out.println(oldal293);
                    System.out.print(bekeres);
                    beker = sc.nextInt();
                    if (beker == 137) {
                        System.out.println(oldal137);
                        System.out.printf(allapot, ugyesseg, eletero, szerencse);
                    } else if (beker == 387) {
                        System.out.println(oldal387);
                        System.out.printf(allapot, ugyesseg, eletero, szerencse);
                    }
                } else if (beker == 56) {
                    System.out.println(oldal56);
                    System.out.print(bekeres);
                    beker = sc.nextInt();
                    if (beker == 373) {
                        System.out.println(oldal373);
                        System.out.printf(allapot, ugyesseg, eletero, szerencse);
                    } else if (beker == 215) {
                        System.out.println(oldal215);
                        System.out.printf(allapot, ugyesseg, eletero, szerencse);
                    }
                }
            }
        }

    }

}
