
public class Main {
    public static void main(String[] args) {
    }


    //1. Crea una función que sea checkWordLength(String word) que devuelva la longitud de cada palabra que se le envíe como parámetro.

    public static int checkWordLength(String word) {
        return word.length();
    }
    //Crea una función NumOfVowels(String word) que devuelva el número de vocales que contiene esa palabra. Para poder realizar este ejercicio, deberás descomponer el String en un array de char[] con la función: toCharArray();
    public static int NumOfVowels(String word) {
        char [] letras = word.toCharArray();
        int vocales = 0;
        for (int i = 0;i < letras.length; i++){
            letras [i] = Character.toLowerCase(letras[i]);
            if(letras[i] == 'a' ||letras[i] == 'e'||letras[i] == 'i'||letras[i] == 'o'||letras[i] == 'u'){
                vocales++;
            }

            }
        return vocales;
        }


    public static int checkNumberOfPrimes(int[] numbers) {
        return 0;
    }
    public static boolean isPrime(int i){
        return true;
    }

    public static boolean isIdentityMatrix(int[][] matrix) {
        return true;
    }




}
