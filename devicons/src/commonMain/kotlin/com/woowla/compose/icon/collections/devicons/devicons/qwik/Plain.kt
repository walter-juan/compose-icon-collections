package com.woowla.compose.icon.collections.devicons.devicons.qwik

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.QwikGroup

public val QwikGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF18B6F6)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(77.73f, 15.32f)
                lineTo(69.33f, 15.56f)
                lineTo(44.23f, 15.63f)
                curveTo(39.5f, 15.66f, 35.12f, 18.18f, 32.72f, 22.26f)
                lineTo(17.48f, 52.54f)
                lineTo(17.61f, 52.37f)
                curveTo(14.76f, 56.71f, 14.52f, 62.61f, 17.21f, 67.11f)
                lineTo(33.13f, 93.53f)
                curveTo(35.56f, 97.58f, 39.38f, 100.18f, 44.72f, 99.99f)
                curveTo(56.03f, 99.59f, 61.0f, 99.59f, 61.0f, 99.59f)
                lineTo(95.66f, 112.55f)
                lineTo(94.77f, 111.65f)
                lineTo(95.47f, 112.34f)
                curveTo(96.07f, 112.93f, 97.06f, 112.22f, 96.66f, 111.5f)
                lineTo(87.73f, 93.94f)
                lineTo(104.29f, 63.96f)
                curveTo(106.79f, 58.79f, 107.69f, 54.26f, 105.21f, 49.71f)
                lineTo(101.69f, 43.22f)
                lineTo(99.86f, 39.89f)
                lineTo(99.15f, 38.6f)
                lineTo(99.09f, 38.67f)
                lineTo(89.5f, 22.04f)
                curveTo(87.08f, 17.84f, 82.58f, 15.27f, 77.73f, 15.32f)
                close()
                moveTo(95.66f, 112.55f)
                lineTo(95.67f, 112.56f)
                lineTo(95.67f, 112.55f)
                lineTo(95.66f, 112.55f)
                close()
                moveTo(44.76f, 18.59f)
                lineTo(80.55f, 57.95f)
                lineTo(74.15f, 64.45f)
                lineTo(77.95f, 95.03f)
                lineTo(40.93f, 58.42f)
                lineTo(50.08f, 49.6f)
                lineTo(44.7f, 18.76f)
                lineTo(19.69f, 49.79f)
                lineTo(44.76f, 18.59f)
                close()
                moveTo(78.03f, 95.17f)
                lineTo(78.03f, 95.25f)
                lineTo(78.0f, 95.26f)
                lineTo(78.0f, 95.21f)
                lineTo(78.03f, 95.17f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
