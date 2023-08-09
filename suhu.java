        import java.util.Scanner;

        public class suhu {
            public static void main(String[] args) {
                Scanner suhu = new Scanner(System.in);

                System.out.println("masukan Suhu celcius");
                Double C = suhu.nextDouble();

                System.out.println("Pilih opsi"); System.out.println("1.Suhu Farenheit"); System.out.println("2.Suhu Reamur"); System.out.println("3.Suhu Kelvin"); 

                int opsi = suhu.nextInt();

                if(opsi == 1){double F = (C * 9/5) + 32;
                System.out.println(C + " Adalah " + F );}

                else if (opsi == 2){double R = (C * 4/5);
                System.out.println(C + " Adalah " + R );}

                else if (opsi == 1){double K = (C + 273);
                System.out.println(C + " Adalah " + K );}

                else{System.out.println("System Eror 404");
            
        }


            }
            
        }
