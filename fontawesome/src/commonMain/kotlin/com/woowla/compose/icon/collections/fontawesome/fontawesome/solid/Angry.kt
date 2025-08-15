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

public val SolidGroup.Angry: ImageVector
    get() {
        if (_angry != null) {
            return _angry!!
        }
        _angry = Builder(name = "Angry", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
                close()
                moveTo(256.0f, 368.0f)
                curveToRelative(24.1f, 0.0f, 45.4f, 11.8f, 58.5f, 30.0f)
                curveToRelative(7.7f, 10.8f, 22.7f, 13.2f, 33.5f, 5.5f)
                reflectiveCurveToRelative(13.2f, -22.7f, 5.5f, -33.5f)
                curveToRelative(-21.7f, -30.2f, -57.3f, -50.0f, -97.5f, -50.0f)
                reflectiveCurveToRelative(-75.7f, 19.8f, -97.5f, 50.0f)
                curveToRelative(-7.7f, 10.8f, -5.3f, 25.8f, 5.5f, 33.5f)
                reflectiveCurveToRelative(25.8f, 5.3f, 33.5f, -5.5f)
                curveToRelative(13.1f, -18.2f, 34.4f, -30.0f, 58.5f, -30.0f)
                close()
                moveTo(176.0f, 272.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -0.3f)
                lineToRelative(9.7f, 3.2f)
                curveToRelative(10.5f, 3.5f, 21.8f, -2.2f, 25.3f, -12.6f)
                reflectiveCurveToRelative(-2.2f, -21.8f, -12.6f, -25.3f)
                lineToRelative(-96.0f, -32.0f)
                curveToRelative(-10.5f, -3.5f, -21.8f, 2.2f, -25.3f, 12.6f)
                reflectiveCurveToRelative(2.2f, 21.8f, 12.6f, 25.3f)
                lineToRelative(28.9f, 9.6f)
                curveToRelative(-4.1f, 5.4f, -6.6f, 12.1f, -6.6f, 19.4f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                close()
                moveTo(368.0f, 240.0f)
                curveToRelative(0.0f, -7.3f, -2.4f, -14.0f, -6.6f, -19.4f)
                lineToRelative(28.9f, -9.6f)
                curveToRelative(10.5f, -3.5f, 16.1f, -14.8f, 12.6f, -25.3f)
                reflectiveCurveToRelative(-14.8f, -16.1f, -25.3f, -12.6f)
                lineToRelative(-96.0f, 32.0f)
                curveToRelative(-10.5f, 3.5f, -16.1f, 14.8f, -12.6f, 25.3f)
                reflectiveCurveToRelative(14.8f, 16.1f, 25.3f, 12.6f)
                lineToRelative(9.7f, -3.2f)
                lineToRelative(0.0f, 0.3f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _angry!!
    }

private var _angry: ImageVector? = null
