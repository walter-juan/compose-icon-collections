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

public val Twbs.SafeFill: ImageVector
    get() {
        if (_safeFill != null) {
            return _safeFill!!
        }
        _safeFill = Builder(name = "SafeFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.778f, 9.414f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 6.95f, 6.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.828f, 2.828f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.0f, 1.5f)
                lineTo(1.0f, 3.0f)
                lineTo(0.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(1.0f, 4.0f)
                verticalLineToRelative(3.5f)
                lineTo(0.5f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(1.0f, 8.5f)
                lineTo(1.0f, 12.0f)
                lineTo(0.5f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(1.0f, 13.0f)
                verticalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.5f, 16.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 0.0f)
                close()
                moveTo(5.536f, 4.464f)
                lineTo(6.626f, 5.554f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.476f, 0.0f)
                lineToRelative(1.09f, -1.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.707f, 0.708f)
                lineToRelative(-1.09f, 1.09f)
                curveToRelative(0.74f, 1.037f, 0.74f, 2.44f, 0.0f, 3.476f)
                lineToRelative(1.09f, 1.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.707f, 0.708f)
                lineToRelative(-1.09f, -1.09f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.476f, 0.0f)
                lineToRelative(-1.09f, 1.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.708f, -0.708f)
                lineToRelative(1.09f, -1.09f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -3.476f)
                lineToRelative(-1.09f, -1.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.708f, -0.708f)
                moveTo(14.0f, 6.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
            }
        }
        .build()
        return _safeFill!!
    }

private var _safeFill: ImageVector? = null
