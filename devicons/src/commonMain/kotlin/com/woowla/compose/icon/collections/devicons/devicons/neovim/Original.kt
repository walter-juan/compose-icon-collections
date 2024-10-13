package com.woowla.compose.icon.collections.devicons.devicons.neovim

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.NeovimGroup

public val NeovimGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xCC16B0ED), 1.0f to Color(0xD40F59B2), start =
                    Offset(24.92f,-0.0f), end = Offset(24.92f,127.82f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.3f, 27.49f)
                lineTo(38.53f, -0.0f)
                lineToRelative(0.0f, 127.82f)
                lineTo(11.3f, 100.65f)
                close()
                moveTo(11.3f, 27.49f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF7DB643), 1.0f to Color(0xFF367533), start =
                    Offset(102.82f,-0.0f), end = Offset(102.82f,127.82f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(116.51f, 27.74f)
                lineTo(88.94f, -0.0f)
                lineToRelative(0.56f, 127.82f)
                lineTo(116.7f, 100.65f)
                close()
                moveTo(116.51f, 27.74f)
            }
            path(fill = linearGradient(0.0f to Color(0xCC88C649), 1.0f to Color(0xD6439240), start =
                    Offset(64.0f,0.17f), end = Offset(64.0f,128.0f)), stroke = null, strokeLineWidth
                    = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(38.53f, 0.17f)
                lineToRelative(70.79f, 108.02f)
                lineToRelative(-19.81f, 19.81f)
                lineTo(18.68f, 20.22f)
                close()
                moveTo(38.53f, 0.17f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.129412f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveToRelative(38.53f, 50.01f)
                lineToRelative(-0.04f, 4.24f)
                lineToRelative(-21.74f, -32.18f)
                lineToRelative(2.01f, -2.06f)
                close()
                moveTo(38.53f, 50.01f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
