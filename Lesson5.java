/**
 * Java 1. Homework 3
 *
 * @author Gleb
 * @version 20.10.2021
 */

class Lesson5 {
    public static void main(String[] args) {
        Worker[] arrWorker = new Worker[5];
        arrWorker[0] = new Worker("name", "position", "email", "phone", 30000, 30);
        arrWorker[1] = new Worker("name", "position", "email", "phone", 25000, 25);
        arrWorker[2] = new Worker("name", "position", "email", "phone", 45000, 45);
        arrWorker[3] = new Worker("name", "position", "email", "phone", 32000, 41);
        arrWorker[4] = new Worker("name", "position", "email", "phone", 39000, 39); 
        
        for (int i = 0; i < arrWorker.length; i++) {
            if(arrWorker[i].getAge() > 40)
            System.out.println(arrWorker[i]);
        }
    }
}

class Worker {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int wages;
    private int age;
    
    public String toString() {
        return name + " / " + position + " / " + email + " / " + phone + " / " + wages + " / " + age;
    }
    
    Worker(String name, String position, String email, String phone, int wages, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.wages = wages;
        this.age = age;
    }
    
    String getName() {
        return name;
    }
    
    void setName(String name) {
        this.name = name;
    }
    
    String getPosition() {
        return position;
    }
    
    void setPosition(String position) {
        this.position = position;
    }
    
    String getEmail() {
        return email;
    }
    
    void setEmail(String email) {
        this.email = email;
    }
    
    String getPhone() {
        return phone;
    }
    
    void setPhone(String phone) {
        this.phone = phone;
    }
    
    int getWages() {
        return wages;
    }
    
    void setWages(int wages) {
        this.wages = wages;
    }
    
    int getAge() {
        return age;
    }
    
    void setAge(int age) {
        this.age = age;
    }
}
