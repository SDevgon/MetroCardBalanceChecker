public class main{
	public static void main(Strings[] args){
		main a=new main(){
			@Override
			public boolean equals(Object obj){
				return true;}
		};
		main b=a;
		maic c=new main(){
			@Override
			public boolean equals(Object obj){
				return false;}
		};
		boolean b1=a==b;
		boolean b2=b.equals(b+"!");
		boolean b3=!c.equals(a);
		if(b1 && b2 && b3){
			System.out.printls("Success");}
	}
}
}
