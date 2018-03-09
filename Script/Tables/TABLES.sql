CREATE TABLE TYPE_USER(
  TTYUS_CDG_ID                NUMBER(20) NOT NULL,
  TTYUS_CAR_NAME              VARCHAR2(50) NOT NULL,
  TTYUS_CAR_DESCRIPTION       VARCHAR2(100),
  TTYUS_FCH_STATE_CREATE      DATE,
  TTYUS_FCH_STATE_LAST_UPDATE DATE
);

CREATE TABLE STATUS_USER(
       TSTUS_CDG_ID                NUMBER(20) NOT NULL,
       TSTUS_CAR_NAME              VARCHAR2(50) NOT NULL,
       TSTUS_CAR_DESCRIPTION       VARCHAR2(100),
       TSTUS_FCH_STATE_CREATE      DATE,
       TSTUS_FCH_STATE_LAST_UPDATE DATE
);