package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Earbuds: ImageVector
    get() {
        if (_earbuds != null) {
            return _earbuds!!
        }
        _earbuds = Builder(name = "Earbuds", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.825f, 4.138f)
                curveToRelative(0.596f, 2.141f, -0.36f, 3.593f, -2.389f, 4.117f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -2.018f, 0.054f)
                curveToRelative(-0.048f, -0.01f, 0.9f, 2.778f, 1.522f, 4.61f)
                lineToRelative(0.41f, 1.205f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, -0.346f, 0.659f)
                lineToRelative(-0.593f, 0.19f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.69f, -0.34f)
                lineTo(0.184f, 6.99f)
                curveToRelative(-0.696f, -2.137f, 0.662f, -4.309f, 2.564f, -4.8f)
                curveToRelative(2.029f, -0.523f, 3.402f, 0.0f, 4.076f, 1.948f)
                close()
                moveTo(5.957f, 6.359f)
                curveToRelative(0.43f, -0.112f, 0.561f, -0.993f, 0.292f, -1.969f)
                curveToRelative(-0.269f, -0.975f, -0.836f, -1.675f, -1.266f, -1.563f)
                reflectiveCurveToRelative(-0.561f, 0.994f, -0.292f, 1.969f)
                reflectiveCurveToRelative(0.836f, 1.675f, 1.266f, 1.563f)
                moveToRelative(3.218f, -2.221f)
                curveToRelative(-0.596f, 2.141f, 0.36f, 3.593f, 2.389f, 4.117f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, 2.018f, 0.054f)
                curveToRelative(0.048f, -0.01f, -0.9f, 2.778f, -1.522f, 4.61f)
                lineToRelative(-0.41f, 1.205f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, 0.346f, 0.659f)
                lineToRelative(0.593f, 0.19f)
                curveToRelative(0.289f, 0.092f, 0.6f, -0.06f, 0.69f, -0.34f)
                lineToRelative(2.536f, -7.643f)
                curveToRelative(0.696f, -2.137f, -0.662f, -4.309f, -2.564f, -4.8f)
                curveToRelative(-2.029f, -0.523f, -3.402f, 0.0f, -4.076f, 1.948f)
                moveToRelative(0.868f, 2.221f)
                curveToRelative(-0.43f, -0.112f, -0.561f, -0.993f, -0.292f, -1.969f)
                curveToRelative(0.269f, -0.975f, 0.836f, -1.675f, 1.266f, -1.563f)
                reflectiveCurveToRelative(0.561f, 0.994f, 0.292f, 1.969f)
                reflectiveCurveToRelative(-0.836f, 1.675f, -1.266f, 1.563f)
            }
        }
        .build()
        return _earbuds!!
    }

private var _earbuds: ImageVector? = null
