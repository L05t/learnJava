package com.example.learnandriodbyjava;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Calendar;
import java.util.Date;
import java.text.*;
import java.util.Locale;
import java.util.Scanner;
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

/*
JAVA类变量（静态变量）
类变量也称静态变量，在类中已static 关键字声明，但必须在方法之外；
无论一个类创建了多少个对象，类只拥有类变量的一份拷贝；
静态变量除了被声明为常量外很少使用。常量是指声明为public/private,final,static类型的变量，常量初始化后不可改变
静态变量在第一次被访问时创建，在程序结束时销毁，
与实例变量具有相似的可见性。但为了对类的使用者可见，大多数静态变量声明为public类型
默认值和实例变量相似。数值型变量默认为0，布尔型默认值是false,引用类型默认值是null。变量的值可以在声明的时候指定，
也可以在构造方法中指定，此时静态变量还可以在静态语句块中初始化
静态变量可以通过: ClassName.VariableName的方式访问
类变量被声明为public static final 类型时，类变量名称一般建议使用大写字母。如果静态变量不是public和final类型，
其命名方式与实例变量以及局部变量的命名方式一致
 */

public class EmployeeOne{
    //salary is a private variable of static
    private static double salary;
    //DEPARTMENT is a constant
    public static  final String DEPARMENT = "developer";
    public static void main (String[] args){
        salary = 10000;
        System.out.println(DEPARMENT+"平均工资"+salary);
    }
}

//JAVA修饰符
public class JAVA_Modifier{
    private boolean myFlag;
    static final double weeks = 9.5;
    protected static  final int BOXWIDTH = 53;
    public static void main(String[] args){
        //
    }
}

//私有访问修饰符 -private
public class Logger{
    private String format;
    public String getFormat(){
        return this.format;
    }

    public void setFormat (String format){
        this.format = format;
    }
}

class  AudioPlayer{
    protected void openSpeaker(){
        //
    }
}
class AudioPlayerSubClassStreamingAudioPlayer extends AudioPlayer{
    protected void openSpeaker(){

    }
}
/*
父类声明为public的方法，子类也必须为public
父类声明为protect的方法，子类只能声明为protect/public
父类声明为private的方法，子类只能声明为private;
 */
/*
非访问修饰符
static final abstract synchronized
*/

public class InstanceCounter{
    private static  int numInstance = 0;
    protected static int getCount(){
        return numInstance;
    }
    private static void addInstance(){
        numInstance++;
    }
     InstanceCounter(){
        InstanceCounter.addInstance();
    }
}

abstract class Caravan{
    private double price;
    private String model;
    private String year;
    public abstract void goFast();
    public abstract void changeColor();
}

public class MyRunnable implements Runnable{
    private volatile boolean active;
    public void run(){
        while (active){
            //
        }

    }
    public void stop(){
        active = false;
    }
    String name = "name";
    boolean result = name instanceof String;

}
//JAVA 循环结构 -for,while,do...while

public class whileClass {
    public static void main(String[] args){

        //while
        int x = 10;
        while (x<20){
            System.out.println("value of x:"+x);
            x++;
            System.out.println("\n");
        }

        //do while (run once time at least)
        do {
            System.out.println("value of x:"+x);
        }while (x<20);

        //for循环
        for (int x = 10,x < 20, x ++){
            System.out.println("value of i :"+x);
        }

        //增强for循环

        int [] numbers = {10,20,30,40,50};

        for (int x:numbers){
            System.out.println(x);
            System.out.println(",");
        }
        String[] names = {"123","345",'345'};
        for (String y : names){
            System.out.println(y);
        }
        //break
        double [] d = {123,345,345,234234};
        for (double z:d){
            if (z == 345){
                break;
            }else {
                System.out.println("hehhehe");
            }
        }
    }
}

//JAVA Number & Math

public class Number_Math {
    public static void main (String[] args){
        System.out.println("sin90度:"+Math.sin(Math.PI/2));
        System.out.println("cos90度:"+Math.cos(Math.PI/2));
        System.out.println("tan90度:"Math.tan(Math.PI/2));
        System.out.println("cot90度:"Math.atan(Math.PI/2));
    }
}

//JAVA String StingBuffer StringBuilder(String 类无法改变，一旦创建String对象，value是无法改变的，如果需要修改
// 需要用StringBuffer & StringBuilt);
public class StringClass {
    public static void main(String[] args){
        String site = "www.baidu.com";
        int len = site.length();
        System.out.println(site+"leng:"+len);
        System.out.println(site.concat("wwwww"));

        StringBuffer sBuffer = new StringBuffer("hhhhhh");
        sBuffer.append("WWW");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);

        sBuffer.reverse(); // 将此字符序列用其反转形式取代

