package com.example.learnandriodbyjava;

import android.os.Bundle;
import android.os.StatFs;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public class Test {
        public void pupAge(int age) {
            age += 7;
            System.out.println("dog age:" + age);
        }

        public static void main(String[] args) {
            Test test = new Test(6);
            test.pupAge();
        }
    }

    public class Employee {
        private static double salary;
        public static final String DEPARTMENT = "developer";

        public static void main(String[] args) {
            salary = 10000;
            System.out.println(DEPARTMENT + "平均工资" + salary);
        }
    }

    private boolean myFlag;
    static final double weeks = 9.5;
    protected static final int BOXWIDTH = 42;


    public class logger{
        private String format;
        public String getFormat(){
            return this.format;
        }
        public void setFormat(String format){
            this.format = format;
        }
    }

    class AudioPlayer{
        protected boolean openSpeaker(Speaker sp){
        }
    }

    class StreamingAudioPlayer extends AudioPlayer {
        protected boolean openSpeaker(Speaker)
    }

    public class InstanceCounter{
        private static int numInstances = 0;
        protected static int getCount(){
            return numInstances;
        }

        private static void addInstance(){
            InstanceCounter++;
        }

        InstanceCounter(){
            InstanceCounter.addInstance();
        }

        public static void main (String[] args){
            System.out.println("Starting With"+InstanceCounter.getCount()+"instances");
            for (int i = 0; i < 500; i++) {
                new InstanceCounter();

            }
            System.out.println("Created"+InstanceCounter.getCount()+"instances");
        }
    }

    public class test{
        final int value = 10;
        public static final int BOXWIDTH = 6;
        static final String TITLE = "Manager";
        public void changeValue(){

        }
    }
}


public class Puppy{
    int puppyAge;
    public Puppy (String name){
        System.out.println("dog name:"+name);
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("dog age:"+puppyAge);
        return puppyAge;
    }
    public static void main (String[] args){
        Puppy myPuppy = new Puppy("hhh");
        myPuppy.setAge(1);
        myPuppy.getAge();
        System.out.println("hhhhh"+myPuppy.puppyAge);
    }
}


public class Employee{
    String name;
    int age;
    String designation;
    double salary;
    public Employee(String name){
        this.name = name;
    }
    public void empAge(int empAge){
        age = empAge;
    }

    public void empDesignation(String empDesignation){
        designation = empDesignation;
    }

    public void empSalary(double empSalary){
        salary = empSalary;
    }

    public void printlnEmpolyee(){
        System.out.println("name:"+name);
        System.out.println("age":+age);
        System.out.println("designation:"+designation);
        System.out.println("salary:"+salary);
    }
}

public class EmpolyeeTest{

    public static void main(String[] args){
        Employee empOne = new Employee("one");
        Employee empTwo = new Employee("two");

        empOne.empAge(20);
        empOne.empDesignation("height level developer");
        empOne.empSalary(10000);

        empTwo.empAge(18);
        empTwo.empDesignation("low level developer");
        empTwo.empSalary(8000);
    }
}

public class PrimitiveTypeTest{
    public static void main (String[] args){

        //byte
        System.out.println("baseType:byte:"+Byte.SIZE);
        System.out.println("maxValue:"+Byte.MAX_VALUE);
        System.out.println("minValue:"+Byte.MIN_VALUE);

        //short
        System.out.println("baseType:short:"+Short.SIZE);
        System.out.println("maxValue:"+Short.MAX_VALUE);
        System.out.println("minValue:"+Short.MIN_VALUE);


        //int
        System.out.println("baseType:int:"+Integer.SIZE);
        System.out.println("maxValue:"+Integer.MAX_VALUE);
        System.out.println("minValue:"+Integer.MIN_VALUE);


        //long
        System.out.println("baseType:long:"+Long.SIZE);
        System.out.println("maxValue:"+Long.MAX_VALUE);
        System.out.println("minValue:"+Long.MIN_VALUE);

        //float
        System.out.println("baseType:float:"+Float.SIZE);
        System.out.println("maxValue:"+Float.MAX_VALUE);
        System.out.println("minValue:"+Float.MIN_VALUE);


        //double
        System.out.println("baseType:Double:"+Double.SIZE);
        System.out.println("maxValue:"+Double.MAX_VALUE);
        System.out.println("minValye:"+Double.MIN_VALUE);
    }
}

public class Test{
    static boolean bool;
    static byte by;
    static char ch;
    static double d;
    static float f;
    static int i;
    static long l;
    static short sh;
    static String str;

    public static void main (String[] args){
        System.out.println("Bool"+bool);
        System.out.println("byte"+by);
        System.out.println("char"+ch);
        System.out.println("double"+d);
        System.out.println("float"+f);
        System.out.println("int"+i);
        System.out.println("long"+l);
        System.out.println("short"+sh);
        System.out.println("str"+str);

    }
}

public class Variable{
    static int allClicks = 0; //类变量
    String str = "Hello world";//实例变量
    public void testFunc(){
        int a = 0; //局部变量
    }

}

public class HelloTest{
    public  void pupAge(int age){
        age += 7;
        System.out.println("dog age:"+age);
    }

    public static void main (String[] args) {
        HelloTest test = new HelloTest();
        test.pupAge(5);
    }
}

/*
JAVA局部变量
局部变量申明在方法，构造方法或者语句块中
局部变量在方法，构造方法，或者语句块被执行的时候创建，当它们执行完成后，变量将被销毁
访问修饰符不能修饰局部变量
局部变量只在申明他的方法、构造方法或者语句块中可见
局部变量是在栈中分配的
局部变量没有默认值，所以局部变量被申明后，必须经过初始化才能使用
 */

/*
JAVA实例变量
实例变量申明在一个类中，但在方法、构造方法和语句块之外
当一个对象被实例话之后，每个实例变量的值也就跟着确定
实例变量的值应该至少被一个方法、构造方法或者语句块引用，使得外部能够通过这些方式获得实例变量信息
实例变量可以申明在前或者使用后
访问修饰符可以修饰实例变量
实例变量对于类中的方法，构造方法或者语句块是可见的。一般情况下应该吧实例变量设置为私有。通过使用访问修饰符可以使实例变量对于子类可见
实例变量具有默认值。实例变量的默认值是0，布尔默认值是false，引用类型变量的默认值是null，变量的值可以在申明时指定，也可以在构造方法中指定；
实例变量可以直接通过变量名访问。但在静态方法以及其他类中，就应该使用完全限定名：ObjectReference.VariableName;
 */

public class NewEmployee{
    //this instance variable can be used by subclass
    public String name;
    //this private variable only used by self class
    private Double salary;
    // Assign a value to name in the constructor
    public NewEmployee (String empName){
        name = empName;
    }
    public void setSalary(double empSalary){
        salary = empSalary;
    }
    public void printEmp(){
        System.out.println("name"+name);
        System.out.println("salary"+salary);
    }

    public static void main(String[] args){
        NewEmployee emp = new NewEmployee("hhh");
        emp.setSalary(1000);
        emp.printEmp();
    }
}