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

public val OthersGroup.BoxingLine: ImageVector
    get() {
        if (_boxingLine != null) {
            return _boxingLine!!
        }
        _boxingLine = Builder(name = "BoxingLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 2.0f)
                curveTo(19.538f, 2.0f, 22.0f, 4.462f, 22.0f, 7.5f)
                verticalLineTo(10.0f)
                curveTo(22.0f, 10.888f, 21.614f, 11.686f, 21.001f, 12.235f)
                lineTo(21.0f, 17.0f)
                curveTo(21.0f, 18.306f, 20.166f, 19.417f, 19.001f, 19.829f)
                lineTo(19.0f, 21.0f)
                curveTo(19.0f, 21.552f, 18.552f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 22.0f, 5.0f, 21.552f, 5.0f, 21.0f)
                lineTo(5.0f, 19.829f)
                curveTo(3.835f, 19.417f, 3.0f, 18.306f, 3.0f, 17.0f)
                verticalLineTo(6.0f)
                curveTo(3.0f, 3.791f, 4.791f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(16.5f)
                close()
                moveTo(9.5f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                curveTo(5.0f, 17.513f, 5.386f, 17.935f, 5.883f, 17.993f)
                lineTo(6.0f, 18.0f)
                horizontalLineTo(18.0f)
                curveTo(18.513f, 18.0f, 18.935f, 17.614f, 18.993f, 17.117f)
                lineTo(19.0f, 17.0f)
                verticalLineTo(13.0f)
                lineTo(12.964f, 13.001f)
                curveTo(12.721f, 14.697f, 11.263f, 16.0f, 9.5f, 16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.5f)
                curveTo(10.28f, 14.0f, 10.92f, 13.405f, 10.993f, 12.644f)
                lineTo(11.0f, 12.5f)
                curveTo(11.0f, 11.72f, 10.405f, 11.08f, 9.644f, 11.007f)
                lineTo(9.5f, 11.0f)
                close()
                moveTo(16.5f, 4.0f)
                horizontalLineTo(7.0f)
                curveTo(5.946f, 4.0f, 5.082f, 4.816f, 5.005f, 5.851f)
                lineTo(5.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.5f)
                curveTo(10.896f, 9.0f, 12.101f, 9.818f, 12.663f, 11.0f)
                horizontalLineTo(19.0f)
                curveTo(19.513f, 11.0f, 19.935f, 10.614f, 19.993f, 10.117f)
                lineTo(20.0f, 10.0f)
                verticalLineTo(7.5f)
                curveTo(20.0f, 5.631f, 18.536f, 4.105f, 16.692f, 4.005f)
                lineTo(16.5f, 4.0f)
                close()
            }
        }
        .build()
        return _boxingLine!!
    }

private var _boxingLine: ImageVector? = null
