package com.nuu.sample.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "solicituddocumentos")
public class PropertiesConfiguration {
    private String wsAddress;

    private String busDriverClassName;
    private String busUrl;
    private String busUsername;
    private String busPassword;
    private Integer busInitialSize;
    private Integer busMaxActive;
    private Integer busMaxIdle;
    private Integer busMinIdle;
    private Long busTimeBetweenEvictionRunsMillis;
    private Long busMinEvictableIdleTimeMillis;
    private Boolean busTestOnBorrow;
    private String busValidationQuery;

    private String aforeDriverClassName;
    private String aforeUrl;
    private String aforeUsername;
    private String aforePassword;
    private Integer aforeInitialSize;
    private Integer aforeMaxActive;
    private Integer aforeMaxIdle;
    private Integer aforeMinIdle;
    private Long aforeTimeBetweenEvictionRunsMillis;
    private Long aforeMinEvictableIdleTimeMillis;
    private Boolean aforeTestOnBorrow;
    private String aforeValidationQuery;


    private String admonDriverClassName;
    private String admonUrl;
    private String admonUsername;
    private String admonPassword;
    private Integer admonInitialSize;
    private Integer admonMaxActive;
    private Integer admonMaxIdle;
    private Integer admonMinIdle;
    private Long admonTimeBetweenEvictionRunsMillis;
    private Long admonMinEvictableIdleTimeMillis;
    private Boolean admonTestOnBorrow;
    private String admonValidationQuery;

    private Integer alertaRequiereReintento;
    private Integer alertaNumeroReintentos;
    private String alertaMensajeAlerta;
    private String alertaCorreos;
    private Integer alertaLimiteOcurrencia;
    private String alertaDescripcion;

    private String jmsBrokerUrl;
    private String jmsUsername;
    private String jmsPassword;
    private Integer jmsPoolMaxConnections;
    private Integer jmsConcurrentConsumers;
    private String wsAddressEnvioMovimientos;

    private String internalEndpoint;
    private int internalEndpointTimeout;

    public String getWsAddress() {
        return wsAddress;
    }

    public void setWsAddress(String wsAddress) {
        this.wsAddress = wsAddress;
    }

    public String getBusDriverClassName() {
        return busDriverClassName;
    }

    public void setBusDriverClassName(String busDriverClassName) {
        this.busDriverClassName = busDriverClassName;
    }

    public String getBusUrl() {
        return busUrl;
    }

    public void setBusUrl(String busUrl) {
        this.busUrl = busUrl;
    }

    public String getBusUsername() {
        return busUsername;
    }

    public void setBusUsername(String busUsername) {
        this.busUsername = busUsername;
    }

    public String getBusPassword() {
        return busPassword;
    }

    public void setBusPassword(String busPassword) {
        this.busPassword = busPassword;
    }

    public Integer getBusInitialSize() {
        return busInitialSize;
    }

    public void setBusInitialSize(Integer busInitialSize) {
        this.busInitialSize = busInitialSize;
    }

    public Integer getBusMaxActive() {
        return busMaxActive;
    }

    public void setBusMaxActive(Integer busMaxActive) {
        this.busMaxActive = busMaxActive;
    }

    public Integer getBusMaxIdle() {
        return busMaxIdle;
    }

    public void setBusMaxIdle(Integer busMaxIdle) {
        this.busMaxIdle = busMaxIdle;
    }

    public Integer getBusMinIdle() {
        return busMinIdle;
    }

    public void setBusMinIdle(Integer busMinIdle) {
        this.busMinIdle = busMinIdle;
    }

    public Long getBusTimeBetweenEvictionRunsMillis() {
        return busTimeBetweenEvictionRunsMillis;
    }

    public void setBusTimeBetweenEvictionRunsMillis(Long busTimeBetweenEvictionRunsMillis) {
        this.busTimeBetweenEvictionRunsMillis = busTimeBetweenEvictionRunsMillis;
    }

    public Long getBusMinEvictableIdleTimeMillis() {
        return busMinEvictableIdleTimeMillis;
    }

    public void setBusMinEvictableIdleTimeMillis(Long busMinEvictableIdleTimeMillis) {
        this.busMinEvictableIdleTimeMillis = busMinEvictableIdleTimeMillis;
    }

    public Boolean getBusTestOnBorrow() {
        return busTestOnBorrow;
    }

    public void setBusTestOnBorrow(Boolean busTestOnBorrow) {
        this.busTestOnBorrow = busTestOnBorrow;
    }

