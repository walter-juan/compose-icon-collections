package com.woowla.compose.icon.collections.remix.remix.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DocumentGroup

public val DocumentGroup.ReceiptFill: ImageVector
    get() {
        if (_receiptFill != null) {
            return _receiptFill!!
        }
        _receiptFill = Builder(name = "ReceiptFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                lineTo(6.0f, 2.0f)
                lineTo(3.0f, 4.0f)
                verticalLineTo(16.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.657f, 4.343f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.657f, 22.0f, 23.0f, 20.657f, 23.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                curveTo(7.0f, 19.552f, 6.552f, 20.0f, 6.0f, 20.0f)
                curveTo(5.448f, 20.0f, 5.0f, 19.552f, 5.0f, 19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                lineTo(18.0f, 2.0f)
                lineTo(15.0f, 4.0f)
                lineTo(12.0f, 2.0f)
                lineTo(9.0f, 4.0f)
                close()
            }
        }
        .build()
        return _receiptFill!!
    }

private var _receiptFill: ImageVector? = null
