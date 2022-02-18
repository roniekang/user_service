package com.gomsp.user_service.config

object Code {
    /*const val OK_MESSAGE : String = "ok"
    const val MEMBER_NOT_AUTHENTICATED_CODE : Int = 2001
    const val MEMBER_LICENCE_NOT_AUTHENTICATED_CODE : Int = 2002
    const val NOT_FOUND_MESSAGE : String = "not found"
    const val INTERNAL_SERVER_ERROR_MESSAGE : String = "INTERNAL_SERVER_ERROR_CODE"
    const val OK_CODE : Int = 200
    const val NON_AUTHORITATIVE_INFORMATION_CODE : Int = 203
    const val OK_CODE_NULL : Int = 204
    const val BADREQUEST_CODE : Int = 400
    //const val UNAUTHORIZED_CODE : Int = 401
    const val NOT_FOUND_CODE : Int = 404
    const val INTERNAL_SERVER_ERROR_CODE : Int = 500
    const val PRECONDITION_REQUIRED_CODE : Int = 428
    const val INVALID_PHONE_NUMBER_MESSAGE: String = "Invalid phone number"*/


    //////////////////////////////
    //////COMMON Error Code///////
    //////////////////////////////
    const val OK_MESSAGE: String = "ok"
    const val MEMBER_NOT_AUTHENTICATED_CODE: Int = 2001
    const val MEMBER_LICENCE_NOT_AUTHENTICATED_CODE: Int = 2002
    const val NOT_FOUND_MESSAGE: String = "not found"
    const val INTERNAL_SERVER_ERROR_MESSAGE: String = "INTERNAL_SERVER_ERROR_CODE"
    const val OK_CODE: Int = 200
    const val NON_AUTHORITATIVE_INFORMATION_CODE: Int = 203
    const val OK_CODE_NULL: Int = 1000001
    const val OK_CODE_V10_NULL: Int = 204  //카플렛
    const val PROXY_ERROR: Int = 1000003

    const val BADREQUEST_CODE: Int = 400

    //const val UNAUTHORIZED_CODE : Int = 401
    const val NOT_FOUND_CODE: Int = 404
    const val INTERNAL_SERVER_ERROR_CODE: Int = 500
    const val PRECONDITION_REQUIRED_CODE: Int = 428

    const val INVALID_PHONE_NUMBER_MESSAGE: String = "Invalid phone number"

    //////////////////////////////
    //////Member Error Code///////
    //////////////////////////////
    const val MEMBER_UPDATE_FAIL_CODE: Int = 3030001        //멤버 업데이트 실패
    const val ALREADY_MEMBER_EXIST_CODE: Int = 3030002      //멤버가 이미 존재하는 경우
    const val ALREADY_MEMBER_WITHDRAWN_CODE: Int = 3030003  //멤버가 이미 회원 탈퇴한 경우
    const val ALREADY_WELFAREINFO_CODE: Int = 3030004       //맴버 복지카드가 이미 존재하는 경우
    const val ALREADY_NOT_WELFAREINFO_CODE: Int = 3030005   //멤버 복지카드가 이미 존재하지 않는 경우
    const val ALREADY_BUSINESS_NAME_CODE: Int = 3030006     //멤버 비지니스가 이미 존재하는 경우
    const val ALREADY_NOT_BUSINESS_NAME_CODE: Int = 3030007 //멤버 비지니스가 이미 존재하지 않는 경우
    const val MATCHING_INFOMATION_CODE: Int = 3030008
    const val PASSPORT_NOT_EXIST_CODE: Int = 3030009        //멤버 여권정보가 존재하지 않는 경우
    const val CONFIRM_ALERT_TYPE_CODE: Int = 3030010        //그룹 타입이 잘못된 경우
    const val GROUPTYPE_DEPARTMENT_CODE: Int = 3030011      //그룹 타입이 부서인 경우
    const val BUTLER_SERVICE_ERROR_CODE: Int = 3030012      //bulter service error
    const val AUTH_SERVICE_ERROR_CODE: Int = 3030013        //auth service error
    const val LICENSE_NOT_VALID_CODE: Int = 3030014         //먼허 승인 상태가 대기가 아닌경우
    const val MEMBER_NOT_VALID_CODE: Int = 3030015          //회원 상태가 활동 상태가 아닌경우
    const val MEMBER_NOT_BELONG_GROUP: Int = 3030016        //멤버가 속한 그룹이 존재하지 않는 경
    const val ALREADY_GROUP_INFO_CODE: Int = 3030017        //이미 그룹 정보가 있는 경우
    const val REQUSET_USERUUID_CODE: Int = 3030018          //userUuid 필요

