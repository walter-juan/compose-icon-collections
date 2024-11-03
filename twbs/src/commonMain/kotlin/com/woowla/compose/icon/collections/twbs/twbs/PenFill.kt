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

public val Twbs.PenFill: ImageVector
    get() {
        if (_penFill != null) {
            return _penFill!!
        }
        _penFill = Builder(name = "PenFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.498f, 0.795f)
                lineToRelative(0.149f, -0.149f)
                arcToRelative(1.207f, 1.207f, 0.0f, true, true, 1.707f, 1.708f)
                lineToRelative(-0.149f, 0.148f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.059f, 2.059f)
                lineTo(4.854f, 14.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.233f, 0.131f)
                lineToRelative(-4.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.606f, -0.606f)
                lineToRelative(1.0f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.131f, -0.232f)
                lineToRelative(9.642f, -9.642f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.642f, 0.056f)
                lineTo(6.854f, 4.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.708f, -0.708f)
                lineTo(9.44f, 0.854f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 0.796f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.998f, -0.001f)
            }
        }
        .build()
        return _penFill!!
    }

private var _penFill: ImageVector? = null
