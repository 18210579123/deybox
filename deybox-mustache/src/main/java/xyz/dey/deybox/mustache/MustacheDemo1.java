package xyz.dey.deybox.mustache;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.Writer;
import java.util.HashMap;

public class MustacheDemo1 {

    public static void main(String[] args) throws Exception{
        HashMap<String, Object> scopes = new HashMap<String, Object>();
        scopes.put("name", "Mustache");
        scopes.put("feature", new Feature("Perfect!"));

        Writer writer = new OutputStreamWriter(System.out);
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile(new StringReader("{{name}}, {{feature.description}}!"), "example");
        mustache.execute(writer, scopes);


//        Mustache m2 = mf.compile("example");
//        m2.execute(writer, scopes);
        writer.flush();
    }
}
