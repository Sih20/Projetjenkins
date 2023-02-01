mkdir -p /tmp/siham/
rm -rf /tmp/siham/*
echo '
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
}
' >/tmp/siham/Main.java
javac /tmp/siham/Main.java
