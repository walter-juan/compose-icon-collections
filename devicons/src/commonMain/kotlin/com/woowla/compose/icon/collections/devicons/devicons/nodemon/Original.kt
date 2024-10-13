package com.woowla.compose.icon.collections.devicons.devicons.nodemon

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
import com.woowla.compose.icon.collections.devicons.devicons.NodemonGroup

public val NodemonGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF76d04b)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(61.06f, 125.21f)
                arcToRelative(5.86f, 5.86f, 0.0f, false, false, 5.87f, 0.0f)
                lineToRelative(48.61f, -28.05f)
                arcToRelative(5.87f, 5.87f, 0.0f, false, false, 2.94f, -5.09f)
                verticalLineTo(35.94f)
                arcToRelative(5.88f, 5.88f, 0.0f, false, false, -2.93f, -5.08f)
                lineTo(66.93f, 2.78f)
                arcToRelative(5.88f, 5.88f, 0.0f, false, false, -5.87f, 0.0f)
                lineToRelative(-48.59f, 28.07f)
                arcToRelative(5.87f, 5.87f, 0.0f, false, false, -2.93f, 5.09f)
                verticalLineTo(92.08f)
                arcToRelative(5.87f, 5.87f, 0.0f, false, false, 2.94f, 5.08f)
                lineTo(61.06f, 125.21f)
            }
            path(fill = SolidColor(Color(0xFF4f4d3f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(95.47f, 50.62f)
                lineTo(93.3f, 49.37f)
                curveToRelative(3.33f, -4.92f, 5.32f, -12.31f, 2.83f, -23.36f)
                curveToRelative(0.0f, 0.0f, -5.63f, 15.77f, -16.93f, 15.24f)
                lineToRelative(-13.24f, -7.62f)
                arcToRelative(3.45f, 3.45f, 0.0f, false, false, -1.62f, -0.47f)
                horizontalLineToRelative(-0.31f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, -1.63f, 0.47f)
                lineToRelative(-13.24f, 7.62f)
                curveToRelative(-11.31f, 0.52f, -16.93f, -15.24f, -16.93f, -15.24f)
                curveToRelative(-2.5f, 11.05f, -0.5f, 18.44f, 2.83f, 23.36f)
                lineToRelative(-2.17f, 1.25f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, false, -1.78f, 3.1f)
                lineToRelative(0.06f, 45.73f)
                curveToRelative(0.0f, 0.64f, 0.33f, 1.23f, 0.89f, 1.54f)
                curveToRelative(0.55f, 0.33f, 1.23f, 0.33f, 1.77f, 0.0f)
                lineToRelative(17.54f, -10.04f)
                curveToRelative(1.11f, -0.66f, 1.78f, -1.82f, 1.78f, -3.09f)
                verticalLineTo(66.49f)
                arcToRelative(3.55f, 3.55f, 0.0f, false, true, 1.78f, -3.09f)
                lineToRelative(7.47f, -4.3f)
                arcToRelative(3.52f, 3.52f, 0.0f, false, true, 1.79f, -0.48f)
                curveToRelative(0.61f, 0.0f, 1.23f, 0.16f, 1.77f, 0.48f)
                lineToRelative(7.47f, 4.3f)
                arcToRelative(3.55f, 3.55f, 0.0f, false, true, 1.78f, 3.09f)
                verticalLineTo(87.85f)
                curveToRelative(0.0f, 1.27f, 0.68f, 2.44f, 1.79f, 3.09f)
                lineToRelative(17.53f, 10.04f)
                curveToRelative(0.55f, 0.33f, 1.24f, 0.33f, 1.78f, 0.0f)
                curveToRelative(0.54f, -0.31f, 0.88f, -0.9f, 0.88f, -1.54f)
                lineToRelative(0.06f, -45.73f)
                arcToRelative(3.56f, 3.56f, 0.0f, false, false, -1.78f, -3.1f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
