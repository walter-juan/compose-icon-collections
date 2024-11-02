package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Vtex: ImageVector
    get() {
        if (_vtex != null) {
            return _vtex!!
        }
        _vtex = Builder(name = "Vtex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.203f, 1.793f)
                horizontalLineTo(4.281f)
                curveToRelative(-1.39f, 0.0f, -2.28f, 1.47f, -1.629f, 2.692f)
                lineToRelative(1.793f, 3.377f)
                horizontalLineTo(1.195f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.587f, 0.154f)
                arcToRelative(1.192f, 1.192f, 0.0f, false, false, -0.436f, 0.421f)
                arcToRelative(1.185f, 1.185f, 0.0f, false, false, -0.034f, 1.168f)
                lineToRelative(5.766f, 10.858f)
                curveToRelative(0.102f, 0.191f, 0.254f, 0.351f, 0.44f, 0.462f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 1.233f, 0.0f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, false, 0.44f, -0.462f)
                lineToRelative(1.566f, -2.933f)
                lineToRelative(1.965f, 3.701f)
                curveToRelative(0.691f, 1.302f, 2.565f, 1.304f, 3.258f, 0.004f)
                lineTo(23.788f, 4.416f)
                curveToRelative(0.635f, -1.189f, -0.231f, -2.624f, -1.585f, -2.624f)
                close()
                moveTo(14.152f, 8.978f)
                lineToRelative(-3.873f, 7.253f)
                arcToRelative(0.793f, 0.793f, 0.0f, false, true, -0.293f, 0.307f)
                arcToRelative(0.799f, 0.799f, 0.0f, false, true, -0.82f, 0.0f)
                arcToRelative(0.793f, 0.793f, 0.0f, false, true, -0.293f, -0.307f)
                lineTo(5.038f, 9.009f)
                arcToRelative(0.788f, 0.788f, 0.0f, false, true, 0.021f, -0.778f)
                arcToRelative(0.793f, 0.793f, 0.0f, false, true, 0.289f, -0.281f)
                arcToRelative(0.799f, 0.799f, 0.0f, false, true, 0.391f, -0.103f)
                horizontalLineToRelative(7.731f)
                arcToRelative(0.777f, 0.777f, 0.0f, false, true, 0.381f, 0.1f)
                arcToRelative(0.772f, 0.772f, 0.0f, false, true, 0.282f, 0.274f)
                arcToRelative(0.767f, 0.767f, 0.0f, false, true, 0.02f, 0.758f)
                close()
            }
        }
        .build()
        return _vtex!!
    }

private var _vtex: ImageVector? = null
