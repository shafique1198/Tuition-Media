/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutuionmediapleaseletitbefinal;


public class RFT {
     private int serial,s_ID,t_ID;
   
    public RFT(int serial, int s_ID,int t_ID){
        
        this.serial=serial;
        this.s_ID=s_ID;
        this.t_ID=t_ID;
       
        
        
    }
    
    public int getserial(){
        return serial;
    }
    
    public int gets_ID(){
        return s_ID;
    }
    
    public int gett_ID(){
        return t_ID;
    }
    
}
