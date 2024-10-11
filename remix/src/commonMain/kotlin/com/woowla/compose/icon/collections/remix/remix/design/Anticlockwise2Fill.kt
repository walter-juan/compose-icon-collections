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

public val DesignGroup.Anticlockwise2Fill: ImageVector
    get() {
        if (_anticlockwise2Fill != null) {
            return _anticlockwise2Fill!!
        }
        _anticlockwise2Fill = Builder(name = "Anticlockwise2Fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                horizontalLineTo(16.0f)
                curveTo(18.761f, 4.0f, 21.0f, 6.239f, 21.0f, 9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                curveTo(19.0f, 7.343f, 17.657f, 6.0f, 16.0f, 6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                lineTo(9.0f, 5.0f)
                lineTo(14.0f, 1.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(15.0f, 11.0f)
                verticalLineTo(21.0f)
                curveTo(15.0f, 21.552f, 14.552f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 22.0f, 3.0f, 21.552f, 3.0f, 21.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 10.448f, 3.448f, 10.0f, 4.0f, 10.0f)
                horizontalLineTo(14.0f)
                curveTo(14.552f, 10.0f, 15.0f, 10.448f, 15.0f, 11.0f)
                close()
            }
        }
        .build()
        return _anticlockwise2Fill!!
    }

private var _anticlockwise2Fill: ImageVector? = null
