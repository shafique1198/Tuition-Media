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
class Student {
    
    private int Age;
    private String s_ID,Name,Gender,Educational_Institution,Class,Medium_Version;
    
    public Student(String s_ID,  String Name, int Age,  String Gender,String Educational_Institution, String Class, String Medium_Version ){
        
        this.s_ID=s_ID;
        this.Name=Name;
        this.Age=Age;
        this.Gender=Gender;
        this.Educational_Institution=Educational_Institution;
        this.Class=Class;
        this.Medium_Version=Medium_Version;
        
    }
    
    public String gets_Id(){
        return s_ID;
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
    
    public String getEducational_Institution(){
        return Educational_Institution;
    }
    
    
    public String getStudentClass(){
        return Class;
    }
    
    
    public String getMedium_Version(){
        return Medium_Version;
    }
    
    
    
    
    
}
