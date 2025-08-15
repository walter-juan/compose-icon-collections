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
                moveTo(224.1f, 97.1f)
                lineToRelative(0.0f, 49.6f)
                lineToRelative(0.5f, 0.5f)
                curveToRelative(6.5f, -82.4f, 75.4f, -147.2f, 159.5f, -147.2f)
                curveToRelative(20.1f, 0.0f, 39.4f, 3.7f, 57.1f, 10.5f)
                curveToRelative(10.0f, 3.8f, 11.8f, 16.5f, 4.3f, 24.1f)
                lineToRelative(-88.7f, 88.7f)
                curveToRelative(-3.0f, 3.0f, -4.7f, 7.1f, -4.7f, 11.3f)
                lineToRelative(0.0f, 41.4f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(41.4f, 0.0f)
                curveToRelative(4.2f, 0.0f, 8.3f, -1.7f, 11.3f, -4.7f)
                lineToRelative(88.7f, -88.7f)
                curveToRelative(7.6f, -7.6f, 20.3f, -5.7f, 24.1f, 4.3f)
                curveToRelative(6.8f, 17.7f, 10.5f, 37.0f, 10.5f, 57.1f)
                curveToRelative(0.0f, 60.6f, -33.7f, 113.4f, -83.5f, 140.5f)
                lineToRelative(81.5f, 81.5f)
                curveToRelative(18.7f, 18.7f, 18.7f, 49.1f, 0.0f, 67.9f)
                lineToRelative(-60.1f, 60.1f)
                curveToRelative(-18.7f, 18.7f, -49.1f, 18.7f, -67.9f, 0.0f)
                lineTo(288.1f, 384.0f)
                curveToRelative(-27.4f, -27.4f, -33.6f, -67.9f, -18.5f, -101.3f)
                lineToRelative(-90.7f, -90.7f)
                lineToRelative(-49.6f, 0.0f)
                curveToRelative(-10.7f, 0.0f, -20.7f, -5.3f, -26.6f, -14.2f)
                lineTo(23.4f, 58.9f)
                curveToRelative(-4.2f, -6.3f, -3.4f, -14.8f, 2.0f, -20.2f)
                lineTo(70.8f, -6.7f)
                curveToRelative(5.4f, -5.4f, 13.8f, -6.2f, 20.2f, -2.0f)
                lineTo(209.9f, 70.5f)
                curveToRelative(8.9f, 5.9f, 14.2f, 15.9f, 14.2f, 26.6f)
                close()
                moveTo(215.6f, 296.6f)
                curveToRelative(-6.3f, 37.0f, 2.4f, 76.1f, 26.4f, 107.4f)
                lineTo(147.0f, 498.9f)
                curveToRelative(-28.1f, 28.1f, -73.7f, 28.1f, -101.8f, 0.0f)
                reflectiveCurveToRelative(-28.1f, -73.7f, 0.0f, -101.8f)
                lineToRelative(135.4f, -135.4f)
                lineToRelative(35.0f, 35.0f)
                close()
            }
        }
        .build()
        return _tools!!
    }

private var _tools: ImageVector? = null
