FROM navikt/java:17
LABEL org.opencontainers.image.source=https://github.com/navikt/omsorgspenger-lab
COPY build/libs/app.jar app.jar