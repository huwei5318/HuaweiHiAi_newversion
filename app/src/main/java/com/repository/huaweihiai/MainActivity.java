package com.repository.huaweihiai;

import android.annotation.TargetApi;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.widget.Toast;

import com.huawei.hiai.nlu.model.ResponseResult;
import com.huawei.hiai.nlu.sdk.NLUAPIService;
import com.huawei.hiai.nlu.sdk.NLUConstants;
import com.huawei.hiai.nlu.sdk.OnResultListener;
import com.repository.huaweihiai.runtimepermissions.PermissionsManager;
import com.repository.huaweihiai.runtimepermissions.PermissionsResultAction;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends Activity {

    /**
     * requestJson样例
     */

    private String requestJson = "{text:'您个人信用卡07月账单￥198.00，还款日07月27日，点cmbt.cn/zZyF6N9avld10i分期送积分【招商银行】'}";

    //    private String requestJson = "{text:'【欧普照明官方旗舰店】顺丰快递457882429353'}";
    private String cmccJson = "{text:'广东移动提醒您:用户13096971683在12/05 11:53给您来电一次.您可按通话键或选项键直接回拨'}";
    private String incomeJson = "{text:'您尾号6678龙卡信用卡05月24日14:09存入7947.00元，入账后该卡本期人民币账单已还清。绑定“中国建设银行”查账、办分期轻松搞定。[建设银行]'}";
    private String filmJson = "{text:'【百度糯米电影】您已成功购买影票。请凭序号686871和验票码526890至影院大厅内横店取票机或前台取票。影票信息：2016-06-08 21:20(周三),魔兽,福州横店影城,5号厅,7排9座。如有疑问请拨客服电话4006099866'}";
    private String expressJson = "{text:'【中通快递】您好，我是中通快递员，您的包裹已送至华为基地v5-v6地下通道社区人，凭提货码或运单号领取，如有问题请联系13468924932'}";
    private String subwayJson = "{text:'【铁路客服】订单EK79354467,高越您已购4月13日K8182次10车26号上铺,西安站23:33开'}";
    //    private String repayJson = "{text:'【华夏银行】华夏银行提示您：您在我行个人一手房屋按揭5-30年含(扣款卡号*4109)，本期应还款额为3353.58元。如已还款，请勿理会'}";
    private String repayJson = "{text:'尊敬的客户:您合同号为*1111的个人一手房按揭抵款于20180128应归还贷款本息5555.15元,并已扣款成功，剩余本金990718.37元，剩余期限200期，感谢您的支持！【交通银行】'}";
//    private String requestJson = "{text:'尊敬的旅客：您网上值机成功！深航2018-05-18(宝安机场T3 20:40-西安咸阳机场T2 23:20)的ZH9217航班，乘机人：高越，座位号：14D。可在深航官网、当地机场自助值机设备或人工柜台打印登机牌,请在航班截载时间前办理相关手续（航班截载时间以各地机场公布为准），服务咨询热线95361-3。祝您旅途愉快！-深圳航空'}";
//    private String requestJson = "{text:'打开蓝牙'}";


    private static final String TAG = "MainActivity";
    public static final String prefix = "{text:'";
    public static final String suffix = "'}";


    private ArrayList<String> keyWordList = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions();
        }


        initService();


    }


    @TargetApi(23)
    private void requestPermissions() {
        PermissionsManager.getInstance().requestAllManifestPermissionsIfNecessary(this, new PermissionsResultAction() {
            @Override
            public void onGranted() {
                Toast.makeText(MainActivity.this, "All permissions have been granted", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDenied(String permission) {
                Toast.makeText(MainActivity.this, "Permission " + permission + " has been denied", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void getChatIntention() {
//        List<String> smsList = getSmsInPhone();//手机内短信body列表


//        if (smsList == null || smsList.size() == 0)
//            return;
//
//        for (String sms : smsList) {
//            if (FilterUtil.getInstance().filter(sms)) {
//                keyWordList.add(sms);
//            }
//        }
//        keyWordList.add(requestJson);
//        if (keyWordList != null && keyWordList.size() > 0) {
//
//            for (int i = 0; i < keyWordList.size(); i++) {
//                String requestJson = i == 2 ? keyWordList.get(i) : prefix + keyWordList.get(i) + suffix;
//                传入短信筛选列表中部分
//                NLUAPIService.getInstance().getChatIntention(requestJson, NLUConstants.REQUEST_TYPE_LOCAL, new OnResultListener<ResponseResult>() {
//
//                    @Override
//                    public void onResult(ResponseResult respResult) {
//                        异步返回
//                        if (null != respResult && NLUConstants.ErrorCode.SUCCESS_RESULT == respResult.getCode()) {
//                            获取接口返回结果，参考接口文档返回使用
//                            String result = respResult.getJsonRes();
//                            Log.d(TAG, respResult.getMessage() + respResult.getCode());
//                        }
//
//                    }
//                });
//            }
//        }

        NLUAPIService.getInstance().getChatIntention(requestJson, NLUConstants.REQUEST_TYPE_LOCAL, new OnResultListener<ResponseResult>() {

            @Override
            public void onResult(ResponseResult respResult) {
                //异步返回
                if (null != respResult && NLUConstants.ErrorCode.SUCCESS_RESULT == respResult.getCode()) {
                    //获取接口返回结果，参考接口文档返回使用
                    String result = respResult.getJsonRes();
                    Log.d(TAG, respResult.getMessage() + respResult.getCode());
                }

            }
        });


    }


    private void getAssistantIntention() {
        //传入短信筛选列表中部分
        NLUAPIService.getInstance().getAssistantIntention(expressJson, NLUConstants.REQUEST_TYPE_LOCAL, new OnResultListener<ResponseResult>() {

            @Override
            public void onResult(ResponseResult respResult) {
                //异步返回
                if (null != respResult && NLUConstants.ErrorCode.SUCCESS_RESULT == respResult.getCode()) {
                    //获取接口返回结果，参考接口文档返回使用
                    String result = respResult.getJsonRes();
                    Log.d(TAG, respResult.getMessage() + respResult.getCode());
                }

            }
        });
    }

    private void initService() {
        NLUAPIService.getInstance().init(this, new OnResultListener<Integer>() {
            @Override
            public void onResult(Integer integer) {
                Toast.makeText(MainActivity.this, "HuaweiAiService init success", Toast.LENGTH_LONG).show();
                getChatIntention();
            }
        }, true);
    }


    public List<String> getSmsInPhone() {
        final String SMS_URI_ALL = "content://sms/";
        final String SMS_URI_INBOX = "content://sms/inbox";
        final String SMS_URI_SEND = "content://sms/sent";
        final String SMS_URI_DRAFT = "content://sms/draft";
        final String SMS_URI_OUTBOX = "content://sms/outbox";
        final String SMS_URI_FAILED = "content://sms/failed";
        final String SMS_URI_QUEUED = "content://sms/queued";

        StringBuilder smsBuilder = new StringBuilder();
        List<String> smsList = new ArrayList<>();

        try {
            Uri uri = Uri.parse(SMS_URI_ALL);
            String[] projection = new String[]{"_id", "address", "person", "body", "date", "type"};
            Cursor cur = getContentResolver().query(uri, projection, null, null, "date desc");        // 获取手机内部短信
            if (cur.moveToFirst()) {
                int index_Address = cur.getColumnIndex("address");
                int index_Person = cur.getColumnIndex("person");
                int index_Body = cur.getColumnIndex("body");
                int index_Date = cur.getColumnIndex("date");
                int index_Type = cur.getColumnIndex("type");

                do {
                    String strAddress = cur.getString(index_Address);
                    int intPerson = cur.getInt(index_Person);
                    String strbody = cur.getString(index_Body);
                    long longDate = cur.getLong(index_Date);
                    int intType = cur.getInt(index_Type);

                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                    Date d = new Date(longDate);
                    String strDate = dateFormat.format(d);

                    String strType = "";
                    if (intType == 1) {
                        strType = "接收";
                    } else if (intType == 2) {
                        strType = "发送";
                    } else {
                        strType = "null";
                    }

                    smsList.add(strbody);

//                    smsBuilder.append("[ ");
//                    smsBuilder.append(strAddress + ", ");
//                    smsBuilder.append(intPerson + ", ");
//                    smsBuilder.append(strbody + ", ");
//                    smsBuilder.append(strDate + ", ");
//                    smsBuilder.append(strType);
//                    smsBuilder.append(" ]\n\n");
                } while (cur.moveToNext());

                if (!cur.isClosed()) {
                    cur.close();
                    cur = null;
                }
            } else {
                smsBuilder.append("no result!");
            } // end if

            smsBuilder.append("getSmsPhone has executed!");

        } catch (SQLiteException ex) {
            Log.d("SQLiteException inSms", ex.getMessage());
        }

        return smsList;
    }
}
