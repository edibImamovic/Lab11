public class pravugaonik {

public static void main(String[] args) {

System.out.println(pripremiPravougaonik(15, 15));

}



private static String pripremiPravougaonik(int visina, int sirina) {

String str = "";

str += pripremiPrviIliZadnjiRed(sirina) + "\n";

for (int i = 2; i < visina; i++) {

str += pripremiSrednjiRed(sirina) + "\n";

}

str += pripremiPrviIliZadnjiRed(sirina);

return str;

}



private static String pripremiSrednjiRed(int sirina) {

String str = "";

str += pripremiProizvoljanRed(sirina, 'I', ' ');

return str;

}



private static String pripremiPrviIliZadnjiRed(int sirina) {

String str = "";

str += pripremiProizvoljanRed(sirina, 'A', 'B');

return str;

}



private static String pripremiProizvoljanRed(int sirina, char c, char d) {

String str = "";

str += c;

for (int i = 2; i < sirina; i++) {

str += d;

}

str += c;

return str;



}

}
