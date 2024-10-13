package com.woowla.compose.icon.collections.devicons.devicons.confluence

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ConfluenceGroup

public val ConfluenceGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF136be6)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(97.25f, 2.67f)
                arcToRelative(4.02f, 4.02f, 0.0f, false, false, -3.29f, 1.95f)
                arcToRelative(178.07f, 178.07f, 0.0f, false, true, -3.87f, 6.58f)
                curveToRelative(-10.44f, 17.21f, -21.07f, 15.28f, -40.01f, 6.19f)
                lineTo(23.79f, 5.01f)
                curveToRelative(-2.12f, -0.97f, -4.44f, 0.0f, -5.41f, 1.93f)
                lineTo(5.82f, 35.37f)
                curveToRelative(-0.97f, 1.94f, 0.0f, 4.45f, 1.93f, 5.42f)
                curveToRelative(5.6f, 2.52f, 16.62f, 7.74f, 26.28f, 12.57f)
                curveToRelative(35.77f, 17.03f, 66.11f, 16.06f, 89.31f, -21.66f)
                horizontalLineToRelative(0.0f)
                arcToRelative(332.06f, 332.06f, 0.0f, false, false, 4.06f, -6.58f)
                curveToRelative(1.16f, -1.93f, 0.58f, -4.45f, -1.36f, -5.61f)
                lineTo(99.57f, 3.26f)
                arcToRelative(4.14f, 4.14f, 0.0f, false, false, -2.32f, -0.59f)
                close()
                moveTo(53.17f, 63.97f)
                curveToRelative(-18.45f, 0.42f, -34.75f, 9.93f, -48.52f, 32.33f)
                arcToRelative(332.06f, 332.06f, 0.0f, false, false, -4.06f, 6.58f)
                curveToRelative(-1.16f, 1.93f, -0.58f, 4.45f, 1.36f, 5.61f)
                lineToRelative(26.49f, 16.25f)
                curveToRelative(1.93f, 1.16f, 4.44f, 0.58f, 5.6f, -1.36f)
                arcToRelative(185.8f, 185.8f, 0.0f, false, true, 3.87f, -6.58f)
                curveToRelative(10.44f, -17.21f, 21.07f, -15.28f, 40.02f, -6.19f)
                lineToRelative(26.29f, 12.38f)
                curveToRelative(2.12f, 0.97f, 4.45f, 0.0f, 5.41f, -1.93f)
                lineToRelative(12.57f, -28.43f)
                curveToRelative(0.96f, -1.94f, -0.0f, -4.45f, -1.94f, -5.42f)
                curveToRelative(-5.6f, -2.52f, -16.62f, -7.74f, -26.28f, -12.57f)
                curveToRelative(-14.53f, -6.99f, -28.16f, -10.96f, -40.79f, -10.67f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
