package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.SimSlash: ImageVector
    get() {
        if (_simSlash != null) {
            return _simSlash!!
        }
        _simSlash = Builder(name = "SimSlash", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.646f, 0.44f)
                lineToRelative(0.897f, 0.896f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-0.897f, -0.897f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 10.586f, 1.0f)
                lineTo(3.5f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(9.379f)
                lineToRelative(-1.0f, 1.0f)
                lineTo(2.0f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 0.0f)
                horizontalLineToRelative(7.086f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.06f, 0.44f)
                moveTo(10.5f, 3.0f)
                quadToRelative(0.175f, 0.0f, 0.34f, 0.039f)
                lineTo(9.879f, 4.0f)
                lineTo(8.5f, 4.0f)
                verticalLineToRelative(1.379f)
                lineTo(6.879f, 7.0f)
                lineTo(5.0f, 7.0f)
                verticalLineToRelative(1.879f)
                lineToRelative(-1.0f, 1.0f)
                lineTo(4.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 3.0f)
                close()
                moveTo(12.0f, 6.121f)
                lineToRelative(-1.0f, 1.0f)
                lineTo(11.0f, 9.0f)
                lineTo(9.121f, 9.0f)
                lineTo(7.5f, 10.621f)
                lineTo(7.5f, 12.0f)
                lineTo(6.121f, 12.0f)
                lineToRelative(-0.961f, 0.961f)
                quadToRelative(0.165f, 0.039f, 0.34f, 0.039f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                close()
                moveTo(3.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.288f, -0.091f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(0.265f, 0.237f, 0.615f, 0.381f, 0.998f, 0.381f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                lineTo(14.0f, 4.121f)
                lineToRelative(-1.0f, 1.0f)
                lineTo(13.0f, 14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                close()
                moveTo(5.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                lineTo(5.0f, 6.0f)
                horizontalLineToRelative(2.5f)
                lineTo(7.5f, 4.0f)
                close()
                moveTo(11.0f, 10.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(14.854f, 1.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, -0.708f)
                lineToRelative(-13.0f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.708f)
                close()
            }
        }
        .build()
        return _simSlash!!
    }

private var _simSlash: ImageVector? = null
