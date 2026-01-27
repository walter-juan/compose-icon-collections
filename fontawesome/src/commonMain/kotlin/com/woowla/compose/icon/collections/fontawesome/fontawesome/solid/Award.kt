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

public val SolidGroup.Award: ImageVector
    get() {
        if (_award != null) {
            return _award!!
        }
        _award = Builder(name = "Award", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.9f, -25.9f)
                curveToRelative(-13.4f, -8.2f, -30.3f, -8.2f, -43.7f, 0.0f)
                curveToRelative(-24.4f, 14.9f, -39.5f, 18.9f, -68.1f, 18.3f)
                curveToRelative(-15.7f, -0.4f, -30.3f, 8.1f, -37.9f, 21.9f)
                curveToRelative(-13.7f, 25.1f, -24.8f, 36.2f, -49.9f, 49.9f)
                curveToRelative(-13.8f, 7.5f, -22.2f, 22.2f, -21.9f, 37.9f)
                curveToRelative(0.7f, 28.6f, -3.4f, 43.7f, -18.3f, 68.1f)
                curveToRelative(-8.2f, 13.4f, -8.2f, 30.3f, 0.0f, 43.7f)
                curveToRelative(14.9f, 24.4f, 18.9f, 39.5f, 18.3f, 68.1f)
                curveToRelative(-0.4f, 15.7f, 8.1f, 30.3f, 21.9f, 37.9f)
                curveToRelative(22.1f, 12.1f, 33.3f, 22.1f, 45.1f, 41.5f)
                lineTo(42.7f, 458.5f)
                curveToRelative(-5.9f, 11.9f, -1.1f, 26.3f, 10.7f, 32.2f)
                lineToRelative(86.0f, 43.0f)
                curveToRelative(11.5f, 5.7f, 25.5f, 1.4f, 31.7f, -9.8f)
                lineToRelative(52.8f, -95.1f)
                lineToRelative(52.8f, 95.1f)
                curveToRelative(6.2f, 11.2f, 20.2f, 15.6f, 31.7f, 9.8f)
                lineToRelative(86.0f, -43.0f)
                curveToRelative(11.9f, -5.9f, 16.7f, -20.3f, 10.7f, -32.2f)
                lineToRelative(-48.6f, -97.2f)
                curveToRelative(11.7f, -19.4f, 23.0f, -29.4f, 45.1f, -41.5f)
                curveToRelative(13.8f, -7.5f, 22.2f, -22.2f, 21.9f, -37.9f)
                curveToRelative(-0.7f, -28.6f, 3.4f, -43.7f, 18.3f, -68.1f)
                curveToRelative(8.2f, -13.4f, 8.2f, -30.3f, 0.0f, -43.7f)
                curveToRelative(-14.9f, -24.4f, -18.9f, -39.5f, -18.3f, -68.1f)
                curveToRelative(0.4f, -15.7f, -8.1f, -30.3f, -21.9f, -37.9f)
                curveToRelative(-25.1f, -13.7f, -36.2f, -24.8f, -49.9f, -49.9f)
                curveToRelative(-7.5f, -13.8f, -22.2f, -22.2f, -37.9f, -21.9f)
                curveToRelative(-28.6f, 0.7f, -43.7f, -3.4f, -68.1f, -18.3f)
                close()
                moveTo(224.0f, 96.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 0.0f, 192.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 0.0f, -192.0f)
                close()
            }
        }
        .build()
        return _award!!
    }

private var _award: ImageVector? = null
