package com.woowla.compose.icon.collections.devicons.devicons.ballerina

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.BallerinaGroup

public val BallerinaGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF46C0BC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.0f, 35.93f)
                verticalLineTo(0.0f)
                horizontalLineTo(59.08f)
                verticalLineTo(47.43f)
                lineTo(29.0f, 35.93f)
                close()
                moveTo(29.0f, 62.92f)
                lineTo(49.59f, 55.05f)
                lineTo(29.0f, 47.17f)
                verticalLineTo(62.92f)
                close()
                moveTo(29.0f, 74.17f)
                verticalLineTo(128.0f)
                horizontalLineTo(44.46f)
                lineTo(59.08f, 80.06f)
                verticalLineTo(62.66f)
                lineTo(29.0f, 74.17f)
                close()
                moveTo(99.59f, 35.93f)
                verticalLineTo(0.0f)
                horizontalLineTo(69.51f)
                verticalLineTo(47.43f)
                lineTo(99.59f, 35.93f)
                close()
                moveTo(99.59f, 47.17f)
                lineTo(79.0f, 55.05f)
                lineTo(99.59f, 62.92f)
                verticalLineTo(47.17f)
                close()
                moveTo(69.51f, 62.66f)
                verticalLineTo(80.06f)
                lineTo(84.13f, 128.0f)
                horizontalLineTo(99.59f)
                verticalLineTo(74.17f)
                lineTo(69.51f, 62.66f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