    //////////////////////////////
    ///////Card Error Code////////
    //////////////////////////////
    const val BILLINGKEY_DELETE_ERROR_CODE: Int = 3030039      //bill key 삭제 실패시
    const val WRONG_CARD_TYPE_CODE: Int = 3030040       //카드 타입이 잘못 입력된 경우
    const val ALREADY_CARD_NAME_CODE: Int = 3030041     //해당하는 카드네임이 이미 존재하는 경우
    const val BILLINGKEY_ERROR_CODE: Int = 3030042      //PG사에 카드등록 실패의 경우 에러 코드 값
    const val WRONG_PGTYPE_CODE: Int = 3030043          //pgType 오류
    const val CARD_UPDATE_FAIL_CODE: Int = 3030044      //card collection 업데이트 실패된 경우
    const val ALREADY_MAIN_CARD_CODE: Int = 3030045     //이미 메인카드로 등록 되어있는 경우
    const val ALREADY_USE_CARD_CODE: Int = 3030046      //이미 사용하는 카드
    const val ALREADY_NO_USE_CARD_CODE: Int = 3030047    //이미 사용하지 않는 카드
    const val ALREADY_EXIST_BILLING_ADDRESS: Int = 3030048 //이미 billing address가 존재하는 경우
    const val BILLINGKEY_COMMUNICATION_ERROR_CODE: Int = 3030049      //PG service 와의 연동간 실패의 경우 에러 코드 값

    //////////////////////////////
    /////License Error Code///////
    //////////////////////////////
    const val LICENSE_MEMBER_STATUS_UPDATE_FAIL_CODE: Int = 3030050     //멤버 라이센스 상태 업데이트 실패
    const val CHECK_USERNAME_CODE: Int = 3030051                        //이미 등록된 회원 이름과 면허 소유자 이름이 일치하지 않는 경우
    const val ALREADY_REGISTER_LICENSE_CODE: Int = 3030052              //라이센스가 이미 등록되어 있는 경우
    const val LICENSE_UPDATE_FAIL_CODE: Int = 3030053                   //업데이트 실패
    const val LICENSE_VERIFY_FAIL_CODE: Int = 3030054                   //라이센스 validation check 실패

    //////////////////////////////
    //////Group Error Code////////
    //////////////////////////////
    const val DUPLICATION_CORNUM_CODE: Int = 3030060                         //중복된 사업자 번호
    const val ALREADY_MEMBER_IN_GROUP_CODE: Int = 3030061                    //member가 이미 특정 그룹에 속해 있는 경우
    const val ALREADY_SUBGROUP_CODE: Int = 3030062                           //하위 그룹이 존재하는 경우
    const val WRONG_TYPE_CODE: Int = 3030063                                 //타입이 잘못 입력 된 경우
    const val GROUP_ADD_FAIL_CODE: Int = 3030064                             //그룹 추가 실패
    const val WRONG_PHONE_TYPE_CODE: Int = 3030065                           //잘못된 전화 번호 형식
    const val USE_DEL_API: Int = 3030066                                     //다른 API 사용 요청
    const val NO_EXIST_GROUP_PATH: Int = 3030067
    //////////////////////////////
    ///MeberGroup Error Code//////
    //////////////////////////////
    const val WRONG_SEARCHKEY_VALUE: Int = 3030070                           //잘못된 serchKey를 입력한 경우
    const val CHECK_SIZE_PAAGE_VALUE: Int = 3030071                          //잘못된 페이지 value
    const val WRONG_PARENT_GROUP_ID = 3030072                                //부모 그룹아이디와 일치하지 않는 경우
    const val FAIL_SEND_EMAIL = 3030073                                      //email 전송 실패
    const val CHECK_GROUPID_DOMAIN = 3030074                                 //groupId or domain check
    const val SAME_INVITE_MEMBER = 3030075
    const val WRONG_VALUE_DEPARTMENT_INFO_DIFF_1 = 3030076                               //부서사용여부 flag 정보가 맞지 않을 경우
    const val WRONG_VALUE_DEPARTMENT_INFO_DIFF_2 = 3030077                               //부서사용여부 flag 정보가 맞지 않을 경우
    const val WRONG_VALUE_EMPNUMBER_INFO_DIFF_1 = 3030078                                //사번사용여부 flag 정보가 맞지 않을 경우
    const val WRONG_VALUE_EMPNUMBER_INFO_DIFF_2 = 3030079                                //사번사용여부 flag 정보가 맞지 않을 경우

    //////////////////////////////
    ///PrePaid Error Code//////
    //////////////////////////////
    const val PREPAID_CARD_PRODUCE_ERROR = 3030080                          //선불카드 생성 에러
    const val BILLINGKEY_PRODUCE_ERROR = 3030081                            //빌키 생성 에러
    const val WRONG_INPUT_ACCOUNT = 3030082                                 //잘못된 유형선택
}