package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Flower2: ImageVector
    get() {
        if (_flower2 != null) {
            return _flower2!!
        }
        _flower2 = Builder(name = "Flower2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                moveToRelative(3.0f, -12.0f)
                quadToRelative(0.0f, 0.11f, -0.03f, 0.247f)
                curveToRelative(-0.544f, 0.241f, -1.091f, 0.638f, -1.598f, 1.084f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 5.0f)
                curveToRelative(-0.494f, 0.0f, -0.96f, 0.12f, -1.372f, 0.331f)
                curveToRelative(-0.507f, -0.446f, -1.054f, -0.843f, -1.597f, -1.084f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                moveToRelative(-0.812f, 6.052f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.812f, -2.052f)
                curveToRelative(0.215f, -0.18f, 0.432f, -0.346f, 0.647f, -0.487f)
                curveTo(11.34f, 5.131f, 11.732f, 5.0f, 12.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                curveToRelative(-0.268f, 0.0f, -0.66f, -0.13f, -1.165f, -0.461f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.647f, -0.487f)
                moveToRelative(-3.56f, 0.617f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.744f, 0.0f)
                curveToRelative(0.507f, 0.446f, 1.054f, 0.842f, 1.598f, 1.084f)
                quadToRelative(0.03f, 0.137f, 0.03f, 0.247f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                quadToRelative(0.0f, -0.11f, 0.03f, -0.247f)
                curveToRelative(0.544f, -0.242f, 1.091f, -0.638f, 1.598f, -1.084f)
                moveToRelative(-0.816f, -4.721f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.0f, 8.0f)
                curveToRelative(0.0f, 0.794f, 0.308f, 1.516f, 0.812f, 2.052f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.647f, 0.487f)
                curveTo(4.66f, 10.869f, 4.268f, 11.0f, 4.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                curveToRelative(0.268f, 0.0f, 0.66f, 0.13f, 1.165f, 0.461f)
                curveToRelative(0.215f, 0.141f, 0.432f, 0.306f, 0.647f, 0.487f)
                moveTo(8.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
            }
        }
        .build()
        return _flower2!!
    }

private var _flower2: ImageVector? = null