        sBuffer.delete(1,3);//移除此序列的子字符串中的字符。

        sBuffer.insert(1,3);//将 int 参数的字符串表示形式插入此序列中

        sBuffer.replace(1,3,"333");
    }
}

//JAVA 数组
public class Array{
    public static void main (String[] args){
        double[] myList = new double[5];
        double total = 0;
        double[0] = 1.0;
        double[1] = 1.3;
        double[2] = 1.4;
        double[3] = 3.9;
        double[4] = 9.9;
        for (int i = 0, i < 5,i ++){
            total += double[i];
        }
        System.out.println(total);


        double[] testList = {1.5,1.6,4.4,5.6,32.0,4.5};
        //print all element
        for (int i = 0;i < testList.length;i ++){
            System.out.println(testList[i]);
        }
        //sum all element
        double total = 0;
        for (int i = 0;i < testList.length;i ++) System.out.println(total += testList[i]);

        //check MAX value

        double maxValue = testList[0];
        for (int i = 0; i < testList.length;i ++)
            if (testList[i] > maxValue) {
                maxValue = testList[i];
            }


    }

    public static  int[] reverse(int[] list){
        int [] result = new int[list.length];
        for (int i = 0;j < result.length-1;i < list.length;i ++,j--){
            result[j] = list[i];
        }
        return result;
    }


    //多维数组
    String str[][] = new String[3][4];
}
//JAVA日期时间
public class JAVA_Date{
    public static void main(String[] args){
        Date();
        Date(long millisec);
        Date date = new Date();
        System.out.println(date.toString());

        Date dNow = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yy-mm-dd hh:mm:ss");
        System.out.println("localTime:".concat(sdf.format(dNow)));

        System.out.println("全部日期和时间信息:%fc",date);
        System.out.println("年-月-日格式:%tF",date);
        System.out.println("月-日-年格式:%tD",date);
        System.out.println("HH-MM-SS PM格式%tf",date);
        System.out.println("HH:MM:SS (24h)格式,%tT",date);
        System.out.println("HH:MM(24h)格式,%tR",date);

        String str = String.format(Locale.US,"英文月份简称:%tb",date);
        System.out.println(str);
        System.out.println("本地月份简称:%tB",date);

        str = String.format(Locale.US,"英文星期的简称:%ta",date);

        System.out.println("本地月份全程%ta"+date);
        System.out.println(str);

    }
}

//JAVA_Calendar

public class JAVA_Calendar{

    Calendar c1 = new Calendar() {

        int year = c1.get(Calendar.YEAR);
        int month = c1.MONTH+1;
        int date = c1.DATE;
        int hour = c1.HOUR_OF_DAY;
        int minute = c1.MINUTE;
        int second =  c1.SECOND;
        @Override
        protected void computeTime() {

        }

        @Override
        protected void computeFields() {

        }

        @Override
        public void add(int field, int amount) {

        }

        @Override
        public void roll(int field, boolean up) {

        }

        @Override
        public int getMinimum(int field) {
            return 0;
        }

        @Override
        public int getMaximum(int field) {
            return 0;
        }

        @Override
        public int getGreatestMinimum(int field) {
            return 0;
        }

        @Override
        public int getLeastMaximum(int field) {
            return 0;
        }
    }
}

//JAVA_正则表达式(略)

//JAVA_方法

public class FuncTest{
    public static void main(String[] args) {
        int i = 5; int j = 2;int k = max(i ,j);
        System.out.println("maxValue:%d"+k);
    }

    public static int void max(int x,int y){
        int result;
        if (x>y)
            return = x;
        else
            result = y;
        return result;
    }
}

public class TestPassByValue{
    public class void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.printf("before exchange:num1:%d,num2:%d", num1, num2);
        System.out.printf("%d; %d; %d%n", -500, 2343L, iObj);
    }
    public static void swap(int x,int y){
        System.out.println("enter");
        System.out.printf("before:num1:%d;num2:%d",x,y);
        int temp = x;
        x = y;
        y = temp;
        System.out.printf("after:num1:%d;num2:%d",x,y);
    }
}


public class VarargsDemo{
    public static void main (String args[]){

    }

    public static void printMax(double...numbers){
        if (numbers.length == 0)return;
        double result = numbers[0];
        for (int i = 1;i < numbers.length;i ++){
            if (numbers[i] >result){
                result = numbers[i];
            }
        }
        System.out.println("The Max vaule is"+result);
    }
}

public class JAVA_Scanner{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("next:");
        if (scan.hasNext()){
            String stri1 = scan.next();
            System.out.println("输入数据为:"+stri1);
        }
        scan.close();
    }
}

class ScannerDemo{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (scan.hasNextDouble()){
            double x = scan.nextDouble();
            m = m+1;
            sum = sum + x;
        }
        System.out.println(m+"和"+sum);
        System.out.println("平均值:"+(sum/m));
        scan.close();
}

