public interface Vehicle {
    void start ();
    void stop ();
    void speedUp ();
    void turn ();
    void park ();

}
 class Sedan implements Vehicle, Car {
     int horsepower;
     String color;

     @Override
     public void start() {
     }

     @Override
     public void stop() {

     }

     @Override
     public void speedUp() {

     }

     @Override
     public void turn() {

     }

     @Override
     public void park() {

     }
 }


 class Hatchback implements Vehicle, Car {
     int horsepower;
     String color;

     @Override
     public void start() {

     }

     @Override
     public void stop() {

     }

     @Override
     public void speedUp() {

     }

     @Override
     public void turn() {

     }

     @Override
     public void park() {

     }
 }


class CrossMotorbike implements Vehicle, Motorbike {
    int horsepower;
    String color;

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void speedUp() {

    }

    @Override
    public void turn() {

    }

    @Override
    public void park() {

    }
}

class SportMotorbike implements Vehicle, Motorbike {
    int horsepower;
    String color;

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void speedUp() {

    }

    @Override
    public void turn() {

    }

    @Override
    public void park() {

    }
}

class Van implements Vehicle, Truck {
     int horsepower;
     String color;

     @Override
     public void start() {

     }

     @Override
     public void stop() {

     }

     @Override
     public void speedUp() {

     }

     @Override
     public void turn() {

     }

     @Override
     public void park() {

     }
}

class Pickup implements Vehicle, Truck {
    int horsepower;
    String color;

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void speedUp() {

    }

    @Override
    public void turn() {

    }

    @Override
    public void park() {

    }
}