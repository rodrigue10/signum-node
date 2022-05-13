/*
 * This file is generated by jOOQ.
 */
package brs.schema;


import brs.schema.tables.Account;
import brs.schema.tables.AccountAsset;
import brs.schema.tables.AccountBalance;
import brs.schema.tables.Alias;
import brs.schema.tables.AskOrder;
import brs.schema.tables.Asset;
import brs.schema.tables.AssetTransfer;
import brs.schema.tables.At;
import brs.schema.tables.AtState;
import brs.schema.tables.BidOrder;
import brs.schema.tables.Block;
import brs.schema.tables.Escrow;
import brs.schema.tables.EscrowDecision;
import brs.schema.tables.FlywaySchemaHistory;
import brs.schema.tables.Goods;
import brs.schema.tables.IndirectIncoming;
import brs.schema.tables.Purchase;
import brs.schema.tables.PurchaseFeedback;
import brs.schema.tables.PurchasePublicFeedback;
import brs.schema.tables.RewardRecipAssign;
import brs.schema.tables.Subscription;
import brs.schema.tables.Trade;
import brs.schema.tables.Transaction;
import brs.schema.tables.UnconfirmedTransaction;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in DB.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ACCOUNT_ASSET_ACCOUNT_ASSET_QUANTITY_IDX = Internal.createIndex(DSL.name("account_asset_quantity_idx"), AccountAsset.ACCOUNT_ASSET, new OrderField[] { AccountAsset.ACCOUNT_ASSET.QUANTITY }, false);
    public static final Index ACCOUNT_BALANCE_ACCOUNT_BALANCE_ID_BALANCE_HEIGHT_IDX = Internal.createIndex(DSL.name("account_balance_id_balance_height_idx"), AccountBalance.ACCOUNT_BALANCE, new OrderField[] { AccountBalance.ACCOUNT_BALANCE.ID, AccountBalance.ACCOUNT_BALANCE.BALANCE, AccountBalance.ACCOUNT_BALANCE.HEIGHT }, false);
    public static final Index ACCOUNT_ACCOUNT_ID_BALANCE_HEIGHT_IDX = Internal.createIndex(DSL.name("account_id_balance_height_idx"), Account.ACCOUNT, new OrderField[] { Account.ACCOUNT.ID, Account.ACCOUNT.HEIGHT }, false);
    public static final Index ACCOUNT_ACCOUNT_ID_LATEST_IDX = Internal.createIndex(DSL.name("account_id_latest_idx"), Account.ACCOUNT, new OrderField[] { Account.ACCOUNT.ID, Account.ACCOUNT.LATEST }, false);
    public static final Index ALIAS_ALIAS_ACCOUNT_ID_IDX = Internal.createIndex(DSL.name("alias_account_id_idx"), Alias.ALIAS, new OrderField[] { Alias.ALIAS.ACCOUNT_ID, Alias.ALIAS.HEIGHT }, false);
    public static final Index ALIAS_ALIAS_NAME_LOWER_IDX = Internal.createIndex(DSL.name("alias_name_lower_idx"), Alias.ALIAS, new OrderField[] { Alias.ALIAS.ALIAS_NAME_LOWER }, false);
    public static final Index ASK_ORDER_ASK_ORDER_ACCOUNT_ID_IDX = Internal.createIndex(DSL.name("ask_order_account_id_idx"), AskOrder.ASK_ORDER, new OrderField[] { AskOrder.ASK_ORDER.ACCOUNT_ID, AskOrder.ASK_ORDER.HEIGHT }, false);
    public static final Index ASK_ORDER_ASK_ORDER_ASSET_ID_PRICE_IDX = Internal.createIndex(DSL.name("ask_order_asset_id_price_idx"), AskOrder.ASK_ORDER, new OrderField[] { AskOrder.ASK_ORDER.ASSET_ID, AskOrder.ASK_ORDER.PRICE }, false);
    public static final Index ASK_ORDER_ASK_ORDER_CREATION_IDX = Internal.createIndex(DSL.name("ask_order_creation_idx"), AskOrder.ASK_ORDER, new OrderField[] { AskOrder.ASK_ORDER.CREATION_HEIGHT }, false);
    public static final Index ASSET_ASSET_ACCOUNT_ID_IDX = Internal.createIndex(DSL.name("asset_account_id_idx"), Asset.ASSET, new OrderField[] { Asset.ASSET.ACCOUNT_ID }, false);
    public static final Index ASSET_TRANSFER_ASSET_TRANSFER_ASSET_ID_IDX = Internal.createIndex(DSL.name("asset_transfer_asset_id_idx"), AssetTransfer.ASSET_TRANSFER, new OrderField[] { AssetTransfer.ASSET_TRANSFER.ASSET_ID, AssetTransfer.ASSET_TRANSFER.HEIGHT }, false);
    public static final Index ASSET_TRANSFER_ASSET_TRANSFER_ID_IDX = Internal.createIndex(DSL.name("asset_transfer_id_idx"), AssetTransfer.ASSET_TRANSFER, new OrderField[] { AssetTransfer.ASSET_TRANSFER.ID }, false);
    public static final Index ASSET_TRANSFER_ASSET_TRANSFER_RECIPIENT_ID_IDX = Internal.createIndex(DSL.name("asset_transfer_recipient_id_idx"), AssetTransfer.ASSET_TRANSFER, new OrderField[] { AssetTransfer.ASSET_TRANSFER.RECIPIENT_ID, AssetTransfer.ASSET_TRANSFER.HEIGHT }, false);
    public static final Index ASSET_TRANSFER_ASSET_TRANSFER_SENDER_ID_IDX = Internal.createIndex(DSL.name("asset_transfer_sender_id_idx"), AssetTransfer.ASSET_TRANSFER, new OrderField[] { AssetTransfer.ASSET_TRANSFER.SENDER_ID, AssetTransfer.ASSET_TRANSFER.HEIGHT }, false);
    public static final Index AT_AT_AP_CODE_HASH_ID_INDEX = Internal.createIndex(DSL.name("at_ap_code_hash_id_index"), At.AT, new OrderField[] { At.AT.AP_CODE_HASH_ID }, false);
    public static final Index AT_AT_CREATOR_ID_HEIGHT_IDX = Internal.createIndex(DSL.name("at_creator_id_height_idx"), At.AT, new OrderField[] { At.AT.CREATOR_ID, At.AT.HEIGHT }, false);
    public static final Index AT_STATE_AT_STATE_ID_NEXT_HEIGHT_HEIGHT_IDX = Internal.createIndex(DSL.name("at_state_id_next_height_height_idx"), AtState.AT_STATE, new OrderField[] { AtState.AT_STATE.AT_ID, AtState.AT_STATE.NEXT_HEIGHT, AtState.AT_STATE.HEIGHT }, false);
    public static final Index BID_ORDER_BID_ORDER_ACCOUNT_ID_IDX = Internal.createIndex(DSL.name("bid_order_account_id_idx"), BidOrder.BID_ORDER, new OrderField[] { BidOrder.BID_ORDER.ACCOUNT_ID, BidOrder.BID_ORDER.HEIGHT }, false);
    public static final Index BID_ORDER_BID_ORDER_ASSET_ID_PRICE_IDX = Internal.createIndex(DSL.name("bid_order_asset_id_price_idx"), BidOrder.BID_ORDER, new OrderField[] { BidOrder.BID_ORDER.ASSET_ID, BidOrder.BID_ORDER.PRICE }, false);
    public static final Index BID_ORDER_BID_ORDER_CREATION_IDX = Internal.createIndex(DSL.name("bid_order_creation_idx"), BidOrder.BID_ORDER, new OrderField[] { BidOrder.BID_ORDER.CREATION_HEIGHT }, false);
    public static final Index BLOCK_BLOCK_GENERATOR_ID_IDX = Internal.createIndex(DSL.name("block_generator_id_idx"), Block.BLOCK, new OrderField[] { Block.BLOCK.GENERATOR_ID }, false);
    public static final Index ESCROW_ESCROW_DEADLINE_HEIGHT_IDX = Internal.createIndex(DSL.name("escrow_deadline_height_idx"), Escrow.ESCROW, new OrderField[] { Escrow.ESCROW.DEADLINE, Escrow.ESCROW.HEIGHT }, false);
    public static final Index ESCROW_DECISION_ESCROW_DECISION_ACCOUNT_ID_HEIGHT_IDX = Internal.createIndex(DSL.name("escrow_decision_account_id_height_idx"), EscrowDecision.ESCROW_DECISION, new OrderField[] { EscrowDecision.ESCROW_DECISION.ACCOUNT_ID, EscrowDecision.ESCROW_DECISION.HEIGHT }, false);
    public static final Index ESCROW_DECISION_ESCROW_DECISION_ESCROW_ID_HEIGHT_IDX = Internal.createIndex(DSL.name("escrow_decision_escrow_id_height_idx"), EscrowDecision.ESCROW_DECISION, new OrderField[] { EscrowDecision.ESCROW_DECISION.ESCROW_ID, EscrowDecision.ESCROW_DECISION.HEIGHT }, false);
    public static final Index ESCROW_ESCROW_RECIPIENT_ID_HEIGHT_IDX = Internal.createIndex(DSL.name("escrow_recipient_id_height_idx"), Escrow.ESCROW, new OrderField[] { Escrow.ESCROW.RECIPIENT_ID, Escrow.ESCROW.HEIGHT }, false);
    public static final Index ESCROW_ESCROW_SENDER_ID_HEIGHT_IDX = Internal.createIndex(DSL.name("escrow_sender_id_height_idx"), Escrow.ESCROW, new OrderField[] { Escrow.ESCROW.SENDER_ID, Escrow.ESCROW.HEIGHT }, false);
    public static final Index FLYWAY_SCHEMA_HISTORY_FLYWAY_SCHEMA_HISTORY_S_IDX = Internal.createIndex(DSL.name("flyway_schema_history_s_idx"), FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, new OrderField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SUCCESS }, false);
    public static final Index GOODS_GOODS_SELLER_ID_NAME_IDX = Internal.createIndex(DSL.name("goods_seller_id_name_idx"), Goods.GOODS, new OrderField[] { Goods.GOODS.SELLER_ID, Goods.GOODS.NAME }, false);
    public static final Index GOODS_GOODS_TIMESTAMP_IDX = Internal.createIndex(DSL.name("goods_timestamp_idx"), Goods.GOODS, new OrderField[] { Goods.GOODS.TIMESTAMP, Goods.GOODS.HEIGHT }, false);
    public static final Index INDIRECT_INCOMING_INDIRECT_INCOMING_ID_INDEX = Internal.createIndex(DSL.name("indirect_incoming_id_index"), IndirectIncoming.INDIRECT_INCOMING, new OrderField[] { IndirectIncoming.INDIRECT_INCOMING.ACCOUNT_ID }, false);
    public static final Index INDIRECT_INCOMING_INDIRECT_INCOMING_INDEX = Internal.createIndex(DSL.name("indirect_incoming_index"), IndirectIncoming.INDIRECT_INCOMING, new OrderField[] { IndirectIncoming.INDIRECT_INCOMING.HEIGHT }, false);
    public static final Index PURCHASE_PURCHASE_BUYER_ID_HEIGHT_IDX = Internal.createIndex(DSL.name("purchase_buyer_id_height_idx"), Purchase.PURCHASE, new OrderField[] { Purchase.PURCHASE.BUYER_ID, Purchase.PURCHASE.HEIGHT }, false);
    public static final Index PURCHASE_PURCHASE_DEADLINE_IDX = Internal.createIndex(DSL.name("purchase_deadline_idx"), Purchase.PURCHASE, new OrderField[] { Purchase.PURCHASE.DEADLINE, Purchase.PURCHASE.HEIGHT }, false);
    public static final Index PURCHASE_FEEDBACK_PURCHASE_FEEDBACK_ID_HEIGHT_IDX = Internal.createIndex(DSL.name("purchase_feedback_id_height_idx"), PurchaseFeedback.PURCHASE_FEEDBACK, new OrderField[] { PurchaseFeedback.PURCHASE_FEEDBACK.ID, PurchaseFeedback.PURCHASE_FEEDBACK.HEIGHT }, false);
    public static final Index PURCHASE_PUBLIC_FEEDBACK_PURCHASE_PUBLIC_FEEDBACK_ID_HEIGHT_IDX = Internal.createIndex(DSL.name("purchase_public_feedback_id_height_idx"), PurchasePublicFeedback.PURCHASE_PUBLIC_FEEDBACK, new OrderField[] { PurchasePublicFeedback.PURCHASE_PUBLIC_FEEDBACK.ID, PurchasePublicFeedback.PURCHASE_PUBLIC_FEEDBACK.HEIGHT }, false);
    public static final Index PURCHASE_PURCHASE_SELLER_ID_HEIGHT_IDX = Internal.createIndex(DSL.name("purchase_seller_id_height_idx"), Purchase.PURCHASE, new OrderField[] { Purchase.PURCHASE.SELLER_ID, Purchase.PURCHASE.HEIGHT }, false);
    public static final Index PURCHASE_PURCHASE_TIMESTAMP_IDX = Internal.createIndex(DSL.name("purchase_timestamp_idx"), Purchase.PURCHASE, new OrderField[] { Purchase.PURCHASE.TIMESTAMP, Purchase.PURCHASE.ID }, false);
    public static final Index REWARD_RECIP_ASSIGN_REWARD_RECIP_ASSIGN_RECIP_ID_HEIGHT_IDX = Internal.createIndex(DSL.name("reward_recip_assign_recip_id_height_idx"), RewardRecipAssign.REWARD_RECIP_ASSIGN, new OrderField[] { RewardRecipAssign.REWARD_RECIP_ASSIGN.RECIP_ID, RewardRecipAssign.REWARD_RECIP_ASSIGN.HEIGHT }, false);
    public static final Index SUBSCRIPTION_SUBSCRIPTION_LATEST_INDEX = Internal.createIndex(DSL.name("subscription_latest_index"), Subscription.SUBSCRIPTION, new OrderField[] { Subscription.SUBSCRIPTION.LATEST }, false);
    public static final Index SUBSCRIPTION_SUBSCRIPTION_RECIPIENT_ID_HEIGHT_IDX = Internal.createIndex(DSL.name("subscription_recipient_id_height_idx"), Subscription.SUBSCRIPTION, new OrderField[] { Subscription.SUBSCRIPTION.RECIPIENT_ID, Subscription.SUBSCRIPTION.HEIGHT }, false);
    public static final Index SUBSCRIPTION_SUBSCRIPTION_SENDER_ID_HEIGHT_IDX = Internal.createIndex(DSL.name("subscription_sender_id_height_idx"), Subscription.SUBSCRIPTION, new OrderField[] { Subscription.SUBSCRIPTION.SENDER_ID, Subscription.SUBSCRIPTION.HEIGHT }, false);
    public static final Index SUBSCRIPTION_SUBSCRIPTION_TIME_NEXT_INDEX = Internal.createIndex(DSL.name("subscription_time_next_index"), Subscription.SUBSCRIPTION, new OrderField[] { Subscription.SUBSCRIPTION.TIME_NEXT }, false);
    public static final Index TRADE_TRADE_ASSET_ID_IDX = Internal.createIndex(DSL.name("trade_asset_id_idx"), Trade.TRADE, new OrderField[] { Trade.TRADE.ASSET_ID, Trade.TRADE.HEIGHT }, false);
    public static final Index TRADE_TRADE_BUYER_ID_IDX = Internal.createIndex(DSL.name("trade_buyer_id_idx"), Trade.TRADE, new OrderField[] { Trade.TRADE.BUYER_ID, Trade.TRADE.HEIGHT }, false);
    public static final Index TRADE_TRADE_SELLER_ID_IDX = Internal.createIndex(DSL.name("trade_seller_id_idx"), Trade.TRADE, new OrderField[] { Trade.TRADE.SELLER_ID, Trade.TRADE.HEIGHT }, false);
    public static final Index TRANSACTION_TRANSACTION_BLOCK_TIMESTAMP_IDX = Internal.createIndex(DSL.name("transaction_block_timestamp_idx"), Transaction.TRANSACTION, new OrderField[] { Transaction.TRANSACTION.BLOCK_TIMESTAMP }, false);
    public static final Index TRANSACTION_TRANSACTION_RECIPIENT_ID_AMOUNT_HEIGHT_IDX = Internal.createIndex(DSL.name("transaction_recipient_id_amount_height_idx"), Transaction.TRANSACTION, new OrderField[] { Transaction.TRANSACTION.RECIPIENT_ID, Transaction.TRANSACTION.AMOUNT, Transaction.TRANSACTION.HEIGHT }, false);
    public static final Index TRANSACTION_TRANSACTION_RECIPIENT_ID_IDX = Internal.createIndex(DSL.name("transaction_recipient_id_idx"), Transaction.TRANSACTION, new OrderField[] { Transaction.TRANSACTION.RECIPIENT_ID }, false);
    public static final Index TRANSACTION_TRANSACTION_SENDER_ID_IDX = Internal.createIndex(DSL.name("transaction_sender_id_idx"), Transaction.TRANSACTION, new OrderField[] { Transaction.TRANSACTION.SENDER_ID }, false);
    public static final Index TRANSACTION_TX_CASH_BACK_INDEX = Internal.createIndex(DSL.name("tx_cash_back_index"), Transaction.TRANSACTION, new OrderField[] { Transaction.TRANSACTION.CASH_BACK_ID }, false);
    public static final Index TRANSACTION_TX_SENDER_TYPE = Internal.createIndex(DSL.name("tx_sender_type"), Transaction.TRANSACTION, new OrderField[] { Transaction.TRANSACTION.SENDER_ID, Transaction.TRANSACTION.TYPE }, false);
    public static final Index UNCONFIRMED_TRANSACTION_UNCONFIRMED_TRANSACTION_HEIGHT_FEE_TIMESTAMP_IDX = Internal.createIndex(DSL.name("unconfirmed_transaction_height_fee_timestamp_idx"), UnconfirmedTransaction.UNCONFIRMED_TRANSACTION, new OrderField[] { UnconfirmedTransaction.UNCONFIRMED_TRANSACTION.TRANSACTION_HEIGHT, UnconfirmedTransaction.UNCONFIRMED_TRANSACTION.FEE_PER_BYTE, UnconfirmedTransaction.UNCONFIRMED_TRANSACTION.TIMESTAMP }, false);
}
