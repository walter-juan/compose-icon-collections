package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(name = "Scale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(12.414f, 2.25f, 12.75f, 2.586f, 12.75f, 3.0f)
                verticalLineTo(3.756f)
                curveTo(14.818f, 3.787f, 16.856f, 3.947f, 18.855f, 4.228f)
                curveTo(19.881f, 4.373f, 20.897f, 4.549f, 21.902f, 4.756f)
                curveTo(22.278f, 4.834f, 22.535f, 5.184f, 22.496f, 5.567f)
                curveTo(22.457f, 5.95f, 22.135f, 6.241f, 21.75f, 6.241f)
                horizontalLineTo(19.832f)
                lineTo(22.306f, 16.365f)
                curveTo(22.387f, 16.698f, 22.233f, 17.043f, 21.931f, 17.205f)
                curveTo(20.983f, 17.712f, 19.899f, 18.0f, 18.75f, 18.0f)
                curveTo(17.601f, 18.0f, 16.517f, 17.712f, 15.569f, 17.205f)
                curveTo(15.267f, 17.043f, 15.113f, 16.698f, 15.194f, 16.365f)
                lineTo(17.668f, 6.241f)
                horizontalLineTo(12.75f)
                verticalLineTo(19.522f)
                curveTo(14.042f, 19.597f, 15.284f, 19.865f, 16.447f, 20.297f)
                curveTo(16.787f, 20.424f, 16.987f, 20.776f, 16.923f, 21.133f)
                curveTo(16.859f, 21.49f, 16.548f, 21.75f, 16.185f, 21.75f)
                horizontalLineTo(7.815f)
                curveTo(7.452f, 21.75f, 7.141f, 21.49f, 7.077f, 21.133f)
                curveTo(7.012f, 20.776f, 7.213f, 20.424f, 7.553f, 20.297f)
                curveTo(8.715f, 19.865f, 9.957f, 19.597f, 11.25f, 19.522f)
                verticalLineTo(6.241f)
                horizontalLineTo(6.332f)
                lineTo(8.806f, 16.365f)
                curveTo(8.887f, 16.698f, 8.733f, 17.043f, 8.431f, 17.205f)
                curveTo(7.483f, 17.712f, 6.399f, 18.0f, 5.25f, 18.0f)
                curveTo(4.101f, 18.0f, 3.017f, 17.712f, 2.069f, 17.205f)
                curveTo(1.767f, 17.043f, 1.613f, 16.698f, 1.694f, 16.365f)
                lineTo(4.168f, 6.241f)
                horizontalLineTo(2.25f)
                curveTo(1.865f, 6.241f, 1.543f, 5.95f, 1.504f, 5.567f)
                curveTo(1.465f, 5.184f, 1.722f, 4.834f, 2.098f, 4.756f)
                curveTo(3.103f, 4.549f, 4.119f, 4.373f, 5.146f, 4.228f)
                curveTo(7.144f, 3.947f, 9.182f, 3.787f, 11.25f, 3.756f)
                verticalLineTo(3.0f)
                curveTo(11.25f, 2.586f, 11.586f, 2.25f, 12.0f, 2.25f)
                close()
                moveTo(16.878f, 15.793f)
                lineTo(18.75f, 8.131f)
                lineTo(20.622f, 15.793f)
                horizontalLineTo(16.878f)
                close()
                moveTo(7.122f, 15.793f)
                lineTo(5.25f, 8.131f)
                lineTo(3.378f, 15.793f)
                horizontalLineTo(7.122f)
                close()
            }
        }
        .build()
        return _scale!!
    }

private var _scale: ImageVector? = null
