class TestEncapsulation {
    public static void main(String args[]){
        Encapsulation obj = new Encapsulation();

        //setting values of the variables
        obj.setName("Samir");
        obj.setAge(23);
        obj.setRoll(66);

        //displaying values of the variables
        System.out.println("Students name: "+obj.getName());
        System.out.println("Students age:  "+obj.getAge());
        System.out.println("Students Roll: "+obj.getRoll());

        /*Direct access of Student's data is not possible
        due to encapculation*/
    }
}
