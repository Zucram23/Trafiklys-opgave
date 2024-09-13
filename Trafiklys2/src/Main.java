import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //vi importerer en scanner til brugerinput.
        Scanner input = new Scanner(System.in);

        //vores variabler.
        String tid = "";
        String trafik = "";
        String område = "";
        String nøds = "";

        //Indtastning af data fra brugeren
        System.out.println("Indtast tid på dagen (dag,aften,nat)");
        tid = input.nextLine();

        System.out.println("indtast trafikmængde(høj,lav)");
        trafik = input.nextLine();

        System.out.println("Indtast områdets type(Bolig,Erhverv,blandet)");
        område = input.nextLine();

        System.out.println("Er der en nødssituation? (true/false)");
        nøds = input.nextLine();

        //nogle if statements til finde ud af hvad lyset skal være, i hvilke situationer.
        if ((tid.equals("dag"))&&(trafik.equals("lav")||(nøds.equals("true"))) ) {
            System.out.println("Trafiklyset er grønt");

        }
        else if(tid.equals("aften")||(tid.equals("nat")&&(trafik.equals("lav"))) ){
            System.out.println("Trafiklyset er gult");
        }
        else {
            System.out.println("Trafiklyset er rødt");
        }

        //If statements til at finde ud af om der skal være "adgang tilladt" eller "adgang nægtet"
        if(område.equals("erhverv")||(område.equals("blandet")&&(trafik.equals("lav")))) {
            System.out.println("adgang tilladt");
        }

        else if (nøds.equals("true")) {
            System.out.println("adgang");
        }

        else if (område.equals("bolig")&&(tid.equals("nat"))){
            System.out.println("adgang nægtet");
        }




    }
}