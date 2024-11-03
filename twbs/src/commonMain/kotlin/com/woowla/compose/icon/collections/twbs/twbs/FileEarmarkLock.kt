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

public val Twbs.FileEarmarkLock: ImageVector
    get() {
        if (_fileEarmarkLock != null) {
            return _fileEarmarkLock!!
        }
        _fileEarmarkLock = Builder(name = "FileEarmarkLock", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 7.0f)
                verticalLineToRelative(1.076f)
                curveToRelative(0.54f, 0.166f, 1.0f, 0.597f, 1.0f, 1.224f)
                verticalLineToRelative(2.4f)
                curveToRelative(0.0f, 0.816f, -0.781f, 1.3f, -1.5f, 1.3f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.719f, 0.0f, -1.5f, -0.484f, -1.5f, -1.3f)
                verticalLineTo(9.3f)
                curveToRelative(0.0f, -0.627f, 0.46f, -1.058f, 1.0f, -1.224f)
                verticalLineTo(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                moveTo(7.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                moveTo(6.0f, 9.3f)
                verticalLineToRelative(2.4f)
                curveToRelative(0.0f, 0.042f, 0.02f, 0.107f, 0.105f, 0.175f)
                arcTo(0.64f, 0.64f, 0.0f, false, false, 6.5f, 12.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, 0.395f, -0.125f)
                curveToRelative(0.085f, -0.068f, 0.105f, -0.133f, 0.105f, -0.175f)
                verticalLineTo(9.3f)
                curveToRelative(0.0f, -0.042f, -0.02f, -0.107f, -0.105f, -0.175f)
                arcTo(0.64f, 0.64f, 0.0f, false, false, 9.5f, 9.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, -0.395f, 0.125f)
                curveTo(6.02f, 9.193f, 6.0f, 9.258f, 6.0f, 9.3f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 14.0f)
                verticalLineTo(4.5f)
                lineTo(9.5f, 0.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                moveTo(9.5f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 4.5f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(5.5f)
                close()
            }
        }
        .build()
        return _fileEarmarkLock!!
    }

private var _fileEarmarkLock: ImageVector? = null
