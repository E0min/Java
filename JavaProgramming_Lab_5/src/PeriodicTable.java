public class PeriodicTable {
    PeriodicElement [] elements; // 객체 넣기

    PeriodicTable(PeriodicElement [] elements){
        this.elements = elements;
    }

    PeriodicElement [] gas ={
            new PeriodicElement(1,"H","Hydrogen", 1.01),
            new PeriodicElement(2,"He","Helium", 4.00),
            new PeriodicElement(7,"N","Nitrogen", 14.01),
            new PeriodicElement(8,"O","Oxygen", 16.00),
            new PeriodicElement(9,"F","Fluorine", 19.00),
    };
    PeriodicElement [] liquid = {
            new PeriodicElement(10,"Ne","Neon",20.18)
    };
    PeriodicElement [] soild = {
            new PeriodicElement(3,"Li","Lithium", 6.94),
            new PeriodicElement(4,"Be","Beryllium", 9.01),
            new PeriodicElement(5,"B","Boron", 10.81),
            new PeriodicElement(6,"C","Carbon", 12.01),
    };
    //
    PeriodicElement get(int index) { return elements[index-1]; }
    PeriodicElement getPrevious(int index) { return elements[index-2]; }
    PeriodicElement getNext(int index){ return elements[index]; }

    PeriodicElement find(Element e){
        switch(e){
            case HYDROGEN: return elements[0];
            case HELIUM: return elements[1];
            case LITHIUM: return elements[2];
            case BERYLLIUM: return elements[3];
            case BORON: return elements[4];
            case CARBON: return elements[5];
            case NITROGEN: return elements[6];
            case OXYGEN: return elements[7];
            case FLUORINE: return elements[8];
            case NEON: return elements[9];
        }
        return null;
    }
    PeriodicElement find(int number){
        switch(number){
            case 1: return elements[0];
            case 2: return elements[1];
            case 3: return elements[2];
            case 4: return elements[3];
            case 5: return elements[4];
            case 6: return elements[5];
            case 7: return elements[6];
            case 8: return elements[7];
            case 9: return elements[8];
            case 10: return elements[9];
        }
        return null;
    }
    PeriodicElement find(String symbol) {
        switch (symbol) {
            case "H": return elements[0];
            case "He": return elements[1];
            case "Li": return elements[2];
            case "Be": return elements[3];
            case "B": return elements[4];
            case "C": return elements[5];
            case "N": return elements[6];
            case "O": return elements[7];
            case "F": return elements[8];
            case "Ne": return elements[9];
        }
        return null;
    }
    PeriodicElement [] find(PeriodicElement.State state){
        switch (state){
            case GAS: return gas;
            case LIQUID: return liquid;
            case SOLID: return soild;
        }
        return null;
    }

    public void set(int index, PeriodicElement pe){
        this.elements[index] = pe;
    }
}


