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

public val DesignGroup.AnticlockwiseLine: ImageVector
    get() {
        if (_anticlockwiseLine != null) {
            return _anticlockwiseLine!!
        }
        _anticlockwiseLine = Builder(name = "AnticlockwiseLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 9.0f, 22.0f, 9.448f, 22.0f, 10.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(11.0f)
                curveTo(10.448f, 21.0f, 10.0f, 20.552f, 10.0f, 20.0f)
                verticalLineTo(10.0f)
                curveTo(10.0f, 9.448f, 10.448f, 9.0f, 11.0f, 9.0f)
                close()
                moveTo(12.0f, 11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(6.0f, 10.586f)
                lineTo(7.828f, 8.757f)
                lineTo(9.243f, 10.172f)
                lineTo(5.0f, 14.414f)
                lineTo(0.757f, 10.172f)
                lineTo(2.172f, 8.757f)
                lineTo(4.0f, 10.586f)
                verticalLineTo(8.0f)
                curveTo(4.0f, 5.239f, 6.239f, 3.0f, 9.0f, 3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                curveTo(7.343f, 5.0f, 6.0f, 6.343f, 6.0f, 8.0f)
                verticalLineTo(10.586f)
                close()
            }
        }
        .build()
        return _anticlockwiseLine!!
    }

private var _anticlockwiseLine: ImageVector? = null
