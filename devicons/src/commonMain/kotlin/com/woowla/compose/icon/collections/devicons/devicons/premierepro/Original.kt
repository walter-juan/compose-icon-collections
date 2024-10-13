package com.woowla.compose.icon.collections.devicons.devicons.premierepro

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
import com.woowla.compose.icon.collections.devicons.devicons.PremiereproGroup

public val PremiereproGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF2A0634)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(128.0f)
                horizontalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE976B9)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(128.0f)
                lineTo(128.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(123.0f, 123.0f)
                lineTo(5.0f, 123.0f)
                lineTo(5.0f, 5.0f)
                horizontalLineToRelative(118.0f)
                verticalLineToRelative(118.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE976B9)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(69.0f, 47.1f)
                curveToRelative(-0.1f, -9.4f, -7.8f, -16.9f, -17.2f, -16.8f)
                lineTo(33.3f, 30.3f)
                verticalLineToRelative(58.5f)
                horizontalLineToRelative(9.6f)
                lineTo(42.9f, 67.5f)
                horizontalLineToRelative(8.3f)
                curveTo(61.0f, 67.4f, 69.0f, 59.3f, 69.0f, 49.4f)
                verticalLineToRelative(-2.3f)
                close()
                moveTo(59.4f, 50.1f)
                curveToRelative(0.0f, 5.0f, -4.1f, 9.1f, -9.1f, 9.1f)
                horizontalLineToRelative(-7.4f)
                lineTo(42.9f, 38.5f)
                horizontalLineToRelative(7.4f)
                curveToRelative(5.0f, 0.0f, 9.1f, 4.1f, 9.1f, 9.1f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(77.1f, 88.8f)
                lineTo(77.1f, 48.9f)
                reflectiveCurveToRelative(10.2f, -5.1f, 20.2f, -3.8f)
                verticalLineToRelative(8.3f)
                reflectiveCurveToRelative(-7.0f, 0.0f, -10.1f, 1.3f)
                verticalLineToRelative(34.2f)
                lineTo(77.1f, 88.9f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
