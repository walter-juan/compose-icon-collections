package com.woowla.compose.icon.collections.ionicons.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.FilledGroup

public val FilledGroup.LogoGitlab: ImageVector
    get() {
        if (_logoGitlab != null) {
            return _logoGitlab!!
        }
        _logoGitlab = Builder(name = "LogoGitlab", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(488.03f, 207.68f)
                lineTo(487.35f, 205.95f)
                lineTo(422.02f, 34.79f)
                curveTo(420.69f, 31.44f, 418.34f, 28.59f, 415.3f, 26.67f)
                curveTo(412.25f, 24.77f, 408.7f, 23.86f, 405.13f, 24.05f)
                curveTo(401.55f, 24.24f, 398.12f, 25.53f, 395.3f, 27.75f)
                curveTo(392.51f, 30.02f, 390.48f, 33.1f, 389.5f, 36.58f)
                lineTo(345.39f, 172.05f)
                horizontalLineTo(166.76f)
                lineTo(122.64f, 36.58f)
                curveTo(121.68f, 33.09f, 119.65f, 29.99f, 116.84f, 27.72f)
                curveTo(114.02f, 25.51f, 110.59f, 24.22f, 107.01f, 24.03f)
                curveTo(103.44f, 23.83f, 99.89f, 24.75f, 96.85f, 26.64f)
                curveTo(93.81f, 28.58f, 91.46f, 31.42f, 90.12f, 34.77f)
                lineTo(24.66f, 205.85f)
                lineTo(24.01f, 207.58f)
                curveTo(14.61f, 232.25f, 13.45f, 259.31f, 20.71f, 284.7f)
                curveTo(27.97f, 310.09f, 43.25f, 332.42f, 64.26f, 348.33f)
                lineTo(64.48f, 348.5f)
                lineTo(65.08f, 348.93f)
                lineTo(164.61f, 423.74f)
                lineTo(213.84f, 461.15f)
                lineTo(243.84f, 483.88f)
                curveTo(247.35f, 486.55f, 251.63f, 488.0f, 256.03f, 488.0f)
                curveTo(260.44f, 488.0f, 264.72f, 486.55f, 268.23f, 483.88f)
                lineTo(298.22f, 461.15f)
                lineTo(347.46f, 423.74f)
                lineTo(447.59f, 348.48f)
                lineTo(447.84f, 348.28f)
                curveTo(468.8f, 332.37f, 484.05f, 310.06f, 491.29f, 284.71f)
                curveTo(498.54f, 259.35f, 497.39f, 232.32f, 488.03f, 207.68f)
                close()
            }
        }
        .build()
        return _logoGitlab!!
    }

private var _logoGitlab: ImageVector? = null
