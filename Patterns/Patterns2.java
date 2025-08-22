
public class Patterns2{
  // most imp thing is to reverse the pattern lower part as same like upper 
  // simply flip then => logic of outter loop  
  // => because the whole inner loop is depends on outer loop 
  // when outerloop logic is reverse then 
  // inner loop logic is also reverse
  public static void butterflyPattern(){
    /*
        *      *
        **    **
        ***  ***
        ********
        ********
        ***  ***
        **    **
        *      *
     */
    int n = 4;

    // Uppper half
    for(int i=1; i<=n; i++){
      
      //  star for 1st 
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }

      // spaces
      int spaces = 2 * (n-i);
      for(int j=1; j<=spaces; j++){
        System.out.print(" ");
      }

      // 2nd part
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    // Lower half
    for(int i=n; i>=1; i--){
      
      //  star for 1st 
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }

      // spaces
      int spaces = 2 * (n-i);
      for(int j=1; j<=spaces; j++){
        System.out.print(" ");
      }
      
      // 2nd part
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

public static void solidRhombus(){
  /*
    *****
   *****
  *****
 *****
*****
*/
  int n = 5; 
  for(int i=1; i<=n; i++){
    // for spaces
   
    for(int j=1; j<=n-i; j++){
      System.out.print(" ");
    }
    for(int j=1; j<=5; j++){
      System.out.print("*");
    }
    System.out.println("");
  }
}

public static void numberPyramid(){
  /*

    1 
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

   */
  int n = 5;
  for(int i=1; i<=n; i++){
    // spaces
    for(int j=1; j<=n-i; j++){
      System.out.print(" ");
    }

    // number (now is row times no)
    for(int j=1; j<=i; j++){
      System.out.print(i + " ");
    }
    System.out.println();
  } 
}

public static void palindromicPattern(){
  /*
    1
   212
  32123
 4321234
543212345
   */
  int n = 5; 

  for(int i=1; i<=n; i++){
    // spaces
    for(int j=1; j<=n-i; j++){
      System.out.print(" ");
    }

    //1st half numbers
    for(int j=i; j>=1; j--){
      System.out.print(j);
    }
    // 2nd half numbers
    for(int j=2; j<=i; j++){
      System.out.print(j);
    }
    System.out.println();

  }

}

public static void diamond(){
  /*
   *
  ***
 *****
*******
*******
 *****
  ***
   *
   */
  int n = 4;
  // Upper half
  for(int i=1; i<=n; i++){
    // spaces
    for(int j=1; j<=n-i; j++){
      System.out.print(" ");
    }

    for(int j=1; j<=2*i-1; j++){
      System.out.print("*");
    }
    System.out.println();
  }
  // Lower half
  for(int i=n; i>=1; i--){
    // spaces
    for(int j=1; j<=n-i; j++){
      System.out.print(" ");
    }

    for(int j=1; j<=2*i-1; j++){
      System.out.print("*");
    }
    System.out.println();
  }
}
  public static void main(String args[]){
    //  butterflyPattern();
    // solidRhombus();
    // numberPyramid();
    // palindromicPattern();
    diamond();
  }
}