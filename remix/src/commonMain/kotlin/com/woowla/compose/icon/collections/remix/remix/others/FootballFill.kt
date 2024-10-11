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

public val OthersGroup.FootballFill: ImageVector
    get() {
        if (_footballFill != null) {
            return _footballFill!!
        }
        _footballFill = Builder(name = "FootballFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.67f, 16.0f)
                horizontalLineTo(10.33f)
                lineTo(8.951f, 17.897f)
                lineTo(9.504f, 19.603f)
                curveTo(10.29f, 19.861f, 11.129f, 20.0f, 12.0f, 20.0f)
                curveTo(12.871f, 20.0f, 13.71f, 19.861f, 14.496f, 19.603f)
                lineTo(15.049f, 17.897f)
                lineTo(13.67f, 16.0f)
                close()
                moveTo(5.294f, 10.872f)
                lineTo(4.002f, 11.809f)
                lineTo(4.0f, 12.0f)
                curveTo(4.0f, 13.73f, 4.549f, 15.331f, 5.482f, 16.64f)
                lineTo(7.393f, 16.64f)
                lineTo(8.715f, 14.82f)
                lineTo(7.687f, 11.65f)
                lineTo(5.294f, 10.872f)
                close()
                moveTo(18.705f, 10.872f)
                lineTo(16.313f, 11.65f)
                lineTo(15.285f, 14.82f)
                lineTo(16.607f, 16.64f)
                lineTo(18.518f, 16.64f)
                curveTo(19.451f, 15.331f, 20.0f, 13.73f, 20.0f, 12.0f)
                lineTo(19.997f, 11.809f)
                lineTo(18.705f, 10.872f)
                close()
                moveTo(14.291f, 4.333f)
                lineTo(13.0f, 5.273f)
                verticalLineTo(7.79f)
                lineTo(15.693f, 9.747f)
                lineTo(17.933f, 9.02f)
                lineTo(18.487f, 7.317f)
                curveTo(17.467f, 5.907f, 15.999f, 4.843f, 14.291f, 4.333f)
                close()
                moveTo(9.709f, 4.333f)
                curveTo(8.001f, 4.843f, 6.532f, 5.907f, 5.513f, 7.318f)
                lineTo(6.067f, 9.02f)
                lineTo(8.306f, 9.747f)
                lineTo(11.0f, 7.79f)
                verticalLineTo(5.273f)
                lineTo(9.709f, 4.333f)
                close()
            }
        }
        .build()
        return _footballFill!!
    }

private var _footballFill: ImageVector? = null
