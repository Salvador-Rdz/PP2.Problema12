/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema12;
import java.util.*;
/**
 *
 * @author Enano
 */
public class PP2Problema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Resolucion     
        print(calcAver(getPar(getInf())));
        
    }
    public static float[] getInf() //Se recibe la información
    {
        float[] numbers=new float [10]; //Se crea un arreglo que guarde los 10 números.
        for(int i=0;i<10;i++)
        {
            Scanner in =new Scanner (System.in);
            System.out.println("Ingrese el número "+(i+1)+" :"); //Se pide el número del 1 al 10. (0+1) Para que no afecte el array
            numbers[i]=in.nextFloat();            
        }
        return numbers;
    }
    public static float[] getPar(float[] num) //Se obtienen los números que se encuentren en los pares del arreglo
    {
        float[] promParNum = new float [4];//
        int counter=0;
        for (int i=0;i<num.length;i++)
        {
            if(i%2==0&&i!=0) //Se revisa si la posición es par. (Se debe notar que inicia en 0, y tomo como par 2, 4, 6 y 8.
            {
                promParNum[counter]=num[i]; //Se guarda el número par en un arreglo.
                counter++;                  //Se incrementa para cambiar el arreglo.
            }
        }
        return promParNum;
    }
    public static float calcAver(float[] par)//Se calcula la media
    {
        float prom=0;
        for(int i=0;i<par.length;i++)
        {
            prom=prom+par[i];   //Se suman los números pares.
        }
        prom=prom/par.length;   //Se divide entre la longitud del arreglo.
        return prom;
    }
    public static void print (float promPares)
    {
        System.out.println("El promedio de los números que se encuentran en coordenadas pares son: "+promPares);
    }
}