    public String getBusValidationQuery() {
        return busValidationQuery;
    }

    public void setBusValidationQuery(String busValidationQuery) {
        this.busValidationQuery = busValidationQuery;
    }

    public String getAforeDriverClassName() {
        return aforeDriverClassName;
    }

    public void setAforeDriverClassName(String aforeDriverClassName) {
        this.aforeDriverClassName = aforeDriverClassName;
    }

    public String getAforeUrl() {
        return aforeUrl;
    }

    public void setAforeUrl(String aforeUrl) {
        this.aforeUrl = aforeUrl;
    }

    public String getAforeUsername() {
        return aforeUsername;
    }

    public void setAforeUsername(String aforeUsername) {
        this.aforeUsername = aforeUsername;
    }

    public String getAforePassword() {
        return aforePassword;
    }

    public void setAforePassword(String aforePassword) {
        this.aforePassword = aforePassword;
    }

    public Integer getAforeInitialSize() {
        return aforeInitialSize;
    }

    public void setAforeInitialSize(Integer aforeInitialSize) {
        this.aforeInitialSize = aforeInitialSize;
    }

    public Integer getAforeMaxActive() {
        return aforeMaxActive;
    }

    public void setAforeMaxActive(Integer aforeMaxActive) {
        this.aforeMaxActive = aforeMaxActive;
    }

    public Integer getAforeMaxIdle() {
        return aforeMaxIdle;
    }

    public void setAforeMaxIdle(Integer aforeMaxIdle) {
        this.aforeMaxIdle = aforeMaxIdle;
    }

    public Integer getAforeMinIdle() {
        return aforeMinIdle;
    }

    public void setAforeMinIdle(Integer aforeMinIdle) {
        this.aforeMinIdle = aforeMinIdle;
    }

    public Long getAforeTimeBetweenEvictionRunsMillis() {
        return aforeTimeBetweenEvictionRunsMillis;
    }

    public void setAforeTimeBetweenEvictionRunsMillis(Long aforeTimeBetweenEvictionRunsMillis) {
        this.aforeTimeBetweenEvictionRunsMillis = aforeTimeBetweenEvictionRunsMillis;
    }

    public Long getAforeMinEvictableIdleTimeMillis() {
        return aforeMinEvictableIdleTimeMillis;
    }

    public void setAforeMinEvictableIdleTimeMillis(Long aforeMinEvictableIdleTimeMillis) {
        this.aforeMinEvictableIdleTimeMillis = aforeMinEvictableIdleTimeMillis;
    }

    public Boolean getAforeTestOnBorrow() {
        return aforeTestOnBorrow;
    }

    public void setAforeTestOnBorrow(Boolean aforeTestOnBorrow) {
        this.aforeTestOnBorrow = aforeTestOnBorrow;
    }

    public String getAforeValidationQuery() {
        return aforeValidationQuery;
    }

    public void setAforeValidationQuery(String aforeValidationQuery) {
        this.aforeValidationQuery = aforeValidationQuery;
    }

    public Integer getAlertaRequiereReintento() {
        return alertaRequiereReintento;
    }

    public void setAlertaRequiereReintento(Integer alertaRequiereReintento) {
        this.alertaRequiereReintento = alertaRequiereReintento;
    }

    public Integer getAlertaNumeroReintentos() {
        return alertaNumeroReintentos;
    }

    public void setAlertaNumeroReintentos(Integer alertaNumeroReintentos) {
        this.alertaNumeroReintentos = alertaNumeroReintentos;
    }

    public String getAlertaMensajeAlerta() {
        return alertaMensajeAlerta;
    }

    public void setAlertaMensajeAlerta(String alertaMensajeAlerta) {
        this.alertaMensajeAlerta = alertaMensajeAlerta;
    }

    public String getAlertaCorreos() {
        return alertaCorreos;
    }

    public void setAlertaCorreos(String alertaCorreos) {
        this.alertaCorreos = alertaCorreos;
    }

    public Integer getAlertaLimiteOcurrencia() {
        return alertaLimiteOcurrencia;
    }

    public void setAlertaLimiteOcurrencia(Integer alertaLimiteOcurrencia) {
        this.alertaLimiteOcurrencia = alertaLimiteOcurrencia;
    }

    public String getAlertaDescripcion() {
        return alertaDescripcion;
    }

    public void setAlertaDescripcion(String alertaDescripcion) {
        this.alertaDescripcion = alertaDescripcion;
    }

    public String getJmsBrokerUrl() {
        return jmsBrokerUrl;
    }

