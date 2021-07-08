import java.rmi.Naming;

public class HotelClient {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                System.out.println("Você pode usar os seguintes comandos: ");
                System.out.println("java HotelClient list");
                System.out.println("java HotelClient book <tipo do quarto(0-5)> <nome do hospede>");
                System.out.println("java HotelClient guests");
            } else if (args.length == 1 && args[0].equals("list")) {
                RoomManager access = (RoomManager) Naming.lookup("rmi://localhost:1900/HotelRoomReservation");
                System.out.println(access.list());
            } else if (args.length == 1 && args[0].equals("guests")) {
                RoomManager access = (RoomManager) Naming.lookup("rmi://localhost:1900/HotelRoomReservation");
                System.out.println(access.guests());
            } else if (args.length == 3 && args[0].equals("book")) {
                if (Integer.parseInt(args[1]) < 0 || Integer.parseInt(args[1]) > 4) {
                    System.out.println("Tipo do quarto invalido!!");
                } else {
                    RoomManager access = (RoomManager) Naming.lookup("rmi://localhost:1900/HotelRoomReservation");
                    System.out.println(access.reserve(Integer.parseInt(args[1]), args[2]));
                }
            } else {
                System.out.println("Argumentos invalidos, por gentileza tentar novamente!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
