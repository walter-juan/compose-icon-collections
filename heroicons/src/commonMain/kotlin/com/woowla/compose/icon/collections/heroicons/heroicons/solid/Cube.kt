package com.woowla.compose.icon.collections.heroicons.heroicons.solid

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
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.378f, 1.602f)
                curveTo(12.144f, 1.466f, 11.856f, 1.466f, 11.622f, 1.602f)
                lineTo(3.0f, 6.632f)
                lineTo(12.0f, 11.882f)
                lineTo(21.0f, 6.632f)
                lineTo(12.378f, 1.602f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.75f, 7.931f)
                lineTo(12.75f, 13.181f)
                verticalLineTo(22.181f)
                lineTo(21.378f, 17.148f)
                curveTo(21.608f, 17.013f, 21.75f, 16.767f, 21.75f, 16.5f)
                verticalLineTo(7.931f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 22.181f)
                verticalLineTo(13.181f)
                lineTo(2.25f, 7.931f)
                verticalLineTo(16.5f)
                curveTo(2.25f, 16.767f, 2.392f, 17.013f, 2.622f, 17.148f)
                lineTo(11.25f, 22.181f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
