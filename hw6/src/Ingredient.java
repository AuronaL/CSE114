import java.util.Objects;
/**
 * You will be creating a cooking recipes book. A RecipeBook will contain multiple CookingRecipe(s) and each recipe has multiple RecipeIngredient(s).
 * To do this you will need to implement the following classes and methods:
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class Ingredient {
    private String name, measuringUnit;
    private int caloriesPerUnit;
    public Ingredient(String name, String measuringUnit, int caloriesPerUnit){
        this.name=name;
        this.caloriesPerUnit=caloriesPerUnit;
        this.measuringUnit=measuringUnit;
    }
//Getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasuringUnit() {
        return measuringUnit;
    }

    public void setMeasuringUnit(String measuringUnit) {
        this.measuringUnit = measuringUnit;
    }

    public int getCaloriesPerUnit() {
        return caloriesPerUnit;
    }

    public void setCaloriesPerUnit(int caloriesPerUnit) {
        this.caloriesPerUnit = caloriesPerUnit;
    }

    // equal & string
    public String toString(){
        return "Ingredient\n"+ " name=" + name + "\n" + " measuringUnit=" + measuringUnit + "\n" + " caloriesPerUnit=" + caloriesPerUnit;
    }
    public boolean equals(Ingredient i1){
        return i1.name.equals(this.name) && i1.caloriesPerUnit==this.caloriesPerUnit && Objects.equals(i1.measuringUnit, this.measuringUnit);
    }
}
