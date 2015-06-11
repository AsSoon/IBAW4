package com.IBAW4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.IBAW4.model.Recipe;
import com.IBAW4.util.DbUtil;

/*
 * Klasa zapewniająca 
 * operacje na danych
 * zawartych w tabeli recipe
 */

/*
 * import com.daniel.model.Recipe;
 * zamiast
 * com.daniel.model.User;
 */

public class RecipeDao {

    private Connection connection;

    public RecipeDao() {
    	/*
    	 * połączenie z bazą danych
    	 */
        connection = DbUtil.getConnection();
    }

    public void addRecipe(Recipe recipe) {
    	/*
    	 * dodawanie przepisu 
    	 * atrybuty: 
    	 * nazwa przepisu (varchar) - recipename w tabeli recipe
		 * rodzaj (enum: zupa/deser/itd) - dishtype
		 * smak (enum: słodki/pikantny/itd) - dishflavour
		 * poziom trudności (enum: łatwy/średni/trudny) - difficultylevel
    	 */
    	
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into recipe(name, type, flavour, difficulty, instruction) values (?, ?, ?, ?, ?)");
            // Parameters start with 1
            preparedStatement.setString(1, recipe.getName());
            preparedStatement.setString(2, recipe.getType());
            preparedStatement.setString(3, recipe.getFlavour());
            preparedStatement.setString(4, recipe.getDifficulty());
            preparedStatement.setString(5, recipe.getInstruction());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteRecipe(int recipeId) {
    	/*
    	 * usuwanie przepisu
    	 * na podstawie numeru id
    	 */
        try {
        	/*
        	 * recipeid
        	 * zamiast
        	 * userid
        	 */
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from recipe where recipe_id=?");
            // Parameters start with 1
            preparedStatement.setInt(1, recipeId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateRecipe(Recipe recipe) {
    	/*
    	 * aktualizacja przepisu
    	 * atrybuty takie jak poprzednio
    	 */
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update recipe set name=?, type=?, flavour=?, difficulty=?, instruction=?" +
                            "where recipe_id=?");
            // Parameters start with 1
            preparedStatement.setString(1, recipe.getName());
            preparedStatement.setString(2, recipe.getType());
            preparedStatement.setString(3, recipe.getFlavour());
            preparedStatement.setString(4, recipe.getDifficulty());
            preparedStatement.setString(5, recipe.getInstruction());
            preparedStatement.setInt(6, recipe.getRecipeId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Recipe> getAllRecipes() {
    	/*
    	 * wyśiwetlenie wszystkich przepisów 
    	 * w formie listy
    	 */
        List<Recipe> recipes = new ArrayList<Recipe>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from recipe");
            while (rs.next()) {
            	/*
            	 * wypełnianie listy
            	 */
                Recipe recipe = new Recipe();
                recipe.setRecipeId(rs.getInt("recipe_id"));
                recipe.setName(rs.getString("name"));
                recipe.setType(rs.getString("type"));
                recipe.setFlavour(rs.getString("flavour"));
                recipe.setDifficulty(rs.getString("difficulty"));
                recipe.setInstruction(rs.getString("instruction"));
                recipes.add(recipe);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return recipes;
    }

    public Recipe getRecipeById(int recipeId) {
    	/*
    	 * wyświetlenie jednego przepisu
    	 * na podstawie numeru id
    	 */
        Recipe recipe = new Recipe();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from recipe where recipe_id=?");
            preparedStatement.setInt(1, recipeId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                recipe.setRecipeId(rs.getInt("recipe_id"));
                recipe.setName(rs.getString("name"));
                recipe.setType(rs.getString("type"));
                recipe.setFlavour(rs.getString("flavour"));
                recipe.setDifficulty(rs.getString("difficulty"));
                recipe.setInstruction(rs.getString("instruction"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return recipe;
    }
}
