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

public val SolidGroup.Cogs: ImageVector
    get() {
        if (_cogs != null) {
            return _cogs!!
        }
        _cogs = Builder(name = "Cogs", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(415.9f, 210.5f)
                curveToRelative(12.2f, -3.3f, 25.0f, 2.5f, 30.5f, 13.8f)
                lineTo(465.0f, 261.9f)
                curveToRelative(10.3f, 1.4f, 20.4f, 4.2f, 29.9f, 8.1f)
                lineToRelative(35.0f, -23.3f)
                curveToRelative(10.5f, -7.0f, 24.4f, -5.6f, 33.3f, 3.3f)
                lineToRelative(19.2f, 19.2f)
                curveToRelative(8.9f, 8.9f, 10.3f, 22.9f, 3.3f, 33.3f)
                lineToRelative(-23.3f, 34.9f)
                curveToRelative(1.9f, 4.7f, 3.6f, 9.6f, 5.0f, 14.7f)
                curveToRelative(1.4f, 5.1f, 2.3f, 10.1f, 3.0f, 15.2f)
                lineToRelative(37.7f, 18.6f)
                curveToRelative(11.3f, 5.6f, 17.1f, 18.4f, 13.8f, 30.5f)
                lineToRelative(-7.0f, 26.2f)
                curveToRelative(-3.3f, 12.1f, -14.6f, 20.3f, -27.2f, 19.5f)
                lineToRelative(-42.0f, -2.7f)
                curveToRelative(-6.3f, 8.1f, -13.6f, 15.6f, -21.9f, 22.0f)
                lineToRelative(2.7f, 41.9f)
                curveToRelative(0.8f, 12.6f, -7.4f, 24.0f, -19.5f, 27.2f)
                lineToRelative(-26.2f, 7.0f)
                curveToRelative(-12.2f, 3.3f, -24.9f, -2.5f, -30.5f, -13.8f)
                lineToRelative(-18.6f, -37.6f)
                curveToRelative(-10.3f, -1.4f, -20.4f, -4.2f, -29.9f, -8.1f)
                lineToRelative(-35.0f, 23.3f)
                curveToRelative(-10.5f, 7.0f, -24.4f, 5.6f, -33.3f, -3.3f)
                lineToRelative(-19.2f, -19.2f)
                curveToRelative(-8.9f, -8.9f, -10.3f, -22.8f, -3.3f, -33.3f)
                lineToRelative(23.3f, -35.0f)
                curveToRelative(-1.9f, -4.7f, -3.6f, -9.6f, -5.0f, -14.7f)
                reflectiveCurveToRelative(-2.3f, -10.2f, -3.0f, -15.2f)
                lineToRelative(-37.7f, -18.6f)
                curveToRelative(-11.3f, -5.6f, -17.0f, -18.4f, -13.8f, -30.5f)
                lineToRelative(7.0f, -26.2f)
                curveToRelative(3.3f, -12.1f, 14.6f, -20.3f, 27.2f, -19.5f)
                lineToRelative(41.9f, 2.7f)
                curveToRelative(6.3f, -8.1f, 13.6f, -15.6f, 21.9f, -22.0f)
                lineToRelative(-2.7f, -41.8f)
                curveToRelative(-0.8f, -12.6f, 7.4f, -24.0f, 19.5f, -27.2f)
                lineToRelative(26.2f, -7.0f)
                close()
                moveTo(448.4f, 340.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 0.1f, 88.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -0.1f, -88.0f)
                close()
                moveTo(224.9f, -45.5f)
                lineToRelative(26.2f, 7.0f)
                curveToRelative(12.1f, 3.3f, 20.3f, 14.7f, 19.5f, 27.2f)
                lineToRelative(-2.7f, 41.8f)
                curveToRelative(8.3f, 6.4f, 15.6f, 13.8f, 21.9f, 22.0f)
                lineToRelative(42.0f, -2.7f)
                curveToRelative(12.5f, -0.8f, 23.9f, 7.4f, 27.2f, 19.5f)
                lineToRelative(7.0f, 26.2f)
                curveToRelative(3.2f, 12.1f, -2.5f, 24.9f, -13.8f, 30.5f)
                lineToRelative(-37.7f, 18.6f)
                curveToRelative(-0.7f, 5.1f, -1.7f, 10.2f, -3.0f, 15.2f)
                reflectiveCurveToRelative(-3.1f, 10.0f, -5.0f, 14.7f)
                lineToRelative(23.3f, 35.0f)
                curveToRelative(7.0f, 10.5f, 5.6f, 24.4f, -3.3f, 33.3f)
                lineTo(307.3f, 262.0f)
                curveToRelative(-8.9f, 8.9f, -22.8f, 10.3f, -33.3f, 3.3f)
                lineTo(239.0f, 242.0f)
                curveToRelative(-9.5f, 3.9f, -19.6f, 6.7f, -29.9f, 8.1f)
                lineToRelative(-18.6f, 37.6f)
                curveToRelative(-5.6f, 11.3f, -18.4f, 17.0f, -30.5f, 13.8f)
                lineToRelative(-26.2f, -7.0f)
                curveToRelative(-12.2f, -3.3f, -20.3f, -14.7f, -19.5f, -27.2f)
                lineToRelative(2.7f, -41.9f)
                curveToRelative(-8.3f, -6.4f, -15.6f, -13.8f, -21.9f, -22.0f)
                lineToRelative(-42.0f, 2.7f)
                curveToRelative(-12.5f, 0.8f, -23.9f, -7.4f, -27.2f, -19.5f)
                lineToRelative(-7.0f, -26.2f)
                curveToRelative(-3.2f, -12.1f, 2.5f, -24.9f, 13.8f, -30.5f)
                lineToRelative(37.7f, -18.6f)
                curveToRelative(0.7f, -5.1f, 1.7f, -10.1f, 3.0f, -15.2f)
                curveToRelative(1.4f, -5.1f, 3.0f, -10.0f, 5.0f, -14.7f)
                lineTo(55.1f, 46.5f)
                curveToRelative(-7.0f, -10.5f, -5.6f, -24.4f, 3.3f, -33.3f)
                lineTo(77.6f, -6.0f)
                curveToRelative(8.9f, -8.9f, 22.8f, -10.3f, 33.3f, -3.3f)
                lineToRelative(35.0f, 23.3f)
                curveToRelative(9.5f, -3.9f, 19.6f, -6.7f, 29.9f, -8.1f)
                lineToRelative(18.6f, -37.6f)
                curveToRelative(5.6f, -11.3f, 18.3f, -17.0f, 30.5f, -13.8f)
                close()
                moveTo(192.4f, 84.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 0.0f, 88.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 0.0f, -88.0f)
                close()
            }
        }
        .build()
        return _cogs!!
    }

private var _cogs: ImageVector? = null
