/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutuionmediapleaseletitbefinal;

/**
 *
 * @author MD SHAFIQUE
 */
public class TeacherA {
    private int Age,Phone,Area_Code;
    private String t_ID,Name,Gender,Medium_Version,Educational_Qualification;
    
    
    public TeacherA(String t_ID,  String Name, int Age, String Gender, String Educational_Qualification,String Medium_Version,int Phone, int Area_Code ){
        
        this.t_ID=t_ID;
        this.Name=Name;
        this.Age=Age;
        this.Gender=Gender;
        this.Educational_Qualification=Educational_Qualification;
        this.Medium_Version=Medium_Version;
        this.Phone=Phone;
       
        this.Area_Code=Area_Code;
        
    }
    
    
    public String gett_Id(){
        return t_ID;
    }
    
    public String getName(){
        return Name;
    }
    
    public int getAge(){
        return Age;
    }
    
    
    public String getGender(){
        return Gender;
    }
    
    public String getMedium_Version(){
        return Medium_Version;
    }
    
    
    public String getEducational_Qualification(){
        return Educational_Qualification;
    }
    
    public int getPhone(){
        return Phone;
    }
    
    
     public int getArea_Code(){
        return Area_Code;
    }
    
    
}
