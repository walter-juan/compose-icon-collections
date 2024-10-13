package com.woowla.compose.icon.collections.devicons.devicons.figma

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
import com.woowla.compose.icon.collections.devicons.devicons.FigmaGroup

public val FigmaGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF0acf83)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(45.5f, 129.0f)
                curveToRelative(11.9f, 0.0f, 21.5f, -9.6f, 21.5f, -21.5f)
                lineTo(67.0f, 86.0f)
                lineTo(45.5f, 86.0f)
                curveTo(33.6f, 86.0f, 24.0f, 95.6f, 24.0f, 107.5f)
                reflectiveCurveTo(33.6f, 129.0f, 45.5f, 129.0f)
                close()
                moveTo(45.5f, 129.0f)
            }
            path(fill = SolidColor(Color(0xFFa259ff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 64.5f)
                curveTo(24.0f, 52.6f, 33.6f, 43.0f, 45.5f, 43.0f)
                lineTo(67.0f, 43.0f)
                verticalLineToRelative(43.0f)
                lineTo(45.5f, 86.0f)
                curveTo(33.6f, 86.0f, 24.0f, 76.4f, 24.0f, 64.5f)
                close()
                moveTo(24.0f, 64.5f)
            }
            path(fill = SolidColor(Color(0xFFf24e1e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 21.5f)
                curveTo(24.0f, 9.6f, 33.6f, 0.0f, 45.5f, 0.0f)
                lineTo(67.0f, 0.0f)
                verticalLineToRelative(43.0f)
                lineTo(45.5f, 43.0f)
                curveTo(33.6f, 43.0f, 24.0f, 33.4f, 24.0f, 21.5f)
                close()
                moveTo(24.0f, 21.5f)
            }
            path(fill = SolidColor(Color(0xFFff7262)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(67.0f, 0.0f)
                horizontalLineToRelative(21.5f)
                curveTo(100.4f, 0.0f, 110.0f, 9.6f, 110.0f, 21.5f)
                reflectiveCurveTo(100.4f, 43.0f, 88.5f, 43.0f)
                lineTo(67.0f, 43.0f)
                close()
                moveTo(67.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF1abcfe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(110.0f, 64.5f)
                curveToRelative(0.0f, 11.9f, -9.6f, 21.5f, -21.5f, 21.5f)
                reflectiveCurveTo(67.0f, 76.4f, 67.0f, 64.5f)
                reflectiveCurveTo(76.6f, 43.0f, 88.5f, 43.0f)
                reflectiveCurveTo(110.0f, 52.6f, 110.0f, 64.5f)
                close()
                moveTo(110.0f, 64.5f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
