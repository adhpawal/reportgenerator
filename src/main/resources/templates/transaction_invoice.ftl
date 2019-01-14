<!DOCTYPE html>
<html>
    <head>
        <title>Transaction Invoice</title>
    </head>

    <body>
        <#if transactionInvoice.transactionStatus=="CANCELED">
            <p class="background cancelled">CANCELED</p>
        </#if>
        <div class="container">
            <div class="row">
                <div class="logo">
                <#if transactionInvoice.senderState=="CA">
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