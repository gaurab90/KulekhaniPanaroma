package kulekhanipanaromaresort

class Reservation {
    String name;
    String address;
    String contactNumber;
    String email;
    String message;
    Date checkIn;
    Date checkOut;
    Integer adult;
    Integer children;;

    static constraints = {
        name(blank: false , minSize: 3)
        address(blank: false , minSize: 5)
        contactNumber(blank: false , minSize:10 )
        email(email: true , blank: false)
       message(minSize:10 ,blank:true)
        checkIn(nullable: false)
        checkOut(nullable: false);
        adult(nullable: false)
        children(nullable: false)

    }
}
