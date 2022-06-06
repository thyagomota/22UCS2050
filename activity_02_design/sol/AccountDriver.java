public class AccountDriver {

    public static void main(String[] args) {
        Account jane = new Account(101, "Jane Austin");
        jane.setName("Jane Austin II");
        System.out.println("Jane's balance = " + jane.getBalance());
        if (jane.deposit(100))
            System.out.println("deposit successful!");
        else
            System.out.println("deposit failed!");
        System.out.println("Jane's balance = " + jane.getBalance());
        if (jane.withdraw(-10))
            System.out.println("withdraw successful!");
        else
            System.out.println("withdraw failed!");
        System.out.println("Jane's balance = " + jane.getBalance());
        System.out.println(jane);
    }
}
