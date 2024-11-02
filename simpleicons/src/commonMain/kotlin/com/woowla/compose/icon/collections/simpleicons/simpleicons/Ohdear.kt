package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Ohdear: ImageVector
    get() {
        if (_ohdear != null) {
            return _ohdear!!
        }
        _ohdear = Builder(name = "Ohdear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.811f, 9.333f)
                curveToRelative(2.534f, 0.0f, 4.597f, 1.994f, 4.597f, 4.444f)
                curveToRelative(0.0f, 2.451f, -2.062f, 4.444f, -4.597f, 4.444f)
                curveToRelative(-2.214f, 0.0f, -4.067f, -1.521f, -4.501f, -3.54f)
                horizontalLineToRelative(-6.31f)
                verticalLineToRelative(-1.797f)
                horizontalLineToRelative(6.307f)
                curveToRelative(0.429f, -2.024f, 2.285f, -3.552f, 4.504f, -3.552f)
                close()
                moveTo(18.142f, 5.778f)
                verticalLineToRelative(3.877f)
                curveToRelative(0.601f, -0.384f, 1.333f, -0.586f, 2.139f, -0.586f)
                curveToRelative(1.716f, 0.0f, 3.719f, 1.152f, 3.719f, 4.399f)
                verticalLineToRelative(4.458f)
                horizontalLineToRelative(-1.845f)
                verticalLineToRelative(-4.458f)
                curveToRelative(0.0f, -1.023f, -0.25f, -1.756f, -0.744f, -2.179f)
                curveToRelative(-0.389f, -0.333f, -0.845f, -0.403f, -1.159f, -0.403f)
                curveToRelative(-0.963f, 0.0f, -2.11f, 0.448f, -2.11f, 2.581f)
                verticalLineToRelative(4.458f)
                horizontalLineToRelative(-1.845f)
                verticalLineToRelative(-12.148f)
                close()
                moveTo(10.811f, 11.152f)
                curveToRelative(-1.498f, 0.0f, -2.716f, 1.178f, -2.716f, 2.626f)
                reflectiveCurveToRelative(1.218f, 2.626f, 2.716f, 2.626f)
                curveToRelative(1.497f, 0.0f, 2.716f, -1.178f, 2.716f, -2.626f)
                reflectiveCurveToRelative(-1.218f, -2.626f, -2.716f, -2.626f)
                close()
            }
        }
        .build()
        return _ohdear!!
    }

private var _ohdear: ImageVector? = null
