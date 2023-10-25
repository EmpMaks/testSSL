package org.example;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;

class App {
    public static void main(String[] args) {
        JavalinJte.init();
        Javalin app = Javalin.create(javalinConfig -> {
            javalinConfig.staticFiles.add("/static");
        }).start(7070);
        app.get("/", ctx -> ctx.render("index.jte"));
        app.post("/", context -> {
            String ip = context.formParam("ip");
            String threads = context.formParam("threads");
            System.out.println(ip + "\n" +threads);
        });
    }
}
