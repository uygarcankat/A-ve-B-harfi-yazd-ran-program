public class Shape {
    public static void main(String[] args) {

        System.out.println("***************************************** A HARFİ BASTIRAN PROGRAM**************************************");
        String[][] Harf = new String[5][9];


        for(int j=4, i =0; 0<=j && i<Harf.length ; j--,i++) {


                Harf[i][j] = "*";

            }

        for(int j=5, i =1; j<=8 && i<Harf.length ; j++,i++){

            Harf[i][j] ="*";

        }

        for(int i=2,j=3; j<=5;j++ ){


            Harf[i][j]="*";

        }

        for(String []row : Harf){
            for(String column: row){
                if(column==null){
                    column=" ";
                }
                System.out.print(column+ " ");
            }
            System.out.println();
        }


        System.out.println("*************************** B HARFİ YAZDIRAN PROGRAM ***************************************");


        String[][] yildiz = new String[7][4];

        for (int i = 0; i < yildiz.length; i++) {
            for (int j = 0; j < yildiz[i].length; j++) {
                if (i == 0 || i == 3 || i== 6) {
                    yildiz[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    yildiz[i][j] = " * ";
                } else {
                    yildiz[i][j] = "   ";
                }
            }
        }

        for(int i=0;i<yildiz.length;i++){
            for(int j=0; j<yildiz[i].length ;j++){

                System.out.print(yildiz[i][j]);

            }
            System.out.println();
        }
    }
}


