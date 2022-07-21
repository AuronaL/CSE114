import java.util.ArrayList;
/**
 * You will be creating a cooking recipes book. A RecipeBook will contain multiple CookingRecipe(s) and each recipe has multiple RecipeIngredient(s).
 * To do this you will need to implement the following classes and methods:
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class CookingRecipe {
    private ArrayList<RecipeIngredient> recipeIngredient = new ArrayList<>();
    private String name;
    public CookingRecipe(String name) {
        this.name = name;
    }
    public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity){
        boolean find=false;
        for (RecipeIngredient value : recipeIngredient) {
            if (value.equals(ingredient)) {
                value.setQuantity(value.getQuantity() + quantity);
                find = true;
                break;
            }
        }
       if (!find) {
           RecipeIngredient e = new RecipeIngredient(ingredient.getName(),ingredient.getMeasuringUnit(),ingredient.getCaloriesPerUnit(),quantity);
           recipeIngredient.add(e);
       }
    }

    public RecipeIngredient getRecipeIngredient(Ingredient ingredient){
        for (RecipeIngredient value : recipeIngredient) {
            if (value.getName().equals(ingredient.getName())) {
                return value;
            }
        }
        return null;
    }

    public RecipeIngredient getRecipeIngredient(String ingredientName){
        for (RecipeIngredient ingredient : recipeIngredient) {
            if (ingredient.getName().equals(ingredientName)) {
                return ingredient;
            }
        }
        return null;
    }

    public RecipeIngredient removeRecipeIngredient(Ingredient ingredient){
        RecipeIngredient r = null;
        for(int i = 0; i< recipeIngredient.size(); i++){
            if(recipeIngredient.get(i).getName().equals(ingredient.getName())){
               r = recipeIngredient.remove(i);
            }
        }
        return r;
    }

    //remove the given ingredient from the recipe.
    //If the ingredient is part of the recipe return it, else return null.
    public RecipeIngredient removeRecipeIngredient(String ingredientName){
        RecipeIngredient r = null;
        for(int i = 0; i< recipeIngredient.size(); i++){
            if(recipeIngredient.get(i).getName().equals(ingredientName)){
                r = recipeIngredient.remove(i);
            }
        }
        return r;
    }

    public float calculateCalories(){
        float sum =0;
        for (RecipeIngredient ingredient : recipeIngredient) {
            sum += ingredient.getCaloriesPerUnit() * ingredient.getQuantity() / Integer.parseInt(ingredient.getMeasuringUnit());
        }
        return sum;
    }

    public int getNumberOfIngredients(){
        return recipeIngredient.size();
    }

    //String & equal
    public String toString(){
        String str = "CookingRecipe\n "+ name+": ";
        for (RecipeIngredient ingredient : recipeIngredient) {
            str += ingredient.getName() + ", "+ingredient.getQuantity()+";";
        }
        return str;
    }

    public boolean equals(CookingRecipe c2){
        if(this.recipeIngredient.size()!=c2.recipeIngredient.size()) return false;
        for(int i=0; i< recipeIngredient.size();i++){
           if(! this.recipeIngredient.get(i).equals(c2.recipeIngredient.get(i))) return false;
        }
        return this.name.equals(c2.getName());//this.recipeIngredient==c2.recipeIngredient : compare address
    }

    public ArrayList<RecipeIngredient> getRecipeIngredient() {
        return recipeIngredient;
    }

    public void setRecipeIngredient(ArrayList<RecipeIngredient> recipeIngredient) {
        this.recipeIngredient = recipeIngredient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
