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

public val Twbs.FileSlidesFill: ImageVector
    get() {
        if (_fileSlidesFill != null) {
            return _fileSlidesFill!!
        }
        _fileSlidesFill = Builder(name = "FileSlidesFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.78f)
                verticalLineTo(5.22f)
                curveToRelative(0.0f, -0.096f, 0.106f, -0.156f, 0.19f, -0.106f)
                lineToRelative(2.13f, 1.279f)
                arcToRelative(0.125f, 0.125f, 0.0f, false, true, 0.0f, 0.214f)
                lineToRelative(-2.13f, 1.28f)
                arcTo(0.125f, 0.125f, 0.0f, false, true, 7.0f, 7.778f)
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
                moveTo(5.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.496f, 0.438f)
                lineToRelative(0.5f, 4.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 9.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.016f)
                curveToRelative(0.863f, 0.055f, 1.5f, 0.251f, 1.5f, 0.484f)
                curveToRelative(0.0f, 0.276f, -0.895f, 0.5f, -2.0f, 0.5f)
                reflectiveCurveToRelative(-2.0f, -0.224f, -2.0f, -0.5f)
                curveToRelative(0.0f, -0.233f, 0.637f, -0.429f, 1.5f, -0.484f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.496f, -0.562f)
                lineToRelative(0.5f, -4.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 4.0f)
            }
        }
        .build()
        return _fileSlidesFill!!
    }

private var _fileSlidesFill: ImageVector? = null
