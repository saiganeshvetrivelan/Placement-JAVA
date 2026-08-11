





class management{
    static class schools{
    static  class teachers extends worker{
            String name="rdx";
            int id=1001;
        }
        static class worker{
            String name="raj";
            int id=1002;
        }
        
    }
    static class colleges{
        static  class professors extends transport{
            String name="bsk";
            int id=1003;
        }
        static class transport{
            String name="bus";
            String type="volvo";
        }
        
    }
    static class placement{
        static class staffs extends training{
            String name="rajesh";
            int id=1006;
        }
        static  class companies{
            String name="tcs";
            String type="IT";
        }
        static class training extends companies{
            String name="java";
            int duration=6;
        }
     
    }
}
class introvert extends management.schools.teachers{


}
class gupta extends management.colleges.professors{

}
class ajay extends management.placement.staffs{

}



public class inheri_task1 {
    public static void main(String[] args) {
        
        introvert i=new introvert();
        System.out.println("name:"+i.name+" id:"+i.id);
        gupta g=new gupta();
        System.out.println("name:"+g.name+" id:"+g.id);
        ajay a=new ajay();
        System.out.println("name:"+a.name+" id:"+a.id); 

        
    }
}
