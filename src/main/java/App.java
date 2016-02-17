import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {


        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        get("/", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();
          model.put("template", "templates/index.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/compactDiscs", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();
          model.put("compactDiscs", CompactDisc.all());
          model.put("template", "templates/compactDiscs.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/compactDiscs/new", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();
          model.put("template", "templates/compactDisc-form.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/compactDiscs/:id", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();
          CompactDisc compactDisc = CompactDisc.find(Integer.parseInt(request.params(":id")));
          model.put("compactDisc", compactDisc);
          model.put("template", "templates/compactDisc.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/compactDiscs", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();
          String title = request.queryParams("title");
          CompactDisc newCompactDisc = new CompactDisc(title);
          model.put("template", "templates/success.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        //RESTful ARCHITECTURE
        //Use POST to create something on the server
        //Use GET to retrieve something from the server
        //Use PUT to change or update something on the server
        //Use DELETE to remove or delete something on the server
        //Keep URLs intuitive
        //Each request from client contains all info necessary for that request

        //ROUTES: Home Page

        // get("/", (request, response) -> {
        //     HashMap<String, Object> model = new HashMap<String, Object>();

        //     model.put("template", "templates/index.vtl");
        //     return new ModelAndView(model, layout);
        // }, new VelocityTemplateEngine());

        //ROUTES: Identification of Resources

        //ROUTES: Changing Resources

    }
}
