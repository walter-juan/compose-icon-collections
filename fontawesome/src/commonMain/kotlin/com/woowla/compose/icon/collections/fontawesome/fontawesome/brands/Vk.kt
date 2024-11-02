package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Vk: ImageVector
    get() {
        if (_vk != null) {
            return _vk!!
        }
        _vk = Builder(name = "Vk", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.49f, 63.49f)
                curveTo(0.0f, 94.98f, 0.0f, 145.67f, 0.0f, 247.04f)
                verticalLineTo(264.96f)
                curveTo(0.0f, 366.33f, 0.0f, 417.02f, 31.49f, 448.51f)
                curveTo(62.98f, 480.0f, 113.67f, 480.0f, 215.04f, 480.0f)
                horizontalLineTo(232.96f)
                curveTo(334.33f, 480.0f, 385.02f, 480.0f, 416.51f, 448.51f)
                curveTo(448.0f, 417.02f, 448.0f, 366.33f, 448.0f, 264.96f)
                verticalLineTo(247.04f)
                curveTo(448.0f, 145.67f, 448.0f, 94.98f, 416.51f, 63.49f)
                curveTo(385.02f, 32.0f, 334.33f, 32.0f, 232.96f, 32.0f)
                horizontalLineTo(215.04f)
                curveTo(113.67f, 32.0f, 62.98f, 32.0f, 31.49f, 63.49f)
                close()
                moveTo(75.6f, 168.27f)
                horizontalLineTo(126.75f)
                curveTo(128.43f, 253.76f, 166.13f, 289.97f, 196.0f, 297.44f)
                verticalLineTo(168.27f)
                horizontalLineTo(244.16f)
                verticalLineTo(242.0f)
                curveTo(273.65f, 238.83f, 304.64f, 205.23f, 315.09f, 168.27f)
                horizontalLineTo(363.25f)
                curveTo(359.31f, 187.43f, 351.46f, 205.58f, 340.19f, 221.58f)
                curveTo(328.91f, 237.57f, 314.46f, 251.07f, 297.73f, 261.23f)
                curveTo(316.41f, 270.5f, 332.91f, 283.63f, 346.13f, 299.75f)
                curveTo(359.36f, 315.87f, 369.01f, 334.62f, 374.45f, 354.75f)
                horizontalLineTo(321.44f)
                curveTo(316.55f, 337.26f, 306.61f, 321.61f, 292.86f, 309.75f)
                curveTo(279.12f, 297.9f, 262.17f, 290.37f, 244.16f, 288.11f)
                verticalLineTo(354.75f)
                horizontalLineTo(238.37f)
                curveTo(136.27f, 354.75f, 78.03f, 284.75f, 75.6f, 168.27f)
                close()
            }
        }
        .build()
        return _vk!!
    }

private var _vk: ImageVector? = null
