//week 10 question 1
//Create class Person (Data Member- name, phone).
// Create two member inner classes Address (Data Member- House_No, Street, City, State; Method- displayAddr())
// and DateOfBirth (Data Member- Day, Month,Year; Method- displayDOB()).
// Display() is the method of Person class which will display name, address and date of birth of a Person object.
public class Person {
    String name;
    String phone;

    Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

class Address {
    String houseNo, street, city, state;

    Address(String houseNo, String street, String city, String state) {
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    void displayAddr() {
        System.out.println("Address: " + houseNo + ", " + street + ", " + city + ", " + state);
    }
}

class DateOfBirth {
    int day, month, year;

    DateOfBirth(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    void displayDOB() {
        System.out.println("Date of Birth: " + day + "/" + month + "/" + year);
        }
    }

    void display(Address addr, DateOfBirth dob) {
    System.out.println("Name: " + name);
    System.out.println("Phone: " + phone);
    addr.displayAddr();
    dob.displayDOB();
    }

    public static void main(String[] args) {
    Person p = new Person("Aisha", "9876543210");
    Address a = p.new Address("H-12", "Park Road", "Delhi", "Delhi");
    DateOfBirth d = p.new DateOfBirth(12, 8, 2002);
    p.display(a,d);
    }
}

