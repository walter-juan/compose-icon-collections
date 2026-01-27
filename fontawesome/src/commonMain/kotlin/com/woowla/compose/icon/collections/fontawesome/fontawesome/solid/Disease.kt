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

public val SolidGroup.Disease: ImageVector
    get() {
        if (_disease != null) {
            return _disease!!
        }
        _disease = Builder(name = "Disease", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.5f, 29.4f)
                lineTo(224.0f, 48.0f)
                curveToRelative(-20.0f, 30.0f, -53.6f, 48.0f, -89.7f, 48.0f)
                lineTo(68.0f, 96.0f)
                curveToRelative(-37.5f, 0.0f, -67.9f, 30.4f, -67.9f, 67.9f)
                curveToRelative(0.0f, 18.0f, 7.2f, 35.2f, 19.9f, 47.9f)
                lineToRelative(27.0f, 27.0f)
                curveToRelative(11.0f, 11.0f, 17.2f, 25.9f, 17.2f, 41.5f)
                curveToRelative(0.0f, 15.8f, -6.4f, 30.9f, -17.7f, 42.0f)
                lineTo(33.4f, 335.1f)
                curveToRelative(-11.1f, 10.8f, -17.3f, 25.7f, -17.3f, 41.2f)
                curveToRelative(0.0f, 36.8f, 34.1f, 64.2f, 70.1f, 56.2f)
                lineToRelative(62.3f, -13.8f)
                curveToRelative(7.7f, -1.7f, 15.7f, -2.6f, 23.6f, -2.6f)
                curveToRelative(32.8f, 0.0f, 64.2f, 14.6f, 85.2f, 39.8f)
                lineToRelative(30.5f, 36.6f)
                curveToRelative(10.4f, 12.4f, 25.7f, 19.6f, 41.9f, 19.6f)
                curveToRelative(30.1f, 0.0f, 54.5f, -24.4f, 54.5f, -54.5f)
                lineToRelative(0.0f, -51.2f)
                curveToRelative(0.0f, -41.4f, 25.4f, -78.5f, 64.0f, -93.5f)
                lineToRelative(22.2f, -8.6f)
                curveToRelative(25.2f, -9.8f, 41.8f, -34.1f, 41.8f, -61.1f)
                curveToRelative(0.0f, -26.4f, -15.9f, -50.3f, -40.3f, -60.5f)
                lineTo(429.0f, 164.8f)
                curveToRelative(-33.2f, -13.9f, -57.6f, -43.0f, -65.5f, -78.1f)
                lineToRelative(-7.9f, -35.2f)
                curveToRelative(-6.8f, -30.1f, -33.5f, -51.5f, -64.3f, -51.5f)
                curveToRelative(-22.0f, 0.0f, -42.6f, 11.0f, -54.8f, 29.4f)
                close()
                moveTo(160.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(256.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(288.0f, 288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _disease!!
    }

private var _disease: ImageVector? = null
