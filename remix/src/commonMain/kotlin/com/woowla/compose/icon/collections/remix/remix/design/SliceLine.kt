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

public val DesignGroup.SliceLine: ImageVector
    get() {
        if (_sliceLine != null) {
            return _sliceLine!!
        }
        _sliceLine = Builder(name = "SliceLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.691f, 12.915f)
                lineTo(17.459f, 14.682f)
                curveTo(11.448f, 20.693f, 6.498f, 20.693f, 2.256f, 19.279f)
                lineTo(17.812f, 3.722f)
                lineTo(21.348f, 7.258f)
                lineTo(15.691f, 12.915f)
                close()
                moveTo(12.863f, 12.915f)
                lineTo(18.519f, 7.258f)
                lineTo(17.812f, 6.551f)
                lineTo(6.314f, 18.048f)
                curveTo(9.046f, 18.156f, 11.672f, 17.142f, 14.581f, 14.633f)
                lineTo(12.863f, 12.915f)
                close()
            }
        }
        .build()
        return _sliceLine!!
    }

private var _sliceLine: ImageVector? = null
