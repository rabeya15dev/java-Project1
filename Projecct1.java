

package com.mycompany.projecct1;
import java.util.Scanner;

public class Projecct1 {
Scanner input = new Scanner(System.in);
    void setId(int id)
    {
        int Id = id/1000;
       
        if(Id%10==4)
        {
            cseDepartment();
        }
        
        else if(Id%10==5)
        {
            msjDepartment();
        }
        
        else if(Id%10==6)
        {
            eeeDepartment();
        }
        
        else if(Id%10==7)
        {
            bbaDepartment();
        }
        
        else if(Id%10==3)
        {
           engDepartment();
        }
         
        else
        {
            System.out.println("Invalid Id!!!");
        }
       
    }
    
//    cseDepartment
    
    void cseDepartment()
    {
        int choice;
       
        boolean a;
        System.out.println("Welcome to CSE DEPARTMENT!!! Building C, 3rd floor");
        System.out.println("Do you want more information?");
        a = input.nextBoolean();
        System.out.println("Which faculty's consultation hour do you want to know?");
        if(a==true)
        {
            String table = """
                       !!*******************************!!
                       **  1. Java Programming           **
                       **  2. Python                     **
                       **  3. Data Structure             **
                       !!*******************************!!
                       """;
        System.out.print(table );
       choice = input.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("I am Dr.Golam Kibria. My consultation hour is m/w 11:30-12:30, Room No. PA201");
                break;
            }
            case 2:
            {
                System.out.println("I am Dr.Abul Kalam Al Azad. My consultation hour is s/t 12:40-2:20, Room No. PA215");
                break;
            }
            case 3:
            {
                System.out.println("I am MD.Ashikur Rahman. My consultation hour is s/t 2:40-4:20, Room No. PA112");
                break;
            }
            default:
            {
                 System.out.println("Invalid input!!!");
            }
        }
       }
        else
        {
            System.out.println("Program closed!!!");
        }
       
       
    }
    
//    msjDepartment
    void msjDepartment()
    {
        int choice;
       
        boolean a;
        System.out.println("Welcome to MSJ DEPARTMENT!!! Building D, 3rd floor");
        System.out.println("Do you want more information?");
        a = input.nextBoolean();
        System.out.println("Which faculty's consultation hour do you want to know?");
        if(a==true)
        {
            String table = """
                       !!*******************************!!
                       **  1. Arts and Humanities             **
                       **  2. Social Sciences                 **
                       **  3. Professional Skills             **
                       !!*******************************!!
                       """;
        System.out.print(table );
       choice = input.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("I am Prof. Jude W.R. Genilo, PhD. My consultation hour is m/w 11:30-12:30, Room No. PC201");
                break;
            }
            case 2:
            {
                System.out.println("I am A F M Moniruzzaman Shipu. My consultation hour is s/t 12:40-2:20, Room No. PD215");
                break;
            }
            case 3:
            {
                System.out.println("I am Muhammad Abdul Kader. My consultation hour is s/t 2:40-4:20, Room No. PD112");
                break;
            }
            default:
            {
                 System.out.println("Invalid input!!!");
            }
        }
       }
        else
        {
            System.out.println("Program closed!!!");
        }
       
    }
    
    // eeeDepartment
    void eeeDepartment()
    {
        int choice;
       
        boolean a;
        System.out.println("Welcome to EEE DEPARTMENT!!! Building B, 3rd floor");
        System.out.println("Do you want more information?");
        a = input.nextBoolean();
        System.out.println("Which faculty's consultation hour do you want to know?");
        if(a==true)
        {
            String table = """
                       !!*******************************!!
                       **  1. Electromagnetic Fields and Waves       **
                       **  2. Control System                         **
                       **  3. Differential and Integral Calculus     **
                       !!*******************************!!
                       """;
        System.out.print(table );
       choice = input.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("I am Prof. M. Mofazzal Hossain, PhD. My consultation hour is m/w 11:30-12:30, Room No. PD200");
                break;
            }
            case 2:
            {
                System.out.println("I am Abul Barkat Mollah Sayeed Ud Doulah, PhD. My consultation hour is s/t 12:40-2:20, Room No. PB225");
                break;
            }
            case 3:
            {
                System.out.println("I am Muhammad Abdul Kader. My consultation hour is s/t 2:40-4:20, Room No. PB112");
                break;
            }
            default:
            {
                 System.out.println("Invalid input!!!");
            }
        }
       }
        else
        {
            System.out.println("Program closed!!!");
        }
    }
    
//    bbaDepartment
    
    void bbaDepartment()
    {
        int choice;
       
        boolean a;
        System.out.println("Welcome to BBA DEPARTMENT!!! Building B, 3rd floor");
        System.out.println("Do you want more information?");
        a = input.nextBoolean();
        System.out.println("Which faculty's consultation hour do you want to know?");
        if(a==true)
        {
            String table = """
                       !!*******************************!!
                       **  1. Accounting **
                       **  2. Economics **
                       **  3. Finance **
                       !!*******************************!!
                       """;
        System.out.print(table );
       choice = input.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("I am  Prof. Imran Rahman. My consultation hour is m/w 11:30-12:30, Room No. PD308");
                break;
            }
            case 2:
            {
                System.out.println("I am Dr. Pinki Shah. My consultation hour is s/t 12:40-2:20, Room No. PB305");
                break;
            }
            case 3:
            {
                System.out.println("I am  A F Wazir Ahmad. My consultation hour is s/t 2:40-4:20, Room No. PB300");
                break;
            }
            default:
            {
                 System.out.println("Invalid input!!!");
            }
        }
       }
        else
        {
            System.out.println("Program closed!!!");
        }
    }
    
//    engDepartment
    
   void engDepartment()
   {
       int choice;
       
        boolean a;
        System.out.println("Welcome to DEH DEPARTMENT!!! Building A, 3rd floor");
        System.out.println("Do you want more information?");
        a = input.nextBoolean();
        System.out.println("Which faculty's consultation hour do you want to know?");
        if(a==true)
        {
            String table = """
                       !!*******************************!!
                        1. Literature                      
                        2. Public Speaking 
                        3. Literature and Cultural Studies 
                       !!*******************************!!
                       """;
        System.out.print(table );
       choice = input.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("I am  Arifa Ghani Rahman. My consultation hour is m/w 11:30-12:30, Room No. PC300");
                break;
            }
            case 2:
            {
                System.out.println("I am Professor Shamsad Mortuza, PhD. My consultation hour is s/t 12:40-2:20, Room No. PC325");
                break;
            }
            case 3:
            {
                System.out.println("I am  Tanzia Siddiqua. My consultation hour is s/t 2:40-4:20, Room No. PC302");
                break;
            }
            default:
            {
                 System.out.println("Invalid input!!!");
            }
        }
       }
        else
        {
            System.out.println("Program closed!!!");
        }
   }
    public static void main(String[] args) {
         int id;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your id: ");
        id = input.nextInt();
       
        Projecct1 obj = new Projecct1();
        obj.setId(id);
    }
}
