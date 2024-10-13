package com.woowla.compose.icon.collections.devicons.devicons.consul

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ConsulGroup

public val ConsulGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFe03875)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.41f, 42.79f)
                arcToRelative(5.26f, 5.26f, 0.0f, false, true, -3.72f, -8.96f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, true, 5.73f, -1.14f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, true, -2.01f, 10.1f)
                close()
                moveTo(106.53f, 61.02f)
                arcToRelative(5.24f, 5.24f, 0.0f, false, true, -5.14f, -5.24f)
                arcToRelative(5.24f, 5.24f, 0.0f, false, true, 5.14f, -5.24f)
                arcToRelative(5.24f, 5.24f, 0.0f, false, true, 5.14f, 5.24f)
                arcToRelative(5.24f, 5.24f, 0.0f, false, true, -5.14f, 5.24f)
                close()
                moveTo(122.17f, 60.42f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, true, -5.25f, -5.24f)
                arcToRelative(5.24f, 5.24f, 0.0f, true, true, 10.49f, 0.0f)
                arcToRelative(5.27f, 5.27f, 0.0f, false, true, -5.24f, 5.24f)
                close()
                moveTo(106.53f, 77.46f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, true, -4.86f, -3.24f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, true, 6.86f, -6.86f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, true, -2.0f, 10.1f)
                close()
                moveTo(122.17f, 78.06f)
                arcToRelative(5.24f, 5.24f, 0.0f, false, true, -5.28f, -5.2f)
                arcToRelative(5.24f, 5.24f, 0.0f, true, true, 10.48f, -0.08f)
                arcToRelative(5.26f, 5.26f, 0.0f, false, true, -5.2f, 5.28f)
                close()
                moveTo(64.2f, 77.85f)
                curveToRelative(-7.66f, 0.0f, -13.86f, -6.21f, -13.86f, -13.86f)
                curveToRelative(0.0f, -7.66f, 6.21f, -13.86f, 13.87f, -13.86f)
                curveToRelative(7.66f, 0.0f, 13.86f, 6.22f, 13.85f, 13.87f)
                curveToRelative(-0.01f, 7.65f, -6.21f, 13.84f, -13.86f, 13.85f)
                close()
                moveTo(116.11f, 95.98f)
                arcToRelative(5.24f, 5.24f, 0.0f, false, true, -5.24f, -5.24f)
                arcToRelative(5.24f, 5.24f, 0.0f, false, true, 10.48f, 0.0f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, true, -5.25f, 5.24f)
                close()
                moveTo(64.6f, 128.0f)
                curveToRelative(-28.64f, 0.01f, -53.8f, -19.01f, -61.6f, -46.57f)
                curveTo(-4.8f, 53.88f, 6.66f, 24.49f, 31.05f, 9.49f)
                curveTo(55.44f, -5.52f, 86.84f, -2.49f, 107.91f, 16.9f)
                lineTo(92.78f, 32.79f)
                curveTo(75.95f, 17.6f, 50.12f, 18.48f, 34.37f, 34.78f)
                curveToRelative(-15.75f, 16.3f, -15.75f, 42.14f, 0.0f, 58.44f)
                curveToRelative(15.75f, 16.3f, 41.58f, 17.18f, 58.41f, 2.0f)
                lineToRelative(15.14f, 15.89f)
                arcToRelative(63.86f, 63.86f, 0.0f, false, true, -43.31f, 16.9f)
                close()
                moveTo(64.6f, 128.0f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
