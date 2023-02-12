/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutuionmediapleaseletitbefinal;

/**
 *
 * @author blank
 */
class Teacher {
    
    private int Area_Code;
    private String t_ID,Name,Gender,Educational_Qualification;
    
    
    public Teacher(String t_ID,  String Name, String Gender, String Educational_Qualification, int Area_Code ){
        
        this.t_ID=t_ID;
        this.Name=Name;
        this.Gender=Gender;
        this.Educational_Qualification=Educational_Qualification;
        this.Area_Code=Area_Code;
        
    }
    
    
    public String gett_Id(){
        return t_ID;
    }
    
    public String getName(){
        return Name;
    }
    
    
    
    public String getGender(){
        return Gender;
    }
    
    public String getEducational_Qualification(){
        return Educational_Qualification;
    }
    
    
    
    
    
    public int getArea_Code(){
        return Area_Code;
    }
    
}
