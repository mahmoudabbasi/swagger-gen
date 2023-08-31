package com.swaggergen.exception;

public interface ExceptionMessages {

    interface Global {
        String NOT_VALID_ARGUMENTS = "not.valid.arguments";
        String INTERNAL_SERVER_ERROR = "internal.server.error";
    }

    interface File {
        String NOT_VALID_FILE_TYPE_ID = "fileTypeId.is.not.valid";
        String NOT_VALID_FILE_TYPE = "fileType.is.not.valid";
        String FILE_UPLOAD_FAILURE = "file.upload.failure";
        String FILE_REMOVE_FAILURE = "file.remove.failure";
        String FILE_GET_FAILURE = "file.get.failure";
        String NOT_FOUND_FILE = "file.is.not.found";
        String NOT_FOUND_FACE_FILE = "face.file.is.not.found";
        String NOT_FOUND_VIDEO_FILE = "video.file.is.not.found";
        String NOT_FOUND_IDENTIFICATION_FILE = "identification.file.is.not.found";
    }

    interface AI {
        String NOT_FOUND_AI_CHECK_REQUEST = "request.is.not.found.for.sessionId";
        String NOT_FOUND_AI_CHECK_RESPONSE = "ai.response.is.not.found.or.is.not.ready.for.sessionId";
    }

    interface Operator {
        String NOT_FOUND_OPERATOR_CHECK_RESPONSE = "operator.response.is.not.found.for.sessionId";
    }

}
