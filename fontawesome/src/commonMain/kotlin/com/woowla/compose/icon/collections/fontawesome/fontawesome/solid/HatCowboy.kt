package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.HatCowboy: ImageVector
    get() {
        if (_hatCowboy != null) {
            return _hatCowboy!!
        }
        _hatCowboy = Builder(name = "HatCowboy", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(182.2f, 76.1f)
                lineTo(130.8f, 307.5f)
                curveTo(145.5f, 324.9f, 167.4f, 336.0f, 192.0f, 336.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(24.6f, 0.0f, 46.5f, -11.1f, 61.2f, -28.5f)
                lineTo(457.8f, 76.1f)
                curveToRelative(-5.7f, -25.8f, -28.6f, -44.1f, -55.0f, -44.1f)
                curveToRelative(-12.2f, 0.0f, -24.1f, 4.0f, -33.8f, 11.3f)
                lineToRelative(-4.7f, 3.5f)
                curveToRelative(-26.3f, 19.7f, -62.4f, 19.7f, -88.6f, 0.0f)
                lineTo(271.0f, 43.3f)
                curveToRelative(-9.8f, -7.3f, -21.6f, -11.3f, -33.8f, -11.3f)
                curveToRelative(-26.4f, 0.0f, -49.3f, 18.3f, -55.0f, 44.1f)
                close()
                moveTo(64.0f, 256.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveTo(0.0f, 238.3f, 0.0f, 256.0f)
                curveTo(0.0f, 362.0f, 86.0f, 448.0f, 192.0f, 448.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(106.0f, 0.0f, 192.0f, -86.0f, 192.0f, -192.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                curveToRelative(0.0f, 70.7f, -57.3f, 128.0f, -128.0f, 128.0f)
                lineToRelative(-256.0f, 0.0f)
                curveToRelative(-70.7f, 0.0f, -128.0f, -57.3f, -128.0f, -128.0f)
                close()
            }
        }
        .build()
        return _hatCowboy!!
    }

private var _hatCowboy: ImageVector? = null
