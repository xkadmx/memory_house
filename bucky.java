public class bucky {
    public static void main (String [] args){
        String[] listaSlow1 = {"architekktura wielowarstwowa", "3000 mieszkañców", "rozwi¹zanie B-do-B", "aplikacja kliencka", "interfejs", "inteligentna karta", "rozwi¹zania dynamiczne" , "szerokosc sigma", "przenikliwosc"};
        String[] listaSlow2 = {"zwieksza mo¿liwosci", "poprawia  atrakcyjnosc", "pomna¿a wartoœæ", "opracowana dla", "bazuj¹ca na", "podniesienia na wy¿szy poziom", "skierowanej", "udostepniona"};
        String[] listaSlow3 = {"procesu", "punktu wpisywania" , "rozwi¹zania" , "strategii" , "paradygmatu" , "portalu", "witryny" , "wersji" , "misji"};
        
        int lista1Dlugosc = listaSlow1.length;
        int lista2Dlugosc = listaSlow2.length;
        int lista3Dlugosc = listaSlow3.length;
        
        int rnd1 = (int)(Math.random() * lista1Dlugosc);
        int rnd2 = (int)(Math.random() * lista2Dlugosc);
        int rnd3 = (int)(Math.random() * lista3Dlugosc);
                         
        String zdanie = listaSlow1[rnd1] + " " + listaSlow2[rnd2] + " " + listaSlow3[rnd3];
        
        System.out.println("To jest to, czego nam trzeba :" + zdanie);
    }
}
        

        
        