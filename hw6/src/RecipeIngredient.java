import java.util.Objects;
/**
 * You will be creating a cooking recipes book. A RecipeBook will contain multiple CookingRecipe(s) and each recipe has multiple RecipeIngredient(s).
 * To do this you will need to implement the following classes and methods:
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class RecipeIngredient extends Ingredient{

    private float quantity;
    RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity){
        super(name,measuringUnit,caloriesPerUnit);
        this.quantity=quantity;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    // String & equal
    public String toString(){
        return "RecipeIngredient\n"+ " name=" + getName() + "\n" + " measuringUnit=" + getMeasuringUnit() + "\n"
                + " caloriesPerUnit=" + getCaloriesPerUnit() +"\n" + " quantity=" +quantity;
    }

    public boolean equals(RecipeIngredient r1){
        return r1.quantity == this.quantity &&  r1.getName().equals(this.getName())
                && r1.getCaloriesPerUnit()==this.getCaloriesPerUnit() && Objects.equals(r1.getMeasuringUnit(), this.getMeasuringUnit());
    }
}
