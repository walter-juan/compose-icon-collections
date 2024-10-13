package com.woowla.compose.icon.collections.devicons.devicons.jasmine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.JasmineGroup

public val JasmineGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF8a4182)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 64.0f, 64.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 64.0f, 0.0f)
                close()
                moveTo(71.57f, 13.4f)
                arcToRelative(50.62f, 50.62f, 0.0f, false, true, 42.7f, 49.99f)
                arcToRelative(50.62f, 50.62f, 0.0f, false, true, -50.62f, 50.63f)
                verticalLineToRelative(-0.01f)
                arcTo(50.62f, 50.62f, 0.0f, true, true, 71.57f, 13.4f)
                close()
                moveTo(56.33f, 22.79f)
                verticalLineToRelative(26.3f)
                lineToRelative(2.61f, 3.35f)
                horizontalLineToRelative(9.65f)
                lineToRelative(2.44f, -3.35f)
                verticalLineToRelative(-26.3f)
                close()
                moveTo(86.55f, 28.19f)
                lineTo(74.82f, 44.33f)
                lineToRelative(3.24f, 2.36f)
                lineTo(89.79f, 30.54f)
                close()
                moveTo(41.39f, 28.19f)
                lineTo(38.14f, 30.54f)
                lineTo(49.87f, 46.68f)
                lineToRelative(3.24f, -2.36f)
                close()
                moveTo(28.09f, 43.42f)
                lineToRelative(-4.55f, 13.98f)
                lineToRelative(25.02f, 8.13f)
                lineToRelative(3.99f, -1.44f)
                lineToRelative(2.98f, -9.18f)
                lineToRelative(-2.43f, -3.36f)
                close()
                moveTo(99.49f, 43.42f)
                lineTo(74.48f, 51.53f)
                lineTo(72.1f, 55.04f)
                lineTo(75.08f, 64.24f)
                lineTo(79.02f, 65.52f)
                lineTo(104.04f, 57.39f)
                close()
                moveTo(84.5f, 67.29f)
                lineTo(83.26f, 71.1f)
                lineTo(102.24f, 77.27f)
                lineTo(103.47f, 73.46f)
                close()
                moveTo(42.93f, 67.3f)
                lineTo(23.96f, 73.46f)
                lineTo(25.2f, 77.27f)
                lineTo(44.17f, 71.11f)
                close()
                moveTo(53.81f, 67.82f)
                lineTo(49.88f, 69.09f)
                lineTo(34.41f, 90.38f)
                lineTo(46.31f, 99.02f)
                lineTo(61.76f, 77.73f)
                lineTo(61.63f, 73.5f)
                close()
                moveTo(73.62f, 67.86f)
                lineTo(65.8f, 73.54f)
                verticalLineToRelative(4.15f)
                lineTo(81.26f, 98.97f)
                lineToRelative(11.89f, -8.64f)
                lineToRelative(-15.46f, -21.28f)
                close()
                moveTo(61.53f, 83.42f)
                verticalLineToRelative(19.95f)
                horizontalLineToRelative(4.01f)
                verticalLineToRelative(-19.95f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
