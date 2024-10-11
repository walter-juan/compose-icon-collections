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

public val DesignGroup.Clockwise2Line: ImageVector
    get() {
        if (_clockwise2Line != null) {
            return _clockwise2Line!!
        }
        _clockwise2Line = Builder(name = "Clockwise2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.586f, 4.0f)
                lineTo(8.757f, 2.172f)
                lineTo(10.172f, 0.757f)
                lineTo(14.414f, 5.0f)
                lineTo(10.172f, 9.243f)
                lineTo(8.757f, 7.828f)
                lineTo(10.586f, 6.0f)
                horizontalLineTo(8.0f)
                curveTo(6.343f, 6.0f, 5.0f, 7.343f, 5.0f, 9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 6.239f, 5.239f, 4.0f, 8.0f, 4.0f)
                horizontalLineTo(10.586f)
                close()
                moveTo(9.0f, 11.0f)
                curveTo(9.0f, 10.448f, 9.448f, 10.0f, 10.0f, 10.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 10.0f, 21.0f, 10.448f, 21.0f, 11.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.552f, 20.552f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(9.448f, 22.0f, 9.0f, 21.552f, 9.0f, 21.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(11.0f, 12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _clockwise2Line!!
    }

private var _clockwise2Line: ImageVector? = null
