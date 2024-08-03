diff --git a/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/.classpath b/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/.classpath
new file mode 100644
index 0000000..463d5f9
--- /dev/null
+++ b/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/.classpath
@@ -0,0 +1,10 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<classpath>
+	<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-21">
+		<attributes>
+			<attribute name="module" value="true"/>
+		</attributes>
+	</classpathentry>
+	<classpathentry kind="src" path="src"/>
+	<classpathentry kind="output" path="bin"/>
+</classpath>
diff --git a/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/.gitignore b/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/.gitignore
new file mode 100644
index 0000000..ae3c172
--- /dev/null
+++ b/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/.gitignore
@@ -0,0 +1 @@
+/bin/
diff --git a/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/.project b/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/.project
new file mode 100644
index 0000000..f061071
--- /dev/null
+++ b/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/.project
@@ -0,0 +1,17 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<projectDescription>
+	<name>PrimeiroProgramaJava</name>
+	<comment></comment>
+	<projects>
+	</projects>
+	<buildSpec>
+		<buildCommand>
+			<name>org.eclipse.jdt.core.javabuilder</name>
+			<arguments>
+			</arguments>
+		</buildCommand>
+	</buildSpec>
+	<natures>
+		<nature>org.eclipse.jdt.core.javanature</nature>
+	</natures>
+</projectDescription>
diff --git a/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/.settings/org.eclipse.core.resources.prefs b/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/.settings/org.eclipse.core.resources.prefs
new file mode 100644
index 0000000..99f26c0
--- /dev/null
+++ b/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/.settings/org.eclipse.core.resources.prefs
@@ -0,0 +1,2 @@
+eclipse.preferences.version=1
+encoding/<project>=UTF-8
diff --git a/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/.settings/org.eclipse.jdt.core.prefs b/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/.settings/org.eclipse.jdt.core.prefs
new file mode 100644
index 0000000..92dd3c2
--- /dev/null
+++ b/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/.settings/org.eclipse.jdt.core.prefs
@@ -0,0 +1,14 @@
+eclipse.preferences.version=1
+org.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode=enabled
+org.eclipse.jdt.core.compiler.codegen.targetPlatform=21
+org.eclipse.jdt.core.compiler.codegen.unusedLocal=preserve
+org.eclipse.jdt.core.compiler.compliance=21
+org.eclipse.jdt.core.compiler.debug.lineNumber=generate
+org.eclipse.jdt.core.compiler.debug.localVariable=generate
+org.eclipse.jdt.core.compiler.debug.sourceFile=generate
+org.eclipse.jdt.core.compiler.problem.assertIdentifier=error
+org.eclipse.jdt.core.compiler.problem.enablePreviewFeatures=disabled
+org.eclipse.jdt.core.compiler.problem.enumIdentifier=error
+org.eclipse.jdt.core.compiler.problem.reportPreviewFeatures=warning
+org.eclipse.jdt.core.compiler.release=enabled
+org.eclipse.jdt.core.compiler.source=21
diff --git a/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/src/com/dio/PrimeiroPrograma.java b/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/src/com/dio/PrimeiroPrograma.java
new file mode 100644
index 0000000..4326623
--- /dev/null
+++ b/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/src/com/dio/PrimeiroPrograma.java
@@ -0,0 +1,20 @@
+package com.dio;
+
+import com.dio.model.Gato;
+
+public class PrimeiroPrograma{
+
+	public static void main(String[] args) {
+		Livros livros = new Livros();
+		int a = 0;
+		int b = 2;
+		
+		
+		System.out.println("");
+		System.out.println(livros);
+	}
+class Livros {
+	private String nome;
+	private String npag;
+}
+}
diff --git a/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/src/com/dio/model/Gato.java b/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/src/com/dio/model/Gato.java
new file mode 100644
index 0000000..16580a1
--- /dev/null
+++ b/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/src/com/dio/model/Gato.java
@@ -0,0 +1,63 @@
+package com.dio.model;
+
+import java.util.Objects;
+
+public class Gato {
+
+	private String nome;
+	private String cor;
+	private Integer idade;
+
+	public Gato(String nome, String cor, Integer idade) {
+		this.nome = nome;
+		this.cor = cor;
+		this.idade = idade;
+	}
+
+	public String getNome() {
+		return nome;
+	}
+
+	public void setNome(String nome) {
+		this.nome = nome;
+	}
+
+	public String getCor() {
+		return cor;
+	}
+
+	public void setCor(String cor) {
+		this.cor = cor;
+	}
+
+	public Integer getIdade() {
+		return idade;
+	}
+
+	public void setIdade(Integer idade) {
+		this.idade = idade;
+	}
+
+	@Override
+	public int hashCode() {
+		return Objects.hash(cor, idade, nome);
+	}
+
+	@Override
+	public boolean equals(Object obj) {
+		if (this == obj)
+			return true;
+		if (obj == null)
+			return false;
+		if (getClass() != obj.getClass())
+			return false;
+		Gato other = (Gato) obj;
+		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
+	}
+
+	@Override
+	public String toString() {
+		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
+	}
+
+}
diff --git a/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/src/module-info.java b/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/src/module-info.java
new file mode 100644
index 0000000..fd98f98
--- /dev/null
+++ b/bootcamp/javadeveloper/Exercicies/dominando-ide-eclipse/PrimeiroProgramaJava/src/module-info.java
@@ -0,0 +1,8 @@
+/**
+ * 
+ */
+/**
+ * 
+ */
+module PrimeiroProgramaJava {
+}
\ No newline at end of file
