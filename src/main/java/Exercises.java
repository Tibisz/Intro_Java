public class Exercises {
    //public class Main {

    //  public static void main(String[] args) {
      /*  System.out.println("Hello, World!");
        System.out.println("Hello, World! " + "15");
        String name = "Ana";
        char character = 'A';
        int varsta = 25;
        boolean activ= true; //false
        double numar = 30.3; //pt numere cu zecimale
        float numar2 = 23.4f; //suporta maxim 7 zecimale ocupa mai putina memorie, trebe pus "f" la sf altfel il considera ca double
        System.out.println(character + name + varsta + activ);
        System.out.println("numele:  " + name +  " varsta " + varsta + "marime adidasi:  " + numar);


        int x, y, z;
        x= 5;
        y= 10;
        z= 15;

       // x=y=z=15;
        System.out.println("Numerele sunt: " + x + " " + y + " " + z);*/

    // Afiseaza numele si varsta
      /*  String name = "Alin Cucu ";
        int age = 30;
        System.out.println(name + age);

        //Afiseaza temperatura corpului

        double temperatura = 36.5;
        System.out.println("Temperatura este: " + temperatura);

        //se printeaza text un numar si boolean
        String text = "da";
        int numar = 31;
        boolean alive = true ;
        System.out.println(text + numar + alive);

        //Creează două variabile text și lipește-le într-un mesaj cu + (ex: "Salut, Ana!").

        String expresie = "Salut";
        String nume2  = "Ana!";
        System.out.println(expresie + nume2);

        //Creează o variabilă de tip char și afișeaz-o într-o propoziție (ex: "Prima literă este: A")

        char character= 'A';
        System.out.println("prima litera este: " + character);

        //Creează o variabilă booleană și folosește-o într-un mesaj

        boolean dead= false;
        System.out.println("Is it dead? "+dead);

        //Scrie un program care folosește print și println

        System.out.print("Hello ");
        System.out.println("Big");
        System.out.println("World");

        //Creează mai multe variabile într-o singură linie

        int a=5, b=10, c=20;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //Creează o variabilă String și afișeaz-o cu un mesaj

        String hey="Hello Tibi";
        System.out.println(hey); */

    //Declară două variabile int și afișează suma, diferența, produsul, câtul și restul împărțirii lor
     /* int a = 10;
      int b = 20;
      System.out.println(a+b);
      System.out.println(a-b);
      System.out.println(a*b);
      System.out.println(a/b);*/

    //Creează o variabilă String numită nume și o variabilă int numită varsta. Afișează un mesaj de forma: "Salut, numele meu este [nume] și am [varsta] ani.

      /*String nume= "Radu";
      int varsta= 30;
      System.out.println("Salut, numele meu este "+nume + " si am varsta "+ varsta +" ani");*/

    //Declară o variabilă double cu o valoare zecimală și convertește-o într-o variabilă int. Afișează ambele valori.
   /*  double a = 10.55 ;
     int da = (int) a;
     System.out.println(da); */

      /* int a = 13;
        System.out.println(a+=3);
        System.out.println(a-=3);
        System.out.println(a*=3);
        System.out.println(a/=3); */

    //Verifică dacă o variabilă int este mai mare decât 100, mai mică sau egală cu 50 și diferită de 75. Afișează rezultatele folosind operatori de comparație.
        /* int a = 47;

         System.out.println(a>100);
        System.out.println(a<=50);
        System.out.println(a!=75);*/

    //Declară trei variabile boolean și construiește expresii logice folosind &&, || și !. Afișează rezultatul fiecărei expresii.

      /*  boolean apa= true;
        boolean foc= false;
        boolean aer= false;

        System.out.println(apa&&foc);
        System.out.println(apa||foc);
        System.out.println(!aer); */

    //Declară trei variabile int (a = 5, b = 10, c = 15) și afișează rezultatul pentru a + b * c, (a + b) * c și c % b.

       /* int a = 5;
        int b = 10;
        int c = 15;

        System.out.println(a+b*c);
        System.out.println((a+b)*c);
        System.out.println(c%b); */

    //8

       /* String prenume= "Geo";
        String nume = "Dasilva";
        String oras = "Bucuresti";
        System.out.println(prenume + nume+ "locuieste in "+ oras); */

     /*   int a = 14;
        System.out.println(a++);
        System.out.println(a--);*/

      /*  int x = 14; int y = 14; int z = 14;
        System.out.println(x+y+z); */

    //if (conditia) { }
       /* int nota= 3;
        if (nota >= 5) {
            System.out.println("esti admis !");
        } else {
            System.out.println("esti respins!" );
        } */

    // if mai scurt scris


      /*  int varsta= 17;
        String acces =(varsta >=18) ? "Permis" : "interzis";
        System.out.println(acces); */

    //switch (valoare) { }
    // case valoare1:
    // break;
    // case valoare2:
    //break;
    // default:
    // }

       /* int zi =3;
        switch (zi) {
            case 1:
                System.out.println("luni");
                break;
            case 2:
                System.out.println("marti");
                break;
            default:
                System.out.println("zi necunoscuta");
        }*/

    //while (conditie) { }

       /* int i =1;
        while (i <=5){
            System.out.println("i= " + i);
            i++;
        }*/

    //do {
    //codul
    // } while (conditile);

      /*  int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i<4); */

    //for (int i - start; conditie; actualizare){ }

    //  for(int i = 1; i<=5; i++){
    //    System.out.println( "pasul este " +i);
    // }

//Verifică dacă un număr întreg este pozitiv, negativ sau zero și afișează un mesaj corespunzător
      /*  int a = 30;
        if (a > 0) {
            System.out.println("a este pozitiv");
        }   else if ( a < 0) {
            System.out.println("a este negativ");
        }   else {
            System.out.println("a este zero");
        } */

    //Afișează toate numerele de la 1 la 10 folosind o buclă for

        /*  for (int i= 1; i<=10; i++){
            System.out.println(i);
        }*/
    //Calculează și afișează suma tuturor numerelor de la 1 la 100 folosind o buclă while

       /* int a =1;
        int b = 0;

        while (a<=100){
            b += a;
            a++;

            System.out.println(b);

        }*/

    //Verifică dacă o literă dată este o vocală sau o consoană folosind switch

       /* char litera= 'e';
        switch (litera) {
            case 'a','e','i','o':
                System.out.println("Litera este vocala");
                break;
            default:
                System.out.println("Litera este consoana");
        } */

    //Verifică dacă un număr este divizibil atât cu 3, cât și cu 5 și afișează un mesaj corespunzător

       /* int a = 12;
        if (a % 3 == 0) {
            System.out.println("a este divizibil cu 3");}
             else if (a % 5 == 0) { System.out.println("a este divizibil cu 5");

            }
             else {System.out.println("nu este divizibil cu 3 sau 5");}*/

    //Afișează un mesaj specific în funcție de o valoare a vârstei: “Copil” (0–12), “Adolescent” (13–17), “Adult” (18+).

     /*   int varsta = 18;
        if (varsta <=12){
            System.out.println("Copil");
        } else if (varsta >=13 && varsta <=17) { System.out.println("Adolescent");

        }
        else  {
            System.out.println("Adult");
        } */

    //Folosește o buclă do...while pentru a afișa un număr de la 1 la 5.

      /*  int i = 0;
        do { System.out.println(i);
        i++; }
        while (i <= 5); */

    //arrays

        /*int[] note = {8,9,10};
        for (int i=0; i<note.length;i++)
            System.out.println("nota: "+ note[i]); */

    //Creează un array cu 5 numere întregi și afișează doar cele pare.

       /* int[] numar = {1,2,3,4,5};
        for (int i=0; i<numar.length; i++)
            if (i % 2 == 0 ) {
                System.out.println(i);
            } */

    //Creează o matrice 3x2 și afișează doar elementele mai mari decât 10.

     /*   int [] [] matrice ={
                {1,2},
                {11,12},
                {3,4}
        };
        for (int i=0; i < matrice.length; i++ ){
            for (int j=0; j < matrice[i].length; j++){
                if (matrice [i][j] > 10){
                    System.out.println("matrice[" + i + "][" + j + "] = " + matrice[i][j]);
                }

            }
        } */

    //Folosește for-each pentru a calcula suma elementelor dintr-un array.

      /*  int[] numere = {4, 2, 6, 11, 5};
        int suma= 0;
        for (int numar : numere) {
            suma += numar;
        }
        System.out.println("suma elementelor: " + suma ); */

//Găsește și afișează indexul unui element într-un array de String.

     /*  String[] module = {"sequencer", "VCO", "VCA", "Filter", "Atenutaor","Effects"};
        String cauta = "Filter";

        for (int i=0; i < module.length; i++){
            if (module[i].equals(cauta)) {
                System.out.println("Elementul \"" + cauta + "\" se află la indexul: " + i);

                break;
          }

       } */

//Caută un număr într-un array 2D și afișează poziția lui (rând, coloană).
     /*   int[][] matrice = {
                {4, 7, 10},
                {2, 15, 8},
                {9, 3, 5}
        };

        int cauta = 3;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] == cauta) {
                    System.out.println("Numărul " + cauta + " se află la: rând " + i + ", coloană " + j);
                    return;
                }
            }
        } */

    //Creează o metodă care aruncă o excepție dacă un String este gol.



    //Creează o clasă Cerc cu un atribut raza și o metodă care calculează și returnează aria cercului (folosind π = 3.14).

    //  class Cerc{


    //  }

    //Creează clasa Elev care moștenește Persoana și are o metodă ce primește media și afișează “Promovat” dacă media ≥ 5, altfel “Nepromovat”.

    class Persoana {
        String nume;
    }

    class Elev extends Persoana {
        public void verificaPromovarea(double media) {
            if (media >= 5) {
                System.out.println("promovat");
            } else {
                System.out.println("nepromovat");
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Elev e1 = new Elev();
            e1.nume = "Radu";
            System.out.println("nume: " + e1.nume);
            e1.verificaPromovarea(6);
        }
    }

//    }

//}
}
