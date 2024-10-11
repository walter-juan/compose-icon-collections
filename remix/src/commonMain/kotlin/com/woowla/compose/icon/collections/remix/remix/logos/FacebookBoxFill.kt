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

public val LogosGroup.FacebookBoxFill: ImageVector
    get() {
        if (_facebookBoxFill != null) {
            return _facebookBoxFill!!
        }
        _facebookBoxFill = Builder(name = "FacebookBoxFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.402f, 21.0f)
                verticalLineTo(14.034f)
                horizontalLineTo(17.735f)
                lineTo(18.084f, 11.326f)
                horizontalLineTo(15.402f)
                verticalLineTo(9.598f)
                curveTo(15.402f, 8.814f, 15.62f, 8.279f, 16.744f, 8.279f)
                lineTo(18.178f, 8.279f)
                verticalLineTo(5.857f)
                curveTo(17.93f, 5.824f, 17.079f, 5.75f, 16.089f, 5.75f)
                curveTo(14.021f, 5.75f, 12.606f, 7.012f, 12.606f, 9.33f)
                verticalLineTo(11.326f)
                horizontalLineTo(10.268f)
                verticalLineTo(14.034f)
                horizontalLineTo(12.606f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 3.0f, 21.0f, 3.448f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(15.402f)
                close()
            }
        }
        .build()
        return _facebookBoxFill!!
    }

private var _facebookBoxFill: ImageVector? = null
