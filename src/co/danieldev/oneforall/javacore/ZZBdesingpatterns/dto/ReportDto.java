package co.danieldev.oneforall.javacore.ZZBdesingpatterns.dto;

import co.danieldev.oneforall.javacore.ZZBdesingpatterns.domain.Country;
import co.danieldev.oneforall.javacore.ZZBdesingpatterns.domain.Currency;

public class ReportDto {
    private String aircraftName;
    private Currency currency;
    private Country country;
    private String personName;


    public static final class ReportDtoBuilder {
        private String aircraftName;
        private Currency currency;
        private Country country;
        private String personName;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDtoBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.aircraftName = this.aircraftName;
            reportDto.currency = this.currency;
            reportDto.country = this.country;
            reportDto.personName = this.personName;
            return reportDto;
        }
    }

    @Override
    public String toString() {
        return "ReportDto{" +
                "aircraftName='" + aircraftName + '\'' +
                ", currency=" + currency +
                ", country=" + country +
                ", personName='" + personName + '\'' +
                '}';
    }
}
