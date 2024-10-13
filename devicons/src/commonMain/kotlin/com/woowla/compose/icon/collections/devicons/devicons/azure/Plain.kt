package com.woowla.compose.icon.collections.devicons.devicons.azure

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.AzureGroup

public val AzureGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF474747)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.98f, 4.65f)
                arcToRelative(5.91f, 5.91f, 0.0f, false, true, 5.6f, 4.02f)
                lineToRelative(35.91f, 106.4f)
                arcToRelative(5.91f, 5.91f, 0.0f, false, true, -5.6f, 7.8f)
                horizontalLineToRelative(41.38f)
                arcToRelative(5.92f, 5.92f, 0.0f, false, false, 4.8f, -2.46f)
                arcToRelative(5.91f, 5.91f, 0.0f, false, false, 0.8f, -5.34f)
                lineTo(90.96f, 8.67f)
                arcToRelative(5.91f, 5.91f, 0.0f, false, false, -5.6f, -4.02f)
                close()
                moveTo(42.65f, 5.13f)
                arcToRelative(5.92f, 5.92f, 0.0f, false, false, -5.61f, 4.03f)
                lineTo(1.13f, 115.55f)
                arcToRelative(5.91f, 5.91f, 0.0f, false, false, 5.6f, 7.8f)
                horizontalLineToRelative(28.89f)
                curveToRelative(1.24f, 0.0f, 2.45f, -0.41f, 3.45f, -1.11f)
                arcToRelative(5.92f, 5.92f, 0.0f, false, false, 2.16f, -2.92f)
                lineToRelative(7.02f, -20.71f)
                lineToRelative(-13.41f, -12.86f)
                curveToRelative(-0.25f, -0.27f, -1.35f, -2.27f, -0.37f, -4.0f)
                curveToRelative(1.11f, -1.66f, 2.95f, -1.66f, 2.95f, -1.66f)
                horizontalLineToRelative(17.28f)
                lineToRelative(9.07f, -26.15f)
                lineTo(48.27f, 8.32f)
                curveToRelative(-0.04f, -0.2f, -0.91f, -1.37f, -2.28f, -2.28f)
                curveToRelative(-1.37f, -0.92f, -3.35f, -0.91f, -3.35f, -0.91f)
                close()
                moveTo(37.77f, 80.87f)
                arcToRelative(2.72f, 2.72f, 0.0f, false, false, -1.86f, 4.72f)
                lineToRelative(37.83f, 35.31f)
                curveToRelative(1.1f, 1.03f, 2.5f, 1.63f, 4.01f, 1.63f)
                curveToRelative(0.0f, 0.0f, 1.28f, 0.07f, 2.06f, -0.03f)
                curveToRelative(1.82f, -0.27f, 3.53f, -1.77f, 4.09f, -2.39f)
                curveToRelative(1.46f, -1.94f, 0.79f, -4.95f, 0.79f, -4.95f)
                lineToRelative(-11.45f, -34.28f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
