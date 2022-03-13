public class Tablica {
    public static void main(String[] args) {
        int tab[]={2,1,3,4,5,6,7,8,9,10};
        int tab2[]={12,13,14,15,16,17,18,19,20,21};
        for(int i = 0;i<tab.length; i++){
            System.out.print(tab[i]);
            System.out.print("\t\t");
            System.out.print(tab2[i]);
            System.out.print("\t\t");
            System.out.println(tab2[i]*tab2[i]);
        }
    }
}
