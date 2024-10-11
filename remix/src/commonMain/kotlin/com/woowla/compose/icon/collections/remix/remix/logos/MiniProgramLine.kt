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

public val LogosGroup.MiniProgramLine: ImageVector
    get() {
        if (_miniProgramLine != null) {
            return _miniProgramLine!!
        }
        _miniProgramLine = Builder(name = "MiniProgramLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 22.0f)
                curveTo(6.478f, 22.0f, 2.001f, 17.523f, 2.001f, 12.0f)
                curveTo(2.001f, 6.477f, 6.478f, 2.0f, 12.001f, 2.0f)
                curveTo(17.524f, 2.0f, 22.001f, 6.477f, 22.001f, 12.0f)
                curveTo(22.001f, 17.523f, 17.524f, 22.0f, 12.001f, 22.0f)
                close()
                moveTo(12.001f, 20.0f)
                curveTo(16.419f, 20.0f, 20.001f, 16.418f, 20.001f, 12.0f)
                curveTo(20.001f, 7.582f, 16.419f, 4.0f, 12.001f, 4.0f)
                curveTo(7.583f, 4.0f, 4.001f, 7.582f, 4.001f, 12.0f)
                curveTo(4.001f, 16.418f, 7.583f, 20.0f, 12.001f, 20.0f)
                close()
                moveTo(13.001f, 14.0f)
                curveTo(13.001f, 15.933f, 11.434f, 17.5f, 9.501f, 17.5f)
                curveTo(7.568f, 17.5f, 6.001f, 15.933f, 6.001f, 14.0f)
                curveTo(6.001f, 12.626f, 6.8f, 11.396f, 8.024f, 10.826f)
                curveTo(8.525f, 10.593f, 9.12f, 10.81f, 9.353f, 11.311f)
                curveTo(9.586f, 11.811f, 9.369f, 12.406f, 8.869f, 12.639f)
                curveTo(8.344f, 12.884f, 8.001f, 13.411f, 8.001f, 14.0f)
                curveTo(8.001f, 14.829f, 8.673f, 15.5f, 9.501f, 15.5f)
                curveTo(10.329f, 15.5f, 11.001f, 14.829f, 11.001f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(11.001f, 8.067f, 12.568f, 6.5f, 14.501f, 6.5f)
                curveTo(16.434f, 6.5f, 18.001f, 8.067f, 18.001f, 10.0f)
                curveTo(18.001f, 11.374f, 17.201f, 12.604f, 15.978f, 13.174f)
                curveTo(15.477f, 13.407f, 14.882f, 13.19f, 14.649f, 12.69f)
                curveTo(14.416f, 12.189f, 14.633f, 11.594f, 15.133f, 11.361f)
                curveTo(15.658f, 11.116f, 16.001f, 10.589f, 16.001f, 10.0f)
                curveTo(16.001f, 9.172f, 15.329f, 8.5f, 14.501f, 8.5f)
                curveTo(13.672f, 8.5f, 13.001f, 9.172f, 13.001f, 10.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _miniProgramLine!!
    }

private var _miniProgramLine: ImageVector? = null
