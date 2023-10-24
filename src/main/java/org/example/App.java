package org.example;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import io.javalin.rendering.template.JavalinJte;

class App {
    public static void main(String[] args) {
        JavalinJte.init();
        Javalin app = Javalin.create(javalinConfig -> {
            javalinConfig.staticFiles.add("/public");
        }).start(7070);
        app.get("/", ctx -> ctx.render("index.jte"));
    }
}
