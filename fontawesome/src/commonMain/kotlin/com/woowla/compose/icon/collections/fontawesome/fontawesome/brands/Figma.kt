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

public val BrandsGroup.Figma: ImageVector
    get() {
        if (_figma != null) {
            return _figma!!
        }
        _figma = Builder(name = "Figma", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 95.79f)
                curveTo(14.0f, 42.89f, 56.89f, 0.0f, 109.79f, 0.0f)
                horizontalLineTo(274.16f)
                curveTo(327.07f, 0.0f, 369.95f, 42.89f, 369.95f, 95.79f)
                curveTo(369.95f, 129.29f, 352.76f, 158.78f, 326.71f, 175.9f)
                curveTo(352.76f, 193.02f, 369.95f, 222.5f, 369.95f, 256.0f)
                curveTo(369.95f, 308.91f, 327.07f, 351.8f, 274.16f, 351.8f)
                horizontalLineTo(272.08f)
                curveTo(247.28f, 351.8f, 224.68f, 342.37f, 207.67f, 326.9f)
                verticalLineTo(415.17f)
                curveTo(207.67f, 468.78f, 163.66f, 512.0f, 110.31f, 512.0f)
                curveTo(57.54f, 512.0f, 14.0f, 469.24f, 14.0f, 416.21f)
                curveTo(14.0f, 382.71f, 31.19f, 353.23f, 57.24f, 336.11f)
                curveTo(31.19f, 318.98f, 14.0f, 289.5f, 14.0f, 256.0f)
                curveTo(14.0f, 222.5f, 31.2f, 193.02f, 57.24f, 175.9f)
                curveTo(31.2f, 158.78f, 14.0f, 129.29f, 14.0f, 95.79f)
                close()
                moveTo(176.29f, 191.59f)
                horizontalLineTo(109.79f)
                curveTo(74.22f, 191.59f, 45.38f, 220.43f, 45.38f, 256.0f)
                curveTo(45.38f, 291.44f, 73.99f, 320.19f, 109.38f, 320.42f)
                curveTo(109.52f, 320.42f, 109.65f, 320.42f, 109.79f, 320.42f)
                horizontalLineTo(176.29f)
                verticalLineTo(191.59f)
                close()
                moveTo(207.67f, 256.0f)
                curveTo(207.67f, 291.58f, 236.51f, 320.42f, 272.08f, 320.42f)
                horizontalLineTo(274.16f)
                curveTo(309.74f, 320.42f, 338.58f, 291.58f, 338.58f, 256.0f)
                curveTo(338.58f, 220.43f, 309.74f, 191.59f, 274.16f, 191.59f)
                horizontalLineTo(272.08f)
                curveTo(236.51f, 191.59f, 207.67f, 220.43f, 207.67f, 256.0f)
                close()
                moveTo(109.79f, 351.8f)
                curveTo(109.65f, 351.8f, 109.52f, 351.79f, 109.38f, 351.79f)
                curveTo(73.99f, 352.02f, 45.38f, 380.77f, 45.38f, 416.21f)
                curveTo(45.38f, 451.65f, 74.6f, 480.62f, 110.31f, 480.62f)
                curveTo(146.59f, 480.62f, 176.29f, 451.19f, 176.29f, 415.17f)
                verticalLineTo(351.8f)
                horizontalLineTo(109.79f)
                close()
                moveTo(109.79f, 31.38f)
                curveTo(74.22f, 31.38f, 45.38f, 60.22f, 45.38f, 95.79f)
                curveTo(45.38f, 131.37f, 74.22f, 160.21f, 109.79f, 160.21f)
                horizontalLineTo(176.29f)
                verticalLineTo(31.38f)
                horizontalLineTo(109.79f)
                close()
                moveTo(207.67f, 160.21f)
                horizontalLineTo(274.16f)
                curveTo(309.74f, 160.21f, 338.58f, 131.37f, 338.58f, 95.79f)
                curveTo(338.58f, 60.22f, 309.74f, 31.38f, 274.16f, 31.38f)
                horizontalLineTo(207.67f)
                verticalLineTo(160.21f)
                close()
            }
        }
        .build()
        return _figma!!
    }

private var _figma: ImageVector? = null
