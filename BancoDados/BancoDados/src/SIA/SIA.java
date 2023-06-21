package SIA;

public class SIA {

    public static void main(String[] args) {
        // passo 1
        Class.forName("org.apache.derby.jdbc.ClientDriver");
// passo 2
        Connection c1 = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/escola",
                "escola", "escola");
// passo 3
        Statement st = c1.createStatement();
// passo 4
        st.executeUpdate(
                "INSERT INTO ALUNO VALUES('E2018.5004','DENIS',2018)");
        st.close();
        c1.close();
    }

}
