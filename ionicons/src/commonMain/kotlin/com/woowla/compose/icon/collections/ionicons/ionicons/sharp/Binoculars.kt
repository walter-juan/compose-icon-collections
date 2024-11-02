package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.Binoculars: ImageVector
    get() {
        if (_binoculars != null) {
            return _binoculars!!
        }
        _binoculars = Builder(name = "Binoculars", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(164.0f, 64.0f)
                curveTo(142.71f, 64.0f, 126.82f, 70.76f, 114.92f, 82.83f)
                curveTo(103.85f, 94.06f, 97.37f, 108.87f, 92.13f, 122.11f)
                lineTo(23.28f, 305.69f)
                curveTo(22.61f, 307.39f, 21.55f, 310.28f, 20.97f, 312.02f)
                curveTo(20.72f, 312.7f, 20.52f, 313.39f, 20.37f, 314.08f)
                curveTo(17.53f, 323.56f, 16.0f, 333.6f, 16.0f, 344.0f)
                curveTo(16.0f, 401.44f, 62.56f, 448.0f, 120.0f, 448.0f)
                curveTo(177.44f, 448.0f, 224.0f, 401.44f, 224.0f, 344.0f)
                verticalLineTo(283.54f)
                lineTo(224.04f, 283.53f)
                lineTo(288.0f, 283.54f)
                verticalLineTo(343.89f)
                lineTo(288.0f, 344.0f)
                curveTo(288.0f, 401.44f, 334.56f, 448.0f, 392.0f, 448.0f)
                curveTo(449.44f, 448.0f, 496.0f, 401.44f, 496.0f, 344.0f)
                curveTo(496.0f, 333.6f, 494.47f, 323.56f, 491.63f, 314.08f)
                curveTo(491.31f, 313.0f, 488.72f, 305.69f, 488.72f, 305.69f)
                lineTo(420.51f, 123.78f)
                lineTo(419.88f, 122.11f)
                curveTo(414.63f, 108.87f, 408.15f, 94.06f, 397.08f, 82.83f)
                curveTo(385.18f, 70.76f, 369.29f, 64.0f, 348.0f, 64.0f)
                curveTo(329.56f, 64.0f, 314.07f, 71.24f, 303.39f, 83.61f)
                curveTo(292.94f, 95.71f, 288.0f, 111.64f, 288.0f, 128.0f)
                verticalLineTo(162.81f)
                lineTo(224.0f, 162.81f)
                verticalLineTo(128.0f)
                curveTo(224.0f, 111.64f, 219.06f, 95.71f, 208.61f, 83.61f)
                curveTo(197.93f, 71.24f, 182.44f, 64.0f, 164.0f, 64.0f)
                close()
                moveTo(56.0f, 344.0f)
                curveTo(56.0f, 308.65f, 84.65f, 280.0f, 120.0f, 280.0f)
                curveTo(155.35f, 280.0f, 184.0f, 308.65f, 184.0f, 344.0f)
                curveTo(184.0f, 379.35f, 155.35f, 408.0f, 120.0f, 408.0f)
                curveTo(84.65f, 408.0f, 56.0f, 379.35f, 56.0f, 344.0f)
                close()
                moveTo(328.0f, 344.0f)
                curveTo(328.0f, 308.65f, 356.65f, 280.0f, 392.0f, 280.0f)
                curveTo(427.35f, 280.0f, 456.0f, 308.65f, 456.0f, 344.0f)
                curveTo(456.0f, 379.35f, 427.35f, 408.0f, 392.0f, 408.0f)
                curveTo(356.65f, 408.0f, 328.0f, 379.35f, 328.0f, 344.0f)
                close()
            }
        }
        .build()
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
