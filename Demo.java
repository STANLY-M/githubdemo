public class Demo{
	public static void main(String[] args){
    int dayNo = Integer.parseInt(args[0]);

	switch(dayNo){

	case 1:System.out.println("its Monday");
		   break;

	case 2:System.out.println("its Tuesday");
		   break;
	case 3:System.out.println("its Wednesday");
		   break;
	
    case 4:System.out.println("its Thursday");
		   break;
	case 5:System.out.println("its Friday");
		   break;
	case 6:System.out.println("its Satarday");
		   break;
	case 7:System.out.println("its Sunday");
		   break;
	
	default:System.out.println("please enter a number between 1 - 7 only!");	   	   	   	   
	}


 }

}