    public void setJmsBrokerUrl(String jmsBrokerUrl) {
        this.jmsBrokerUrl = jmsBrokerUrl;
    }

    public String getJmsUsername() {
        return jmsUsername;
    }

    public void setJmsUsername(String jmsUsername) {
        this.jmsUsername = jmsUsername;
    }

    public String getJmsPassword() {
        return jmsPassword;
    }

    public void setJmsPassword(String jmsPassword) {
        this.jmsPassword = jmsPassword;
    }

    public Integer getJmsPoolMaxConnections() {
        return jmsPoolMaxConnections;
    }

    public void setJmsPoolMaxConnections(Integer jmsPoolMaxConnections) {
        this.jmsPoolMaxConnections = jmsPoolMaxConnections;
    }

    public Integer getJmsConcurrentConsumers() {
        return jmsConcurrentConsumers;
    }

    public void setJmsConcurrentConsumers(Integer jmsConcurrentConsumers) {
        this.jmsConcurrentConsumers = jmsConcurrentConsumers;
    }

    public String getWsAddressEnvioMovimientos() {
        return wsAddressEnvioMovimientos;
    }

    public void setWsAddressEnvioMovimientos(String wsAddressEnvioMovimientos) {
        this.wsAddressEnvioMovimientos = wsAddressEnvioMovimientos;
    }

    public String getInternalEndpoint() {
        return internalEndpoint;
    }

    public void setInternalEndpoint(String internalEndpoint) {
        this.internalEndpoint = internalEndpoint;
    }

    public int getInternalEndpointTimeout() {
        return internalEndpointTimeout;
    }

    public void setInternalEndpointTimeout(int internalEndpointTimeout) {
        this.internalEndpointTimeout = internalEndpointTimeout;
    }

    public String getAdmonDriverClassName() {
        return admonDriverClassName;
    }

    public void setAdmonDriverClassName(String admonDriverClassName) {
        this.admonDriverClassName = admonDriverClassName;
    }

    public String getAdmonUrl() {
        return admonUrl;
    }

    public void setAdmonUrl(String admonUrl) {
        this.admonUrl = admonUrl;
    }

    public String getAdmonUsername() {
        return admonUsername;
    }

    public void setAdmonUsername(String admonUsername) {
        this.admonUsername = admonUsername;
    }

    public String getAdmonPassword() {
        return admonPassword;
    }

    public void setAdmonPassword(String admonPassword) {
        this.admonPassword = admonPassword;
    }

    public Integer getAdmonInitialSize() {
        return admonInitialSize;
    }

    public void setAdmonInitialSize(Integer admonInitialSize) {
        this.admonInitialSize = admonInitialSize;
    }

    public Integer getAdmonMaxActive() {
        return admonMaxActive;
    }

    public void setAdmonMaxActive(Integer admonMaxActive) {
        this.admonMaxActive = admonMaxActive;
    }

    public Integer getAdmonMaxIdle() {
        return admonMaxIdle;
    }

    public void setAdmonMaxIdle(Integer admonMaxIdle) {
        this.admonMaxIdle = admonMaxIdle;
    }

    public Integer getAdmonMinIdle() {
        return admonMinIdle;
    }

    public void setAdmonMinIdle(Integer admonMinIdle) {
        this.admonMinIdle = admonMinIdle;
    }

    public Long getAdmonTimeBetweenEvictionRunsMillis() {
        return admonTimeBetweenEvictionRunsMillis;
    }

    public void setAdmonTimeBetweenEvictionRunsMillis(Long admonTimeBetweenEvictionRunsMillis) {
        this.admonTimeBetweenEvictionRunsMillis = admonTimeBetweenEvictionRunsMillis;
    }

    public Long getAdmonMinEvictableIdleTimeMillis() {
        return admonMinEvictableIdleTimeMillis;
    }

    public void setAdmonMinEvictableIdleTimeMillis(Long admonMinEvictableIdleTimeMillis) {
        this.admonMinEvictableIdleTimeMillis = admonMinEvictableIdleTimeMillis;
    }

    public Boolean getAdmonTestOnBorrow() {
        return admonTestOnBorrow;
    }

    public void setAdmonTestOnBorrow(Boolean admonTestOnBorrow) {
        this.admonTestOnBorrow = admonTestOnBorrow;
    }

    public String getAdmonValidationQuery() {
        return admonValidationQuery;
    }

    public void setAdmonValidationQuery(String admonValidationQuery) {
        this.admonValidationQuery = admonValidationQuery;
    }
}
