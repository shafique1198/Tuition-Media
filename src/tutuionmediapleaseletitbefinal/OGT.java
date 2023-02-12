/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutuionmediapleaseletitbefinal;

public class OGT {
    
    private int serial,s_ID,t_ID;
   
    public OGT(int serial, int t_ID,int s_ID){
        
        this.serial=serial;
        this.t_ID=t_ID;
        this.s_ID=s_ID;
       
        
        
    }
    
    public int getserial(){
        return serial;
    }
    
    public int gett_ID(){
        return t_ID;
    }
    
    public int gets_ID(){
        return s_ID;
    }
    
}
