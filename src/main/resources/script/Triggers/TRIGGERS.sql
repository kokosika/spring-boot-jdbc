CREATE OR REPLACE TRIGGER TRG_TYPE_USER_ID
BEFORE INSERT ON TYPE_USER
FOR EACH ROW
  BEGIN
   SELECT SEQ_TYPE_USER_ID.NEXTVAL INTO :NEW.TTYUS_CDG_ID FROM DUAL; 
  END;
/
CREATE OR REPLACE TRIGGER TRG_STATUS_USER_ID
BEFORE INSERT ON STATUS_USER
FOR EACH ROW
  BEGIN
   SELECT SEQ_STATUS_USER_ID.NEXTVAL INTO :NEW.TSTUS_CDG_ID FROM DUAL; 
  END;
/