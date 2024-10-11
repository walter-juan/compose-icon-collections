package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.DirectionFill: ImageVector
    get() {
        if (_directionFill != null) {
            return _directionFill!!
        }
        _directionFill = Builder(name = "DirectionFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 10.0f)
                curveTo(8.448f, 10.0f, 8.0f, 10.448f, 8.0f, 11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.5f)
                lineTo(16.5f, 11.0f)
                lineTo(13.0f, 7.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(12.707f, 1.393f)
                lineTo(22.607f, 11.293f)
                curveTo(22.997f, 11.684f, 22.997f, 12.317f, 22.607f, 12.707f)
                lineTo(12.707f, 22.607f)
                curveTo(12.317f, 22.997f, 11.684f, 22.997f, 11.293f, 22.607f)
                lineTo(1.393f, 12.707f)
                curveTo(1.003f, 12.317f, 1.003f, 11.684f, 1.393f, 11.293f)
                lineTo(11.293f, 1.393f)
                curveTo(11.684f, 1.003f, 12.317f, 1.003f, 12.707f, 1.393f)
                close()
            }
        }
        .build()
        return _directionFill!!
    }

private var _directionFill: ImageVector? = null
