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

public val Twbs.FileBinaryFill: ImageVector
    get() {
        if (_fileBinaryFill != null) {
            return _fileBinaryFill!!
        }
        _fileBinaryFill = Builder(name = "FileBinaryFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.526f, 9.273f)
                curveToRelative(-0.542f, 0.0f, -0.832f, 0.563f, -0.832f, 1.612f)
                quadToRelative(0.0f, 0.133f, 0.006f, 0.252f)
                lineToRelative(1.56f, -1.143f)
                curveToRelative(-0.126f, -0.474f, -0.375f, -0.72f, -0.733f, -0.72f)
                close()
                moveTo(4.794f, 11.781f)
                curveToRelative(0.126f, 0.472f, 0.372f, 0.718f, 0.732f, 0.718f)
                curveToRelative(0.54f, 0.0f, 0.83f, -0.563f, 0.83f, -1.614f)
                quadToRelative(0.0f, -0.129f, -0.006f, -0.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                moveTo(7.05f, 10.885f)
                curveToRelative(0.0f, 1.415f, -0.548f, 2.206f, -1.524f, 2.206f)
                curveTo(4.548f, 13.09f, 4.0f, 12.3f, 4.0f, 10.885f)
                curveToRelative(0.0f, -1.412f, 0.548f, -2.203f, 1.526f, -2.203f)
                curveToRelative(0.976f, 0.0f, 1.524f, 0.79f, 1.524f, 2.203f)
                moveToRelative(3.805f, 1.52f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.595f)
                horizontalLineToRelative(1.181f)
                verticalLineTo(9.5f)
                horizontalLineToRelative(-0.05f)
                lineToRelative(-1.136f, 0.747f)
                verticalLineToRelative(-0.688f)
                lineToRelative(1.19f, -0.786f)
                horizontalLineToRelative(0.69f)
                verticalLineToRelative(3.633f)
                close()
            }
        }
        .build()
        return _fileBinaryFill!!
    }

private var _fileBinaryFill: ImageVector? = null
