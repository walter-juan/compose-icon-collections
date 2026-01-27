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

public val SolidGroup.FaceLaughSquint: ImageVector
    get() {
        if (_faceLaughSquint != null) {
            return _faceLaughSquint!!
        }
        _faceLaughSquint = Builder(name = "FaceLaughSquint", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, -512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(107.7f, 332.1f)
                curveTo(102.0f, 318.0f, 113.4f, 304.0f, 128.6f, 304.0f)
                lineToRelative(254.9f, 0.0f)
                curveToRelative(15.2f, 0.0f, 26.6f, 14.0f, 20.9f, 28.1f)
                curveToRelative(-23.8f, 58.6f, -81.2f, 99.9f, -148.3f, 99.9f)
                reflectiveCurveToRelative(-124.6f, -41.3f, -148.3f, -99.9f)
                close()
                moveTo(122.7f, 143.3f)
                curveToRelative(4.5f, -6.8f, 13.3f, -9.2f, 20.6f, -5.5f)
                lineToRelative(79.6f, 40.0f)
                curveToRelative(5.4f, 2.7f, 8.8f, 8.2f, 8.8f, 14.3f)
                reflectiveCurveToRelative(-3.4f, 11.6f, -8.8f, 14.3f)
                lineToRelative(-79.6f, 40.0f)
                curveToRelative(-7.3f, 3.6f, -16.1f, 1.3f, -20.6f, -5.5f)
                reflectiveCurveToRelative(-3.1f, -15.9f, 3.1f, -21.1f)
                lineTo(159.0f, 192.0f)
                lineTo(125.8f, 164.3f)
                curveToRelative(-6.2f, -5.2f, -7.6f, -14.3f, -3.1f, -21.1f)
                close()
                moveTo(386.3f, 164.4f)
                lineTo(353.0f, 192.0f)
                lineTo(386.2f, 219.7f)
                curveToRelative(6.2f, 5.2f, 7.6f, 14.3f, 3.1f, 21.1f)
                reflectiveCurveToRelative(-13.3f, 9.2f, -20.6f, 5.5f)
                lineToRelative(-79.6f, -40.0f)
                curveToRelative(-5.4f, -2.7f, -8.8f, -8.2f, -8.8f, -14.3f)
                reflectiveCurveToRelative(3.4f, -11.6f, 8.8f, -14.3f)
                lineToRelative(79.6f, -40.0f)
                curveToRelative(7.3f, -3.6f, 16.1f, -1.3f, 20.6f, 5.5f)
                reflectiveCurveToRelative(3.1f, 15.9f, -3.1f, 21.1f)
                close()
            }
        }
        .build()
        return _faceLaughSquint!!
    }

private var _faceLaughSquint: ImageVector? = null
