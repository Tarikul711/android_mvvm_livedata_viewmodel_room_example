package com.tos.androidroom.webapi;


import com.tos.androidroom.webapi.login.StudentProfile;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WebInterface {
    @FormUrlEncoded
    @POST(WebMethod.STUDENT_LOGIN)
    public Call<StudentProfile> postLoginRequest(@Field("username") String userName, @Field("password") String password);

   /* @GET(WebMethod.GET_ALL_PENDING_EXAM_DATA)
    Call<ExamList> getAllExamData(@Header("Authorization") String token, @Query("pages") String pageNumber);

    @GET(WebMethod.GET_ALL_COMPLETED_EXAM_DATA)
    Call<ExamList> getAllCompletedExamData(@Header("Authorization") String token, @Query("pages") String pageNumber);

    @GET(WebMethod.CHECK_EXAM_PERMISSION + "{subject_id}")
    Call<ResponseBody> getExamPermission(@Header("Authorization") String token, @Path(value = "subject_id", encoded = true) String subjectId);

    @GET(WebMethod.GET_EXAM_DATA + "{subject_id}")
    Call<Exam> getExamData(@Header("Authorization") String token, @Path(value = "subject_id", encoded = true) String subjectId);

    @Headers({"Content-Type:application/json"})
    @POST(WebMethod.POST_ANSWER_DATA)
    Call<ResponseBody> postAnswerData(@Header("Authorization") String token, @Body AnswerPost answerData);
*/
   /* @GET(WebMethod.LOGIN)
    Call<LoginResponse> getLoginReq(@Query("userName") String userName, @Query("Password") String password);

    @GET(WebMethod.DIVISION)
    Call<List<Division>> getDivision();

    @GET(WebMethod.DISTRICT)
    Call<List<District>> getDistrict();

    @GET(WebMethod.FUEL_TYPES)
    Call<List<FuelType>> getFuelType();

    @GET(WebMethod.GRATE_TYPES)
    Call<List<Grate>> getGrate();

    @GET(WebMethod.PO_INFORMATION)
    Call<List<PoInformation>> getPoInformation();

    @GET(WebMethod.QUALITY)
    Call<List<Quality>> getQuality();

    @GET(WebMethod.ROOF_TYPE)
    Call<List<RoofType>> getRoofType();

    @GET(WebMethod.SAVING_LEVEL)
    Call<List<SavingsLevel>> getSavingsLevel();

    @GET(WebMethod.STOVE_TYPE)
    Call<List<StovesType>> getStovesType();

    @GET(WebMethod.THANA)
    Call<List<Thana>> getThana();

    @GET(WebMethod.UNION)
    Call<List<Union>> getUnion();

    @GET(WebMethod.CLUSTER)
    Call<List<Claster>> getCluster();

    @GET(WebMethod.DISBURSEMENT)
    Call<List<Disbursement>> getDisbursement();

    @GET(WebMethod.TECHNICIAN)
    Call<List<Technician>> getTechnical();

    @GET(WebMethod.CUSTOMER)
    Call<List<Customer>> getCustomer(@Query("inspectorID") String inspectorID, @Query("numberOfRows") String numberOfRows);

    ///---------------------------------

    @GET(WebMethod.DISBURSEMENT_MASTER)
    Call<List<DisbursementMaster>> getDisbursementMaster();

    @GET(WebMethod.DIMENSIONS)
    Call<List<Dimension>> getDimension();

    @GET(WebMethod.STOVE_PARAMETERS_MASTER)
    Call<List<StoveParameterMaster>> getStoveParameterMaster();


    @GET(WebMethod.STOVE_PARAMETERS)
    Call<List<StoveParameter>> getStoveParameter();

    @GET(WebMethod.INSTALLATION_TYPES)
    Call<List<Installation>> getInstallation();

    @GET(WebMethod.CHIMNEY_TYPE)
    Call<List<Chimney>> getChimney();


    @GET(WebMethod.USAGE_LEVEL)
    Call<List<UsageLevel>> getUsageLevel();

    @GET(WebMethod.AFTER_SALES_SERVICE)
    Call<List<AfterSalesService>> getAfterSalesService();

    @GET(WebMethod.USER_SATISFACTION_LEVEL)
    Call<List<UserSatisfactionLevel>> getUserSatisfactionLevel();

    @GET(WebMethod.REASON)
    Call<List<Reason>> getReason();

    @GET(WebMethod.DISCREPANCY)
    Call<List<Discripancy>> getDiscrepancy();

    @GET(WebMethod.FUEL)
    Call<List<Fuel>> getFuel();

    @GET(WebMethod.INSPECTION_TO_FROM_DATE)
    Call<List<InspectionDateLine>> getInspectionDateLine(@Query("inspectorID") String inspectorID);

    @Headers({"Content-Type:application/json"})
    @POST(WebMethod.INSERT_CUSTOMER_DATA)
    Call<String> insertCustomerData(@Body UpdateCustomer updateCustomer);

    @Headers({"Content-Type:application/json"})
    @POST(WebMethod.INSERT_CUSTOMER_DATA)
    Call<String> insertCustomerData2(@Body RequestBody params);
*/
}
