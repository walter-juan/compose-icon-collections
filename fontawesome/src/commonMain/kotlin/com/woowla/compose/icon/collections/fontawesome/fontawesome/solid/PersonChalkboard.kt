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

public val SolidGroup.PersonChalkboard: ImageVector
    get() {
        if (_personChalkboard != null) {
            return _personChalkboard!!
        }
        _personChalkboard = Builder(name = "PersonChalkboard", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 80.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 0.0f, -112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 0.0f, 112.0f)
                close()
                moveTo(176.0f, 512.0f)
                lineToRelative(0.0f, -160.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 160.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -336.0f)
                lineToRelative(128.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-16.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(192.0f, 0.0f)
                lineToRelative(0.0f, 192.0f)
                lineToRelative(-192.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(224.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -224.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(368.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-122.7f, 0.0f)
                curveToRelative(-45.6f, 0.0f, -88.5f, 21.6f, -115.6f, 58.2f)
                lineTo(14.3f, 260.9f)
                curveToRelative(-10.5f, 14.2f, -7.6f, 34.2f, 6.6f, 44.8f)
                reflectiveCurveToRelative(34.2f, 7.6f, 44.8f, -6.6f)
                lineTo(112.0f, 236.7f)
                lineTo(112.0f, 512.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _personChalkboard!!
    }

private var _personChalkboard: ImageVector? = null
