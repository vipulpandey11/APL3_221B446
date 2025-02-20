abstract class Bharatvanshi {
   
    public void fight() {
        System.out.println("I am fighting!");
    }
    public abstract void obey();
    public abstract void kind();
}


abstract class Pandav extends Bharatvanshi {
    
    @Override
    public void obey() {
        System.out.println("I obey the rules!");
    }

    @Override
    public void kind() {
        System.out.println("I am kind!");
    }
}


class Arjun extends Pandav {
    @Override
    public void kind() {
        System.out.println("Arjun is kind!");
    }
}


class Bheem extends Pandav {
    @Override
    public void kind() {
        System.out.println("Bheem is kind!");
    }
}


abstract class Kaurav extends Bharatvanshi {
    
    @Override
    public void fight() {
        System.out.println("I am fighting like a Kaurav!");
    }

    @Override
    public void obey() {
        System.out.println("I do not obey!");
    }

    @Override
    public void kind() {
        System.out.println("I am cruel!");
    }
}


class Duryodhan extends Kaurav {
    @Override
    public void kind() {
        System.out.println("Duryodhan is cruel!");
    }
}


class Vikarn extends Kaurav {
    @Override
    public void obey() {
        System.out.println("Vikarn obeys the rules!");
    }

    @Override
    public void kind() {
        System.out.println("Vikarn is kind!");
    }
}


public class Test {
    public static void main(String[] args) {
        
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        
        
        Bharatvanshi duryodhan = new Duryodhan();
        Bharatvanshi vikarn = new Vikarn();
        
       
        System.out.println("Arjun:");
        arjun.fight();
        arjun.obey();
        arjun.kind();
        
        System.out.println("\nBheem:");
        bheem.fight();
        bheem.obey();
        bheem.kind();
        
        System.out.println("\nDuryodhan:");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();
        
        System.out.println("\nVikarn:");
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
