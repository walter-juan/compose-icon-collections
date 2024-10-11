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

public val DesignGroup.Compasses2Fill: ImageVector
    get() {
        if (_compasses2Fill != null) {
            return _compasses2Fill!!
        }
        _compasses2Fill = Builder(name = "Compasses2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.33f, 13.497f)
                curveTo(17.956f, 12.215f, 19.0f, 10.228f, 19.0f, 7.997f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 10.969f, 19.559f, 13.604f, 17.338f, 15.243f)
                lineTo(19.866f, 19.621f)
                curveTo(20.418f, 20.578f, 20.091f, 21.801f, 19.134f, 22.353f)
                lineTo(15.607f, 16.245f)
                curveTo(14.503f, 16.728f, 13.283f, 16.997f, 12.0f, 16.997f)
                curveTo(10.717f, 16.997f, 9.497f, 16.728f, 8.393f, 16.245f)
                lineTo(4.866f, 22.353f)
                curveTo(3.909f, 21.801f, 3.582f, 20.578f, 4.134f, 19.621f)
                lineTo(9.198f, 10.851f)
                curveTo(8.458f, 10.125f, 8.0f, 9.114f, 8.0f, 7.997f)
                curveTo(8.0f, 6.133f, 9.275f, 4.567f, 11.0f, 4.123f)
                verticalLineTo(1.997f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.123f)
                curveTo(14.725f, 4.567f, 16.0f, 6.133f, 16.0f, 7.997f)
                curveTo(16.0f, 9.114f, 15.542f, 10.125f, 14.802f, 10.851f)
                lineTo(16.33f, 13.497f)
                close()
                moveTo(14.599f, 14.498f)
                lineTo(13.071f, 11.852f)
                curveTo(12.73f, 11.946f, 12.371f, 11.997f, 12.0f, 11.997f)
                curveTo(11.629f, 11.997f, 11.27f, 11.946f, 10.929f, 11.852f)
                lineTo(9.401f, 14.498f)
                curveTo(10.205f, 14.82f, 11.082f, 14.997f, 12.0f, 14.997f)
                curveTo(12.918f, 14.997f, 13.795f, 14.82f, 14.599f, 14.498f)
                close()
                moveTo(12.0f, 8.997f)
                curveTo(12.552f, 8.997f, 13.0f, 8.549f, 13.0f, 7.997f)
                curveTo(13.0f, 7.444f, 12.552f, 6.997f, 12.0f, 6.997f)
                curveTo(11.448f, 6.997f, 11.0f, 7.444f, 11.0f, 7.997f)
                curveTo(11.0f, 8.549f, 11.448f, 8.997f, 12.0f, 8.997f)
                close()
            }
        }
        .build()
        return _compasses2Fill!!
    }

private var _compasses2Fill: ImageVector? = null
