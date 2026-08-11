


class subject{
    class maths{
        int code=2009;
        String teacher="gopal";
        int mark=100;
    }
    class physics{
        int code=2010;
        String teacher="RDX";
        int mark=96;
    }
    class english{
        int code=2011;
        String teacher="joan";
        int mark=96;
    }
     class social{
        int code=2033;
        String teacher="bsk";
        int mark=95;
    }
     class chemistry{
        int code=2088;
        String teacher="velmurugan";
        int mark=100;
    }
}
public class subject_management {
    public static void main(String[] args) {
       subject s=new subject();
       subject.maths m=s.new maths();
       subject.physics p=s.new physics();
       subject.english e=s.new english();
       subject.social so=s.new social();
       subject.chemistry ch=s.new chemistry();
       System.out.println("maths code:"+m.code+" teacher:"+m.teacher+" mark:"+m.mark);
       System.out.println("physics code:"+p.code+" teacher:"+p.teacher+" mark:"+p.mark);
       System.out.println("english code:"+e.code+" teacher:"+e.teacher+" mark:"+e.mark);
       System.out.println("social code:"+so.code+" teacher:"+so.teacher+" mark:"+so.mark);
       System.out.println("chemistry code:"+ch.code+" teacher:"+ch.teacher+" mark:"+ch.mark);
    }
}