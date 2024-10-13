package com.woowla.compose.icon.collections.devicons.devicons.moleculer

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.MoleculerGroup

public val MoleculerGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF3cafce)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(79.97f, 10.02f)
                curveToRelative(-6.89f, 0.0f, -12.48f, 5.59f, -12.48f, 12.48f)
                arcToRelative(12.48f, 12.48f, 0.0f, false, false, 6.63f, 10.99f)
                lineToRelative(-6.89f, 13.07f)
                arcToRelative(17.01f, 17.01f, 0.0f, false, false, -5.21f, -0.83f)
                curveToRelative(-9.37f, 0.0f, -16.96f, 7.59f, -16.96f, 16.96f)
                curveToRelative(0.01f, 1.21f, 0.16f, 2.42f, 0.43f, 3.6f)
                lineToRelative(-13.71f, 5.02f)
                arcToRelative(14.36f, 14.36f, 0.0f, false, false, -12.16f, -6.72f)
                curveToRelative(-7.94f, 0.0f, -14.37f, 6.43f, -14.37f, 14.37f)
                curveToRelative(0.0f, 7.93f, 6.43f, 14.37f, 14.37f, 14.37f)
                curveToRelative(7.93f, 0.0f, 14.37f, -6.43f, 14.37f, -14.37f)
                arcToRelative(14.5f, 14.5f, 0.0f, false, false, -0.34f, -3.07f)
                lineToRelative(13.14f, -5.77f)
                arcToRelative(16.96f, 16.96f, 0.0f, false, false, 15.23f, 9.55f)
                arcTo(16.96f, 16.96f, 0.0f, false, false, 72.3f, 76.12f)
                lineToRelative(11.06f, 10.53f)
                arcToRelative(20.85f, 20.85f, 0.0f, false, false, -3.65f, 11.72f)
                curveToRelative(0.0f, 11.51f, 9.33f, 20.83f, 20.83f, 20.83f)
                curveToRelative(11.51f, 0.0f, 20.83f, -9.32f, 20.83f, -20.83f)
                curveToRelative(0.0f, -11.5f, -9.32f, -20.83f, -20.83f, -20.83f)
                arcToRelative(20.85f, 20.85f, 0.0f, false, false, -13.13f, 4.71f)
                lineToRelative(-11.77f, -9.53f)
                arcToRelative(16.96f, 16.96f, 0.0f, false, false, 3.33f, -10.02f)
                arcToRelative(16.97f, 16.97f, 0.0f, false, false, -7.36f, -13.98f)
                lineToRelative(5.84f, -14.02f)
                curveToRelative(0.83f, 0.18f, 1.67f, 0.28f, 2.52f, 0.29f)
                curveToRelative(6.89f, 0.0f, 12.48f, -5.59f, 12.48f, -12.48f)
                curveToRelative(0.0f, -6.89f, -5.59f, -12.48f, -12.48f, -12.48f)
                close()
                moveTo(79.97f, 10.02f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
