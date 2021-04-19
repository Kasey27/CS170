public class SwearFilter2 {
	public static void main (String[] args){
		String text = "duck ship wheat DUCK SHIP WHEAT Duck Ship Wheat ducK shiP wheaT shipping";
		String[] swear = {"duck", "ship", "wheat"};
		System.out.println(swearfilter(text,swear));
		   text = "A duck was sailing on a ship shipping whole wheat bread. Duck that SHIP!!!";
		  System.out.println(swearfilter(text,swear));
		//	substringswear(text,swear); //produces s***ping;

	}

 public static String swearfilter(String text, String[] swear){
	 String lowercase = text.toLowerCase();
	 for(int i = 0; i < swear.length; i++) {
		 int n = lowercase.indexOf(swear[i]);
		 while(n!= -1){
			 String s = text.substring(0, n+1);
			 for(int j = 0; j < swear[i].length()-2; j++){
			 	s+="*";
		 }
		 s+= text.substring(n+ swear[i].length()-1);
		 n = lowercase.indexOf(swear[i],n+1);
		 text = s;
	 }

	 }
	 return text;
 }
}
