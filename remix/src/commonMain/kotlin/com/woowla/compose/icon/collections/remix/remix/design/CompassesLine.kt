package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.CompassesLine: ImageVector
    get() {
        if (_compassesLine != null) {
            return _compassesLine!!
        }
        _compassesLine = Builder(name = "CompassesLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.123f)
                verticalLineTo(1.997f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.123f)
                curveTo(14.725f, 4.567f, 16.0f, 6.133f, 16.0f, 7.997f)
                curveTo(16.0f, 9.114f, 15.541f, 10.125f, 14.802f, 10.851f)
                lineTo(20.866f, 21.353f)
                lineTo(19.134f, 22.353f)
                lineTo(13.071f, 11.852f)
                curveTo(12.73f, 11.946f, 12.371f, 11.997f, 12.0f, 11.997f)
                curveTo(11.629f, 11.997f, 11.27f, 11.946f, 10.929f, 11.852f)
                lineTo(4.866f, 22.353f)
                lineTo(3.134f, 21.353f)
                lineTo(9.197f, 10.851f)
                curveTo(8.458f, 10.125f, 8.0f, 9.114f, 8.0f, 7.997f)
                curveTo(8.0f, 6.133f, 9.275f, 4.567f, 11.0f, 4.123f)
                close()
                moveTo(12.0f, 9.997f)
                curveTo(13.104f, 9.997f, 14.0f, 9.101f, 14.0f, 7.997f)
                curveTo(14.0f, 6.892f, 13.104f, 5.997f, 12.0f, 5.997f)
                curveTo(10.895f, 5.997f, 10.0f, 6.892f, 10.0f, 7.997f)
                curveTo(10.0f, 9.101f, 10.895f, 9.997f, 12.0f, 9.997f)
                close()
            }
        }
        .build()
        return _compassesLine!!
    }

private var _compassesLine: ImageVector? = null
