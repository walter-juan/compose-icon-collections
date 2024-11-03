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

public val Twbs.FileEarmarkMusic: ImageVector
    get() {
        if (_fileEarmarkMusic != null) {
            return _fileEarmarkMusic!!
        }
        _fileEarmarkMusic = Builder(name = "FileEarmarkMusic", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.64f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.243f, -0.97f)
                lineToRelative(-1.0f, 0.25f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 6.89f)
                verticalLineToRelative(4.306f)
                arcTo(2.6f, 2.6f, 0.0f, false, false, 7.0f, 11.0f)
                curveToRelative(-0.5f, 0.0f, -0.974f, 0.134f, -1.338f, 0.377f)
                curveToRelative(-0.36f, 0.24f, -0.662f, 0.628f, -0.662f, 1.123f)
                reflectiveCurveToRelative(0.301f, 0.883f, 0.662f, 1.123f)
                curveToRelative(0.364f, 0.243f, 0.839f, 0.377f, 1.338f, 0.377f)
                reflectiveCurveToRelative(0.974f, -0.134f, 1.338f, -0.377f)
                curveToRelative(0.36f, -0.24f, 0.662f, -0.628f, 0.662f, -1.123f)
                verticalLineTo(8.89f)
                lineToRelative(2.0f, -0.5f)
                close()
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
        return _fileEarmarkMusic!!
    }

private var _fileEarmarkMusic: ImageVector? = null
