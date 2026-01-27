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

public val SolidGroup.Tools: ImageVector
    get() {
        if (_tools != null) {
            return _tools!!
        }
        _tools = Builder(name = "Tools", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(70.8f, -6.7f)
                curveToRelative(5.4f, -5.4f, 13.8f, -6.2f, 20.2f, -2.0f)
                lineTo(209.9f, 70.5f)
                curveToRelative(8.9f, 5.9f, 14.2f, 15.9f, 14.2f, 26.6f)
                lineToRelative(0.0f, 49.6f)
                lineToRelative(90.8f, 90.8f)
                curveToRelative(33.3f, -15.0f, 73.9f, -8.9f, 101.2f, 18.5f)
                lineTo(542.2f, 382.1f)
                curveToRelative(18.7f, 18.7f, 18.7f, 49.1f, 0.0f, 67.9f)
                lineToRelative(-60.1f, 60.1f)
                curveToRelative(-18.7f, 18.7f, -49.1f, 18.7f, -67.9f, 0.0f)
                lineTo(288.1f, 384.0f)
                curveToRelative(-27.4f, -27.4f, -33.5f, -67.9f, -18.5f, -101.2f)
                lineToRelative(-90.8f, -90.8f)
                lineToRelative(-49.6f, 0.0f)
                curveToRelative(-10.7f, 0.0f, -20.7f, -5.3f, -26.6f, -14.2f)
                lineTo(23.4f, 58.9f)
                curveToRelative(-4.2f, -6.3f, -3.4f, -14.8f, 2.0f, -20.2f)
                lineTo(70.8f, -6.7f)
                close()
                moveTo(215.8f, 296.8f)
                curveToRelative(-6.3f, 36.9f, 2.3f, 75.9f, 26.2f, 107.2f)
                lineToRelative(-94.9f, 95.0f)
                curveToRelative(-28.1f, 28.1f, -73.7f, 28.1f, -101.8f, 0.0f)
                reflectiveCurveToRelative(-28.1f, -73.7f, 0.0f, -101.8f)
                lineToRelative(135.4f, -135.5f)
                lineToRelative(35.2f, 35.1f)
                close()
                moveTo(384.1f, 0.0f)
                curveToRelative(20.1f, 0.0f, 39.4f, 3.7f, 57.1f, 10.5f)
                curveToRelative(10.0f, 3.8f, 11.8f, 16.5f, 4.3f, 24.1f)
                lineTo(388.8f, 91.3f)
                curveToRelative(-3.0f, 3.0f, -4.7f, 7.1f, -4.7f, 11.3f)
                lineToRelative(0.0f, 41.4f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(41.4f, 0.0f)
                curveToRelative(4.2f, 0.0f, 8.3f, -1.7f, 11.3f, -4.7f)
                lineToRelative(56.7f, -56.7f)
                curveToRelative(7.6f, -7.5f, 20.3f, -5.7f, 24.1f, 4.3f)
                curveToRelative(6.8f, 17.7f, 10.5f, 37.0f, 10.5f, 57.1f)
                curveToRelative(0.0f, 43.2f, -17.2f, 82.3f, -45.0f, 111.1f)
                lineToRelative(-49.1f, -49.1f)
                curveToRelative(-33.1f, -33.0f, -78.5f, -45.7f, -121.1f, -38.4f)
                lineToRelative(-56.8f, -56.8f)
                lineToRelative(0.0f, -29.7f)
                lineToRelative(-0.2f, -5.0f)
                curveToRelative(-0.8f, -12.4f, -4.4f, -24.3f, -10.5f, -34.9f)
                curveToRelative(29.4f, -35.0f, 73.4f, -57.2f, 122.7f, -57.3f)
                close()
            }
        }
        .build()
        return _tools!!
    }

private var _tools: ImageVector? = null
