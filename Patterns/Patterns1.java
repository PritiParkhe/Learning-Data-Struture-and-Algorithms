public class Patterns1{

  public static void rectanglePattern(){
    int n = 4;
    int m = 5;

    // Outer loop
    for( int i=1; i<=n; i++){
      // Inner loop
      for(int j=1; j<=m; j++){
        System.out.print("*");
      }
      System.out.println("");
    }

  }

  public static void hollowRectangle(){
   /* 
      *******
      *     *
      *     *
      ******* 
    */
    int n = 4;
    int m = 5;

    // Outer loop
    for(int i=1; i<=n; i++){
      // Inner loop
      for(int j=1; j<=m; j++){
        // in cell(i,j)
        if(i == 1 || j == 1 || i == n|| j == m){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
  }

  public static void halfPyramid(){
    /*
        *
        **
        ***
        ****
    */
    int n = 4;

    // Outer loop for row (row no = no of cols)
    for(int i =1; i<=n; i++){
      // Inner loop
      for( int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println("");
    }
  }

  public static void invertedHalfPyramid(){
    /*
        ****
        ***
        **
        *
    */ 
    int n = 4;
    // Outer loop
    for(int i=n; i>=1; i--){
      // inner loop
      for( int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println("");
    }
  }

  public static void invertedHalfPyramid_Rotatedby180(){
    /*
          *
         **
        ***
       ****  

     */
    int n = 4;

    for(int i=1; i<=n; i++){
      // inner loop for space
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }

      // inner loop for stars
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }

      System.out.println();
    }
  }
  public static void halfPyramidWithNo(){
    int n =5;
    /*
      1
      1 2
      1 2 3
      1 2 3 4
      1 2 3 4 5

     */

    // Outer loop
    for(int i=1; i<=n; i++){
      // Inner loop for printing no
      for(int j=1; j<=i; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  public static void invertedHalfPyramidwithNo(){
    /*
      1 2 3 4 5 
      1 2 3 4
      1 2 3
      1 2
      1
     */
    int n = 5;

    // outer loop
    for(int i=1; i<=n; i++){
      // innerloop
      for(int j=1; j<=n-i+1; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }

  }

  public static void floydTriangle(){
    /*
      1 
      2 3
      4 5 6
      7 8 9 10
      11 12 13 14 15
    */
    int n = 5;
    int number = 1;

    // outer loop 
    for(int i=1; i<=n; i++){
      // innerloop
      for(int j=1; j<=i; j++){
        System.out.print(number + " ");
        number++;
      }
      System.out.println();
    }
  }

  public static void triangleWithNo01(){
    /*
      1 
      0 1
      1 0 1
      0 1 0 1
      1 0 1 0 1
     */
    int n = 5;

    // outer loop for row
    for(int i=1; i<=n; i++){
      // Inner loop 
      for(int j=1; j<=i; j++){
        int sum = i+j;
        if(sum % 2 == 0){ //Even
          System.out.print("1" + " ");
        } else{//odd
          System.out.print("0" + " ");
        }
      }
      System.out.println();
    }

  }
  public static void main (String args[]){
    rectanglePattern();
    hollowRectangle();
    halfPyramid();
    invertedHalfPyramid();
    invertedHalfPyramid_Rotatedby180();
    halfPyramidWithNo();
    invertedHalfPyramidwithNo();
    floydTriangle();
    triangleWithNo01();
    
  }
}