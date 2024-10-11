package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.CandleFill: ImageVector
    get() {
        if (_candleFill != null) {
            return _candleFill!!
        }
        _candleFill = Builder(name = "CandleFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.172f, 9.331f)
                curveTo(7.609f, 7.769f, 7.609f, 5.237f, 9.172f, 3.675f)
                lineTo(12.0f, 0.846f)
                lineTo(14.828f, 3.675f)
                curveTo(16.39f, 5.237f, 16.39f, 7.769f, 14.828f, 9.331f)
                curveTo(14.304f, 9.856f, 13.67f, 10.204f, 13.0f, 10.377f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 12.0f, 19.0f, 12.448f, 19.0f, 13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                curveTo(5.0f, 12.448f, 5.448f, 12.0f, 6.0f, 12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.377f)
                curveTo(10.33f, 10.204f, 9.696f, 9.856f, 9.172f, 9.331f)
                close()
                moveTo(10.586f, 5.089f)
                curveTo(9.805f, 5.87f, 9.805f, 7.136f, 10.586f, 7.917f)
                curveTo(11.367f, 8.698f, 12.633f, 8.698f, 13.414f, 7.917f)
                curveTo(14.195f, 7.136f, 14.195f, 5.87f, 13.414f, 5.089f)
                lineTo(12.0f, 3.675f)
                lineTo(10.586f, 5.089f)
                close()
            }
        }
        .build()
        return _candleFill!!
    }

private var _candleFill: ImageVector? = null
