package com.woowla.compose.icon.collections.octicons.octicons

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
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.Mcp24: ImageVector
    get() {
        if (_mcp24 != null) {
            return _mcp24!!
        }
        _mcp24 = Builder(name = "Mcp24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.795f, 1.694f)
                arcToRelative(4.287f, 4.287f, 0.0f, false, true, 6.061f, 0.0f)
                arcToRelative(4.28f, 4.28f, 0.0f, false, true, 1.181f, 3.819f)
                arcToRelative(4.282f, 4.282f, 0.0f, false, true, 3.819f, 1.181f)
                arcToRelative(4.287f, 4.287f, 0.0f, false, true, 0.0f, 6.061f)
                lineToRelative(-6.793f, 6.793f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, false, 0.0f, 0.353f)
                lineToRelative(2.617f, 2.618f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.061f, 1.061f)
                lineToRelative(-2.617f, -2.618f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, -2.475f)
                lineToRelative(6.793f, -6.793f)
                arcToRelative(2.785f, 2.785f, 0.0f, true, false, -3.939f, -3.939f)
                lineToRelative(-5.9f, 5.9f)
                arcToRelative(0.734f, 0.734f, 0.0f, false, true, -0.249f, 0.165f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.812f, -1.225f)
                lineToRelative(5.9f, -5.901f)
                arcToRelative(2.785f, 2.785f, 0.0f, true, false, -3.939f, -3.939f)
                lineTo(2.931f, 10.68f)
                arcTo(0.75f, 0.75f, 0.0f, true, true, 1.87f, 9.619f)
                lineToRelative(7.925f, -7.925f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.42f, 4.069f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, 1.061f, 0.0f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, 0.0f, 1.061f)
                lineTo(7.33f, 11.28f)
                arcToRelative(2.788f, 2.788f, 0.0f, false, false, 0.0f, 3.94f)
                arcToRelative(2.788f, 2.788f, 0.0f, false, false, 3.94f, 0.0f)
                lineToRelative(6.15f, -6.151f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, 1.061f, 0.0f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, 0.0f, 1.061f)
                lineToRelative(-6.151f, 6.15f)
                arcToRelative(4.285f, 4.285f, 0.0f, true, true, -6.06f, -6.06f)
                lineToRelative(6.15f, -6.151f)
                close()
            }
        }
        .build()
        return _mcp24!!
    }

private var _mcp24: ImageVector? = null
