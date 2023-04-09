package A05_String.Tasks;

public class DeleteEnters {
    public static void main(String[] args) {
        String inputText = "Die Autoren dieses Fachbuches haben sich der Verpflichtung gestellt, mit den erstellten Medien der Reihe\n" +
                "einen handlungs- und kompetenzorientierten Unterricht zu unterstützen, wie ihn die Ausbildungsordnungen\n" +
                "und die Rahmenrichtlinien der IT-Berufe fordern (vgl. Kapitel 1.1, Abschnitt (5)). Auszubildende\n" +
                "sollen zunehmend selbstständiger arbeiten, sich neue Lernkompetenzen aneignen und so für lebenslanges\n" +
                "Lernen vorbereitet werden.\n" +
                "Das folgende Schaubild zeigt, wie man seine Arbeits- und Lernkompetenzen in vollständigen Handlungen\n" +
                "ausbauen kann . Im Arbeitsleben sollen alle Mitarbeiter sich insgesamt verantwortlich fühlen und in\n" +
                "Teams gesamtverantwortlich handeln. Dazu ist es wichtig, dass Sie sich in allen Phasen des Arbeitspro zesses\n" +
                "Kompetenzen erarbeiten und einbringen.\n" +
                "Lernkompetenzen und Fähigkeiten zum selbständigen Lernen sind in einem Arbeitsleben sehr wichtig\n" +
                "und müssen systematisch erlernt und geübt werden . Dazu sollen insbesondere auch Schulen Beiträge\n" +
                "leisten. Schulen versuchen, in praxisnahen Projekten realitätsnahe Leistungen und Produkte auch als\n" +
                "Schul- und Ausbildungsleistung zu entwickeln. Zunehmend wird als Ziel gesetzt, Handlungsprodukte als\n" +
                "Unterrichtsziele vorzugeben, um Kompetenzen der vollständigen Handlung entwickeln zu können ."; // "\n" ifadesi "Enter" tuşuna basıldığını simgeler.
        inputText = inputText.replaceAll("\\n", ""); // "\n" ifadesini boşluğa dönüştürür.
        System.out.println(inputText); // Metni konsola yazdırır.

    }
}
