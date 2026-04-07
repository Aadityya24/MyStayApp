import java.util.LinkedList;
import java.util.Queue;

class Reservation {
    private final String guestName;
    private final String roomType;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String toString() {
        return "Reservation{guest='" + guestName + "', roomType='" + roomType + "'}";
    }
}

class BookingRequestQueue {
    private final Queue<Reservation> queue = new LinkedList<>();

    public void addRequest(Reservation reservation) {
        queue.offer(reservation);
        System.out.println("Request added: " + reservation);
    }

    public void viewQueue() {
        System.out.println("Current Booking Queue:");
        for (Reservation r : queue) {
            System.out.println(r);
        }
    }
}

public class MyStayApp {
    public static void main(String[] args) {
        BookingRequestQueue requestQueue = new BookingRequestQueue();

        requestQueue.addRequest(new Reservation("Alice", "Deluxe"));
        requestQueue.addRequest(new Reservation("Bob", "Suite"));
        requestQueue.addRequest(new Reservation("Charlie", "Standard"));

        requestQueue.viewQueue();
    }
}