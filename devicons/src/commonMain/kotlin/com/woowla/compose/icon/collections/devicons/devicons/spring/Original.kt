package com.woowla.compose.icon.collections.devicons.devicons.spring

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.SpringGroup

public val SpringGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF77bc1f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.45f, 6.64f)
                arcToRelative(59.1f, 59.1f, 0.0f, false, true, -6.84f, 12.14f)
                arcTo(64.25f, 64.25f, 0.0f, false, false, 64.21f, -0.03f)
                curveTo(28.98f, -0.03f, 0.0f, 28.98f, 0.0f, 64.24f)
                arcToRelative(64.32f, 64.32f, 0.0f, false, false, 19.94f, 46.56f)
                lineToRelative(2.37f, 2.1f)
                arcToRelative(64.22f, 64.22f, 0.0f, false, false, 41.36f, 15.12f)
                curveToRelative(33.49f, 0.0f, 61.64f, -26.24f, 64.02f, -59.68f)
                curveToRelative(1.75f, -16.37f, -3.05f, -37.08f, -11.24f, -61.7f)
                close()
                moveTo(29.07f, 111.17f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -4.27f, 2.03f)
                curveToRelative(-3.02f, 0.0f, -5.49f, -2.48f, -5.49f, -5.5f)
                curveToRelative(0.0f, -3.02f, 2.48f, -5.5f, 5.49f, -5.5f)
                curveToRelative(1.25f, 0.0f, 2.48f, 0.43f, 3.45f, 1.23f)
                curveToRelative(2.35f, 1.9f, 2.72f, 5.38f, 0.82f, 7.74f)
                close()
                moveTo(116.19f, 91.93f)
                curveToRelative(-15.84f, 21.12f, -49.68f, 14.0f, -71.38f, 15.02f)
                curveToRelative(0.0f, 0.0f, -3.85f, 0.23f, -7.72f, 0.87f)
                curveToRelative(0.0f, 0.0f, 1.45f, -0.62f, 3.34f, -1.33f)
                curveToRelative(15.23f, -5.3f, 22.43f, -6.34f, 31.68f, -11.09f)
                curveToRelative(17.43f, -8.87f, 34.65f, -28.27f, 38.24f, -48.46f)
                curveToRelative(-6.64f, 19.42f, -26.75f, 36.11f, -45.08f, 42.9f)
                curveToRelative(-12.56f, 4.64f, -35.24f, 9.14f, -35.24f, 9.14f)
                lineToRelative(-0.92f, -0.48f)
                curveToRelative(-15.44f, -7.52f, -15.91f, -40.98f, 12.16f, -51.78f)
                curveToRelative(12.29f, -4.74f, 24.05f, -2.13f, 37.32f, -5.3f)
                curveToRelative(14.18f, -3.37f, 30.57f, -14.0f, 37.24f, -27.87f)
                curveToRelative(7.47f, 22.19f, 16.46f, 56.93f, 0.35f, 78.4f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
