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

public val SolidGroup.EyeDropper: ImageVector
    get() {
        if (_eyeDropper != null) {
            return _eyeDropper!!
        }
        _eyeDropper = Builder(name = "EyeDropper", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(341.6f, 29.2f)
                lineToRelative(-101.6f, 101.6f)
                lineToRelative(-9.4f, -9.4f)
                curveToRelative(-12.5f, -12.5f, -32.8f, -12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(160.0f, 160.0f)
                curveToRelative(12.5f, 12.5f, 32.8f, 12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(-9.4f, -9.4f)
                lineToRelative(101.6f, -101.6f)
                curveToRelative(39.0f, -39.0f, 39.0f, -102.2f, 0.0f, -141.1f)
                reflectiveCurveToRelative(-102.2f, -39.0f, -141.1f, 0.0f)
                close()
                moveTo(55.4f, 323.3f)
                curveToRelative(-15.0f, 15.0f, -23.4f, 35.4f, -23.4f, 56.6f)
                lineToRelative(0.0f, 42.4f)
                lineToRelative(-26.6f, 39.9f)
                curveToRelative(-8.5f, 12.7f, -6.8f, 29.6f, 4.0f, 40.4f)
                reflectiveCurveToRelative(27.7f, 12.5f, 40.4f, 4.0f)
                lineToRelative(39.9f, -26.6f)
                lineToRelative(42.4f, 0.0f)
                curveToRelative(21.2f, 0.0f, 41.6f, -8.4f, 56.6f, -23.4f)
                lineToRelative(109.4f, -109.4f)
                lineToRelative(-45.3f, -45.3f)
                lineToRelative(-109.4f, 109.4f)
                curveToRelative(-3.0f, 3.0f, -7.1f, 4.7f, -11.3f, 4.7f)
                lineToRelative(-36.1f, 0.0f)
                lineToRelative(0.0f, -36.1f)
                curveToRelative(0.0f, -4.2f, 1.7f, -8.3f, 4.7f, -11.3f)
                lineToRelative(109.4f, -109.4f)
                lineToRelative(-45.3f, -45.3f)
                lineToRelative(-109.4f, 109.4f)
                close()
            }
        }
        .build()
        return _eyeDropper!!
    }

private var _eyeDropper: ImageVector? = null
