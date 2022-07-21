import java.util.ArrayList;
import java.util.List;
/**
 * You will be creating a cooking recipes book. A RecipeBook will contain multiple CookingRecipe(s) and each recipe has multiple RecipeIngredient(s).
 * To do this you will need to implement the following classes and methods:
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class RecipeBook {
    private String name;
    private ArrayList<CookingRecipe> recipes = new ArrayList<>();
    public RecipeBook(String bookName){
        name=bookName;
    }
    //adds to the book and returns a new cooking recipe with the given parameters.
    // If recipe book already contains a recipe with the same name, do not create a new one and return null.
    public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
        for(CookingRecipe i: recipes){
            if(i.getName().equals(name)) return null;
        }
        CookingRecipe newRec= new CookingRecipe(name);
        newRec.getRecipeIngredient().addAll(List.of(ingredients));
        this.recipes.add(newRec);
        return newRec;
    }

    // removes the cooking recipe from the cooking book and returns it.
    // If recipe book does not contain a recipe with the specified name, then return null.
    public CookingRecipe removeRecipe(String name) {
        for(CookingRecipe i: recipes){
            if(i.getName().equals(name)){
                recipes.remove(i);
                return i;
            }
        }
        return null;
    }

    // returns all cooking recipes from the cooking book that contain all the ingredients passed as parameters
    public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients){
        boolean find = false;
        ArrayList<CookingRecipe> contain = new ArrayList<>();
        ArrayList<RecipeIngredient> target = new ArrayList<>(List.of(ingredients));
        for(CookingRecipe i: recipes){
            for(int j =0; j<Math.min(ingredients.length, i.getRecipeIngredient().size()) ; j++){
                find = i.getRecipeIngredient().get(j).equals(target.get(j));
            }
            if (find) contain.add(i);
        }
        if (contain.size()==0) return null;
        CookingRecipe[] c = new CookingRecipe[contain.size()];
        for(int i=0; i<contain.size(); i++){
            c[i] = contain.get(i);
        }
        return c;
    }

    //returns all cooking recipes from the cooking book that contain less than or equal the number of ingredients passed as parameter
    public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients){
        ArrayList<CookingRecipe> contain = new ArrayList<>();
        for(CookingRecipe i: recipes){
            if(i.getNumberOfIngredients()<=numberOfIngredients) {
                contain.add(i);
            }
        }
        if (contain.size()==0) return null;
        CookingRecipe[] c = new CookingRecipe[contain.size()];
        for(int i=0; i<contain.size(); i++){
            c[i] = contain.get(i);
        }
        return c;
    }

    //returns all cooking recipes from the cooking book that have the lowest number of calories.
    public CookingRecipe[] findRecipesLowCalories(){
        ArrayList<CookingRecipe> lowestCalRec = new ArrayList<>();
        float lowestCal =Integer.MAX_VALUE;
        for(CookingRecipe i: recipes){
            if(i.calculateCalories()<lowestCal){
               lowestCal= i.calculateCalories();
               lowestCalRec.clear();
               lowestCalRec.add(i);
            }
            else if(i.calculateCalories()<lowestCal){
                lowestCalRec.add(i);
            }
        }
        CookingRecipe[] c = new CookingRecipe[lowestCalRec.size()];
        for(int i=0; i<lowestCalRec.size(); i++){
            c[i] = lowestCalRec.get(i);
        }
        return c;
    }

    public String toString(){
        String str = "RecipeBook\n"+ name+":\n ";
        for (CookingRecipe recipe : recipes) {
            str += recipe.toString()+"\n ";
        }
        return str;
    }

    public boolean equals(RecipeBook b1){
        if(this.recipes.size()!=b1.recipes.size()) return false;
        for(int i=0; i< recipes.size();i++){
            if(! this.recipes.get(i).equals(b1.recipes.get(i))) return false;
        }
        return this.name.equals(b1.name);//this.recipeIngredient==c2.recipeIngredient : compare address
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<CookingRecipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(ArrayList<CookingRecipe> recipes) {
        this.recipes = recipes;
    }
}