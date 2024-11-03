package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val Twbs.FileBinary: ImageVector
    get() {
        if (_fileBinary != null) {
            return _fileBinary!!
        }
        _fileBinary = Builder(name = "FileBinary", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.526f, 13.09f)
                curveToRelative(0.976f, 0.0f, 1.524f, -0.79f, 1.524f, -2.205f)
                curveToRelative(0.0f, -1.412f, -0.548f, -2.203f, -1.524f, -2.203f)
                curveToRelative(-0.978f, 0.0f, -1.526f, 0.79f, -1.526f, 2.203f)
                curveToRelative(0.0f, 1.415f, 0.548f, 2.206f, 1.526f, 2.206f)
                close()
                moveTo(4.694f, 10.885f)
                curveToRelative(0.0f, -1.05f, 0.29f, -1.612f, 0.832f, -1.612f)
                curveToRelative(0.358f, 0.0f, 0.607f, 0.247f, 0.733f, 0.721f)
                lineTo(4.7f, 11.137f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.006f, -0.252f)
                moveToRelative(0.832f, 1.614f)
                curveToRelative(-0.36f, 0.0f, -0.606f, -0.246f, -0.732f, -0.718f)
                lineToRelative(1.556f, -1.145f)
                quadToRelative(0.005f, 0.12f, 0.005f, 0.249f)
                curveToRelative(0.0f, 1.052f, -0.29f, 1.614f, -0.829f, 1.614f)
                moveToRelative(5.329f, 0.501f)
                verticalLineToRelative(-0.595f)
                lineTo(9.73f, 12.405f)
                lineTo(9.73f, 8.772f)
                horizontalLineToRelative(-0.69f)
                lineToRelative(-1.19f, 0.786f)
                verticalLineToRelative(0.688f)
                lineTo(8.986f, 9.5f)
                horizontalLineToRelative(0.05f)
                verticalLineToRelative(2.906f)
                horizontalLineToRelative(-1.18f)
                lineTo(7.856f, 13.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(14.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(4.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
            }
        }
        .build()
        return _fileBinary!!
    }

private var _fileBinary: ImageVector? = null
