package DSA2.romanToInteger.rotateImage;



public class ImageRotator {

    public void rotate(int [][] image){
        int n=image.length-1;
        for(int i=0;i<=n/2;i++){
            for(int j=i;j<n-i;j++){
                int temp=image[i][j];
                image[i][j]=image[n-j][i];
                image[n-j][i]=image[n-i][n-j];
                image[n-i][n-j]=image[j][n-i];
                image[j][n-i]=temp;
            }
        }
    }
}
