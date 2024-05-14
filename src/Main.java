//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    Parent parent = new Parent();
//    Parent child = new Child();//向上轉型，可搭配它的祖先

//    Child child = new Child();
    parent.sayHi();

    /*
    Parent child = new Child(); //向上轉型
           //爸爸的外表骨子裡是兒子，但若兒子有的方法爸爸沒有，那執行時只能做爸爸的方法。
    child.sayHi();//用兒子做(自己的能力做)
    child.play(); //只能跟爸爸有一樣的方法
                  //play是兒子的方法
     */

    Parent parent2 = new Child(); //uppercasting 向上轉型(自動)
    parent2.sayHi();

  //  Child caseChild = (Child) child; //child現在是爸爸型別，爸爸想轉成兒子，系統不會幫忙做任何處理。
   Child child = (Child)parent2; //downcasting 向下轉型(手動)，爸爸轉成兒子。
    child.sayHi();
    child.play();

//    if(parent instanceof Child) { //是不是它的物件
//      Child child2 = (Child) parent;
//      child2.sayHi();
//      child2.play();
//    }  //一般工程師不會做"向下轉型"這件事，除非沒經驗。


  }
}