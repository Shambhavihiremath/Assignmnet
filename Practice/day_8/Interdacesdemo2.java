//Multple inheritance
package day_8;
interface Manager1{
	void salary();
}
interface Employee1
{
	void salary();
}
class Demo implements Manager1,Employee1{


@Override
public void salary() {
	// TODO Auto-generated method stub
	System.out.println("Manager");
}

public class Interdacesdemo2 {

}
}