package in.prec.logicalprograms.pyramid;

public class Pyramid {
    int limit;

    public Pyramid(int limit) {
        this.limit = limit;
    }

    public void printPyramid() {
        int number = 1;
        char character = 'A';

        for (int row = 1; row <= limit; row++) {
            // Print spaces
            for (int space = 1; space <= limit - row; space++) {
                System.out.print("\t");
            }

            // Print numbers or characters
            for (int col = 1; col <= row; col++) {
//                if (row % 2 != 0) {
//                    System.out.print(number++ + "\t \t");
//                } else {
//                    System.out.print(character++ + "\t \t");
//                }
            	
//            	if(row%2==0) {
//            		if(col%2==0) {
//                System.out.print(number++ + "\t \t");
//            		}
//            		else {
//               System.out.print(character++ + "\t \t");
//
//            		}
//            	}
//            	else {
//            		if(col%2==0) {
//                        System.out.print(character++ + "\t \t");
//                    		}
//                    		else {
//                       System.out.print(number++ + "\t \t");
//
//                    		}
//            	}.
            	 System.out.print((row%2==0)? ((col%2==0)? (number++ + "\t \t"):(character++ + "\t \t")):((col%2==0)? (character++ + "\t \t"):(number++ + "\t \t")));
            }

            // Move to the next row
            System.out.println();
            System.out.println();

 
        }
    }
}
