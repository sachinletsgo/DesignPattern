package DecoratorPattern;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class ShowRoom {

    public static void main(String [] args){

        twoWheeler twoWheeler =  new AlloyWheel(new LegGuard(new HondaBike()));
        twoWheeler twoWheeler1 =new DecoratorWheeler(new AlloyWheel(new LegGuard(new HondaBike())));

        System.out.println(twoWheeler.wheel());
        System.out.println("\nTotal Cost "+twoWheeler.cost());

        System.out.println(twoWheeler1.wheel());
        System.out.println("\nTotal Cost "+twoWheeler1.cost());

    }
}
