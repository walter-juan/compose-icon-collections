package com.woowla.compose.icon.collections.devicons.devicons.aftereffects

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
import com.woowla.compose.icon.collections.devicons.devicons.AftereffectsGroup

public val AftereffectsGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1F0740)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 6.5f)
                horizontalLineToRelative(115.0f)
                verticalLineToRelative(115.0f)
                horizontalLineTo(6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD490C5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(128.0f)
                lineTo(128.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(121.5f, 121.5f)
                lineTo(6.5f, 121.5f)
                lineTo(6.5f, 6.5f)
                horizontalLineToRelative(115.0f)
                verticalLineToRelative(115.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD490C5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(103.5f, 59.2f)
                reflectiveCurveToRelative(-0.6f, -14.6f, -16.5f, -14.6f)
                curveToRelative(-16.0f, 0.0f, -17.3f, 22.0f, -17.3f, 22.0f)
                verticalLineToRelative(4.7f)
                reflectiveCurveTo(72.5f, 89.6f, 86.0f, 89.6f)
                reflectiveCurveToRelative(14.8f, -2.6f, 14.8f, -2.6f)
                verticalLineToRelative(-8.1f)
                reflectiveCurveToRelative(-19.3f, 9.2f, -21.2f, -10.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-9.7f)
                close()
                moveTo(94.5f, 61.6f)
                horizontalLineToRelative(-15.0f)
                reflectiveCurveToRelative(0.0f, -8.3f, 7.5f, -9.2f)
                curveToRelative(8.2f, 0.0f, 7.5f, 9.2f, 7.5f, 9.2f)
                close()
                moveTo(50.5f, 29.9f)
                lineTo(38.4f, 29.9f)
                verticalLineToRelative(3.8f)
                lineToRelative(-16.0f, 54.9f)
                horizontalLineToRelative(9.4f)
                lineToRelative(4.4f, -16.1f)
                lineTo(53.0f, 72.5f)
                lineToRelative(4.5f, 16.1f)
                horizontalLineToRelative(10.3f)
                lineTo(50.5f, 29.9f)
                close()
                moveTo(38.2f, 63.1f)
                lineToRelative(6.4f, -24.5f)
                lineTo(51.0f, 63.1f)
                lineTo(38.2f, 63.1f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
