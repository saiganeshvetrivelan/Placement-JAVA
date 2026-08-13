abstract class Employee
{
    private String name;
    private int salary;

    
    public void getname(String name)
    {
        this.name = name;
    }

   
    public String setname()
    {
        return name;
    }


    public void getsalary(int salary)
    {
        this.salary = salary;
    }


    public int setsalary()
    {
        return salary;
    }

    abstract int bonus_cal();
    abstract void display();
}



class developer extends Employee
{
    void fullstack()
    {
        System.out.println("Full stack developer");
    }

    void mernstack()
    {
        System.out.println("MERN stack developer");
    }

    int bonus_cal()
    {
        return (int)(setsalary() * 0.1);
    }

    void display()
    {
        System.out.println("Developer");
        System.out.println("Name: " + setname());
        System.out.println("Salary: " + setsalary());
        System.out.println("Bonus: " + bonus_cal());
        System.out.println();
    }
}


class manager extends Employee
{
    void projectmanager()
    {
        System.out.println("Project manager");
    }

    int bonus_cal()
    {
        return (int)(setsalary() * 0.2);
    }

    void display()
    {
        System.out.println("Manager");
        System.out.println("Name: " + setname());
        System.out.println("Salary: " + setsalary());
        System.out.println("Bonus: " + bonus_cal());
        System.out.println();
    }
}


class worker extends Employee
{
    int bonus_cal()
    {
        return (int)(setsalary() * 0.05);
    }

    void display()
    {
        System.out.println("Worker");
        System.out.println("Name: " + setname());
        System.out.println("Salary: " + setsalary());
        System.out.println("Bonus: " + bonus_cal());
        System.out.println();
    }
}


class Encaps
{
    public static void main(String args[])
    {
        developer d = new developer();
        manager m = new manager();
        worker w = new worker();

        d.getname("Akash");
        d.getsalary(50000);
        d.display();

        m.getname("Sonney");
        m.getsalary(60000);
        m.display();

        w.getname("Rahul");
        w.getsalary(40000);
        w.display();
    }
}