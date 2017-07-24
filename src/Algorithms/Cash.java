package Algorithms;

/**
 * Created by RENT on 2017-07-24.
 */
public class Cash extends AbstractAlgoritm {
    @Override
    public String getName() {
        return " Cash";
    }

    @Override
    public void runAlgoritm(String[] input) {
       int zl =Integer.parseInt(input[1]);
       int gr =Integer.parseInt(input[2]);
        int[] baknoty=new int[]{200,100,50,20,10,5,2,1};
        int[] grosze = new int[]{50,20,10,5,2,1};
        int[] iloscBak = new int[]{0,0,0,0,0,0,0,0};
        int[] iloscGr = new int[]{0,0,0,0,0,0};

        while(zl > 0){
            for (int i= 0; i < baknoty.length; i++){
                if(zl>=baknoty[i]){
                    zl=zl-baknoty[i];
                    iloscBak[i]++;
                    break;
                }
            }
        }

        while(gr>0){
            for (int i= 0; i < grosze.length; i++){
                if(gr>=grosze[i]){
                    gr=gr-grosze[i];
                    iloscGr[i]++;
                   /// System.out.println(iloscGr[i]);
                    break;
                }
            }
        }

        for (int i =0; i<iloscBak.length;i++){
            System.out.printf("%d x %d\n", iloscBak[i], baknoty[i]);
        }
        System.out.println();
        for(int i=0; i<iloscGr.length;i++){
            System.out.printf("%d x %d\n",iloscGr[i],grosze[i]);
        }


    }

}

