package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.MiniProgramFill: ImageVector
    get() {
        if (_miniProgramFill != null) {
            return _miniProgramFill!!
        }
        _miniProgramFill = Builder(name = "MiniProgramFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.841f, 12.691f)
                curveTo(15.818f, 12.698f, 15.797f, 12.704f, 15.774f, 12.71f)
                curveTo(15.638f, 12.749f, 15.499f, 12.773f, 15.36f, 12.773f)
                curveTo(14.75f, 12.773f, 14.406f, 12.361f, 14.591f, 11.852f)
                curveTo(14.726f, 11.48f, 15.081f, 11.166f, 15.515f, 11.021f)
                curveTo(16.187f, 10.776f, 16.657f, 10.217f, 16.657f, 9.566f)
                curveTo(16.657f, 8.689f, 15.804f, 7.979f, 14.752f, 7.979f)
                curveTo(13.7f, 7.979f, 12.847f, 8.689f, 12.847f, 9.566f)
                verticalLineTo(14.434f)
                curveTo(12.847f, 15.605f, 12.169f, 16.631f, 11.154f, 17.212f)
                curveTo(10.601f, 17.528f, 9.95f, 17.714f, 9.25f, 17.714f)
                curveTo(7.266f, 17.714f, 5.652f, 16.243f, 5.652f, 14.434f)
                curveTo(5.652f, 13.858f, 5.816f, 13.317f, 6.103f, 12.847f)
                curveTo(6.547f, 12.118f, 7.287f, 11.56f, 8.173f, 11.306f)
                curveTo(8.325f, 11.258f, 8.48f, 11.233f, 8.632f, 11.233f)
                curveTo(9.245f, 11.233f, 9.591f, 11.647f, 9.406f, 12.157f)
                curveTo(9.28f, 12.503f, 8.94f, 12.802f, 8.545f, 12.96f)
                curveTo(8.498f, 12.976f, 8.452f, 12.994f, 8.406f, 13.012f)
                curveTo(7.778f, 13.272f, 7.345f, 13.81f, 7.345f, 14.434f)
                curveTo(7.345f, 15.311f, 8.198f, 16.021f, 9.25f, 16.021f)
                curveTo(10.302f, 16.021f, 11.154f, 15.311f, 11.154f, 14.434f)
                verticalLineTo(9.566f)
                curveTo(11.154f, 8.395f, 11.833f, 7.369f, 12.847f, 6.788f)
                curveTo(13.401f, 6.472f, 14.052f, 6.286f, 14.752f, 6.286f)
                curveTo(16.736f, 6.286f, 18.35f, 7.757f, 18.35f, 9.566f)
                curveTo(18.35f, 10.142f, 18.185f, 10.683f, 17.899f, 11.153f)
                curveTo(17.457f, 11.879f, 16.721f, 12.435f, 15.841f, 12.691f)
                close()
                moveTo(2.001f, 12.0f)
                curveTo(2.001f, 17.523f, 6.478f, 22.0f, 12.001f, 22.0f)
                curveTo(17.524f, 22.0f, 22.001f, 17.523f, 22.001f, 12.0f)
                curveTo(22.001f, 6.477f, 17.524f, 2.0f, 12.001f, 2.0f)
                curveTo(6.478f, 2.0f, 2.001f, 6.477f, 2.001f, 12.0f)
                close()
            }
        }
        .build()
        return _miniProgramFill!!
    }

private var _miniProgramFill: ImageVector? = null
