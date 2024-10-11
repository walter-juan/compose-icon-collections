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

public val DocumentGroup.ReceiptLine: ImageVector
    get() {
        if (_receiptLine != null) {
            return _receiptLine!!
        }
        _receiptLine = Builder(name = "ReceiptLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                lineTo(6.0f, 2.0f)
                lineTo(3.0f, 4.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.657f, 4.343f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.657f, 22.0f, 23.0f, 20.657f, 23.0f, 19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                lineTo(18.0f, 2.0f)
                lineTo(15.0f, 4.0f)
                lineTo(12.0f, 2.0f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(19.0f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                curveTo(7.0f, 19.552f, 6.552f, 20.0f, 6.0f, 20.0f)
                curveTo(5.448f, 20.0f, 5.0f, 19.552f, 5.0f, 19.0f)
                verticalLineTo(5.07f)
                lineTo(6.0f, 4.404f)
                lineTo(9.0f, 6.404f)
                lineTo(12.0f, 4.404f)
                lineTo(15.0f, 6.404f)
                lineTo(18.0f, 4.404f)
                lineTo(19.0f, 5.07f)
                verticalLineTo(16.0f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineTo(8.829f)
                curveTo(8.94f, 19.687f, 9.0f, 19.351f, 9.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 19.552f, 20.552f, 20.0f, 20.0f, 20.0f)
                close()
            }
        }
        .build()
        return _receiptLine!!
    }

private var _receiptLine: ImageVector? = null
