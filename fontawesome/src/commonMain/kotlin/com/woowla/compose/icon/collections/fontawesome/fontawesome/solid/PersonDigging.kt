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

public val SolidGroup.PersonDigging: ImageVector
    get() {
        if (_personDigging != null) {
            return _personDigging!!
        }
        _personDigging = Builder(name = "PersonDigging", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -112.0f, 0.0f)
                close()
                moveTo(10.5f, 181.3f)
                curveToRelative(5.9f, -11.9f, 20.3f, -16.7f, 32.2f, -10.7f)
                lineToRelative(24.6f, 12.3f)
                lineToRelative(12.2f, -20.4f)
                curveToRelative(18.9f, -31.5f, 53.2f, -50.5f, 89.6f, -50.5f)
                curveToRelative(46.2f, 0.0f, 87.7f, 30.5f, 100.5f, 75.4f)
                lineToRelative(32.2f, 112.7f)
                lineToRelative(92.9f, 46.4f)
                lineToRelative(25.8f, -43.0f)
                curveToRelative(5.8f, -9.6f, 16.2f, -15.5f, 27.4f, -15.5f)
                reflectiveCurveToRelative(21.7f, 5.9f, 27.4f, 15.5f)
                lineToRelative(96.0f, 160.0f)
                curveToRelative(5.9f, 9.9f, 6.1f, 22.2f, 0.4f, 32.2f)
                reflectiveCurveTo(555.5f, 512.0f, 544.0f, 512.0f)
                lineToRelative(-192.0f, 0.0f)
                curveToRelative(-11.5f, 0.0f, -22.2f, -6.2f, -27.8f, -16.2f)
                reflectiveCurveToRelative(-5.5f, -22.3f, 0.4f, -32.2f)
                lineTo(370.0f, 387.8f)
                lineTo(21.3f, 213.5f)
                curveToRelative(-11.9f, -5.9f, -16.7f, -20.3f, -10.7f, -32.2f)
                close()
                moveTo(94.3f, 307.4f)
                lineToRelative(112.0f, 56.0f)
                curveToRelative(10.8f, 5.4f, 17.7f, 16.5f, 17.7f, 28.6f)
                lineToRelative(0.0f, 88.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -68.2f)
                lineToRelative(-61.3f, -30.7f)
                lineToRelative(-36.3f, 109.0f)
                curveToRelative(-5.6f, 16.8f, -23.7f, 25.8f, -40.5f, 20.2f)
                reflectiveCurveTo(-3.9f, 486.6f, 1.7f, 469.9f)
                lineToRelative(48.0f, -144.0f)
                curveToRelative(2.9f, -8.8f, 9.5f, -15.9f, 18.1f, -19.4f)
                reflectiveCurveToRelative(18.3f, -3.2f, 26.6f, 0.9f)
                close()
            }
        }
        .build()
        return _personDigging!!
    }

private var _personDigging: ImageVector? = null
