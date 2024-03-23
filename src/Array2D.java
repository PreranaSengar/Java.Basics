public class Array2D {
    class Array{
        public static void main(String[] args){
//declaration and initialization
            int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
//how to print
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}