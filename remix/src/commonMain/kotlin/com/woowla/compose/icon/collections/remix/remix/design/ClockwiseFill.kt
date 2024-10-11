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

public val DesignGroup.ClockwiseFill: ImageVector
    get() {
        if (_clockwiseFill != null) {
            return _clockwiseFill!!
        }
        _clockwiseFill = Builder(name = "ClockwiseFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                horizontalLineTo(23.0f)
                lineTo(19.0f, 15.0f)
                lineTo(15.0f, 10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                curveTo(18.0f, 6.343f, 16.657f, 5.0f, 15.0f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0f)
                curveTo(17.761f, 3.0f, 20.0f, 5.239f, 20.0f, 8.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(13.0f, 9.0f)
                curveTo(13.552f, 9.0f, 14.0f, 9.448f, 14.0f, 10.0f)
                verticalLineTo(20.0f)
                curveTo(14.0f, 20.552f, 13.552f, 21.0f, 13.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 9.448f, 2.448f, 9.0f, 3.0f, 9.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _clockwiseFill!!
    }

private var _clockwiseFill: ImageVector? = null
