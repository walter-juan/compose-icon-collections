package com.woowla.compose.icon.collections.devicons.devicons.solidjs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.SolidjsGroup

public val SolidjsGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(61.83f, 4.74f)
                curveToRelative(-3.2f, 0.06f, -6.37f, 0.4f, -9.45f, 1.07f)
                lineToRelative(-2.4f, 0.8f)
                curveToRelative(-4.81f, 1.6f, -8.81f, 4.01f, -11.22f, 7.21f)
                lineToRelative(-1.6f, 2.4f)
                lineToRelative(-12.02f, 20.83f)
                lineToRelative(0.17f, 0.03f)
                curveToRelative(-4.78f, 5.82f, -5.01f, 14.07f, -0.17f, 21.6f)
                curveToRelative(1.8f, 2.35f, 4.07f, 4.43f, 6.63f, 6.23f)
                lineToRelative(-15.44f, 4.98f)
                lineTo(0.31f, 97.95f)
                reflectiveCurveToRelative(42.46f, 32.04f, 75.31f, 24.03f)
                lineToRelative(2.4f, -0.8f)
                curveToRelative(5.32f, -1.57f, 9.29f, -4.48f, 11.68f, -8.07f)
                lineToRelative(0.33f, 0.06f)
                lineToRelative(16.02f, -28.84f)
                curveToRelative(3.2f, -5.61f, 2.4f, -12.02f, -1.6f, -18.42f)
                arcToRelative(36.05f, 36.05f, 0.0f, false, false, -7.06f, -6.64f)
                lineToRelative(15.87f, -5.38f)
                lineToRelative(14.42f, -24.03f)
                reflectiveCurveTo(92.82f, 4.19f, 61.83f, 4.74f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
