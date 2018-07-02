<!DOCTYPE html>
<html>
    <head>
        <title>Transaction Invoice</title>
        <style>
            .container{
                width: 100%;
                height: auto;
            }

            .row{
                width: 100%;
                clear: both;
                margin: 10px 0;
                height: auto;
                overflow: auto;
            }

            .top-content{
                width: 67.667%;
                float: right;
            }

            .div-content{
                width: 50%;
                float: left;
            }

            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            td, th {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {
                background-color: #dddddd;
            }

            .box{
                width: 45%;
                border: 1px solid #000000;
                margin: 3px;
                float: left;
            }

            .box div{
                padding: 5px;
            }

            .border-bottom{
                border-bottom: 1px solid #000000;
            }

            .text-center{
                text-align: center;
            }

            .div-content p{
                margin: 3px 0;
            }

            span{
                display: inline-block;
            }

            .logo{
                width: 200px;
            }

        </style>

    </head>

    <body>
        <div class="container">
            <div class="row">
                <div class="logo">Moneytun Image</div>
            </div>

            <div class="top-content">
                <div class="box">
                    <div class="border-bottom">Transaction Number</div>
                    <div class="border-bottom">${transactionInvoice.transactionReferenceNumber}</div>
                    <div>${transactionInvoice.paymentType}</div>
                </div>
                <div class="box">
                    <div class="border-bottom">Agents Copy</div>
                    <div class="border-bottom">Date : ${transactionInvoice.transactionDate}</div>
                    <div>Available on : ${transactionInvoice.estimatedDeliveryDate}</div>
                </div>
            </div>

            <div class="row">
                <div class="div-content">
                    <p>Licensee: Moneytun LLC</p>
                    <p>3651 Lindell Rd Ste D225 Las Vegas, NV 89103</p>
                    <p>Tel: 702-485-5886</p>
                </div>

                <div class="div-content">
                    <p>Agent: FOCUS FINANCIAL (AL)</p>
                    <p>1035 SAN PABLO AVE., SUITE 3 ALBANY,CA 94706</p>
                    <p>Tel: (415) 644-5933</p>
                </div>
            </div>

            <div class="row">
                <table>
                    <tr>
                        <td>Remitter</td>
                        <td>Beneficiary</td>
                    </tr>
                    <tr>
                        <td>
                            <span>${transactionInvoice.senderFirstName} ${transactionInvoice.senderLastName}</span>
                            <span>${transactionInvoice.senderAddress}</span>
                            <span>${transactionInvoice.senderPhoneNumber}</span>
                        </td>
                        <td>
                            <span>${transactionInvoice.receiverFirstName} ${transactionInvoice.receiverLastName}</span>
                            <span>${transactionInvoice.receiverAddress}</span>
                            <span>${transactionInvoice.receiverPhoneNumber}</span>
                        </td>
                    </tr>
                    <tr>
                        <td>Amount ${transactionInvoice.senderTotalAmount} ${transactionInvoice.senderCurrency}</td>
                        <td>Paying Entity</td>
                    </tr>
                    <tr>
                        <td>ExchangeRate/Currency ${transactionInvoice.receiverAmount} ${transactionInvoice.receiverCurrency}</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Fee/Extra Charges ${transactionInvoice.fee}/${transactionInvoice.extraFee}</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>
                            Total Charges : ${transactionInvoice.totalFee}
                        </td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Total Amount ${transactionInvoice.senderTotalAmount} ${transactionInvoice.senderCurrency}</td>
                        <td>To be Paid ${transactionInvoice.receiverAmount} ${transactionInvoice.receiverCurrency}</td>
                    </tr>
                </table>
            </div>

            <div class="row">
                <div class="div-content">
                    <div>----------------------------------------</div>
                    <div>Sender's Signature</div>
                </div>
                <div class="div-content">
                    <div>----------------------------------------</div>
                    <div>Cashier's Signature</div>
                </div>
            </div>

            <div class="row">
                <h2 class="text-center">RIGHT TO REFUND</h2>
                <div>
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
                        attorney's fees pursuant to Section 2102 of the California Financial Code.
                    </p>
                </div>
            </div>
        </div>
    </body>
</html>