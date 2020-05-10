import java.util.ArrayList;

public class RealEstateAgentProxy implements RealEstateAgent {

    private ArrayList<Apartment> representedApartments;

    public RealEstateAgentProxy() {
        representedApartments = new ArrayList<>();
    }

    @Override
    public void represent(Apartment apartment) {
        if(!queryApartment(apartment.getLocation())){
            representedApartments.add(apartment);
            System.out.println("Apartment on " + apartment.getLocation() + " is now represented by the real estate firm.");
        }
    }

    @Override
    public Apartment rent(Student student) {

        if(student.getName().charAt(0) == 'P'){
            return null;
        }else {

            int lowestMonthlyRent = Integer.MAX_VALUE;
            for (int i = 0; i < representedApartments.size(); i++) {
                int monthlyRent = representedApartments.get(i).getMonthlyRentCost();
                if (monthlyRent < lowestMonthlyRent) {
                    lowestMonthlyRent = monthlyRent;
                }
            }

            for(int i = 0; i < representedApartments.size(); i++){
                if(representedApartments.get(i).getMonthlyRentCost() == lowestMonthlyRent && student.getMoney() >= lowestMonthlyRent){
                    return representedApartments.get(i);
                }
            }
        }
        return null;
    }

    public boolean queryApartment(String location){
        for(int i = 0; i < representedApartments.size(); i++){
            if(representedApartments.get(i).getLocation().equals(location)){
                return true;
            }
        }
        return false;
    }
}
