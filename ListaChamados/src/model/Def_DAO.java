/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;
import static model.Variables_DAO.j;
import static model.Variables_DAO.j2;
import static model.Variables_DAO.l;
import static model.Variables_DAO.l2;
import static model.Variables_DAO.m;
import static model.Variables_DAO.m2;
import static model.Variables_DAO.n;
import static model.Variables_DAO.n2;
import static model.Variables_DAO.numNormal;
import static model.Variables_DAO.numPreferencial;
import static model.Variables_DAO.numero;
import static model.Variables_DAO.o;
import static model.Variables_DAO.o2;
import static model.Variables_DAO.p;
import static model.Variables_DAO.p2;
import static view.Window_GUI.lbl_NormPref;
import static view.Window_GUI.lbl_num;
import static view.Window_GUI.lbl_old1;
import static view.Window_GUI.lbl_old2;
import static view.Window_GUI.lbl_old3;
import static view.Window_GUI.lbl_old4;

public class Def_DAO {
    public static int Sorteia(){
        
        Random random = new Random();
        numero = random.nextInt(100);
        return numero; 
    }
    public static void Armazena(int x){
        
            numNormal[j]=x;
            j++;
            if(j==5){
                j=0;
            }
            l++;
            m++;
            n++;
            o++;
            p++;
            
            if(l==5){
                l=0;
            }
            if(m==5){
                m=0;
            }
            if(n==5){
                n=0;
            }
            if(o==5){
                o=0;
            }
            if(p==5){
                p=0;
            }

    }
    public static void Mostra(){
        lbl_num.setText("A"+Integer.toString(model.Variables_DAO.numNormal[p]));
        lbl_old1.setText("A"+Integer.toString(model.Variables_DAO.numNormal[o]));
        lbl_old2.setText("A"+Integer.toString(model.Variables_DAO.numNormal[n]));
        lbl_old3.setText("A"+Integer.toString(model.Variables_DAO.numNormal[m]));
        lbl_old4.setText("A"+Integer.toString(model.Variables_DAO.numNormal[l]));
        lbl_NormPref.setText("Convencional");
        
    }
   
    public static void ArmazenaCadeirante(int x){
        numPreferencial[j2]=x;
        
            //numPreferencia[j2]=x;
            j2++;
            if(j2==5){
                j2=0;
            }
            l2++;
            m2++;
            n2++;
            o2++;
            p2++;
            
            if(l2==5){
                l2=0;
            }
            if(m2==5){
                m2=0;
            }
            if(n2==5){
                n2=0;
            }
            if(o2==5){
                o2=0;
            }
            if(p2==5){
                p2=0;
            }

    }
    public static void MostraPreferencial(){
        lbl_num.setText("P"+Integer.toString(model.Variables_DAO.numPreferencial[p2]));
        lbl_old1.setText("P"+Integer.toString(model.Variables_DAO.numPreferencial[o2]));
        lbl_old2.setText("P"+Integer.toString(model.Variables_DAO.numPreferencial[n2]));
        lbl_old3.setText("P"+Integer.toString(model.Variables_DAO.numPreferencial[m2]));
        lbl_old4.setText("P"+Integer.toString(model.Variables_DAO.numPreferencial[l2]));
        lbl_NormPref.setText("Preferencial");
        
    }
    
    
}
