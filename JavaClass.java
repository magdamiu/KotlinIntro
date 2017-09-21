package magdamiu.com.kotlinintro;

/**
 * Created by magdamiu on 20/09/17.
 */


import org.jetbrains.annotations.NotNull;

import kotlin.jvm.internal.Intrinsics;


public final class JavaClass {
    @NotNull
    public JavaClass.GDGPitesti gdg;
    @NotNull
    private final String language;
    @NotNull
    private String name;

    @NotNull
    public final JavaClass.GDGPitesti getGdg() {
        JavaClass.GDGPitesti var10000 = this.gdg;
        if(this.gdg == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gdg");
        }

        return var10000;
    }

    public final void setGdg(@NotNull JavaClass.GDGPitesti var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.gdg = var1;
    }

    @NotNull
    public final String getLanguage() {
        return this.language;
    }

    public final void initializeName(@NotNull String name) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        this.gdg = new JavaClass.GDGPitesti(name);
    }

    @NotNull
    public final String sayItFromGDG() {
        StringBuilder var10000 = (new StringBuilder()).append("");
        JavaClass.GDGPitesti var10001 = this.gdg;
        if(this.gdg == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gdg");
        }

        return var10000.append(var10001.getText()).append(' ').append(this.name).append(' ').append(this.language).toString();
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setName(@NotNull String var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.name = var1;
    }

    public JavaClass(@NotNull String name) {
        super();
        Intrinsics.checkParameterIsNotNull(name, "name");
        this.name = name;
        this.language = "Kotlin";
    }

    public final class GDGPitesti {
        @NotNull
        private final String text;

        @NotNull
        public final String getText() {
            return this.text;
        }

        public GDGPitesti(@NotNull String text) {
            super();
            Intrinsics.checkParameterIsNotNull(text, "text");
            this.text = text;
        }
    }
}
