import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Final1 {
static int STATUS = 0;
static String ERROR;
static int method1(int A1, int A2, int A3) throws Exception{
boolean Y = false;
int _i = 10;
if(STATUS == 0){
FileReader fr = new FileReader("file.txt");	
if(fr == null){
STATUS = 1;
ERROR = "File open error";}
else{
BufferedReader br = new BufferedReader(fr);
if(br == null){
STATUS = 1;
ERROR = "File read error";}
else{
String sCurrentLine;
while ((sCurrentLine = br.readLine()) != null) {
System.out.println(sCurrentLine);
}}}
if(STATUS == 1)
System.out.println(ERROR+" occoured");}
if(!Y){System.out.println("so how is your day?");}
A1+=A2;
return A1;}
public static void main(String[] args) {
try{Final1.method1(1,2,3);} catch(Exception e){}}}

