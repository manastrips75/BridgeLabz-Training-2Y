interface Exporter {
    void export();
    default void exportToJSON() {
        System.out.println("Exported to JSON");
    }
}

class CSVExporter implements Exporter {
    public void export() {
        System.out.println("Exported CSV");
    }
}

class PDFExporter implements Exporter {
    public void export() {
        System.out.println("Exported PDF");
    }
}

public class DataExporter {
    public static void main(String[] args) {
        Exporter e = new CSVExporter();
        e.export();
        e.exportToJSON();
    }
}
