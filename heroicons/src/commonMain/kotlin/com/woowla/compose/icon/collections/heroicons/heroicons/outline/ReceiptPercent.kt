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

public val OutlineGroup.ReceiptPercent: ImageVector
    get() {
        if (_receiptPercent != null) {
            return _receiptPercent!!
        }
        _receiptPercent = Builder(name = "ReceiptPercent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 14.25f)
                lineTo(15.0f, 8.25f)
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
                moveTo(9.75f, 9.0f)
                horizontalLineTo(9.757f)
                verticalLineTo(9.007f)
                horizontalLineTo(9.75f)
                verticalLineTo(9.0f)
                close()
                moveTo(10.125f, 9.0f)
                curveTo(10.125f, 9.207f, 9.957f, 9.375f, 9.75f, 9.375f)
                curveTo(9.543f, 9.375f, 9.375f, 9.207f, 9.375f, 9.0f)
                curveTo(9.375f, 8.793f, 9.543f, 8.625f, 9.75f, 8.625f)
                curveTo(9.957f, 8.625f, 10.125f, 8.793f, 10.125f, 9.0f)
                close()
                moveTo(14.25f, 13.5f)
                horizontalLineTo(14.257f)
                verticalLineTo(13.507f)
                horizontalLineTo(14.25f)
                verticalLineTo(13.5f)
                close()
                moveTo(14.625f, 13.5f)
                curveTo(14.625f, 13.707f, 14.457f, 13.875f, 14.25f, 13.875f)
                curveTo(14.043f, 13.875f, 13.875f, 13.707f, 13.875f, 13.5f)
                curveTo(13.875f, 13.293f, 14.043f, 13.125f, 14.25f, 13.125f)
                curveTo(14.457f, 13.125f, 14.625f, 13.293f, 14.625f, 13.5f)
                close()
            }
        }
        .build()
        return _receiptPercent!!
    }

private var _receiptPercent: ImageVector? = null
