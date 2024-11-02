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

public val BrandsGroup.Unity: ImageVector
    get() {
        if (_unity != null) {
            return _unity!!
        }
        _unity = Builder(name = "Unity", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.58f, 91.6f)
                lineTo(323.7f, 138.38f)
                curveTo(326.58f, 140.03f, 326.68f, 144.58f, 323.7f, 146.23f)
                lineTo(228.5f, 201.85f)
                curveTo(225.62f, 203.55f, 222.22f, 203.44f, 219.55f, 201.85f)
                lineTo(124.36f, 146.23f)
                curveTo(121.43f, 144.64f, 121.37f, 139.97f, 124.36f, 138.38f)
                lineTo(204.42f, 91.6f)
                verticalLineTo(0.0f)
                lineTo(0.0f, 119.42f)
                verticalLineTo(358.25f)
                lineTo(78.38f, 312.48f)
                verticalLineTo(218.91f)
                curveTo(78.33f, 215.58f, 82.21f, 213.19f, 85.09f, 214.99f)
                lineTo(180.28f, 270.62f)
                curveTo(183.16f, 272.32f, 184.78f, 275.34f, 184.78f, 278.46f)
                verticalLineTo(389.67f)
                curveTo(184.83f, 393.01f, 180.96f, 395.39f, 178.08f, 393.59f)
                lineTo(97.97f, 346.81f)
                lineTo(19.58f, 392.58f)
                lineTo(224.0f, 512.0f)
                lineTo(428.42f, 392.58f)
                lineTo(350.03f, 346.81f)
                lineTo(269.92f, 393.59f)
                curveTo(267.09f, 395.34f, 263.11f, 393.06f, 263.22f, 389.67f)
                verticalLineTo(278.46f)
                curveTo(263.22f, 275.13f, 265.05f, 272.16f, 267.72f, 270.62f)
                lineTo(362.91f, 214.99f)
                curveTo(365.74f, 213.24f, 369.72f, 215.47f, 369.62f, 218.91f)
                verticalLineTo(312.48f)
                lineTo(448.0f, 358.25f)
                verticalLineTo(119.42f)
                lineTo(243.58f, 0.0f)
                verticalLineTo(91.6f)
                close()
            }
        }
        .build()
        return _unity!!
    }

private var _unity: ImageVector? = null
