package DSA2.romanToInteger.rotateImage;

public class Main {
    public static void main(String []args){


        int [][] image = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                image[i][j]=i+j;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(image[i][j]);

            }
            System.out.println();
        }
        ImageRotator imageRotator=new ImageRotator();
        imageRotator.rotate(image);

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(image[i][j]);

            }
            System.out.println();
        }
    }
}
