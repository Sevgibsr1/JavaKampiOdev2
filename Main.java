public class Main {
    public static void main(String[] args) {

//        CreditManager creditManager = new CreditManager();
//        creditManager.calculate();
//
//         Customer customer = new Customer();
//         customer.city = "Istanbul";
//
//
//         CustomerManager customerManager = new CustomerManager(customer);
//         customerManager.save(); customerManager.delete();
//
//         Company company=new Company(); company.taxnumber="10000";
//         company.companyName="Arçelik"; company.id=100;
//
//         CustomerManager customerManager2=new CustomerManager(new Person());
//
//         Person person=new Person(); person.nationalIdentity="123456";
//
//         Customer c1=new Customer();
//         Customer c2=new Person();
//         Customer c3=new Company();

        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.giveCredit();

        }

        }

