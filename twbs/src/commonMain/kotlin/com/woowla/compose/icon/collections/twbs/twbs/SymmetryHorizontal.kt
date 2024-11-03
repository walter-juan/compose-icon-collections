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

public val Twbs.SymmetryHorizontal: ImageVector
    get() {
        if (_symmetryHorizontal != null) {
            return _symmetryHorizontal!!
        }
        _symmetryHorizontal = Builder(name = "SymmetryHorizontal", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.24f, -0.939f)
                lineToRelative(-11.0f, -6.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 2.0f, 0.5f)
                verticalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                close()
                moveTo(13.985f, 9.376f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.246f, 0.563f)
                lineToRelative(-11.0f, 6.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 15.5f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.485f, 0.376f)
                moveTo(11.539f, 10.0f)
                lineTo(3.0f, 10.0f)
                verticalLineToRelative(4.658f)
                close()
            }
        }
        .build()
        return _symmetryHorizontal!!
    }

private var _symmetryHorizontal: ImageVector? = null
