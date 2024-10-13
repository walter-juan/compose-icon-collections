package com.woowla.compose.icon.collections.devicons.devicons.algolia

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.AlgoliaGroup

public val AlgoliaGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF003dff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, -0.04f)
                curveTo(29.02f, -0.04f, 0.51f, 28.16f, 0.01f, 63.01f)
                curveToRelative(-0.51f, 35.4f, 28.21f, 64.73f, 63.61f, 64.94f)
                curveToRelative(10.93f, 0.06f, 21.47f, -2.61f, 30.82f, -7.69f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.28f, -2.44f)
                lineToRelative(-5.99f, -5.31f)
                curveToRelative(-1.22f, -1.08f, -2.95f, -1.38f, -4.45f, -0.75f)
                curveToRelative(-6.53f, 2.78f, -13.62f, 4.2f, -20.93f, 4.11f)
                curveToRelative(-28.61f, -0.35f, -51.72f, -24.15f, -51.27f, -52.76f)
                curveToRelative(0.45f, -28.24f, 23.57f, -51.08f, 51.92f, -51.08f)
                horizontalLineToRelative(51.92f)
                verticalLineToRelative(92.29f)
                lineToRelative(-29.46f, -26.18f)
                curveToRelative(-0.95f, -0.85f, -2.41f, -0.68f, -3.18f, 0.34f)
                curveToRelative(-4.73f, 6.26f, -12.43f, 10.15f, -20.99f, 9.56f)
                curveToRelative(-11.87f, -0.82f, -21.48f, -10.37f, -22.37f, -22.24f)
                curveToRelative(-1.06f, -14.15f, 10.15f, -26.0f, 24.08f, -26.0f)
                curveToRelative(12.6f, 0.0f, 22.97f, 9.7f, 24.06f, 22.02f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 1.42f, 2.85f)
                lineToRelative(7.67f, 6.8f)
                curveToRelative(0.87f, 0.77f, 2.25f, 0.3f, 2.46f, -0.85f)
                curveToRelative(0.55f, -2.96f, 0.75f, -6.04f, 0.53f, -9.2f)
                curveToRelative(-1.24f, -18.02f, -15.83f, -32.51f, -33.86f, -33.63f)
                curveToRelative(-20.67f, -1.27f, -37.95f, 14.89f, -38.49f, 35.16f)
                curveToRelative(-0.54f, 19.75f, 15.65f, 36.78f, 35.4f, 37.21f)
                arcToRelative(36.03f, 36.03f, 0.0f, false, false, 22.07f, -6.9f)
                lineToRelative(38.49f, 34.12f)
                curveToRelative(1.65f, 1.46f, 4.26f, 0.29f, 4.26f, -1.91f)
                verticalLineTo(2.39f)
                arcToRelative(2.43f, 2.43f, 0.0f, false, false, -2.43f, -2.43f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
