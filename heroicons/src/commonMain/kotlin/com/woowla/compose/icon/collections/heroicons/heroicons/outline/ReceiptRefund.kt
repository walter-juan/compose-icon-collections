package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.ReceiptRefund: ImageVector
    get() {
        if (_receiptRefund != null) {
            return _receiptRefund!!
        }
        _receiptRefund = Builder(name = "ReceiptRefund", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.25f, 9.75f)
                horizontalLineTo(13.125f)
                curveTo(14.575f, 9.75f, 15.75f, 10.925f, 15.75f, 12.375f)
                curveTo(15.75f, 13.825f, 14.575f, 15.0f, 13.125f, 15.0f)
                horizontalLineTo(12.0f)
                moveTo(8.25f, 9.75f)
                lineTo(10.5f, 7.5f)
                moveTo(8.25f, 9.75f)
                lineTo(10.5f, 12.0f)
                moveTo(19.5f, 4.757f)
                verticalLineTo(21.75f)
                lineTo(15.75f, 20.25f)
                lineTo(12.0f, 21.75f)
                lineTo(8.25f, 20.25f)
                lineTo(4.5f, 21.75f)
                verticalLineTo(4.757f)
                curveTo(4.5f, 3.649f, 5.306f, 2.7f, 6.407f, 2.572f)
                curveTo(8.242f, 2.359f, 10.108f, 2.25f, 12.0f, 2.25f)
                curveTo(13.892f, 2.25f, 15.758f, 2.359f, 17.593f, 2.572f)
                curveTo(18.694f, 2.7f, 19.5f, 3.649f, 19.5f, 4.757f)
                close()
            }
        }
        .build()
        return _receiptRefund!!
    }

private var _receiptRefund: ImageVector? = null
