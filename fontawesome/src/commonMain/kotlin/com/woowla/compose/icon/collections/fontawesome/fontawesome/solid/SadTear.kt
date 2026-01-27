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

public val SolidGroup.SadTear: ImageVector
    get() {
        if (_sadTear != null) {
            return _sadTear!!
        }
        _sadTear = Builder(name = "SadTear", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
                close()
                moveTo(271.0f, 354.0f)
                curveToRelative(5.5f, -1.3f, 11.1f, -2.0f, 17.0f, -2.0f)
                curveToRelative(24.1f, 0.0f, 45.4f, 11.8f, 58.5f, 30.0f)
                curveToRelative(7.7f, 10.8f, 22.7f, 13.2f, 33.5f, 5.5f)
                reflectiveCurveToRelative(13.2f, -22.7f, 5.5f, -33.5f)
                curveToRelative(-21.7f, -30.2f, -57.3f, -50.0f, -97.5f, -50.0f)
                curveToRelative(-12.5f, 0.0f, -24.6f, 1.9f, -35.9f, 5.5f)
                curveToRelative(9.8f, 12.7f, 16.5f, 27.9f, 18.9f, 44.6f)
                close()
                moveTo(176.0f, 240.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
                moveTo(368.0f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(185.4f, 292.8f)
                curveToRelative(-2.4f, -2.9f, -5.7f, -4.8f, -9.4f, -4.8f)
                reflectiveCurveToRelative(-7.0f, 1.9f, -9.4f, 4.8f)
                curveToRelative(-6.5f, 7.8f, -12.6f, 16.1f, -18.3f, 24.6f)
                curveToRelative(-9.0f, 13.4f, -20.3f, 30.2f, -20.3f, 47.4f)
                curveToRelative(0.0f, 28.3f, 21.5f, 51.2f, 48.0f, 51.2f)
                reflectiveCurveToRelative(48.0f, -22.9f, 48.0f, -51.2f)
                curveToRelative(0.0f, -17.2f, -11.2f, -34.0f, -20.3f, -47.4f)
                curveToRelative(-5.7f, -8.5f, -11.9f, -16.7f, -18.3f, -24.6f)
                close()
            }
        }
        .build()
        return _sadTear!!
    }

private var _sadTear: ImageVector? = null
