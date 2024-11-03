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

public val Twbs.FileMusic: ImageVector
    get() {
        if (_fileMusic != null) {
            return _fileMusic!!
        }
        _fileMusic = Builder(name = "FileMusic", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.304f, 3.13f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.196f, 0.98f)
                verticalLineToRelative(1.8f)
                lineToRelative(-2.5f, 0.5f)
                verticalLineToRelative(5.09f)
                curveToRelative(0.0f, 0.495f, -0.301f, 0.883f, -0.662f, 1.123f)
                curveTo(7.974f, 12.866f, 7.499f, 13.0f, 7.0f, 13.0f)
                reflectiveCurveToRelative(-0.974f, -0.134f, -1.338f, -0.377f)
                curveTo(5.302f, 12.383f, 5.0f, 11.995f, 5.0f, 11.5f)
                reflectiveCurveToRelative(0.301f, -0.883f, 0.662f, -1.123f)
                curveTo(6.026f, 10.134f, 6.501f, 10.0f, 7.0f, 10.0f)
                curveToRelative(0.356f, 0.0f, 0.7f, 0.068f, 1.0f, 0.196f)
                verticalLineTo(4.41f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.804f, -0.98f)
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
        return _fileMusic!!
    }

private var _fileMusic: ImageVector? = null
