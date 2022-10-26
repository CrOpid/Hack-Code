class RotateImage. {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){//transposing matrix
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
       for(int i=0;i<matrix.length;i++){//reversing matrix
            reverse(matrix[i]);
        }
         for(int i=0;i<matrix.length;i++){//printing answer
            for(int j=0;j<matrix.length;j++){
               System.out.print(matrix[i][j]+" ");
            }
        }
    }
    public void reverse(int[] arr){
        int i=0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
}
    }
}
