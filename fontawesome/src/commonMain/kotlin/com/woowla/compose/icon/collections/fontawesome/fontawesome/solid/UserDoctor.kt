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

public val SolidGroup.UserDoctor: ImageVector
    get() {
        if (_userDoctor != null) {
            return _userDoctor!!
        }
        _userDoctor = Builder(name = "UserDoctor", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 8.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, false, 0.0f, 240.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, false, 0.0f, -240.0f)
                close()
                moveTo(284.0f, 320.8f)
                curveToRelative(-5.4f, -0.5f, -11.0f, -0.8f, -16.6f, -0.8f)
                lineToRelative(-86.9f, 0.0f)
                curveToRelative(-5.6f, 0.0f, -11.1f, 0.3f, -16.6f, 0.8f)
                lineToRelative(0.0f, 67.5f)
                curveToRelative(16.5f, 7.6f, 28.0f, 24.3f, 28.0f, 43.6f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                reflectiveCurveToRelative(-48.0f, -21.5f, -48.0f, -48.0f)
                curveToRelative(0.0f, -19.4f, 11.5f, -36.1f, 28.0f, -43.6f)
                lineToRelative(0.0f, -58.4f)
                curveTo(61.0f, 353.0f, 16.0f, 413.6f, 16.0f, 484.6f)
                curveTo(16.0f, 499.7f, 28.3f, 512.0f, 43.4f, 512.0f)
                lineToRelative(361.1f, 0.0f)
                curveToRelative(15.1f, 0.0f, 27.4f, -12.3f, 27.4f, -27.4f)
                curveToRelative(0.0f, -71.0f, -45.0f, -131.5f, -108.0f, -154.6f)
                lineToRelative(0.0f, 37.4f)
                curveToRelative(23.3f, 8.2f, 40.0f, 30.5f, 40.0f, 56.6f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 11.0f, -9.0f, 20.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(-20.0f, -9.0f, -20.0f, -20.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -11.0f, -9.0f, -20.0f, -20.0f, -20.0f)
                reflectiveCurveToRelative(-20.0f, 9.0f, -20.0f, 20.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 11.0f, -9.0f, 20.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(-20.0f, -9.0f, -20.0f, -20.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -26.1f, 16.7f, -48.3f, 40.0f, -56.6f)
                lineToRelative(0.0f, -46.6f)
                close()
            }
        }
        .build()
        return _userDoctor!!
    }

private var _userDoctor: ImageVector? = null
