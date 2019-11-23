package day1.classroom;

public class Methods {
	public String makeCall() {
		System.out.println("Calling ");
		return "Nishan";
		
	}
	public String SendSMS() {
		return "Helloo hw r u";
	}
	public boolean shutdown() {
		return true;
	}
	public static void main(String[] args)
{
Methods Call = new Methods();
String makeCalloutput = Call.makeCall();
System.out.println(makeCalloutput);

String SendSMSoutput = Call.SendSMS();
System.out.println(SendSMSoutput);
}
}
