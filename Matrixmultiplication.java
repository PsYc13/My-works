/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adi;

/**
 *
 * @author Psyc
 */
public class Matrixmultiplication {
    public static void main(String args[]){
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               c[i][j]=0;
               for(int k=0;k<3;k++)
               {
                   c[i][j]+=a[i][k]*b[k][j];
               }  
               System.out.println(c[i][j]+"");
            }    
        }    
}}
