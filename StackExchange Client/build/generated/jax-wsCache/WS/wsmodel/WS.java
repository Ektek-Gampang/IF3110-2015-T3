
package wsmodel;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WS", targetNamespace = "http://WSModel/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WS {


    /**
     * 
     * @param userID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserName", targetNamespace = "http://WSModel/", className = "wsmodel.GetUserName")
    @ResponseWrapper(localName = "getUserNameResponse", targetNamespace = "http://WSModel/", className = "wsmodel.GetUserNameResponse")
    @Action(input = "http://WSModel/WS/getUserNameRequest", output = "http://WSModel/WS/getUserNameResponse")
    public String getUserName(
        @WebParam(name = "userID", targetNamespace = "")
        int userID);

    /**
     * 
     * @param password
     * @param userName
     * @param email
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addUser", targetNamespace = "http://WSModel/", className = "wsmodel.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://WSModel/", className = "wsmodel.AddUserResponse")
    @Action(input = "http://WSModel/WS/addUserRequest", output = "http://WSModel/WS/addUserResponse")
    public Boolean addUser(
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "email", targetNamespace = "")
        String email);

    /**
     * 
     * @param questionId
     * @param answerContent
     * @param accessToken
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addAnswer", targetNamespace = "http://WSModel/", className = "wsmodel.AddAnswer")
    @ResponseWrapper(localName = "addAnswerResponse", targetNamespace = "http://WSModel/", className = "wsmodel.AddAnswerResponse")
    @Action(input = "http://WSModel/WS/addAnswerRequest", output = "http://WSModel/WS/addAnswerResponse")
    public String addAnswer(
        @WebParam(name = "access_token", targetNamespace = "")
        String accessToken,
        @WebParam(name = "question_id", targetNamespace = "")
        int questionId,
        @WebParam(name = "answerContent", targetNamespace = "")
        String answerContent);

    /**
     * 
     * @param answerId
     * @return
     *     returns wsmodel.AnswerClass
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAnswerByID", targetNamespace = "http://WSModel/", className = "wsmodel.GetAnswerByID")
    @ResponseWrapper(localName = "getAnswerByIDResponse", targetNamespace = "http://WSModel/", className = "wsmodel.GetAnswerByIDResponse")
    @Action(input = "http://WSModel/WS/getAnswerByIDRequest", output = "http://WSModel/WS/getAnswerByIDResponse")
    public AnswerClass getAnswerByID(
        @WebParam(name = "answer_id", targetNamespace = "")
        int answerId);

    /**
     * 
     * @param questionId
     * @return
     *     returns java.util.List<wsmodel.AnswerClass>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAnswerByQID", targetNamespace = "http://WSModel/", className = "wsmodel.GetAnswerByQID")
    @ResponseWrapper(localName = "getAnswerByQIDResponse", targetNamespace = "http://WSModel/", className = "wsmodel.GetAnswerByQIDResponse")
    @Action(input = "http://WSModel/WS/getAnswerByQIDRequest", output = "http://WSModel/WS/getAnswerByQIDResponse")
    public List<AnswerClass> getAnswerByQID(
        @WebParam(name = "question_id", targetNamespace = "")
        int questionId);

    /**
     * 
     * @param questionId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSumAnswer", targetNamespace = "http://WSModel/", className = "wsmodel.GetSumAnswer")
    @ResponseWrapper(localName = "getSumAnswerResponse", targetNamespace = "http://WSModel/", className = "wsmodel.GetSumAnswerResponse")
    @Action(input = "http://WSModel/WS/getSumAnswerRequest", output = "http://WSModel/WS/getSumAnswerResponse")
    public int getSumAnswer(
        @WebParam(name = "question_id", targetNamespace = "")
        int questionId);

    /**
     * 
     * @param answerId
     * @param questionId
     * @param accessToken
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "voteUpAnswer", targetNamespace = "http://WSModel/", className = "wsmodel.VoteUpAnswer")
    @ResponseWrapper(localName = "voteUpAnswerResponse", targetNamespace = "http://WSModel/", className = "wsmodel.VoteUpAnswerResponse")
    @Action(input = "http://WSModel/WS/voteUpAnswerRequest", output = "http://WSModel/WS/voteUpAnswerResponse")
    public String voteUpAnswer(
        @WebParam(name = "access_token", targetNamespace = "")
        String accessToken,
        @WebParam(name = "answerId", targetNamespace = "")
        int answerId,
        @WebParam(name = "questionId", targetNamespace = "")
        int questionId);

    /**
     * 
     * @param answerId
     * @param questionId
     * @param accessToken
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "voteDownAnswer", targetNamespace = "http://WSModel/", className = "wsmodel.VoteDownAnswer")
    @ResponseWrapper(localName = "voteDownAnswerResponse", targetNamespace = "http://WSModel/", className = "wsmodel.VoteDownAnswerResponse")
    @Action(input = "http://WSModel/WS/voteDownAnswerRequest", output = "http://WSModel/WS/voteDownAnswerResponse")
    public String voteDownAnswer(
        @WebParam(name = "access_token", targetNamespace = "")
        String accessToken,
        @WebParam(name = "answerId", targetNamespace = "")
        int answerId,
        @WebParam(name = "questionId", targetNamespace = "")
        int questionId);

    /**
     * 
     * @param questionContent
     * @param questionTitle
     * @param accessToken
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addQuestion", targetNamespace = "http://WSModel/", className = "wsmodel.AddQuestion")
    @ResponseWrapper(localName = "addQuestionResponse", targetNamespace = "http://WSModel/", className = "wsmodel.AddQuestionResponse")
    @Action(input = "http://WSModel/WS/addQuestionRequest", output = "http://WSModel/WS/addQuestionResponse")
    public String addQuestion(
        @WebParam(name = "access_token", targetNamespace = "")
        String accessToken,
        @WebParam(name = "questionTitle", targetNamespace = "")
        String questionTitle,
        @WebParam(name = "questionContent", targetNamespace = "")
        String questionContent);

    /**
     * 
     * @return
     *     returns java.util.List<wsmodel.QuestionClass>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllQuestion", targetNamespace = "http://WSModel/", className = "wsmodel.GetAllQuestion")
    @ResponseWrapper(localName = "getAllQuestionResponse", targetNamespace = "http://WSModel/", className = "wsmodel.GetAllQuestionResponse")
    @Action(input = "http://WSModel/WS/getAllQuestionRequest", output = "http://WSModel/WS/getAllQuestionResponse")
    public List<QuestionClass> getAllQuestion();

    /**
     * 
     * @param questionId
     * @return
     *     returns wsmodel.QuestionClass
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getQuestionByID", targetNamespace = "http://WSModel/", className = "wsmodel.GetQuestionByID")
    @ResponseWrapper(localName = "getQuestionByIDResponse", targetNamespace = "http://WSModel/", className = "wsmodel.GetQuestionByIDResponse")
    @Action(input = "http://WSModel/WS/getQuestionByIDRequest", output = "http://WSModel/WS/getQuestionByIDResponse")
    public QuestionClass getQuestionByID(
        @WebParam(name = "questionId", targetNamespace = "")
        int questionId);

    /**
     * 
     * @param questionContent
     * @param questionId
     * @param questionTitle
     * @param accessToken
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateQuestion", targetNamespace = "http://WSModel/", className = "wsmodel.UpdateQuestion")
    @ResponseWrapper(localName = "updateQuestionResponse", targetNamespace = "http://WSModel/", className = "wsmodel.UpdateQuestionResponse")
    @Action(input = "http://WSModel/WS/updateQuestionRequest", output = "http://WSModel/WS/updateQuestionResponse")
    public String updateQuestion(
        @WebParam(name = "access_token", targetNamespace = "")
        String accessToken,
        @WebParam(name = "questionId", targetNamespace = "")
        int questionId,
        @WebParam(name = "questionTitle", targetNamespace = "")
        String questionTitle,
        @WebParam(name = "questionContent", targetNamespace = "")
        String questionContent);

    /**
     * 
     * @param questionId
     * @param accessToken
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteQuestion", targetNamespace = "http://WSModel/", className = "wsmodel.DeleteQuestion")
    @ResponseWrapper(localName = "deleteQuestionResponse", targetNamespace = "http://WSModel/", className = "wsmodel.DeleteQuestionResponse")
    @Action(input = "http://WSModel/WS/deleteQuestionRequest", output = "http://WSModel/WS/deleteQuestionResponse")
    public String deleteQuestion(
        @WebParam(name = "access_token", targetNamespace = "")
        String accessToken,
        @WebParam(name = "questionId", targetNamespace = "")
        int questionId);

    /**
     * 
     * @param questionId
     * @param accessToken
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "voteUpQuestion", targetNamespace = "http://WSModel/", className = "wsmodel.VoteUpQuestion")
    @ResponseWrapper(localName = "voteUpQuestionResponse", targetNamespace = "http://WSModel/", className = "wsmodel.VoteUpQuestionResponse")
    @Action(input = "http://WSModel/WS/voteUpQuestionRequest", output = "http://WSModel/WS/voteUpQuestionResponse")
    public String voteUpQuestion(
        @WebParam(name = "access_token", targetNamespace = "")
        String accessToken,
        @WebParam(name = "questionId", targetNamespace = "")
        int questionId);

    /**
     * 
     * @param questionId
     * @param accessToken
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "voteDownQuestion", targetNamespace = "http://WSModel/", className = "wsmodel.VoteDownQuestion")
    @ResponseWrapper(localName = "voteDownQuestionResponse", targetNamespace = "http://WSModel/", className = "wsmodel.VoteDownQuestionResponse")
    @Action(input = "http://WSModel/WS/voteDownQuestionRequest", output = "http://WSModel/WS/voteDownQuestionResponse")
    public String voteDownQuestion(
        @WebParam(name = "access_token", targetNamespace = "")
        String accessToken,
        @WebParam(name = "questionId", targetNamespace = "")
        int questionId);

}
