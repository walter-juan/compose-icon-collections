package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) {
            return _cloudSlash!!
        }
        _cloudSlash = Builder(name = "CloudSlash", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.112f, 5.112f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.17f, 0.613f)
                curveTo(1.266f, 6.095f, 0.0f, 7.555f, 0.0f, 9.318f)
                curveTo(0.0f, 11.366f, 1.708f, 13.0f, 3.781f, 13.0f)
                lineTo(11.0f, 13.0f)
                lineToRelative(-1.0f, -1.0f)
                lineTo(3.781f, 12.0f)
                curveTo(2.231f, 12.0f, 1.0f, 10.785f, 1.0f, 9.318f)
                curveToRelative(0.0f, -1.365f, 1.064f, -2.513f, 2.46f, -2.666f)
                lineToRelative(0.446f, -0.05f)
                verticalLineToRelative(-0.447f)
                quadToRelative(0.0f, -0.113f, 0.018f, -0.231f)
                close()
                moveTo(5.662f, 3.662f)
                lineTo(4.937f, 2.937f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 8.0f, 2.0f)
                curveToRelative(2.69f, 0.0f, 4.923f, 2.0f, 5.166f, 4.579f)
                curveTo(14.758f, 6.804f, 16.0f, 8.137f, 16.0f, 9.773f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, -1.516f, 2.711f)
                lineToRelative(-0.733f, -0.733f)
                curveTo(14.498f, 11.378f, 15.0f, 10.626f, 15.0f, 9.773f)
                curveToRelative(0.0f, -1.216f, -1.02f, -2.228f, -2.313f, -2.228f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveTo(12.188f, 4.825f, 10.328f, 3.0f, 8.0f, 3.0f)
                curveToRelative(-0.875f, 0.0f, -1.678f, 0.26f, -2.339f, 0.661f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.646f, 14.354f)
                lineToRelative(-12.0f, -12.0f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
