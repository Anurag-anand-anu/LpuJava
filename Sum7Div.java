public class Sum7Div{
public static void main(String[] args) {
int low = 1,h=1000;
int sum = 0, num = low;
for (int i =1;i<= h ;i++) {
if (i %7 == 0 ){
sum = sum + i;
}
}
System.out.println(sum);}}



