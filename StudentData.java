import java.nio.Buffer;
import java.util.*;

class  Student{
        int semester;
        int rollno;
        String name;

        int eng, math,science;
        int avgWholeClass, avgAllSub;

        void get(int sem,String n,int r,int e,int m,int s)
        {
                semester=sem;
                rollno=r;
                name=n;
                eng=e;
                math=m;
                s=science;
        }
        void display()
        {
                avgAllSub=(eng+math+science)/2;
                System.out.println("****** Semester:" + semester+"******");
                System.out.println("Roll no=" + rollno);
                System.out.println("Name=" + name);
                System.out.println("English=" + eng);
                System.out.println("Math=" + math);
                System.out.println("Science=" + science);
                System.out.println("Average=" + avgAllSub);

                System.out.println("-----------------------------------------");
        }

}

public class StudentData {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                Student s11 = new Student();
                Student s21 = new Student();
                Student s31 = new Student();

                Student s12 = new Student();
                Student s22 = new Student();
                Student s32 = new Student();


                s11.get(1,"Anshu",19321,61,78, 91);
                s21.get(1,"Manish", 19322, 77,91,65);
                s31.get(1,"Darshan", 19323, 85, 65,87);

                s12.get(2,"Anshu",19321,68,74, 96);
                s22.get(2,"Manish", 19322, 67,81,75);
                s32.get(2,"Darshan", 19323, 75, 95,77);

                s11.display();
                s12.display();

                s21.display();
                s22.display();

                s31.display();
                s32.display();

                int cgpaStd1=(s11.avgAllSub+s12.avgAllSub)/2;
                int cgpaStd2=(s21.avgAllSub+s22.avgAllSub)/2;
                int cgpaStd3=(s31.avgAllSub+s32.avgAllSub)/2;

                int temp=0;


                Map<Integer, String> map=new HashMap<>();
                map.put(cgpaStd1,"19321, Ajay");
                map.put(cgpaStd2,"19322, Vikas");
                map.put(cgpaStd3,"19323, Shreya");

                int arr[] = {cgpaStd1,cgpaStd2,cgpaStd3};

                /*Sorting of student on the basis of avg marks of subjects */
                for (int i = 0; i < arr.length; i++) {
                        for (int j = i+1; j < arr.length; j++) {
                                if (arr[i]<arr[j])
                                {
                                        temp=arr[i];
                                        arr[i]=arr[j];
                                        arr[j]=temp;
                                }
                        }
                }
               /*after sorting the results of every student we get the 1st position at arr[0] and 2nd position at arr[1]*/
                System.out.println(map.get(arr[0])+" is the Topper");
                System.out.println(map.get(arr[1])+" got second position");

        }
}
