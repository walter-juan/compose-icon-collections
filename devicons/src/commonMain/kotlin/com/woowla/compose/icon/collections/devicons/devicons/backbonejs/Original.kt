package com.woowla.compose.icon.collections.devicons.devicons.backbonejs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.BackbonejsGroup

public val BackbonejsGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF002A41)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.65f, 2.7f)
                verticalLineToRelative(66.31f)
                lineToRelative(49.35f, 28.13f)
                verticalLineTo(78.01f)
                lineToRelative(-33.02f, -18.82f)
                verticalLineTo(29.63f)
                lineToRelative(33.02f, 18.82f)
                verticalLineToRelative(-17.62f)
                lineTo(14.65f, 2.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0071B5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(113.35f, 2.7f)
                verticalLineToRelative(66.31f)
                lineTo(64.0f, 97.14f)
                verticalLineTo(78.01f)
                lineToRelative(33.02f, -18.82f)
                verticalLineTo(29.63f)
                lineTo(64.0f, 48.45f)
                verticalLineToRelative(-17.62f)
                lineToRelative(49.35f, -28.13f)
                close()
                moveTo(14.65f, 125.3f)
                verticalLineTo(59.0f)
                lineToRelative(49.35f, -28.13f)
                verticalLineToRelative(19.13f)
                lineTo(30.98f, 68.81f)
                verticalLineToRelative(28.06f)
                lineToRelative(33.02f, -18.82f)
                verticalLineToRelative(19.12f)
                lineToRelative(-49.35f, 28.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF002A41)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(113.35f, 125.3f)
                verticalLineTo(59.0f)
                lineTo(64.0f, 30.86f)
                verticalLineToRelative(19.13f)
                lineToRelative(33.02f, 18.82f)
                verticalLineToRelative(28.06f)
                lineTo(64.0f, 78.05f)
                verticalLineToRelative(19.12f)
                lineToRelative(49.35f, 28.13f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
