package com.woowla.compose.icon.collections.devicons.devicons.nimble

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
import com.woowla.compose.icon.collections.devicons.devicons.NimbleGroup

public val NimbleGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.26f, 30.41f)
                verticalLineToRelative(61.51f)
                lineTo(64.0f, 116.32f)
                lineTo(64.0f, 51.33f)
                close()
                moveTo(20.81f, 53.07f)
                lineTo(23.04f, 56.11f)
                curveToRelative(1.53f, -0.25f, 3.07f, -0.54f, 4.87f, -0.1f)
                lineToRelative(2.3f, -2.83f)
                lineToRelative(2.35f, 3.69f)
                curveToRelative(1.91f, 0.25f, 3.6f, 1.17f, 5.33f, 2.08f)
                lineToRelative(2.62f, -2.37f)
                lineToRelative(1.58f, 4.82f)
                curveToRelative(1.68f, 1.61f, 2.15f, 2.42f, 2.82f, 3.49f)
                lineToRelative(2.47f, -0.89f)
                lineToRelative(-1.45f, 7.96f)
                lineToRelative(-0.11f, 0.27f)
                lineToRelative(-3.03f, 10.98f)
                curveToRelative(-2.17f, 5.59f, -8.6f, 6.5f, -12.57f, 5.17f)
                curveToRelative(-3.83f, -1.28f, -9.48f, -5.97f, -11.26f, -12.18f)
                lineToRelative(-2.37f, -11.06f)
                lineToRelative(-0.09f, -0.28f)
                lineToRelative(-1.09f, -7.43f)
                lineToRelative(1.88f, 1.61f)
                curveToRelative(0.52f, -0.71f, 0.89f, -1.27f, 2.23f, -2.13f)
                close()
                moveTo(27.05f, 62.28f)
                curveToRelative(-4.27f, 0.16f, -7.34f, 2.69f, -8.08f, 6.07f)
                lineToRelative(2.17f, 4.88f)
                lineToRelative(3.07f, 2.25f)
                lineToRelative(5.99f, -3.39f)
                lineToRelative(6.34f, 6.88f)
                lineToRelative(3.56f, -0.5f)
                lineToRelative(2.64f, -4.05f)
                curveToRelative(-1.12f, -5.15f, -6.48f, -10.55f, -12.55f, -11.85f)
                arcToRelative(12.64f, 12.64f, 0.0f, false, false, -3.16f, -0.29f)
                close()
                moveTo(125.74f, 30.41f)
                lineTo(64.0f, 51.33f)
                verticalLineToRelative(64.99f)
                lineToRelative(61.74f, -24.39f)
                close()
                moveTo(102.79f, 38.22f)
                lineTo(102.81f, 54.71f)
                reflectiveCurveToRelative(-1.72f, 0.75f, -3.16f, 2.12f)
                curveToRelative(-0.95f, 0.9f, -3.45f, -0.15f, -5.24f, -0.68f)
                curveToRelative(-0.69f, -0.2f, -2.63f, 2.05f, -2.63f, 2.05f)
                lineTo(91.78f, 41.94f)
                close()
                moveTo(102.79f, 38.22f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.1f, 10.12f)
                lineTo(29.99f, 21.33f)
                lineToRelative(11.07f, -3.63f)
                lineToRelative(61.74f, 20.52f)
                lineToRelative(23.04f, -7.8f)
                close()
                moveTo(29.99f, 21.33f)
                lineToRelative(-27.62f, 9.08f)
                lineToRelative(61.73f, 20.91f)
                lineToRelative(27.72f, -9.39f)
                close()
                moveTo(29.99f, 21.33f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
