package polymorphism.compiletimeVSruntime;

class BuzzwordsReport extends Report {
    void runReport() {
        super.runReport();
        buzzwordCompliance();
        printReport();
    }

    void buzzwordCompliance() {}
}