//JAVA_继承
    /*
    //企鹅类
public class Penguin{
    private String name;
    private int id;
    public Penguin(String penguinName,int penguinID){
        this.name = penguinName;
        this.id = penguinID;
    }
    public void eat() {
        System.out.println(name + "eating");
    }
    public void sleep(){
        System.out.println(name+"sleeping");
    }
    public void introduction(){
        System.out.printf("i`m number :%d;u can call me :%s",id,name);

    }
}

//老鼠
public class Mouse{
    private String name;
    private int id;

    public Mouse(String mouseName, int mouseId){
        this.name = mouseName;
        this.id = mouseId;
    }

    public void eat(){
        System.out.print(name+"eating");
    }
    public void sleep(){
        System.out.print(name+"sleeping");
    }
    public void introduction() {
        System.out.printf("i`m number :%d;u can call me :%s",id,name);
        System.out.printf("i`m number :%d;u can call me :%s",id,name);
    }
}
*/

public class Animail{
    private String name;
    private int age;
    public Animail(String aniName,int aniAge){
        this.name = aniName;
        this.age = aniAge;
    }
    public void eat(){

        System.out.print("eating");
    }
    public void sleep(){

        System.out.print("sleeping");
    }
}

public class Penguin extends Animail{
    public Penguin(String penguinName, int penguinAge){

        super(penguinName,penguinAge);
    }
}

/*
子类拥有父类非private 属性/方法
子类可以拥有自己的属性和方法，即子类可以对父类进行扩展
子类可以拥有自己的方式实现父类（override）
Java 的继承是单继承，但是可以多重继承，单继承就是一个子类只能继承一个父类，多重继承就是，例如 A 类继承 B 类，B
类继承 C 类，所以按照关系就是 C 类是 B 类的父类，B 类是 A 类的父类，这是 Java 继承区别于 C++ 继承的一个特性。
提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系越紧密，代码独立性越差）
 */

//JAVA_构造器

class SuperClass{
    private int n;
    SuperClass(){
        System.out.print("SuperClass");
    }

    SuperClass(int n){
        System.out.print("SuperClass(int n)");
        this.n = n;
    }
}


//SubClass 类继承
class SubClass extends SuperClass{

    private int n;
    SuperClass(){
        System.out.print("SubClass");
    }

    public SubClass(int n){
        Super(300);
        System.out.println("SubClass2");
    }

    public SubClass2(int n){
        System.out.print("");
        this.n = n;
    }
}

public class TestSuperSub{

    public static void main[String[] args]{

        System.out.print("");
        SubClass sc1 = new SubClass();
        SubClass sc2 = new SubClass();
    }
}

//JAVA_重写(Override)与重载(Overload)

class Animal{
    public void move(){
        System.out.print("animal can move");
    }
}

class Dog extends Animal{
    public void move(){
        System.out.print("");
    }
}

public class TestDog{
    public static void main(String[] args){
        Animail a = new Animail();
        Animail b = new Dog();
        a.move();
        ((Dog) b).move();
    }
}

public class Overloading{
    public int test(){ System.out.print("test1"); }

    public void test(int a){ System.out.print("test2"); }

    public String test(int a, String s){
        System.out.print("test3");
        return "test";
    }

    public String test(String s, int a){
        System.out.print("test4");
        return "test4";
    }

    public static void main(String[] args){
        Overloading ol = new Overloading();
        ol.test();
        ol.test(1);
        ol.test(2,"2");
        ol.test("2",2);
    }
}

//JAVA_多态


public class Employee{
    private String name;
    private String address;
    private int number;
    public Employee(String name,String address,int number){
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck(){
        System.out.print("");
    }

    public String toString (){

    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}

public class Salary extends Employee{
    private double salary;
    public Salary(String name, String address, int number, double salary) {
        super(name,address,number);

    }

    public void mailCheck(){
        System.out.print("");
    }

    public double getSalary(double newSalary){
        if (newSalary>=0){
            salary = newSalary;
    }

    public double computePay (){
        System.out.print("for :"+getName());
        return salary/52;
    }
}

public class VirtualDemo{
        public static void main(String[] args){
            Salary s = new Salary("hah","北京",1000.0);
        }
}


//JAVA_Encapsulation 封装

public class EncapTest{
        private String name;
        private int age;
        private int idNum;

        public int getAge(){
            return age;
        }

        public String getName(){
            return name;
        }

        public int getIdNum(){
            return idNum;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setIdNum(int idNum){
            this.idNum = idNum;
        }
}

//JAVA_接口
public class MammalInt implements Animail{
    public void eat(){

    }
}


//JAVA_Package