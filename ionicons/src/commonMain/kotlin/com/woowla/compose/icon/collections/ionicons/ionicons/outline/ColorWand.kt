package com.woowla.compose.icon.collections.ionicons.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.OutlineGroup

public val OutlineGroup.ColorWand: ImageVector
    get() {
        if (_colorWand != null) {
            return _colorWand!!
        }
        _colorWand = Builder(name = "ColorWand", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(178.29f, 178.29f)
                lineTo(178.29f, 178.29f)
                arcTo(31.52f, 31.51f, 45.0f, false, true, 222.86f, 178.29f)
                lineTo(445.71f, 401.14f)
                arcTo(31.52f, 31.51f, 45.0f, false, true, 445.71f, 445.72f)
                lineTo(445.71f, 445.72f)
                arcTo(31.52f, 31.51f, 45.0f, false, true, 401.14f, 445.71f)
                lineTo(178.29f, 222.86f)
                arcTo(31.52f, 31.51f, 45.0f, false, true, 178.29f, 178.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.38f, 178.38f)
                horizontalLineToRelative(0.0f)
                arcToRelative(31.64f, 31.64f, 0.0f, false, false, 0.0f, 44.75f)
                lineTo(223.25f, 268.0f)
                lineTo(268.0f, 223.25f)
                lineToRelative(-44.87f, -44.87f)
                arcTo(31.64f, 31.64f, 0.0f, false, false, 178.38f, 178.38f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 192.0f)
                lineTo(96.0f, 192.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(90.18f, 90.18f)
                lineTo(124.12f, 124.12f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 48.0f)
                lineTo(192.0f, 96.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(293.82f, 90.18f)
                lineTo(259.88f, 124.12f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(124.12f, 259.88f)
                lineTo(90.18f, 293.82f)
            }
        }
        .build()
        return _colorWand!!
    }

private var _colorWand: ImageVector? = null
