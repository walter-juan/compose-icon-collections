package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.StopCircle: ImageVector
    get() {
        if (_stopCircle != null) {
            return _stopCircle!!
        }
        _stopCircle = Builder(name = "StopCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.25f, 12.0f)
                curveTo(2.25f, 6.615f, 6.615f, 2.25f, 12.0f, 2.25f)
                curveTo(17.385f, 2.25f, 21.75f, 6.615f, 21.75f, 12.0f)
                curveTo(21.75f, 17.385f, 17.385f, 21.75f, 12.0f, 21.75f)
                curveTo(6.615f, 21.75f, 2.25f, 17.385f, 2.25f, 12.0f)
                close()
                moveTo(8.25f, 9.563f)
                curveTo(8.25f, 8.838f, 8.838f, 8.25f, 9.563f, 8.25f)
                horizontalLineTo(14.438f)
                curveTo(15.162f, 8.25f, 15.75f, 8.838f, 15.75f, 9.563f)
                verticalLineTo(14.438f)
                curveTo(15.75f, 15.162f, 15.162f, 15.75f, 14.438f, 15.75f)
                horizontalLineTo(9.563f)
                curveTo(8.838f, 15.75f, 8.25f, 15.162f, 8.25f, 14.438f)
                verticalLineTo(9.563f)
                close()
            }
        }
        .build()
        return _stopCircle!!
    }

private var _stopCircle: ImageVector? = null
