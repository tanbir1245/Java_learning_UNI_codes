//Multiple inheritance using implement

interface tanbir{
    void Section();
}
interface tasfia{
    void Intake();
}

class Students implements tanbir,tasfia{
    public void Section(){
        System.out.println("Tanbir is from section 8!\n");
    }
    public void Intake(){
        System.out.println("Tasfia is from section 8 and inake 44!\n");
    }
}

public class Multiple_inheritance
{
	public static void main(String[] args) {
		Students obj=new Students();
		obj.Section();
		obj.Intake();
	}
}



