public class Hwork4 {
    public abstract static class pet {
        public String name;
        public String sex;
        public pet(String name,String sex){
            this.name = name;
            this.sex = sex;
        }
        public void talk() {
        }
        public void eat() {
        }
    }
    public static class Dog extends pet {
        public String color;
        public Dog(String name,String sex,String color){
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
        public Cat(String name,String sex, int wight){
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
        Dog dog = new Dog("小白","公","白");
        System.out.print("Dog: "+dog.name+" "+dog.sex+" "+dog.color);
        System.out.print("食物: ");
        dog.eat();
        System.out.print("叫声: ");
        dog.talk();
        Cat cat = new Cat("小黑","母",10);
        System.out.print("Cat: "+cat.name+" "+cat.sex+" "+cat.wight+"Kg");
        System.out.print("食物: ");
        cat.eat();
        System.out.print("叫声: ");
        cat.talk();
    }
}
