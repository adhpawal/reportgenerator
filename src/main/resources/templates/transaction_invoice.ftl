<!DOCTYPE html>
<html>
    <head>
        <title>Transaction Invoice</title>
        <style>
            .container{
                width: 100%;
                height: auto;
                padding: 20px;
            }

            .row{
                width: 100%;
                clear: both;
                margin: 10px 0;
                height: auto;
                overflow: auto;
            }

            .top-content{
                width: 64.667%;
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

            td, th {
                border: 1px solid #ddd;
                text-align: left;
                padding: 8px;
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
                font-size: 14px;
                text-align: center;
            }

            .grey-title{
                font-weight: bold;
                font-size: 12px;
                background-color: #c5c3c3;
            }

            .center-text{
                font-size: 14px;
                text-align: center;
            }

            .bold-text{
                font-size: 14px;
                font-weight: bold;
            }
            .p-text{
                font-size:14px;
            }
            .signature-block{
                font-weight: bold;
                font-size: 16px;
                font-style: italic;
                margin: 0px 0;
                text-align: center;
            }
            .licensee-text p{
                text-align: left;
                font-size: 11px;
            }
            .agent-text p{
                text-align: left;
            }
            .subtable tr td:first-child{
                background-color: #ddd;
            }
            table {
                width: 100%;
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
        </style>

    </head>

    <body>
        <div class="container">
            <div class="row">
                <div class="logo">
                    <img width="200px" src="https://beta.sodatransfer.com/img/logos/logo_moneytun.png" class="someClass ">
                    <div class="div-content licensee-text">
                        <p>Licensee: Moneytun LLC</p>
                        <p>3651 Lindell Rd Ste D225 Las Vegas, NV 89103</p>
                        <p>Tel: 702-485-5886</p>
                    </div>
                </div>
                <div class="top-content">
                    <div class="box-large">
                        <div class="border-bottom center-text bold-text">Transaction Number</div>
                        <div class="border-bottom invoice-number center-text">${transactionInvoice.transactionReferenceNumber}</div>
                        <div class="border-bottom center-text bold-text">Transaction Reference Number</div>
                        <div class="border-bottom invoice-number center-text">${transactionInvoice.referenceNumber}</div>
                        <div class="bold-text center-text">${transactionInvoice.paymentType}</div>
                    </div>
                    <div class="box">
                        <div class="border-bottom grey-title center-text">Customer's Copy</div>
                        <div class="border-bottom center-text" >${transactionInvoice.transactionDate}</div>
                        <div class="border-bottom grey-title center-text">Available on</div>
                        <div class="border-bottom center-text" >${transactionInvoice.estimatedDeliveryDate}</div>
                    </div>
                </div>
            </div>

            <div class="row">

            </div>

            <div class="row p-text">
                <table>
                    <tr>
                        <td class="grey-title center-text">REMITTER</td>
                        <td class="grey-title center-text">BENEFICIARY</td>
                    </tr>
                    <tr >
                        <td>
                            <p>${transactionInvoice.senderFirstName} ${transactionInvoice.senderLastName}</p>
                            <p>${transactionInvoice.senderAddress}</p>
                            <p>${transactionInvoice.senderPhoneNumber}</p>
                        </td>
                        <td>
                            <p>${transactionInvoice.receiverFirstName} ${transactionInvoice.receiverLastName}</p>
                            <p>${transactionInvoice.receiverAddress}</p>
                            <p>${transactionInvoice.receiverPhoneNumber}</p>
                        </td>
                    </tr>
                    <tr>
                        <td style="padding: 0px;">
                        <table class="subtable">
                            <tr>
                                <td>Amount</td>
                                <td>${transactionInvoice.senderTotalAmount} ${transactionInvoice.senderCurrency}</td>
                            </tr>

                            <tr>
                                <td>ExchangeRate/Currency</td>
                                <td>${transactionInvoice.receiverAmount} ${transactionInvoice.receiverCurrency}</td>
                            </tr>
                            <tr>
                                <td>Fee/Extra Charges</td>
                                <td>${transactionInvoice.fee}/${transactionInvoice.extraFee} ${transactionInvoice.senderCurrency}</td>
                            </tr>
                            <tr>
                                <td>Total Charges</td>
                                <td>${transactionInvoice.totalFee} ${transactionInvoice.senderCurrency}</td>
                            </tr>
                            <tr>
                                <td>Total Amount</td>
                                <td>${transactionInvoice.senderTotalAmount} ${transactionInvoice.senderCurrency}</td>
                            </tr>
                            <tr>
                                <td>To be Paid</td>
                                <td>${transactionInvoice.receiverAmount} ${transactionInvoice.receiverCurrency}</td>
                            </tr>
                        </table>
                        </td>
                        <td style="padding: 0px;">
                        <table>
                            <tbody>
                                <tr><td>Paying Entity : EWAY</td></tr>
                                <tr><td>Message</td></tr>
                                <tr><td style="border: none;">Note** ${transactionInvoice.note}</td></tr>
                            </tbody>
                        </table></td>
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
                    <p>You, the customer, are entitled to a refund of the money to be transmitted as the result of this agreement if MONEYTUN LLC
                        does not forward the money received from you within 10 days of the date of its receipt, or does not give instructions
                        committing an equivalent amount of money to the person designated by you within 10 days of the date of the receipt of the
                        funds from you unless otherwise instructed by you.</p>

                    <p>
                        If your instructions as to when the moneys shall be forwarded or transmitted are not complied with and the money has not yet
                        been forwarded or transmitted, you have a right to a refund of your money.
                    </p>

                    <p>
                        If you want a refund, you must mail or deliver your written request to MONEYTUN LLC at 3651 Lindell Rd Suite D225, Las
                        Vegas NV 89103. If you do not receive your refund, you may be entitled to your money back plus a penalty of up to $1,000 and
                        attorney's fees pursuant to Section 2102 of the Nevada Financial Code.
                    </p>
                </div>
            </div>
        </div>
    </body>
</html>