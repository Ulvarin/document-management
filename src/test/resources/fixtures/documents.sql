--INSERT INTO Employee (id, hashedPassword, login) VALUES (100, ''test100'', ''test100'');

--INSERT INTO DOCUMENT (id, content, number, status, title, creator_id, verificator_id, createdAt, updatedAt, verifiedAt, deletor_id, deleted)
--VALUES (100, ''draft content'', ''100'', ''DRAFT'', ''draft title'', 100, NULL, TIMESTAMP ''2016-01-01 10:00:00'', NULL, NULL, NULL, false);

INSERT INTO Employee (id, HASHEDPASSWORD, LOGIN) VALUES (100, ''test100'', ''test100'');
INSERT INTO Employee (id, HASHEDPASSWORD, LOGIN) VALUES (200, ''test200'', ''test200'');
INSERT INTO Employee (id, HASHEDPASSWORD, LOGIN) VALUES (300, ''test300'', ''test300'');
INSERT INTO Employee (id, HASHEDPASSWORD, LOGIN) VALUES (400, ''test400'', ''test400'');

INSERT INTO document (content, id, createdat, DELETED, status, number, title, UPDATEDAT, VERIFIEDAT, CREATOR_ID, deletor_id, VERIFICATOR_ID)
VALUES (''draft content'', 11, ''2016-01-01 10:00:10'', FALSE, ''DRAFT'', ''11A'', ''draft'', ''2016-01-02 10:00:10'', null, 100, null, null);

INSERT INTO document (content, id, createdat, DELETED, status, number, title, UPDATEDAT, VERIFIEDAT, CREATOR_ID, deletor_id, VERIFICATOR_ID)
VALUES (''second draft content'', 12, ''2016-02-01 10:00:10'', FALSE, ''DRAFT'', ''12A'', ''second draft'', ''2016-02-02 10:00:10'', null, 200, null, null);

INSERT INTO document (content, id, createdat, DELETED, status, number, title, UPDATEDAT, VERIFIEDAT, CREATOR_ID, deletor_id, VERIFICATOR_ID)
VALUES (''verified content'', 13, ''2016-01-01 10:00:10'', FALSE, ''VERIFIED'', ''13A'', ''verified'', ''2016-01-02 10:00:10'', ''2016-01-03 10:00:10'', 400, null, 200);

INSERT INTO document (content, id, createdat, DELETED, status, number, title, UPDATEDAT, VERIFIEDAT, CREATOR_ID, deletor_id, VERIFICATOR_ID)
VALUES (''deleted content'', 14, ''2016-03-01 10:00:10'', TRUE, ''VERIFIED'', ''14A'', ''deleted'', ''2016-03-02 10:00:10'', ''2016-03-03 10:00:10'', 100, 300, 200);

INSERT INTO document (content, id, createdat, DELETED, status, number, title, UPDATEDAT, VERIFIEDAT, CREATOR_ID, deletor_id, VERIFICATOR_ID)
VALUES (''second verified content'', 15, ''2016-02-01 10:00:10'', FALSE, ''VERIFIED'', ''15A'', ''second verified'', ''2016-02-02 10:00:10'', ''2016-02-03 10:00:10'', 100, null, 400);

INSERT INTO document (content, id, createdat, DELETED, status, number, title, UPDATEDAT, VERIFIEDAT, CREATOR_ID, deletor_id, VERIFICATOR_ID)
VALUES (''second deleted content'', 16, ''2016-01-01 10:00:10'', TRUE, ''DRAFT'', ''16A'', ''second deleted'', ''2016-01-02 10:00:10'', null, 200, 400, null);

INSERT INTO document (content, id, createdat, DELETED, status, number, title, UPDATEDAT, VERIFIEDAT, CREATOR_ID, deletor_id, VERIFICATOR_ID)
VALUES (''third draft content'', 17, ''2016-02-01 10:00:10'', FALSE, ''DRAFT'', ''17A'', ''third draft'', ''2016-02-02 10:00:10'', null, 400, null, null);
