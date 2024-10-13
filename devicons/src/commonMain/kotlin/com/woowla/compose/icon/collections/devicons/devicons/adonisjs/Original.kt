package com.woowla.compose.icon.collections.devicons.devicons.adonisjs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.AdonisjsGroup

public val AdonisjsGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF5A45FF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.0f, 64.0f)
                curveToRelative(0.0f, 51.62f, 12.38f, 64.0f, 64.0f, 64.0f)
                curveToRelative(51.62f, 0.0f, 64.0f, -12.38f, 64.0f, -64.0f)
                curveToRelative(0.0f, -51.62f, -12.38f, -64.0f, -64.0f, -64.0f)
                curveTo(12.38f, 0.0f, 0.0f, 12.38f, 0.0f, 64.0f)
                close()
                moveTo(25.81f, 77.29f)
                lineToRelative(20.08f, -45.62f)
                curveTo(49.27f, 23.98f, 55.79f, 19.81f, 64.0f, 19.81f)
                curveToRelative(8.21f, 0.0f, 14.73f, 4.17f, 18.12f, 11.86f)
                lineToRelative(20.07f, 45.62f)
                curveToRelative(0.91f, 2.22f, 1.69f, 5.08f, 1.69f, 7.56f)
                curveToRelative(0.0f, 11.34f, -7.95f, 19.29f, -19.29f, 19.29f)
                curveToRelative(-3.86f, 0.0f, -6.93f, -0.99f, -10.03f, -1.98f)
                curveToRelative(-3.18f, -1.02f, -6.4f, -2.06f, -10.56f, -2.06f)
                curveToRelative(-4.11f, 0.0f, -7.41f, 1.04f, -10.65f, 2.07f)
                curveToRelative(-3.14f, 0.99f, -6.22f, 1.97f, -9.94f, 1.97f)
                curveToRelative(-11.34f, 0.0f, -19.29f, -7.95f, -19.29f, -19.29f)
                curveToRelative(0.0f, -2.48f, 0.78f, -5.34f, 1.7f, -7.56f)
                close()
                moveTo(64.0f, 39.63f)
                lineToRelative(-19.81f, 44.84f)
                curveToRelative(5.87f, -2.74f, 12.64f, -4.04f, 19.81f, -4.04f)
                curveToRelative(6.91f, 0.0f, 13.95f, 1.3f, 19.55f, 4.04f)
                lineTo(64.0f, 39.63f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
