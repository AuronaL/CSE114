import java.util.Arrays;
/**
 * You will be creating a cooking recipes book. A RecipeBook will contain multiple CookingRecipe(s) and each recipe has multiple RecipeIngredient(s).
 * To do this you will need to implement the following classes and methods:
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class TestRecipeBook {
    public static void main(String[] args) {
        //Ingredient
        Ingredient i1 = new Ingredient("Beef", "10",30);
        Ingredient i2 = new Ingredient("Beef", "10",30);
        Ingredient i3 = new Ingredient("Butter", "10",30);
        System.out.println(i1); // toString()
        System.out.println("i1 equals i2: "+i1.equals(i2));//equal
        System.out.println("i1 equals i3: "+i1.equals(i3)+"\n");// not equal

        //RecipeIngredient
        RecipeIngredient r1 = new RecipeIngredient("Beef", "10",30, 20);
        RecipeIngredient r2 = new RecipeIngredient("Beef", "10",30, 20);
        RecipeIngredient r3 = new RecipeIngredient("Butter", "10",30, 15);
        RecipeIngredient r4 = new RecipeIngredient("Sugar choco mix", "20", 30, 50);
        System.out.println(r1); // toString()
        System.out.println("r1 equals r2: "+r1.equals(r2));//equal
        System.out.println("r1 equals r3: "+r1.equals(r3)+"\n"); // not equal

        //CookingRecipe
        CookingRecipe c1 = new CookingRecipe("Steak");
        CookingRecipe c2 = new CookingRecipe("Steak");
        CookingRecipe c3 = new CookingRecipe("Hot choco");

        //public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity)
        c1.addOrUpdateRecipeIngredient(r1,20);
        System.out.println(c1);
        c1.addOrUpdateRecipeIngredient(r1, 10);
        System.out.println(c1);
        c1.addOrUpdateRecipeIngredient(r3,15);
        System.out.println(c1+"\n");
        c2.addOrUpdateRecipeIngredient(r2,30);

        //public RecipeIngredient getRecipeIngredient(Ingredient ingredient)
        System.out.println("Find Ingredient beef(r1) in recipe Steak(c1): \n" + c1.getRecipeIngredient(r1)); // get
        System.out.println("Find Ingredient beef(r1) in recipe hot choco(c3):  "+ c3.getRecipeIngredient(r1)+"\n"); // null

        //public RecipeIngredient getRecipeIngredient(String ingredientName)
        System.out.println("Find Ingredient beef in recipe Steak(c1): \n" + c1.getRecipeIngredient("Beef")); //get
        System.out.println("Find Ingredient beef in recipe hot choco(c3): "+ c3.getRecipeIngredient("Beef")+"\n");//null

        //public RecipeIngredient removeRecipeIngredient(Ingredient ingredient)
        System.out.println(c2+"\nRemove Ingredient beef(r2) in recipe Steak(c2): \n" + c2.removeRecipeIngredient(r2)); //remove
        System.out.println(c3+"\nRemove Ingredient beef(r2) in recipe hot choco(c3): "+ c3.removeRecipeIngredient(r2)+"\n");//null
        c2.addOrUpdateRecipeIngredient(r2,30);

        //public RecipeIngredient removeRecipeIngredient(String ingredientName)
        System.out.println(c2+"\nRemove Ingredient beef in recipe Steak(c1): \n" + c2.removeRecipeIngredient("Beef")); //remove
        System.out.println(c3+"\nRemove Ingredient beef in recipe hot choco(c3): "+ c3.removeRecipeIngredient("Beef")+"\n");//null
        c2.addOrUpdateRecipeIngredient(r2,30);
        //public float calculateCalories()
        System.out.println("Calculate the calories of recipe Steak(c1): \n"+c1.calculateCalories()); // 135.0
        System.out.println("Calculate the calories of recipe Steak(c2):\n"+c2.calculateCalories()+"\n");//0.0

        //public int getNumberOfIngredients()
        System.out.println("Calculate the number of ingredients of recipe Steak(c1): \n"+c1.getNumberOfIngredients()); //2
        System.out.println("Calculate the number of ingredients of recipe Steak(c2):\n"+c2.getNumberOfIngredients()+"\n");//0

        //public String toString() returns the recipe name and ingredients as a String.
        System.out.println("print out c1 & c2: \n");
        System.out.println( c1+"\n"+c2 );

        //equal
        System.out.println("c1 equals c2: "+c1.equals(c2));// same name but not equal
        c2.addOrUpdateRecipeIngredient(r3,15);
        System.out.println("-"+c1+"\n"+"-"+c2);
        System.out.println("c1 equals c2: "+c1.equals(c2)); // equal
        c3.addOrUpdateRecipeIngredient(r4,100);
        System.out.println(c1+"\n"+c3);
        System.out.println("c1 equals c3: "+c1.equals(c3)+"\n"); // different name not equal

        // RecipeBook
        RecipeBook b1 = new RecipeBook("Chef Meal");
        RecipeBook b2 = new RecipeBook("Chef Meal");
        RecipeBook b3 = new RecipeBook("Easy cook");

        //public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients)
        System.out.println("Before add "+ b1);  //toString empty
        System.out.println("Add recipe : "+ b1.addRecipe(c1.getName(), c1.getRecipeIngredient().toArray(new RecipeIngredient[0]))+"\n"); //add c1
        System.out.println("after add a new recipe"+ b1);
        b1.addRecipe(c1.getName(), c2.getRecipeIngredient().toArray(new RecipeIngredient[0]));// add same recipe return null
        System.out.println( "after add the same recipe"+b1);

        //equals
        System.out.println("Book1 equals Book2: "+b1.equals(b2));//same name Not equal
        b2.addRecipe(c1.getName(), c2.getRecipeIngredient().toArray(new RecipeIngredient[0]));
        System.out.println("Book1 equals Book2: "+b1.equals(b2)); // equal
        System.out.println("Book2 equals Book3: "+b2.equals(b3)+"\n"); // Different name Not equal

        //public CookingRecipe removeRecipe(String name)
        b1.addRecipe(c3.getName(), c3.getRecipeIngredient().toArray(new RecipeIngredient[0]));
        System.out.println("Before remove: "+b1);//before remove
        System.out.println("Remove Hot choco :"+ b1.removeRecipe("Hot choco")+"\n");
        System.out.println("After remove"+b1);//after remove
        System.out.println("Remove egg :"+ b1.removeRecipe("egg"));// remove nonexistent recipe
        System.out.print(b1+"\n");

        //public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients)
        r1.setQuantity(30);
        b1.addRecipe(c3.getName(), c3.getRecipeIngredient().toArray(new RecipeIngredient[0]));
        System.out.println("Find all the recipes in book1 has Ingredient r1: \n"+ Arrays.toString(b1.findRecipes(new RecipeIngredient[]{r1}))); //has
        System.out.println("Find all the recipes in book1 has Ingredient r1, r2: \n"+ Arrays.toString(b1.findRecipes(new RecipeIngredient[]{r1,r2}))+"\n"); // do not contain

        //public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients)
        System.out.println("Find all the recipes in book1 has <= 2 Ingredient \n"+ Arrays.toString(b1.findRecipesWithFewIngredients(2))); //has 2 or less : [Steak] [choco]
        System.out.println("Find all the recipes in book1 has <= 0 Ingredients \n"+ Arrays.toString(b1.findRecipesWithFewIngredients(0))+"\n"); // do not contain

        //public CookingRecipe[] findRecipesLowCalories()
        System.out.println("Find all the lowest calories recipes in book1 \n"+ Arrays.toString(b1.findRecipesLowCalories())); // sugar has more calories, so it should return [ Steak]
        System.out.println("Find all the lowest calories recipes in book1 \n"+ Arrays.toString(b3.findRecipesLowCalories())+"\n"); // null

    }
}
