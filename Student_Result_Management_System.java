import java.util.ArrayList;
import java.util.Scanner;

public class Student_Result_Management_System{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> NAME= new ArrayList<>();
        ArrayList<Integer> ROLLNO= new ArrayList<>();
        ArrayList<Float> MARKS= new ArrayList<>();
        MAINMENU(input, NAME, ROLLNO, MARKS);
        
        
        
        input.close();


    }
    static void MAINMENU(Scanner input, ArrayList<String> NAME, ArrayList<Integer> ROLLNO, ArrayList<Float> MARKS){
        System.out.println(" 1. Add Student\n 2. View Students\n 3. Search Student\n 4. Update Marks\n 5. Calculate Grade\n 6. Exit");
        System.out.println("-> ");
        int n = input.nextInt();

        while (n != 1 && n != 2 && n !=3 && n !=4 && n!=5 && n!=6) {
            System.out.println("PLEASE CHOOSE AMONG OPTIONS ONLY.");
            System.out.println("-> ");
            n = input.nextInt();
        }
        
        
        

        
        if (n==1){
            Add_Student(input, NAME, ROLLNO, MARKS);

        }
        else if(n==2){
            View_Students( input,NAME, ROLLNO, MARKS);

        }
        else if(n==3){
            Search_Student(input,NAME, ROLLNO, MARKS);
            
        }
        else if(n==4){
            Update_Marks(input,NAME, ROLLNO, MARKS);
            
        }
        else if(n==5){
            Calculate_Grade(input,NAME, ROLLNO, MARKS);
            
        }
        else{
            System.out.println("Exiting.\nThank you.");
            
        }
        

    }

    static void Add_Student(Scanner input, ArrayList<String> names, ArrayList<Integer> rollno, ArrayList<Float> marks){
        
        
        System.out.print("ENTER NAME OF THE STUDENT: ");
        input.nextLine();
        String name=input.nextLine();

        String SName = name.toUpperCase();
        names.add(SName);
        System.out.print("\n ENTER ROLL NO OF THE STUDENT: ");
        rollno.add(input.nextInt());
        System.out.print("\n ENTER MARKS OF THE STUDENT: ");
        Float mark = input.nextFloat();
        while (mark < 0 || mark > 100) {
            System.out.print("MARKS ARE OUT OF 100, pls re-enter: ");
            mark = input.nextFloat();
        }
    
        marks.add(mark);

        System.out.println(" TO ADD MORE, PRESS 1.\n TO VIEW UR ENTRY PRESS 2.\n FOR MAIN MENU PRESS 3.\n --> ");
        System.out.println("-> ");
        int choice = input.nextInt();

        while (choice != 1 && choice != 2 && choice !=3) {
            System.out.println("PLEASE CHOOSE AMONG OPTIONS ONLY.");
            System.out.println("-> ");
            choice = input.nextInt();
        }

        
        if (choice==1){
            Add_Student(input,names,rollno,marks);

        }
        else if(choice==2){
            View_Students(input, names,rollno,marks);

        }
        else{
            MAINMENU(input, names, rollno, marks);

        }
        


    }
    static void View_Students( Scanner input,ArrayList<String> names, ArrayList<Integer> rollno, ArrayList<Float> marks){
        int size = names.size();
        String[][] studentarray=new String[size+1][3];
        studentarray[0][0]="NAME";
        studentarray[0][1]="ROLLNO";
        studentarray[0][2]="MARKS";
        for (int i=1; i<=size;i++){
            for(int j=0;j<3;j++){
                if(j==0){
                    studentarray[i][j]=names.get(i-1);
                }
                else if(j==1){
                    studentarray[i][j]=String.valueOf(rollno.get(i-1));
                }
                else{
                    studentarray[i][j]=String.valueOf(marks.get(i-1));
                }


            }

        }
        for (int i=0; i<=size;i++){
            for(int j=0;j<3;j++){
                System.out.print(studentarray[i][j]+"  ");
            }
            System.out.println("");
        }
        MAINMENU(input, names, rollno, marks);

        


        
    }
    static void Search_Student( Scanner input,ArrayList<String> names, ArrayList<Integer> rollno, ArrayList<Float> marks){
        System.out.println("If you wanna search by name then press 1.\nIf you wanna search by roll no then press 2");
        System.out.println("-> ");
        int choice = input.nextInt();

        while (choice != 1 && choice != 2) {
            System.out.println("PLEASE CHOOSE AMONG OPTIONS ONLY.");
            System.out.println("-> ");
            choice = input.nextInt();
        }

        if (choice==1){
            System.out.print("ENTER THE NAME OF THE STUDENT: ");
            input.nextLine();
            String studentname= input.nextLine();
            String SName = studentname.toUpperCase();
           
            boolean sn= names.contains(SName);
            ArrayList<Integer> count= new ArrayList<>();
            if (sn){
                System.out.println("RECORD FOUND");
                for (int i=0; i<names.size();i++){
                    if(SName.equals(names.get(i))){
                        count.add(i);


                    }
                }
                int countsize = count.size();
                System.out.println(countsize+" record found.");
                for(int i=0;i<countsize;i++){
                   
                    System.out.println("name->"+names.get(count.get(i))+"  rollno->"+rollno.get(count.get(i))+"  marks->"+marks.get(count.get(i)));

                }
                
                MAINMENU(input, names, rollno, marks);
            }
            else{
                System.out.println("RECORD NOT FOUND");
                MAINMENU(input, names, rollno, marks);

            }

        }
        else{
            System.out.print("ENTER THE ROLL NO. OF THE STUDENT: ");
            int studentrollno= input.nextInt();
            
            boolean sn= rollno.contains(studentrollno);
            ArrayList<Integer> count= new ArrayList<>();
            if (sn){
                System.out.println("RECORD FOUND");
                for (int i=0; i<rollno.size();i++){
                    if(studentrollno==rollno.get(i)){
                        count.add(i);


                    }
                }
                int countsize = count.size();
                System.out.println(countsize+" record found.");
                for(int i=0;i<countsize;i++){
                    
                    System.out.println("name->"+names.get(count.get(i))+"  rollno->"+rollno.get(count.get(i))+"  marks->"+marks.get(count.get(i)));

                }
                
                MAINMENU(input, names, rollno, marks);
            }
            else{
                System.out.println("RECORD NOT FOUND");
                MAINMENU(input, names, rollno, marks);

            }

        }


        

  
    }
    static void Update_Marks( Scanner input,ArrayList<String> names, ArrayList<Integer> rollno, ArrayList<Float> marks){
        System.out.println("ENTER THE ROLL NO OF THE STUDENT: ");
        int rn=input.nextInt();
        int size = rollno.size();
        if (rn < 1 || rn > size) {
            System.out.println("RECORD NOT FOUND");
            MAINMENU(input, names, rollno, marks);
            return;

        }
        else {
            System.out.print("ENTER UPDATED MARKS: ");
            Float updatedmarks= input.nextFloat();
            if (updatedmarks < 0 || updatedmarks > 100){
                System.out.println("MARKS ARE OUT OF 100, MARKS CANT EXCEED 100. \n Try again.");
                Update_Marks(input, names, rollno, marks);
                

            }
            else{

                marks.set((rn-1),updatedmarks);
                System.out.println("UPDATED RECORD:-");
                System.out.println("name->"+names.get(rn-1)+"  rollno->"+rollno.get(rn-1)+"  marks->"+marks.get(rn-1));
                MAINMENU(input, names, rollno, marks);

            }


        }




        
    }
    static void Calculate_Grade( Scanner input,ArrayList<String> names, ArrayList<Integer> rollno, ArrayList<Float> marks){
        
        System.out.print("Enter the roll no of student: ");
        int rn = input.nextInt();
        if (rn < 1 || rn > marks.size()) {
            System.out.println("RECORD NOT FOUND");
            MAINMENU(input, names, rollno, marks);
            return;

        }
        Float mark = marks.get(rn-1);
        if (mark >= 90) {
            System.out.println("Grade: A");
        } else if (mark >= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
        MAINMENU(input, names, rollno, marks);
        

        
    }
}
