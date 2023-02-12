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
class StudentA {
     private int s_ID,Age,Phone,Area_Code;
    private String Name,Gender,Medium_Version,s_Class,Educational_Institution;
    
    public StudentA(int s_ID, String Name, int Age, String Gender,String Educational_Institution, String s_Class, String Medium_Version,  int Phone, int Area_Code){
        
        this.s_ID=s_ID;
        this.Name=Name;
        this.Age=Age;
        this.Gender=Gender;
        this.Educational_Institution=Educational_Institution;
        this.s_Class=s_Class;
        this.Medium_Version=Medium_Version;
        this.Phone=Phone;
        this.Area_Code=Area_Code;
        
    }
    
    public int gets_Id(){
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
    
    public String gets_Class(){
        return s_Class;
    }
    
    public String getMedium_Version(){
        return Medium_Version;
    }
    
    
    
    public int getPhone(){
        return Phone;
    }
    
    public int getArea_Code(){
        return Area_Code;
    }
     
    
}

