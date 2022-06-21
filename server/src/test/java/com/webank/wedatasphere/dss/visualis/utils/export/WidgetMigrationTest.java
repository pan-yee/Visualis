package com.webank.wedatasphere.dss.visualis.utils.export;

import org.apache.commons.lang.StringUtils;

public class WidgetMigrationTest {

    public static void main(String[] args) throws Exception {
//        String oldConfig = "{\"pageSize\":\"500\",\"cols\":[\"id\",\"name\",\"sex\",\"class\",\"lesson\",\"city\",\"teacher\",\"birthday\"],\"rows\":[],\"metrics\":[{\"name\":\"age@davinci@F5269200\",\"type\":\"value\",\"visualType\":\"string\",\"agg\":\"sum\",\"config\":true,\"chart\":{\"id\":1,\"name\":\"pivot\",\"title\":\"透视表\",\"icon\":\"icon-table\",\"coordinate\":\"cartesian\",\"requireDimetions\":[0,9999],\"requireMetrics\":[0,9999],\"data\":{\"color\":{\"title\":\"颜色\",\"type\":\"category\"}},\"style\":{\"pivot\":{\"fontFamily\":\"PingFang SC\",\"fontSize\":\"12\",\"color\":\"#666\",\"lineStyle\":\"solid\",\"lineColor\":\"#D9D9D9\",\"headerBackgroundColor\":\"#f7f7f7\"}}}},{\"name\":\"score@davinci@893072DB\",\"type\":\"value\",\"visualType\":\"string\",\"agg\":\"sum\",\"config\":true,\"chart\":{\"id\":1,\"name\":\"pivot\",\"title\":\"透视表\",\"icon\":\"icon-table\",\"coordinate\":\"cartesian\",\"requireDimetions\":[0,9999],\"requireMetrics\":[0,9999],\"data\":{\"color\":{\"title\":\"颜色\",\"type\":\"category\"}},\"style\":{\"pivot\":{\"fontFamily\":\"PingFang SC\",\"fontSize\":\"12\",\"color\":\"#666\",\"lineStyle\":\"solid\",\"lineColor\":\"#D9D9D9\",\"headerBackgroundColor\":\"#f7f7f7\"}}}},{\"name\":\"fee@davinci@A5BB2EC4\",\"type\":\"value\",\"visualType\":\"string\",\"agg\":\"sum\",\"config\":true,\"chart\":{\"id\":1,\"name\":\"pivot\",\"title\":\"透视表\",\"icon\":\"icon-table\",\"coordinate\":\"cartesian\",\"requireDimetions\":[0,9999],\"requireMetrics\":[0,9999],\"data\":{\"color\":{\"title\":\"颜色\",\"type\":\"category\"}},\"style\":{\"pivot\":{\"fontFamily\":\"PingFang SC\",\"fontSize\":\"12\",\"color\":\"#666\",\"lineStyle\":\"solid\",\"lineColor\":\"#D9D9D9\",\"headerBackgroundColor\":\"#f7f7f7\"}}}}],\"filters\":[],\"chartStyles\":{\"table\":{\"fontFamily\":\"PingFang SC\",\"fontSize\":\"12\",\"color\":\"#666\",\"lineStyle\":\"solid\",\"lineColor\":\"#D9D9D9\",\"headerBackgroundColor\":\"#f7f7f7\"}},\"selectedChart\":1,\"data\":[],\"renderType\":\"rerender\",\"orders\":[],\"mode\":\"chart\",\"model\":{\"id\":{\"sqlType\":\"int\",\"visualType\":\"string\",\"modelType\":\"category\"},\"name\":{\"sqlType\":\"string\",\"visualType\":\"string\",\"modelType\":\"category\"},\"sex\":{\"sqlType\":\"string\",\"visualType\":\"string\",\"modelType\":\"category\"},\"age\":{\"sqlType\":\"int\",\"visualType\":\"string\",\"modelType\":\"value\"},\"class\":{\"sqlType\":\"string\",\"visualType\":\"string\",\"modelType\":\"category\"},\"lesson\":{\"sqlType\":\"string\",\"visualType\":\"string\",\"modelType\":\"category\"},\"city\":{\"sqlType\":\"string\",\"visualType\":\"string\",\"modelType\":\"category\"},\"teacher\":{\"sqlType\":\"string\",\"visualType\":\"string\",\"modelType\":\"category\"},\"score\":{\"sqlType\":\"double\",\"visualType\":\"string\",\"modelType\":\"value\"},\"fee\":{\"sqlType\":\"double\",\"visualType\":\"string\",\"modelType\":\"value\"},\"birthday\":{\"sqlType\":\"string\",\"visualType\":\"string\",\"modelType\":\"category\"},\"exam_date\":{\"sqlType\":\"string\",\"visualType\":\"string\",\"modelType\":\"category\"}},\"queryParams\":[],\"cache\":false,\"expired\":300,\"columnsWidth\":{\"id\":168.75,\"name\":168.75,\"sex\":168.75,\"class\":168.75,\"lesson\":168.75,\"city\":168.75,\"teacher\":168.75,\"birthday\":168.75,\"sum(age)\":122.72727272727273,\"sum(score)\":122.72727272727273,\"sum(fee)\":122.72727272727273},\"columnsShowAsPercent\":{}}";
//        String newConfig = WidgetMigration.migrate(oldConfig, 297L);
//        System.out.println(newConfig);
        String a = "ffffff029aa07098c790192de951383f8a076a467701a8dbcf8704d9f098d8c2c94cd610c2a4a0b9bd9303b6d2379cc0101700d156512d638e02b847d517902b3a94573a6bd053ccf7d522ee6312603e3eaec01aa4bb4910051c5f2efa0c53ac36491f20c121a3170193210e3e20823628de9dd5d42e67d51596a5a0c4995961a6f253275793e56ac3862eaa9d5afd26fb308a4f0f7d48209ec7c585e23a37dd8ec9e90512b65b299017a6a44d21f37422c880c8b3c795225341e374fbf9a63acadd4b39cf726c1f04bd59a1bc96955e3f100dad1b3be21f3f13894eb240aec7858997beb2ffe20ba614533734896a52ab9e7455377c4186b9794e19397f76a0c4732baa@MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC8G6Vz79UNIq7AxR22tnW9ib0VTrgTiXkQ5DkujN1FmgDG/WeXAQwpblysYcEBPeuZ044QejDruvnnONeSzqYwPK5T7LfZNaymFHqFpQyxFx94FanmHdyxAFpoNPZ2Lakv6vExe+Gh0Cgj1TVtJ/hTmryZwmcKWfW3A5STLcEJLxUf3lBrAdi9N77U0g0v5okbdbiD0l8TCgU+cM5AcYWvKi00yzXNkG3c8PI2wys+WgFUsVVQBPtGmZeQSaN+mp/MO907gX0xIFqfqyTaNDJYlSDgUpeCyp5dTP45ils1bwPDRDkTkkMYy2vHWTNfyZWiiF6hLtKmI8myCLboU9ITAgMBAAECggEANxpqJ0I0SPrF8lZL1AAzEWjN6PX8WkzFGDuivI4rK35nh+Mne0alR2W65Axmu3RmFdOxJAaHWiaVmjQ+ghTi/fJoptELMifVAXmyQoAM7bt2TnkaIfzRb1BJK4mIQSozC4RpTzOY7wvJFmYYlndE+Ui0wt39zTx5DDmSRmL6zzNoTG5pPgmN/zq2icbhXqD0DP8wxw4AFKJWdrcMkkjRfKkByqA03bymfQqIz5uHril60o3xuuTyBPR74bnPdJE4ONahQHIgvWj/aQYqNyaapJJ8C194Acin0hl1QRv30+syM95QBdLEbLPAUHo2ClWRJZ6cqDPZe2a2N5YpbXtIQQKBgQD0iremr8O42yENqfAXK06Cek30E6wHTJ/RYipcveVg34rXsJ+yTls7SV6tyCqNknZzMoRw\" + \"QrIs74TN+KDF52wudrTpbsf5IKJQyExOz7LxTJ76h2OVA9zM1/MPtOHLt5mnwhLTtmxhVZ54CXbkw237pSagG+HhLyrO8S4mIweH8QKBgQDE7AEClojuj5cwRH46ic2s/oIuBObNFeJcRvxx+ONNdlOWOKRi6FhfHlhzLoFDUci2bjn1fvP1EMYZ+KkXATyezgIjJnnClXFpsORhUWh0SiqS3gVJeSIEDKeuh9esRPXk/cyPa3V8o5HouWWDitday0Xsnw51/sVTbN3b5z0eQwKBgEys9hqgv+jFZJ7JKwvIu2wz9x9Rz73WK8JWWlwL+tEeJoWsztX0taxoO/SXb6hGRTennlkowH9Qdr6yd462GniTJfSPlMorjllwBGUtwLjiQnLhYrsFpATirUa+e5IJtncgZhDWATOfyflvVkUyddjSlsLbGz8lL/IFM2gn0aOxAoGADJlQ4zqAXkr/kE4BiXtBlnzeFVWo8pwg1GiSRDR5Tn5wkJ7lHZLh/IvzesMR8B2uasWYnbVWpGpDUmwPXXJtz3c8ucT/a0ymae2wXu2XckFAgg8EZZQDciDhJZB5YwMyfEkkqlRkuum4LxyVexoJ9zwkKCRxB2madGD1vNkJlwMCgYANF7fiG6k3D45Nopu8iTbi3S9oOnhTWxpwxSJWTUij4HFmtSXjJfgOPG9rVvO5QCaHWDWHE/LyZ/Y51ustAV3uj5UmnGwXQDNEgNZUFe4vwzYq7ikXoE6zCTzs70DT/4llos5g1rs8feuWrJK19DPKrenxyOLI6pPA9GjMgC1aEg==";
        String[] b = StringUtils.split(a,"@");
        b.toString();

    }
}