<!DOCTYPE html>
<html>
    <head>
        <title>Transaction Invoice</title>
        <style>
            .container{
                width: 100%;
                height: auto;
                padding: 20px;
                position: relative;
            }

            .row{
                width: 100%;
                clear: both;
                height: auto;
                overflow: auto;
            }

            .top-content{
                width: 68%;
                float: right;
            }

            .div-content{
                width: 100%;
                float: left;
            }

            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            .p-text td, th {
                border: 2px solid black;
            }
            .p-text {
                text-align: left;
                font-size: 12px;
                padding: 8px;
            }
            .p-text p{
                text-align: left;
                font-size: 14px;
            }
            .table-header td, .table-header p {
                font-size: 16px;
                padding: 10px;
            }
            .table-header {
                font-size: 14px;
                padding-left: 8px;
            }
            .box{
                width: 30%;
                border: 1px solid #000;
                margin: 3px;
                margin-right: 25px;
                float: right;
            }
            .box-large {
                width: 60%;
                border: 1px solid #000;
                margin: 3px;
                float: left;
            }

            .box div{
                padding: 2px;
            }

            .border-bottom{
                border-bottom: 1px solid #000;
            }

            .text-center{
                text-align: center;
            }

            .div-content p{
                margin: 1px 0;
            }

            span{
                display: inline-block;
            }

            .logo{
                width: 220px;
                float : left;
            }
            .invoice-number{
                color: red;
                font-weight: bold;
                font-size: 24px;
                text-align: center;
            }

            .grey-title{
                font-weight: bold;
                font-size: 12px;
                background-color: #ddd;;
            }

            .center-text{
                font-size: 13px;
                text-align: center;
            }
            .small-text{
                font-size: 14px;
                text-align:center;
                padding:3px
            }

            .bold-text{
                font-weight: bold;
            }
            .signature-block{
                font-weight: bold;
                font-size: 16px;
                font-style: italic;
                margin: 0px 0;
                text-align: center;
            }
            .licensee-text p{
                text-align: center;
            }
            .agent-text p{
                text-align: left;
            }
            .subtable{
                background-color: #ddd;;
            }
            table {
                width: 97%;
                table-layout: fixed;
            }
            td {
                max-width: 0;
                overflow: hidden;
                word-wrap:break-word;
            }
            tbody{
                vertical-align: top;
            }
            .disclaimer-note p{
                font-size: 13px;
                font-style: italic;
            }
            .cancelled{
                color: #fbb4bb;
                font-size:100px;
                top: 0px;
                right: 0px;
                width:100%;
                text-align: center;
                margin-top:350px;
                filter: alpha(opacity=0.5);

            }
            .background{
                position: absolute;
                top: 0;
                left: 0;
                bottom: 0;
                right: 0;
                z-index: 50;
                overflow: hidden;
            }
            .license-agent-content td{
                font-size: 13px;
                padding-left: 5px;
                padding-right: 5px;
            }
            .amount p{
                text-align: right;
                padding-right: 5px;
            }
        </style>

    </head>

    <body>
        <#if transactionInvoice.transactionStatus=="CANCELED">
            <p class="background cancelled">CANCELED</p>
        </#if>
        <div class="container">
            <div class="row">
                <div class="logo">
                <#if transactionInvoice.senderState=="California">
                    <img width="200px" src="https://s3.amazonaws.com/com-machpay-raas/assets/logo_moneytun_california.png" class="someClass "></img>
                <#else>
                    <img width="200px" src="https://s3.amazonaws.com/com-machpay-raas/assets/logo_moneytun.png" class="someClass "></img>
                </#if>
                </div>
                <div class="top-content">
                    <div class="box-large">
                        <div class="border-bottom small-text bold-text">Transaction Number</div>
                        <div class="border-bottom invoice-number">${transactionInvoice.transactionReferenceNumber}</div>
                        <div class="border-bottom small-text ">
                        ${transactionInvoice.referenceNumber} /<b>${transactionInvoice.paymentType.toUpperCase()}</b>
                        </div>

                    </div>
                    <div class="box">
                        <div class="border-bottom grey-title center-text">Customer's Copy</div>
                        <div class="border-bottom center-text" >${transactionInvoice.transactionDate}</div>
                        <div class="border-bottom grey-title center-text">Available on</div>
                        <div class="border-bottom center-text" >${transactionInvoice.estimatedDeliveryDate}</div>
                    </div>
                </div>
            </div>

            <div class="row license-agent-content">
                <table>
                    <tr>
                        <td>
                            <div class="div-content licensee-text bold-text">
                                <p>Service Provider: ${transactionInvoice.msbName}</p>
                                <p>${transactionInvoice.msbAddress}</p>
                                <p>Tel: ${transactionInvoice.msbPhoneNumber}</p>
                            </div>
                        </td>
                    </tr>
                </table>
            </div>

            <div class="row p-text">
                <table>
                    <tr class="table-header">
                        <td colspan="2" class="grey-title">REMITTER</td>
                        <td colspan="2" class="grey-title">BENEFICIARY</td>
                    </tr>
                    <tr >
                        <td colspan="2" class="p-text">
                            <p>${transactionInvoice.senderFirstName} ${transactionInvoice.senderLastName}<br></br>
                            ${transactionInvoice.senderAddress}<br></br>
                            Tel: ${transactionInvoice.senderPhoneNumber}</p>
                        </td>
                        <td colspan="2" class="p-text">
                            <p>${transactionInvoice.receiverFirstName} ${transactionInvoice.receiverLastName}<br></br>
                            ${transactionInvoice.receiverAddress}<br></br>
                            Tel: ${transactionInvoice.receiverPhoneNumber}</p>
                        </td>
                    </tr>
                    <tr>
                        <td class="subtable bold-text"><p class="table-header">Amount</p></td>
                        <td class="amount"><p>${transactionInvoice.senderAmount} ${transactionInvoice.senderCurrency}</p></td>
                        <td colspan="2" class="subtable bold-text"><p class="table-header">Paying Entity</p></td>
                    </tr>

                    <tr>
                        <td class="subtable bold-text"><p class="table-header">ExchangeRate/Currency</p></td>
                        <td class="amount"><p>${transactionInvoice.exchangeRate} <br></br>${transactionInvoice.receiverCurrency}</p></td>
                        <td colspan="2" rowspan="3" class="amount"><p>
                            VTNetwork Limited<br></br>

                            No. 5 Beckley Street, off Adeyi<br></br>


                            Old Bodija, Ibadan. Oyo-State, Nigeria<br></br>

                            Tel:   07041911945, 08138994140<br></br>

                        </p></td>
                    </tr>
                    <tr>
                        <td class="subtable bold-text"><p class="table-header">Fee/Extra Charges</p></td>
                        <td class="amount"><p>${transactionInvoice.fee}/${transactionInvoice.extraFee} ${transactionInvoice.senderCurrency}</p></td>

                    </tr>
                    <tr>
                        <td class="subtable bold-text"><p class="table-header">Total Charges</p></td>
                        <td class="amount"><p>${transactionInvoice.totalFee} ${transactionInvoice.senderCurrency}</p></td>
                    </tr>
                    <tr>
                        <td class="subtable bold-text"><p class="table-header">Total Amount</p></td>
                        <td class="amount bold-text"><p>${transactionInvoice.senderTotalAmount} ${transactionInvoice.senderCurrency}</p></td>
                        <td colspan="2" rowspan="2" class="p-text"><p>Note** ${transactionInvoice.note}</p></td>
                    </tr>
                    <tr>
                        <td class="subtable bold-text"><p class="table-header">To be Paid</p></td>
                        <td class="amount bold-text"><p>${transactionInvoice.receiverAmount} ${transactionInvoice.receiverCurrency}</p></td>
                    </tr>

                </table>
            </div>

            <div class="row">
                <div class="signature-block">
                    <div>Digitally Signed By ${transactionInvoice.senderFirstName} ${transactionInvoice.senderLastName}</div>
                </div>
            </div>

            <div class="row">
                <h4 class="text-center">RIGHT TO REFUND</h4>
                <div class="disclaimer-note">
                    <p>You, the customer, are entitled to a refund of the money to be transmitted as the result of this agreement if ${transactionInvoice.msbName}
                        does not forward the money received from you within 10 days of the date of its receipt, or does not give instructions
                        committing an equivalent amount of money to the person designated by you within 10 days of the date of the receipt of the
                        funds from you unless otherwise instructed by you.</p>

                    <p>
                        If your instructions as to when the moneys shall be forwarded or transmitted are not complied with and the money has not yet
                        been forwarded or transmitted, you have a right to a refund of your money.
                    </p>

                    <p>
                        If you want a refund, you must mail or deliver your written request to ${transactionInvoice.msbName} at ${transactionInvoice.msbAddress}.
                        If you do not receive your refund, you may be entitled to your money back plus a penalty of up to $1,000 and
                        attorney's fees pursuant to Section 2102 of the Nevada Financial Code.
                    </p>
                </div>
            </div>
        </div>
    </body>
</html>