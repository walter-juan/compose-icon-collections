package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.StackOverflowLine: ImageVector
    get() {
        if (_stackOverflowLine != null) {
            return _stackOverflowLine!!
        }
        _stackOverflowLine = Builder(name = "StackOverflowLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.001f, 20.003f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.001f)
                verticalLineTo(22.003f)
                horizontalLineTo(4.001f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.001f)
                verticalLineTo(20.003f)
                horizontalLineTo(18.001f)
                close()
                moveTo(7.501f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.501f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.501f)
                close()
                moveTo(7.578f, 13.62f)
                lineTo(7.925f, 11.65f)
                lineTo(16.789f, 13.213f)
                lineTo(16.441f, 15.182f)
                lineTo(7.578f, 13.62f)
                close()
                moveTo(9.212f, 8.116f)
                lineTo(10.212f, 6.384f)
                lineTo(18.006f, 10.884f)
                lineTo(17.006f, 12.616f)
                lineTo(9.212f, 8.116f)
                close()
                moveTo(12.629f, 3.503f)
                lineTo(14.161f, 2.218f)
                lineTo(19.946f, 9.112f)
                lineTo(18.414f, 10.398f)
                lineTo(12.629f, 3.503f)
                close()
            }
        }
        .build()
        return _stackOverflowLine!!
    }

private var _stackOverflowLine: ImageVector? = null
