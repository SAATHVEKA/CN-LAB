import java.net.*;
class arpClient {
public static void main(String args[]) {
try {
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
Socket clsct = new Socket("127.0.0.1", 3636);
BufferedReader din = new BufferedReader(new InputStreamReader(clsct.getInputStream()));
DataOutputStream dout = new DataOutputStream(clsct.getOutputStream());
System.out.println("Enter the Logical address (IP):");
String str1 = in.readLine();
dout.writeBytes(str1 + '\n');
String str = din.readLine();
System.out.println("The Physical Address is: " + str);
clsct.close();
} catch (Exception e) {
System.out.println(e);
2117230020143
}
}
}