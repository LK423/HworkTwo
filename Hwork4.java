public class Hwork4 {
    public abstract static class pet {
        public int name;
        public int sex;
        public pet(int name, int sex){
            this.name = name;
            this.sex = sex;
        }
        public void talk() {
        }
        public void eat() {
        }
    }
    public static class Dog extends pet {
        public int color;
        public Dog(int name,int sex,int color){
            super(name,sex);
            this.color = color;
        }
        public void talk(){
            System.out.println("汪");
        }
        public void eat(){
            System.out.println("bones");
        }
    }
    public static class Cat extends pet {
        public  int wight;
        public Cat(int name, int sex, int wight){
            super(name,sex);
            this.wight = wight;
        }
        public void talk(){
            System.out.println("喵");
        }
        public void eat(){
            System.out.println("fish");
        }
    }
    public static void main(String[] args){
        Dog dog = new Dog(1,0,1);
        if (dog.sex == 0){
            System.out.print("狗:编号: "+dog.name+"性别:母 ");
        }else{
            System.out.print("狗:编号: "+dog.name+"性别:公 ");
        }
        if(dog.color==1){
            System.out.print("颜色: 白色 ");
        }
        System.out.print("食物: ");
        dog.eat();
        System.out.print("叫声: ");
        dog.talk();
        Cat cat = new Cat(2,1,10);
        if (cat.sex == 0){
            System.out.print("猫:编号: "+cat.name+"性别:母 体重: "+cat.wight+"Kg ");
        }else{
            System.out.print("猫:编号: "+cat.name+"性别:公 体重: "+cat.wight+"Kg ");
        }
        System.out.print("食物: ");
        cat.eat();
        System.out.print("叫声: ");
        cat.talk();
    }
}