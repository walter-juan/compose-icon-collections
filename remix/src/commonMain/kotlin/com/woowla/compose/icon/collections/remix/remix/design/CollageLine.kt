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

public val DesignGroup.CollageLine: ImageVector
    get() {
        if (_collageLine != null) {
            return _collageLine!!
        }
        _collageLine = Builder(name = "CollageLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.107f)
                curveTo(20.552f, 3.107f, 21.0f, 3.554f, 21.0f, 4.107f)
                verticalLineTo(20.107f)
                curveTo(21.0f, 20.659f, 20.552f, 21.107f, 20.0f, 21.107f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.107f, 3.0f, 20.659f, 3.0f, 20.107f)
                verticalLineTo(4.107f)
                curveTo(3.0f, 3.554f, 3.448f, 3.107f, 4.0f, 3.107f)
                horizontalLineTo(20.0f)
                close()
                moveTo(11.189f, 13.265f)
                lineTo(5.0f, 14.356f)
                verticalLineTo(19.107f)
                horizontalLineTo(12.218f)
                lineTo(11.189f, 13.265f)
                close()
                moveTo(19.0f, 5.107f)
                horizontalLineTo(11.781f)
                lineTo(14.249f, 19.107f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.107f)
                close()
                moveTo(9.75f, 5.107f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.325f)
                lineTo(10.842f, 11.295f)
                lineTo(9.75f, 5.107f)
                close()
            }
        }
        .build()
        return _collageLine!!
    }

private var _collageLine: ImageVector? = null
