public class Water{

public static String stateofWater(double temp) {
  String state
  if(temp < 0) {
    return "solid";
    // state = "solid";
  }
  else if(temp >= 0 && temp <= 100) {
    return "liquid";
    // state = "liquid";
  }
  else {
    return "gas";
    // state = "gas";
  }
  // return state;
}

public static void main(String[] args) {
  System.out.println(stateofWater(120));
  System.out.println(stateofWater(40));
  System.out.println(stateofWater(-20));
  System.out.println(stateofWater(0));
  System.out.println(stateofWater(100));

}

}
