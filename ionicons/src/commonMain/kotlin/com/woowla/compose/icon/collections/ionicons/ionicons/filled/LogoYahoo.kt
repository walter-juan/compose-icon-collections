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

public val FilledGroup.LogoYahoo: ImageVector
    get() {
        if (_logoYahoo != null) {
            return _logoYahoo!!
        }
        _logoYahoo = Builder(name = "LogoYahoo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 139.01f)
                horizontalLineTo(97.65f)
                lineTo(154.51f, 284.74f)
                lineTo(212.11f, 139.01f)
                horizontalLineTo(307.17f)
                lineTo(164.02f, 484.0f)
                horizontalLineTo(68.34f)
                lineTo(107.53f, 392.58f)
                lineTo(0.0f, 139.01f)
                horizontalLineTo(0.0f)
                close()
                moveTo(417.5f, 256.0f)
                horizontalLineTo(311.0f)
                lineTo(405.91f, 28.0f)
                lineTo(512.0f, 28.0f)
                lineTo(417.5f, 256.0f)
                close()
                moveTo(339.29f, 277.22f)
                curveTo(371.96f, 277.22f, 398.45f, 303.75f, 398.45f, 336.48f)
                curveTo(398.45f, 369.21f, 371.96f, 395.74f, 339.29f, 395.74f)
                curveTo(306.63f, 395.74f, 280.15f, 369.21f, 280.15f, 336.48f)
                curveTo(280.15f, 303.75f, 306.63f, 277.22f, 339.29f, 277.22f)
                close()
            }
        }
        .build()
        return _logoYahoo!!
    }

private var _logoYahoo: ImageVector? = null
